-- 7.	Tìm các số HD mua cùng lúc 2 sản phẩm có mã  số “BB01” và “BB02”, mỗi sản phẩm mua với số lượng từ 
-- > 10.

SELECT A.SOHD, COUNT(A.SOHD) AS so_san_pham
FROM CTHD A
WHERE (A.MASP = 'BB01' OR A.MASP = 'BB02') AND (A.SL > 10)
GROUP BY A.SOHD
HAVING so_san_pham = 2
;

-- 8.	In ra danh sách các sản phẩm (MASP,TENSP) 
-- do “Trung Quốc” sản xuất hoặc các sản phẩm được bán ra trong ngày 1/1/2007.

SELECT *
FROM SANPHAM A
WHERE A.NUOCSX = 'Trung Quoc' OR A.MASP IN 
(SELECT C.MASP FROM CTHD C
WHERE C.SOHD IN (
SELECT B.SOHD
FROM HOADON B
WHERE STR_TO_DATE(B.NGHD, "%d/%m/%Y") = "2007-01-01"));

-- 9.	In ra danh sách các sản phẩm (MASP,TENSP) không bán được.
SELECT *
FROM SANPHAM A
WHERE A.MASP NOT IN (
SELECT MASP 
FROM CTHD C);

-- 17.	Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006.
SELECT MAX(B.TRIGIA)
FROM HOADON B
WHERE (STR_TO_DATE(B.NGHD, "%d/%m/%Y") >= "2006-01-01") 
AND (STR_TO_DATE(B.NGHD, "%d/%m/%Y") <= "2006-12-31");


SELECT * FROM KHACHHANG	A
WHERE A.MAKH IN (
SELECT B.MAKH
FROM HOADON B
WHERE (STR_TO_DATE(B.NGHD, "%d/%m/%Y") >= "2006-01-01") 
AND (STR_TO_DATE(B.NGHD, "%d/%m/%Y") <= "2006-12-31")
ORDER BY B.TRIGIA DESC
)
LIMIT 1;