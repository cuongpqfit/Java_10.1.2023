-- 1.	Tăng hệ số lương thêm 0.2 cho những giáo viên là trưởng khoa.

UPDATE giaovien g INNER JOIN khoa k ON g.MAGV = k.TRGKHOA
SET MUCLUONG= MUCLUONG*1.2
;

-- 2.	Thêm vào cột DIEMTB trong quan hệ HOCVIEN, cập nhật giá trị điểm trung bình tất cả các môn học của học viên này 
-- (tất cả các môn học đều có hệ số 1 và nếu học viên thi một môn nhiều lần, chỉ lấy điểm của lần thi sau cùng).

ALTER TABLE `hocvien`
	ADD COLUMN `DIEMTB` FLOAT NULL DEFAULT NULL AFTER `MALOP`;

UPDATE hocvien h 	RIGHT JOIN (
	SELECT SUM(k.DIEM)/COUNT(k.MAHV) AS "DIEMTB1",k.MAHV
	FROM ketquathi k 
	RIGHT JOIN (
	SELECT MAX(k.LANTHI) AS "MAXLANTHI" ,k.MAHV,k.MAMH
	FROM ketquathi k
	GROUP BY k.MAHV,k.MAMH
	) a ON a.MAXLANTHI = k.LANTHI AND a.MAHV = k.MAHV AND a.MAMH = k.MAMH
	GROUP BY k.MAHV
) b ON h.MAHV = b.MAHV
SET h.DIEMTB = b.DIEMTB1

SELECT *
FROM hocvien h
WHERE h.DIEMTB IS NOT NULL ;



-- 3.	Thêm vào cột GHICHU trong quan hệ HOCVIEN, cập nhật giá trị cho cột này là “Cấm thi”
--  đối với trường hợp: học viên có một môn bất kỳ thi lần thứ 3 dưới 5 điểm.

ALTER TABLE `hocvien`
	ADD COLUMN `GHICHU` VARCHAR(512) NULL DEFAULT NULL AFTER `DIEMTB`,
	DROP COLUMN `GHICHU`;

UPDATE hocvien h
RIGHT JOIN (
	SELECT*
	FROM ketquathi k
	WHERE k.LANTHI = 3 AND k.DIEM <5) a ON h.MAHV = a.MAHV
SET h.GHICHU ="Cam thi" 		

;

-- 4.	Thêm vào cột XEPLOAI trong quan hệ HOCVIEN, cập nhật giá trị của cột này như sau:
-- o	Nếu DIEMTB	9 thì XEPLOAI =”XS”
-- o	Nếu 8	DIEMTB < 9 thì XEPLOAI = “G”
-- o	Nếu 6.5	DIEMTB < 8 thì XEPLOAI = “K”
-- o	Nếu  5   DIEMTB < 6.5 thì XEPLOAI = “TB”
-- o	Nếu DIEMTB < 5 thì XEPLOAI = ”Y”

ALTER TABLE `hocvien`
	ADD COLUMN `XEPLOAI` VARCHAR(10) NULL DEFAULT NULL AFTER `GHICHU`;


UPDATE hocvien a 
INNER JOIN (
SELECT h.DIEMTB,
case
	when DIEMTB >= 9 then 'SX'
    when DIEMTB>=8 and DIEMTB<9 then 'G'
    when DIEMTB >=6.5 and DIEMTB<8 then 'K'
    when DIEMTB>=5 and DIEMTB<6.5 then 'TB'
    when DIEMTB<5 then 'Y'
    end as "XepLoaiTMP"
FROM hocvien h
WHERE h.DIEMTB IS NOT null
) b ON a.DIEMTB = b.DIEMTB
SET a.XEPLOAI = b.XepLoaiTMP

-- 1. In ra bảng điểm khi thi (mã học viên, họ tên , lần thi, điểm số) môn CTRR của lớp “K12”, sắp xếp theo tên, họ học viên

SELECT  h.MAHV,h.HO,h.TEN,b.LANTHI, b.DIEM
FROM hocvien h 
RIGHT JOIN (
	SELECT MAHV,k.LANTHI,k.DIEM
	FROM ketquathi k RIGHT JOIN (
	SELECT *
	FROM monhoc m
	WHERE m.MAMH = "CTRR") a ON k.MAMH = a.MAMH
) b ON h.MAHV = b.MAHV
WHERE h.MALOp = "K12"
ORDER BY h.TEN AND h.HO ASC 
;


