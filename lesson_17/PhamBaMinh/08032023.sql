-- 20.	* In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất (sắp xếp theo kiểu xếp hạng).

SELECT k.MAKH, k.HOTEN
FROM khachhang k
ORDER BY k.DOANHSO DESC 
LIMIT 3
;

-- 21.	Tính tổng số sản phẩm do “Trung Quốc” sản xuất

SELECT  COUNT(s.MASP)  AS "Tong_SP_do_TQ"
FROM sanpham s
WHERE s.NUOCSX = "Trung Quoc"
;

-- 22.	Tính tổng số sản phẩm của từng nước sản xuất

SELECT COUNT(s.MASP),s.NUOCSX AS "So_SP_la"
FROM sanpham s
GROUP BY s.NUOCSX
;

-- 23.	Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm.

SELECT MAX(s.GIA),s.NUOCSX AS "Gia_Cao_nhat_la"
FROM sanpham s
WHERE s.GIA IS not null
GROUP BY s.NUOCSX
;

SELECT MIN(s.GIA),s.NUOCSX AS "Gia_Cao_nhat_la"
FROM sanpham s
WHERE s.GIA IS not null
GROUP BY s.NUOCSX
;


SELECT ROUND(AVG(s.GIA),2),s.NUOCSX AS "Gia_Cao_nhat_la"
FROM sanpham s
WHERE s.GIA IS not null
GROUP BY s.NUOCSX
;

-- 24.	Tính doanh thu bán hàng mỗi ngày.

SELECT SUM(a.TRIGIA) AS "doanh thu ban hang ", DATE(a.NGHD) AS "ngayDG"
FROM hoadon a
GROUP BY DATE(a.NGHD)
;

-- 25.	Tính tổng số lượng của từng sản phẩm bán ra trong ngày 28/10/2006.

SELECT SUM(c.SL) AS "Tong so luong" , c.MASP
FROM hoadon h INNER JOIN cthd c ON h.SOHD = c.SOHD
WHERE h.NGHD = "2006-10-28"
GROUP BY c.MASP
; 

-- 26.	Tính doanh thu bán hàng của từng tháng trong năm 2006.

SELECT SUM(a.TRIGIA) AS "Doanh thu ban hang" , MONTH(a.NGHD)
FROM hoadon a
WHERE YEAR(a.NGHD) = 2006
GROUP BY MONTH(a.NGHD);
;

--  27.	Tìm khách hàng (MAKH, HOTEN) có số lần mua hàng nhiều nhất.

SELECT k.MAKH, k.HOTEN
FROM khachhang k RIGHT JOIN (SELECT COUNT(h.MAKH) ,h.MAKH
FROM hoadon h
GROUP BY h.MAKH
ORDER BY COUNT(h.MAKH) DESC 
) AS b ON k.MAKH = b.MAKH
LIMIT 1
;

-- 28.	Tìm sản phẩm (MASP, TENSP) có tổng số lượng bán ra thấp nhất trong năm 2006

SELECT s.MASP, s.TENSP
FROM sanpham s RIGHT JOIN (
SELECT c.MASP
FROM cthd c RIGHT JOIN (
SELECT *
FROM hoadon h
WHERE YEAR(h.NGHD)= "2006"
) AS b ON b.SOHD = c.SOHD
GROUP BY c.MASP
ORDER BY SUM(SL) ASC
LIMIT 1
) AS tmp ON tmp.MASP = s.MASP


-- 29.	Tháng mấy trong năm 2006, doanh số bán hàng thấp nhất ?

SELECT SUM(a.TRIGIA) AS "Doanhthubanhang" , MONTH(a.NGHD)
FROM hoadon a
WHERE YEAR(a.NGHD) = 2006
GROUP BY MONTH(a.NGHD)
ORDER BY Doanhthubanhang ASC 
LIMIT 1
;


-- 30.	Mỗi nước sản xuất, tìm sản phẩm (MASP,TENSP) có giá bán cao nhất.

SELECT MASP,TENSP,NUOCSX
FROM sanpham s RIGHT JOIN (
SELECT MAX(s.GIA) AS "MAXGIA"
FROM sanpham s
GROUP BY s.NUOCSX
) AS b ON b.MAXGIA = s.GIA
WHERE s.TENSP IS NOT null
;


-- 31.	*Trong 10 khách hàng có doanh số cao nhất, tìm khách hàng có số lần mua hàng nhiều nhất.

SELECT k.HOTEN
FROM khachhang k RIGHT JOIN (
SELECT h.MAKH
FROM hoadon h
GROUP BY h.MAKH
ORDER BY COUNT(h.MAKH) DESC
LIMIT 1
) AS b ON k.MAKH = b.MAKH
ORDER BY k.DOANHSO DESC
LIMIT 10
;

-- 32.	*Tìm nước sản xuất sản xuất ít nhất 3 sản phẩm có giá bán khác nhau.


SELECT a.NUOCSX
FROM (SELECT s.NUOCSX,COUNT(DISTINCT s.MASP)
FROM sanpham s
GROUP BY s.NUOCSX) AS a 
INNER JOIN (
SELECT s.NUOCSX, COUNT(DISTINCT s.GIA)
FROM sanpham s
GROUP BY s.NUOCSX
HAVING COUNT(DISTINCT s.GIA) >=3) AS b
ON a.NUOCSX = b.NUOCSX
