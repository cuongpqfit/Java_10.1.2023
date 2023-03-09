-- Tìm các số hóa đơn mua cùng lúc 2 sản phẩm có mã số “BB01” và “BB02”, mỗi sản phẩm mua với số lượng từ 10 đến 20. 
SELECT A.SOHD,  COUNT(A.SOHD) AS so_san_pham
FROM chitiethd A
WHERE (A.MASP = 'BB01' OR A.MASP = 'BB02') AND  (A.SL BETWEEN 10 AND 20)
GROUP BY A.SOHD
HAVING so_san_pham = 2
;


-- In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất hoặc các sản phẩm được bán ra trong ngày 1/1/2007. 
SELECT *
FROM sanpham A
WHERE A.NUOCSX = 'Trung Quoc' OR A.MASP IN (
	SELECT C.MASP FROM chitiethd C
	WHERE C.SOHD IN ( 
 		SELECT B.SOHD
 		FROM hoadon B
 		WHERE STR_TO_DATE(B.NGHD, "%d/%m/%Y")  = "2007-01-01"));


-- Các sản phẩm bán ra trong ngày 01-01-2007
SELECT *
FROM chitiethd C
WHERE C.SOHD IN (
 SELECT B.SOHD
 FROM hoadon B
 WHERE STR_TO_DATE(B.NGHD, "%d/%m/%Y")  = "2007-01-01");

-- In ra danh sách các sản phẩm (MASP,TENSP) không bán được. 
SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE A.MASP NOT IN (
    SELECT MASP
    FROM chitiethd B
);

-- In ra danh sách các sản phẩm (MASP,TENSP) không bán được trong năm 2006. 
SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE A.MASP NOT IN (
	SELECT C.MASP 
	FROM chitiethd C
	WHERE C.SOHD IN ( 
 		SELECT B.SOHD
 		FROM hoadon B
 		WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006));
 
-- san pham ban ra trong nam 2006
SELECT C.MASP 
FROM chitiethd C
WHERE C.SOHD IN ( 
 SELECT B.SOHD
 FROM hoadon B
 WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006);

-- In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất không bán được trong năm 2006. 
SELECT MASP, TENSP
FROM sanpham
WHERE NUOCSX = 'Trung Quoc' 
    AND MASP NOT IN (
        SELECT C.MASP 
			FROM chitiethd C
			WHERE C.SOHD IN ( 
 			SELECT B.SOHD
			FROM hoadon B
			WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006)
    );

-- Có bao nhiêu hóa đơn không phải của khách hàng đăng ký thành viên mua? 
SELECT COUNT(*) AS SoHoaDonKPLTV
FROM hoadon A 
WHERE A.MAKH IS NULL;

-- Cho biết trị giá hóa đơn cao nhất, thấp nhất là bao nhiêu ? 
SELECT MAX(TRIGIA) AS GIATRI_MAX, MIN(TRIGIA) AS GIATRI_MIN
FROM hoadon

-- Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu? 
SELECT AVG(TRIGIA) AS TRUNGBINH
FROM hoadon 
WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006;

-- Tính doanh thu bán hàng trong năm 2006. 
SELECT SUM(TRIGIA) AS DoanhThu2006
FROM hoadon 
WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006;

-- Tìm số hóa đơn có trị giá cao nhất trong năm 2006. 
SELECT A.SOHD,A.TRIGIA
FROM hoadon A
WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006 AND TRIGIA = (
  SELECT MAX(TRIGIA)
  FROM hoadon
  WHERE YEAR(STR_TO_DATE(NGHD, '%d/%m/%Y')) = 2006);

-- Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006. 
SELECT * 
FROM KHACHHANG	A
WHERE A.MAKH IN (
SELECT B.MAKH
FROM HOADON B
WHERE (STR_TO_DATE(B.NGHD, "%d/%m/%Y") >= "2006-01-01") 
AND (STR_TO_DATE(B.NGHD, "%d/%m/%Y") <= "2006-12-31")
ORDER BY B.TRIGIA DESC
)
LIMIT 1;

-- In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất. 
SELECT B.MAKH,B.HOTEN
FROM khachhang B
ORDER BY DOANHSO DESC 
LIMIT 3;

-- In ra danh sách các sản phẩm (MASP, TENSP) có giá bán bằng 1 trong 3 mức giá cao nhất. 

SELECT *
FROM sanpham A
WHERE A.GIA IN (
SELECT DISTINCT A.GIA
	 FROM sanpham A
	 ORDER BY A.GIA DESC
	LIMIT 3
	);
	
	
SELECT DISTINCT A.GIA 
	 FROM sanpham A
	 ORDER BY A.GIA DESC
	LIMIT 3
	