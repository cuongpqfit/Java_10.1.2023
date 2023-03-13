I.Ngôn ngữ quản lý dữ liệu: 

-- Tăng hệ số lương thêm 0.2 cho những giáo viên là trưởng khoa
UPDATE giaovien G 
INNER JOIN khoa K  ON G.MAGV = K.TRGKHOA
SET MUCLUONG= MUCLUONG*1.002;


-- Thêm vào cột DIEMTB trong quan hệ HOCVIEN, cập nhật giá trị điểm trung bình tất cả các môn học của học viên này(tất cả các môn học đều có hệ số 1 và nếu học viên thi một môn nhiều lần, chỉ lấy điểm của lần thi sau cùng).
ALTER TABLE hocvien
	ADD COLUMN DIEMTB FLOAT NULL DEFAULT NULL AFTER MALOP;
	


-- Thêm vào cột GHICHU trong quan hệ HOCVIEN, cập nhật giá trị cho cột này là “Cấm thi” đối với trường hợp: học viên có một môn bất kỳ thi lần thứ 3 dưới 5 điểm.  
ALTER TABLE hocvien
	ADD COLUMN GHICHU VARCHAR(512) NULL DEFAULT NULL AFTER DIEMTB
UPDATE hocvien H
INNER JOIN ketquathi K  ON K.MAHV = H.MAHV
SET H.GHICHU ="Cam thi" 
WHERE K.LANTHI = 3 AND K.DIEM < 5;



-- Thêm vào cột XEPLOAI trong quan hệ HOCVIEN, cập nhật giá trị của cột này như sau: 
--		Nếu DIEMTB	9 thì XEPLOAI =”XS” 
--		Nếu 8	DIEMTB < 9 thì XEPLOAI = “G” 
--		Nếu 6.5	DIEMTB < 8 thì XEPLOAI = “K” 
--		Nếu  5  DIEMTB < 6.5 thì XEPLOAI = “TB” 
--		Nếu DIEMTB < 5 thì XEPLOAI = ”Y” 
ALTER TABLE hocvien
	ADD COLUMN XEPLOAI VARCHAR(10) NULL DEFAULT NULL AFTER GHICHU;


II.Viết các câu truy vấn: 

-- In ra bảng điểm khi thi (mã học viên, họ tên , lần thi, điểm số) môn CSDL của lớp “K12”, sắp xếp theo tên, họ học viên. 
SELECT A.MAHV,A.HO,A.TEN,B.LANTHI,B.DIEM
FROM hocvien A
INNER JOIN ketquathi B ON B.MAHV = A.MAHV
WHERE A.MALOP = "K12" AND B.MAMH = "CSDL"
ORDER BY A.HO,A.TEN ASC

 -- In ra danh sách (mã học viên, họ tên, ngày sinh, mã lớp) của lớp trưởng các lớp. 
SELECT A.MAHV,A.HO,A.TEN,A.NGSINH,A.MALOP
FROM hocvien A
INNER JOIN lop C ON C.MALOP = A.MALOP
WHERE A.MAHV = C.TRGLOP

 -- Tìm họ tên học viên và các môn học mà học viên đó thi lần thứ nhất đã đạt. 
SELECT A.MAHV,A.HO,A.TEN,B.LANTHI,B.MAMH,B.KQUA
FROM hocvien A
INNER JOIN ketquathi B ON B.MAHV = A.MAHV
WHERE B.LANTHI = 1 AND B.KQUA = "DAT"

 -- Danh sách học viên (mã học viên, họ tên) của lớp “K11” thi môn CSDL không đạt (ở lần thi 1). 
SELECT A.MAHV,A.HO,A.TEN,B.LANTHI,B.MAMH,B.KQUA,A.MALOP
FROM hocvien A
INNER JOIN ketquathi B ON B.MAHV = A.MAHV
WHERE B.LANTHI = 1 AND B.KQUA = "KHONG DAT" AND B.MAMH = "CSDL" AND A.MALOP = "K11"
 
 
 -- *Danh sách học viên (mã học viên, họ tên) của lớp “K11” thi môn CSDL không đạt (ở tất cả các lần thi). 
SELECT A.MAHV,A.HO,A.TEN,B.LANTHI,B.MAMH,B.KQUA,A.MALOP
FROM hocvien A
INNER JOIN ketquathi B ON B.MAHV = A.MAHV
WHERE B.KQUA = "KHONG DAT" AND B.MAMH = "CSDL" AND A.MALOP = "K11"
 
 
 -- Tìm tên các môn học mà giáo viên “Ho Thanh Son ” dạy trong học kỳ 1 năm 2006. 

 	 					

 
 -- Tìm những môn học (mã môn học, tên môn học) mà giáo viên chủ nhiệm lớp “K27” dạy trong học kỳ 1 năm 2006. 
 
 
 
 -- Tìm họ tên lớp trưởng của các lớp do giáo viên có tên “Nguyễn Văn A” dạy môn “Cơ Sở Dữ Liệu”. 
 
 
 


