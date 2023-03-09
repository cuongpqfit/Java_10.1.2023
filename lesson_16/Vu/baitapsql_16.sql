-- 7.Tìm các số hóa đơn mua cùng lúc 2 sản phẩm có mã số “BB01” và “BB02”,
--  mỗi sản phẩm mua với số lượng từ 10 đến 20.
SELECT SOHD ,MASP ,SL FROM CTHD A
WHERE MASP IN ('BB01','BB02') AND SL BETWEEN 10 AND 20;
-- bai thay sua
select a.sohd, count(a.sohd) as so_san_pham
from cthd a 
where a.masp in('BB01','BB02') AND a.SL >10
group by a.sohd
having so_san_pham =2;


-- 8.In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” 
-- sản xuất hoặc các sản phẩm được bán ra trong ngày 1/1/2007.
SELECT * FROM SANPHAM A
WHERE A.NUOCSX = 'TRUNG QUOC'
OR A.MASP IN(
SELECT B.MASP FROM CTHD B
WHERE B.SOHD IN 
(SELECT C.SOHD 
FROM HOADON C
WHERE C.TEMP_NGHD ='2007-1-1'));


-- 9.In ra danh sách các sản phẩm (MASP,TENSP) không bán được.
SELECT B.MASP, B.TENSP FROM SANPHAM B 
WHERE B.MASP NOT IN 
(SELECT  distinct A.MASP FROM CTHD A);

-- 10.In ra danh sách các sản phẩm (MASP,TENSP) không bán được trong năm 2006.
SELECT C.MASP, C.TENSP
FROM SANPHAM C
WHERE C.MASP IN (
SELECT B.MASP FROM CTHD B
WHERE B.SOHD IN (
SELECT A.SOHD
FROM HOADON A 
WHERE date_format(A.TEMP_NGHD,'%Y') !=2006));

-- 11.In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất không bán được trong năm 2006.
SELECT C.MASP, C.TENSP
FROM SANPHAM C
WHERE C.MASP IN (
SELECT B.MASP FROM CTHD B
WHERE B.SOHD IN (
SELECT A.SOHD
FROM HOADON A 
WHERE date_format(A.TEMP_NGHD,'%Y') !=2006)) 
AND C.NUOCSX = 'TRUNG QUOC';
 
-- 12.Có bao nhiêu hóa đơn không phải của khách hàng đăng ký thành viên mua?
SELECT COUNT(A.MAKH) FROM HOADON A
WHERE A.MAKH = 'NULL'; 
-- 13.Cho biết trị giá hóa đơn cao nhất, thấp nhất là bao nhiêu ?
SELECT
 MAX(A.TRIGIA) AS MAX_TRI_GIA ,
 MIN(A.TRIGIA) AS MIN_TRI_GIA
FROM HOADON A;

-- 14.Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu?
SELECT ROUND(AVG(A.TRIGIA),3) AS TRI_GIA_TB 
FROM HOADON A
WHERE DATE_FORMAT(A.TEMP_NGHD, '%Y') = 2006;
-- 15.Tính doanh thu bán hàng trong năm 2006.
SELECT SUM(A.TRIGIA) AS TONG_DOANH_THU 
FROM HOADON A
WHERE DATE_FORMAT(A.TEMP_NGHD, '%Y') = 2006;
-- 16.Tìm số hóa đơn có trị giá cao nhất trong năm 2006.
SELECT A.SOHD 
FROM HOADON A
WHERE A.TRIGIA = (
SELECT
 MAX(A.TRIGIA) AS MAX_TRI_GIA 
FROM HOADON A
WHERE DATE_FORMAT(A.TEMP_NGHD, '%Y') = 2006);

-- 17.Tìm họ tên khách hàng đã mua hóa đơn có trị giá cao nhất trong năm 2006.

SELECT B.HOTEN FROM KHACHHANG B 
WHERE B.MAKH =(
SELECT A.MAKH FROM HOADON A 
WHERE A.TRIGIA = ( 
SELECT MAX(A.TRIGIA)
FROM HOADON A
WHERE DATE_FORMAT(A.TEMP_NGHD, '%Y') = 2006));

-- 18.In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất.
SELECT B.MAKH, B.HOTEN 
FROM KHACHHANG B
WHERE B.MAKH IN (
SELECT A.MAKH FROM HOADON A 
ORDER BY A.TRIGIA DESC)
LIMIT 3;

-- 19.In ra danh sách các sản phẩm (MASP, TENSP) có giá bán bằng 1 trong 3 mức giá cao nhất.
SELECT B.MASP, B.TENSP 
FROM SANPHAM B 
WHERE B.GIA IN (
SELECT A.GIA 
FROM SANPHAM A
ORDER BY A.GIA DESC
LIMIT 3);


-- 19.In ra danh sách các sản phẩm (MASP, TENSP) có giá bán bằng 1 trong 3 mức giá cao nhất.
SELECT B.MASP, B.TENSP 
FROM SANPHAM B 
WHERE B.GIA IN (
SELECT A.GIA 
FROM SANPHAM A
ORDER BY A.GIA DESC
LIMIT 3);


-- 20. In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất (sắp xếp theo kiểu xếp hạng).
SELECT A.MAKH, A.HOTEN 
FROM KHACHHANG A
ORDER BY A.DOANHSO DESC
LIMIT 3;

-- 21.Tính tổng số sản phẩm do “Trung Quốc” sản xuất
SELECT COUNT(A.NUOCSX) 
FROM SANPHAM A 
WHERE A.NUOCSX = 'TRUNG QUOC';
-- 22.Tính tổng số sản phẩm của từng nước sản xuất.
SELECT COUNT(A.NUOCSX) AS TONG_SO_SP , A.NUOCSX
FROM SANPHAM A
GROUP BY A.NUOCSX;

-- 23.Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm.
SELECT A.NUOCSX, MAX(A.GIA) , MIN(A.GIA) , AVG(A.GIA) 
FROM SANPHAM A
GROUP BY A.NUOCSX;

-- 24.Tính doanh thu bán hàng mỗi ngày.
SELECT A.TEMP_NGHD AS NGAY, SUM(A.TRIGIA) AS DOANH_THU
FROM HOADON A
GROUP BY A.TEMP_NGHD;

-- 25.Tính tổng số lượng của từng sản phẩm bán ra trong ngày 28/10/2006.
SELECT C. MASP, SUM(C.SL) FROM CTHD C 
GROUP BY C.MASP;

SELECT *FROM CTHD C 
WHERE C.MASP IN ( 
(SELECT B.MASP FROM CTHD B
WHERE B.SOHD IN (
SELECT A.SOHD FROM HOADON A 
WHERE A.TEMP_NGHD = '2006-10-28')));

SELECT A.SOHD FROM HOADON A 
WHERE A.TEMP_NGHD = '2006-10-28';
-- 26.Tính doanh thu bán hàng của từng tháng trong năm 2006.
-- 27.Tìm khách hàng (MAKH, HOTEN) có số lần mua hàng nhiều nhất.
-- 28.Tìm sản phẩm (MASP, TENSP) có tổng số lượng bán ra thấp nhất trong năm 2006.
-- 29.Tháng mấy trong năm 2006, doanh số bán hàng thấp nhất ?
-- 30.Mỗi nước sản xuất, tìm sản phẩm (MASP,TENSP) có giá bán cao nhất.
-- 31.*Trong 10 khách hàng có doanh số cao nhất, tìm khách hàng có số lần mua hàng nhiều nhất.
-- 32.*Tìm nước sản xuất sản xuất ít nhất 3 sản phẩm có giá bán khác nhau.