-- 2.	In ra danh sách (mã học viên, họ tên, ngày sinh, mã lớp) của lớp trưởng các lớp.
SELECT  h.MAHV, h.HO,h.TEN,h.NGSINH,h.MALOP
FROM hocvien h RIGHT JOIN lop l
ON h.MAHV = l.TRGLOP

-- 3.	Tìm họ tên học viên và các môn học mà học viên đó thi lần thứ nhất đã đạt.

SELECT h.HO,h.TEN,b.TENMH
FROM hocvien h 
RIGHT JOIN(
	SELECT MAHV, m.TENMH
	FROM monhoc m RIGHT JOIN (
	SELECT *
	FROM ketquathi k
	WHERE k.LANTHI = 1 AND k.KQUA = "Dat"
	) a ON a.MAMH = m.MAMH ) b 
ON h.MAHV = b.MAHV	
;


-- 4.	 In ra danh sách học viên (mã học viên, họ tên) của lớp “K11” thi môn CTRR không đạt (ở lần thi 1).

SELECT h.MAHV,h.HO,h.TEN
FROM hocvien h 
RIGHT JOIN (
	SELECT k.MAHV
	FROM ketquathi k
	WHERE k.MAMH = "CTRR" AND k.KQUA = "Khong Dat"
	GROUP BY k.MAHV
) a ON h.MAHV = a.MAHV
WHERE h.MALOP = "K11"
;

-- 5.	* Danh sách học viên (mã học viên, họ tên) của lớp “K” thi môn CTRR không đạt (ở tất cả các lần thi

SELECT h.MAHV,h.HO,h.TEN
FROM hocvien h 
RIGHT JOIN (
	SELECT k.MAHV
	FROM ketquathi k
	WHERE k.MAMH ="CTRR" AND k.KQUA="Khong Dat"
	GROUP BY k.MAHV
	) a ON h.MAHV = a.MAHV
WHERE h.MALOP LIKE "K%"
;

-- 6.	Tìm tên các môn học mà giáo viên “Tran Tam Thanh” dạy trong học kỳ 1 năm 2006.

SELECT a.HOTEN , a.MAGV,c.TENMH
FROM giaovien a INNER JOIN (
	SELECT m.TENMH,b.MAGV
	FROM monhoc m
	RIGHT JOIN(
		SELECT *
		FROM giangday g 
		WHERE g.HOCKY = 1 AND g.NAM = 2006
		) b ON m.MAMH = b.MAMH
) c ON c.MAGV = a.MAGV
WHERE a.HOTEN = "Tran Tam Thanh" 
GROUP BY a.HOTEN,a.MAGV,c.TENMH
;

-- 7.	 Tìm những môn học (mã môn học, tên môn học) mà giáo viên chủ nhiệm lớp “K11” dạy trong học kỳ 1 năm 2006.

SELECT m.MAMH,m.TENMH
FROM monhoc m
RIGHT JOIN (
	SELECT a.MAMH
	FROM lop l INNER JOIN (
	SELECT *
	FROM giangday g
	where g.HOCKY = 1 AND g.NAM = 2006
	) a ON l.MAGVCN = a.MAGV
	WHERE l.MALOP = "K11"
) b ON m.MAMH = b.MAMH
;

-- 8.	Tìm họ tên lớp trưởng của các lớp mà giáo viên có tên “Nguyen To Lan” dạy môn “Co So Du Lieu”

SELECT h.MAHV ,h.HO,h.TEN
FROM hocvien h 
RIGHT JOIN (
	SELECT l.TRGLOP
	FROM lop l 
	RIGHT JOIN (
	SELECT g.MAGV
	FROM giaovien g
	LEFT JOIN (
		SELECT a.MAGV
		FROM giangday a 
		RIGHT JOIN (
			SELECT *
			FROM monhoc m
			WHERE m.TENMH="Co so du lieu" 
		) b ON a.MAMH = b.MAMH	
	)c ON g.MAGV = c.MAGV
	WHERE g.HOTEN= "Nguyen To Lan" 
	) d ON l.MAGVCN = d.MAGV
) e ON e.TRGLOP = h.MAHV
;  
 
 