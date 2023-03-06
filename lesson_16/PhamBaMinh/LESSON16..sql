
-- 7.	Tìm các số HD mua cùng lúc 2 sản phẩm có mã số “BB01” và “BB02”, mỗi sản phẩm mua với số lượng từ 10 đến 20.

SELECT C.SOHD AS "SOHD MUA 2 SP"
FROM cthd C 
WHERE (C.MASP = "BB02" AND C.SL BETWEEN 10 AND 20) 
OR (C.MASP = "BB01" AND C.SL BETWEEN 10 AND 20)
GROUP BY C.SOHD


-- 8.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất hoặc các sản phẩm được bán ra trong ngày 1/1/2007.

SELECT DISTINCT(s.MASP), s.TENSP, s.NUOCSX
FROM sanpham s, hoadon h, cthd c
WHERE 
	c.SOHD = h.SOHD
	AND c.MASP = s.MASP
	AND (s.NUOCSX = 'Trung Quoc' OR h.NGHD = '2007-01-01');


-- 9.	In ra danh sách các sản phẩm (MASP,TENSP) không bán được.

SELECT S.MASP, S.TENSP
FROM sanpham S 
WHERE S.MASP NOT IN (
	SELECT DISTINCT(C.MASP)
	FROM cthd C
)
;

-- 10. In ra danh sách các sản phẩm (MASP,TENSP) không bán được trong năm 2006


SELECT S.MASP , S.TENSP
FROM sanpham S
WHERE S.MASP  NOT IN (
		SELECT DISTINCT(C.MASP)
		FROM hoadon H, cthd C
		WHERE YEAR(H.NGHD) = "2006" 
			AND C.SOHD = H.SOHD
		)

-- 11. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất không bán được trong năm 2006.

SELECT S.MASP , S.TENSP
FROM sanpham S
WHERE S.NUOCSX = "Trung Quoc" 
	AND (S.MASP  NOT IN (
		SELECT DISTINCT(C.MASP)
		FROM hoadon H, cthd C
		WHERE YEAR(H.NGHD) = "2006" 
			AND C.SOHD = H.SOHD)
		)


-- 12. Có bao nhiêu hóa đơn không phải của khách hàng đăng ký thành viên mua?

SELECT COUNT(DISTINCT(H.MAKH)) AS "KOPHAITHANHVIENMUA"
FROM hoadon H
WHERE H.MAKH NOT IN (
	SELECT K.MAKH
	FROM khachhang K
)
;


-- 13. Cho biết trị giá hóa đơn cao nhất, thấp nhất là bao nhiêu ?

SELECT MAX(H.TRIGIA) AS "TRIGIAHOADONCAONHAT"
FROM hoadon H
;
SELECT MIN(H.TRIGIA) AS "TRIGIAHOADONTHAPNHAT"
FROM hoadon H
;

-- 14.Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu?

SELECT ROUND(AVG(H.NGHD),2) AS "GIATRITBNAM2006"
FROM hoadon H
WHERE YEAR(H.NGHD)="2006"

-- 15.Tính doanh thu bán hàng trong năm 2006.

SELECT SUM(H.TRIGIA)  AS "DOANHTHUNAM2006"
FROM hoadon H
WHERE YEAR(H.NGHD)="2006"

-- 16. Tìm số hóa đơn có trị giá cao nhất trong năm 2006

SELECT MAX(H.TRIGIA)  AS "GIATRICAONHAT",
FROM hoadon H
WHERE YEAR(H.NGHD)="2006";



-- 17. Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006.

SELECT K.HOTEN,H.TRIGIA
FROM khachhang K, hoadon H
WHERE H.MAKH = K.MAKH 
AND YEAR(H.NGHD) = "2006"
ORDER BY H.TRIGIA DESC
LIMIT 1
;

-- 18 In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất

SELECT K.MAKH, K.HOTEN,K.DOANHSO
FROM khachhang K
ORDER BY K.DOANHSO DESC
LIMIT 3
;

-- 19. In ra danh sách các sản phẩm (MASP, TENSP) có giá bán bằng 1 trong 3 mức giá cao nhất.

SELECT S.MASP, S.TENSP,S.GIA
FROM sanpham S
ORDER BY S.GIA DESC
LIMIT 3
;


-- 23.	Tính tổng số sản phẩm do Trung Quốc sản xuất

SELECT COUNT(DISTINCT a.MASP) AS "TongSoSP"
FROM sanpham a
WHERE a.NUOCSX = "Trung Quoc" 

-- 24.	Tính tổng số sản phẩm của từng nước sản xuất.
SELECT count(a.MASP) AS 'TongSP tung nuoc',a.NUOCSX
FROM sanpham a
WHERE a.NUOCSX IS NOT NULL
GROUP BY a.NUOCSX;

-- 25.	Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm.
SELECT * FROM sanpham;

SELECT MAX(a.GIA) AS "Gia tri lon nhat", a.NUOCSX
FROM sanpham a
WHERE a.NUOCSX IS NOT NULL
GROUP BY a.NUOCSX;

SELECT MIN(a.GIA) AS "Gia tri nho nhat", a.NUOCSX
FROM sanpham a
WHERE a.NUOCSX IS NOT NULL
GROUP BY a.NUOCSX;

SELECT ROUND (AVG (a.GIA),2) AS "Gia  tri trung binh", a.NUOCSX
FROM sanpham a
WHERE a.NUOCSX IS NOT NULL
GROUP BY a.NUOCSX;

-- 26.	Tính doanh thu bán hàng mỗi ngày.
SELECT SUM(a.TRIGIA) AS "doanh thu ban hang ", DATE(a.NGHD) AS "ngayDG"
FROM hoadon a
GROUP BY DATE(a.NGHD)
;

--	27.	Tính tổng số lượng của từng sản phẩm bán ra trong ngày 28/10/2006.



-- 28.	Tính doanh thu bán hàng của từng tháng trong năm 2006.
SELECT SUM(a.TRIGIA) AS "Doanh thu ban hang" , MONTH(a.NGHD)
FROM hoadon a
WHERE YEAR(a.NGHD) = 2006
GROUP BY MONTH(a.NGHD);
;
--29.	Tìm khách hàng (MAKH, HOTEN) có số lần mua hàng nhiều nhất.

SELECT COUNT(a.MAKH) AS "Solanmuahang", a.MAKH
FROM hoadon a
WHERE a.MAKH IS NOT NULL
GROUP BY a.MAKH
ORDER BY Solanmuahang DESC
LIMIT 1
;

--  30.	Tìm sản phẩm (MASP, TENSP) có tổng số lượng bán ra thấp nhất trong năm 2006


-- 31.	Tháng mấy trong năm 2006, doanh số bán hàng thấp nhất ?

SELECT SUM(a.TRIGIA) AS "Doanhthubanhang" , MONTH(a.NGHD)
FROM hoadon a
WHERE YEAR(a.NGHD) = 2006
GROUP BY MONTH(a.NGHD)
ORDER BY Doanhthubanhang ASC 
LIMIT 1
;

-- 32.	Mỗi nước sản xuất, tìm sản phẩm (MASP,TENSP) có giá bán cao nhất.

SELECT MAX(a.GIA),a.NUOCSX
FROM sanpham a
WHERE a.NUOCSX IS NOT null
GROUP BY a.NUOCSX
;




