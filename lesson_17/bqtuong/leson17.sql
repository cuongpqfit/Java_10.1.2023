-- 20 * In ra danh sách 3 khách hàng (MAKH, HOTEN) có doanh số cao nhất (sắp xếp theo kiểu xếp hạng). 
SELECT *
FROM khachhang D
ORDER BY B.DOANHSO DESC
LIMIT 3;

-- 21.Tính tổng số sản phẩm do “Trung Quốc” sản xuất 
SELECT COUNT(A.MASP) AS tong_so_luong_sp , A.NUOCSX
FROM sanpham A
WHERE A.NUOCSX = 'Trung Quoc'


-- 22.Tính tổng số sản phẩm của từng nước sản xuất. 
SELECT COUNT(A.MASP), A.NUOCSX
FROM sanpham A
GROUP BY A.NUOCSX


-- 23 Với từng nước sản xuất, tìm giá bán cao nhất, thấp nhất, trung bình của các sản phẩm. 
SELECT A.NUOCSX, MAX(A.GIA) AS GIÁ_BÁN_CAO_NHẤT , MIN(A.GIA) AS GIÁ_BÁN_THẤP_NHẤT, AVG  (A.GIA) AS GIÁ_BÁN_TRUNG_BÌNH
FROM SANPHAM A
GROUP BY A.NUOCSX

-- 24 Tính doanh thu bán hàng mỗi ngày. 
SELECT B.NGHD , SUM(TRIGIA) AS tổng_doanh_thu
FROM hoadon B
GROUP BY B.NGHD

-- 25 Tính tổng số lượng của từng sản phẩm bán ra trong ngày 28/10/2006. 
SELECT MASP , SUM(SL) TONG_SL, B.NGHD
FROM hoadon B
LEFT JOIN chitiethd C ON B.SOHD = C.SOHD
WHERE STR_TO_DATE (B.NGHD, "%d/%m/%Y") = "2006-10-28"
GROUP BY MASP,B.NGHD

-- 26 Tính doanh thu bán hàng của từng tháng trong năm 2006. 
SELECT SUM(B.TRIGIA) TONG_DOANH_THU , MONTH(NGHD)
FROM hoadon B
INNER JOIN Chitiethd C ON B.SOHD = C.SOHD
WHERE B.SOHD = C.SOHD AND YEAR(STR_TO_DATE (B.NGHD, "%d/%m/%Y")) = "2006"
GROUP BY MONTH(NGHD);

-- 27 Tìm khách hàng (MAKH, HOTEN) có số lần mua hàng nhiều nhất. 
SELECT D.MAKH, D.HOTEN
FROM khachhang  D
INNER JOIN HOADON B ON (D.MAKH = B.MAKH)
ORDER BY MAKH  ASC 
LIMIT 1



-- 28 Tìm sản phẩm (MASP, TENSP) có tổng số lượng bán ra thấp nhất trong năm 2006. 
SELECT A.MASP,A.TENSP
FROM sanpham A
LEFT JOIN (
	SELECT A.MASP , SUM(SL) sum bai1
	FROM chitiethd A
	WHERE A.SOHD IN ( 
		SELECT A.SOHD
		FROM hoadon A
		WHERE  YEAR(STR_TO_DATE (A.NGHD, "%d/%m/%Y")) = "2006")
		GROUP BY A.MASP) E ON A.MASP = E.MASP
		WHERE E.sum IS NOT NULL
		ORDER BY e.sum ASC
		LIMIT 1 ;


-- 29 Tháng mấy trong năm 2006, doanh số bán hàng thấp nhất ? 
SELECT SUM(B.TRIGIA) TONG_DOANH_THU , MONTH(NGHD)
FROM hoadon B
INNER JOIN Chitiethd C ON B.SOHD = C.SOHD
WHERE B.SOHD = C.SOHD AND YEAR(STR_TO_DATE(B.NGHD, "%d/%m/%Y")) = "2006"
GROUP BY MONTH(NGHD)
ORDER BY SUM(B.TRIGIA) ASC
LIMIT 1

-- 30 Mỗi nước sản xuất, tìm sản phẩm (MASP,TENSP) có giá bán cao nhất. 
SELECT *
FROM sanpham A
WHERE A.GIA = (
	SELECT MAX(B.GIA)
	FROM sanpham B
	WHERE A.NUOCSX  = B.NUOCSX);

-- 31 *Trong 10 khách hàng có doanh số cao nhất, tìm khách hàng có số lần mua hàng nhiều nhất. 
SELECT A.MAKH, COUNT(A.SOHD) SO_LAN_MUA_HANG
FROM hoadon A
INNER JOIN (
SELECT B.MAKH, B.DOANHSO
FROM KHACHHANG B
ORDER BY DOANHSO DESC
LIMIT 10) B ON A.MAKH = B.MAKH
GROUP BY A.MAKH
ORDER BY COUNT(A.SOHD) DESC;


-- 32 *Tìm nước sản xuất sản xuất ít nhất 3 sản phẩm có giá bán khác nhau. 
SELECT A.NUOCSX, COUNT(A.GIA)
FROM sanpham A
GROUP BY A.NUOCSX
HAVING COUNT(DISTINCT A.GIA) >= 3;

