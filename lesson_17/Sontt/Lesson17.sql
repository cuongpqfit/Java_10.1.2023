USE bai1;
-- 7.	Tìm các số hóa đơn mua cùng lúc 2 sản phẩm có mã số “BB01” và “BB02”, mỗi sản phẩm mua với số lượng từ 10 đến 20.
SELECT a.SOHD ,COUNT(a.SOHD) AS SoSanPham FROM cthd a
WHERE (a.MASP ="BB01" OR a.MASP ="BB02") AND (a.SL > 5 AND a.SL < 30) 
GROUP BY A.SOHD
HAVING SoSanPham = 2;

-- 8.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất hoặc các sản phẩm được bán ra trong ngày 1/1/2007.

SELECT a.MASP, a.TENSP FROM sanpham a
WHERE a.NUOCSX ="Trung Quoc" OR a.MASP IN 
(SELECT c.MASP FROM cthd c WHERE c.SOHD IN 
(SELECT b.SOHD FROM hoadon b WHERE b.NGHD = "2007-01-01"));

-- 9.	In ra danh sách các sản phẩm (MASP,TENSP) không bán được.

SELECT * FROM sanpham a
WHERE a.MASP NOT IN (
SELECT c.MASP FROM cthd c);

-- 10 In ra danh sách các sản phẩm (MASP,TENSP) không bán được trong năm 2006.

SELECT * FROM sanpham a 
WHERE a.MASP NOT IN (SELECT b.MASP FROM cthd b
WHERE b.SOHD IN 
(SELECT c.SOHD FROM hoadon c WHERE c.NGHD >= "2006-01-01" AND c.NGHD <= "2006-12-31")); 

-- 11 In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất không bán được trong năm 2006.

SELECT * FROM sanpham a
WHERE a.NUOCSX = "Trung Quoc" AND a.MASP IN 
(SELECT a.MASP FROM sanpham a WHERE a.MASP NOT IN 
(SELECT b.MASP FROM cthd bWHERE b.SOHD IN 
(SELECT c.SOHD FROM hoadon c WHERE c.NGHD >= "2006-01-01" AND c.NGHD <= "2006-12-31"))); 

-- 12 Có bao nhiêu hóa đơn không phải của khách hàng đăng ký thành viên mua?

SELECT COUNT(a.SOHD) AS So_Luong_Hoa_Don FROM hoadon a
WHERE a.MAKH NOT IN (SELECT b.MAKH FROM khachhang b);

-- 13 Cho biết trị giá hóa đơn cao nhất, thấp nhất là bao nhiêu ?

SELECT a.TRIGIA FROM hoadon a
ORDER BY a.TRIGIA DESC
LIMIT 1;
SELECT a.TRIGIA FROM hoadon a
ORDER BY a.TRIGIA ASC 
LIMIT 1;

-- 14 Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu?

SELECT round(AVG(a.TRIGIA)) AS TRUNG_BINH FROM  hoadon a
WHERE a.NGHD >= "2006-01-01" AND a.NGHD <="2006-12-31";

-- 15 Tính doanh thu bán hàng trong năm 2006.

SELECT round(sum(a.TRIGIA)) AS DOANH_THU FROM  hoadon a
WHERE a.NGHD >= "2006-01-01" AND a.NGHD <="2006-12-31";

-- 16 Tìm số hóa đơn có trị giá cao nhất trong năm 2006.

SELECT a.MAKH FROM hoadon a
WHERE a.NGHD >= "2006-01-01" AND a.NGHD <="2006-12-31"
ORDER BY a.TRIGIA DESC
LIMIT 1;

-- 17.Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006.

SELECT * FROM khachhang b
WHERE b.MAKH IN (SELECT a.MAKH FROM hoadon a
WHERE a.NGHD >= "2006-01-01" AND a.NGHD <="2006-12-31"
ORDER BY a.TRIGIA DESC)
LIMIT 3;

-- 18.In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất.

SELECT b.MAKH, b.HOTEN FROM khachhang b
WHERE b.MAKH IN (SELECT a.MAKH FROM hoadon a 
ORDER BY a.TRIGIA DESC)
LIMIT 3;

-- 19.In ra danh sách các sản phẩm (MASP, TENSP) có giá bán bằng 1 trong 3 mức giá cao nhất.

SELECT a.MASP, a.TENSP FROM sanpham a
ORDER BY a.GIA DESC
limit 3;

-- 20.In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất (sắp xếp theo kiểu xếp hạng).

SELECT b.MAKH, b.HOTEN FROM khachhang b
WHERE b.MAKH IN (SELECT a.MAKH FROM hoadon a 
ORDER BY a.TRIGIA DESC)
LIMIT 3;

-- 21.Tính tổng số sản phẩm do “Trung Quốc” sản xuất

SELECT COUNT(a.MASP) AS TONG_SAN_PHAM  FROM sanpham a
WHERE a.NUOCSX ="Trung Quoc";

-- 22.Tính tổng số sản phẩm của từng nước sản xuất.

SELECT COUNT(a.MASP) AS TONG_SAN_PHAM, a.NUOCSX  FROM sanpham a
GROUP BY a.NUOCSX;

-- 23.Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm.

SELECT MAX(s.GIA)AS "GIAMAX", MIN(s.GIA)AS "GIAMIN", ROUND(AVG(s.GIA),2) AS "GIATB",s.NUOCSX
FROM sanpham s
WHERE s.GIA IS not null
GROUP BY s.NUOCSX;

-- 24.Tính doanh thu bán hàng mỗi ngày.

SELECT SUM(a.TRIGIA) AS "DOANH_THU", DATE(a.NGHD) AS "ngayDG"
FROM hoadon a
GROUP BY DATE(a.NGHD);

-- 25.Tính tổng số lượng của từng sản phẩm bán ra trong ngày 28/10/2006.

SELECT SUM(b.SL) AS "TONG_SP",b.MASP FROM hoadon a INNER JOIN cthd b ON a.SOHD = b.SOHD
WHERE a.NGHD = "2006-10-28"
GROUP BY b.MASP; 

-- 26.Tính doanh thu bán hàng của từng tháng trong năm 2006.

SELECT SUM(a.TRIGIA) AS "TONG" , MONTH(a.NGHD) AS "THANG"
FROM hoadon a
WHERE YEAR(a.NGHD) = 2006
GROUP BY month(a.NGHD);

-- 27.Tìm khách hàng (MAKH, HOTEN) có số lần mua hàng nhiều nhất.

SELECT * FROM khachhang a  
right JOIN hoadon b ON ((a.MAKH) = b.MAKH)
;

SELECT COUNT(c.SOHD) AS "SLHD", c.MAKH FROM hoadon c
GROUP BY c.MAKH 
ORDER BY COUNT(c.SOHD) DESC
;

-- 28.Tìm sản phẩm (MASP, TENSP) có tổng số lượng bán ra thấp nhất trong năm 2006.
-- 29.Tháng mấy trong năm 2006, doanh số bán hàng thấp nhất ?
-- 30.Mỗi nước sản xuất, tìm sản phẩm (MASP,TENSP) có giá bán cao nhất.
-- 31.Trong 10 khách hàng có doanh số cao nhất, tìm khách hàng có số lần mua hàng nhiều nhất.
-- 32.Tìm nước sản xuất sản xuất ít nhất 3 sản phẩm có giá bán khác nhau.



