SELECT * FROM sanpham2;

--Cập nhật giá tăng 5% đối với những sản phẩm do “Thai Lan” sản xuất. 
START TRANSACTION;
UPDATE sanpham2 
SET GIA = (GIA + (GIA * 0.05))
WHERE NUOCSX = 'Thai Lan';


--Cập nhật giá giảm 5% đối với những sản phẩm do “Trung Quoc” sản xuất có giá từ 10.000 trở xuống. 
START TRANSACTION;
UPDATE sanpham2 
SET GIA = (GIA - (GIA * 0.05))
WHERE (NUOCSX = 'Trung Quoc') AND ( GIA BETWEEN 0 AND 10000);


--Cập nhật giá trị LOAIKH là “Vip” đối với những khách hàng đăng ký thành viên trước ngày 1/1/2007 có doanh số từ 10.000.000 trở lên
 hoặc khách hàng đăng ký thành viên từ 1/1/2007 trở về sau có doanh số từ 2.000.000 trở lên. 
SELECT * FROM khachhang
START TRANSACTION;
ALTER TABLE khachhang
ADD LOAIKH VARCHAR(50);

UPDATE khachhang
SET LOAIKH = 'Vip'
WHERE  (NGGN < '2007/1/1' AND DOANHSO >= 10000000) OR (NGGN >= '2007/1/1' AND DOANHSO >= 2000000)


-- in ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất. 
SELECT * FROM sanpham

SELECT MASP,TENSP
FROM sanpham
WHERE NUOCSX = 'Trung Quoc';


-- in ra danh sách các sản phẩm (MASP, TENSP) có đơn vị tính là “cây”, ”quyển”. 
SELECT MASP,TENSP
FROM sanpham
WHERE ( DVT ='cay') OR ( DVT = 'quyen');


-- In ra danh sách các sản phẩm (MASP,TENSP) có mã sản phẩm bắt đầu là “B” và kết thúc là “01”. 
SELECT MASP,TENSP
FROM sanpham
WHERE  MASP LIKE 'B%'  AND  MASP LIKE '%01';


-- In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 20.000 đến 30.000. 
SELECT MASP,TENSP
FROM sanpham	
WHERE (NUOCSX = 'Trung Quoc') AND ( GIA BETWEEN 20000 AND 30000);


-- In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” hoặc “Thái Lan” sản xuất có giá từ 20.000 đến 30.000. 
SELECT MASP,TENSP
FROM sanpham	
WHERE ((NUOCSX = 'Trung Quoc') OR  (NUOCSX = 'Thai Lan')) AND  ( GIA BETWEEN 20000 AND 30000);

-- In ra các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2007 và ngày 2/1/2007. 
SELECT * FROM hoadon

SELECT SOHD,TRIGIA
FROM hoadon	
WHERE ((NGHD = '1/1/2007') OR  (NGHD = '2/1/2007'));

SELECT SOHD,TRIGIA
FROM hoadon	
WHERE NGHD  BETWEEN '2007-01-01' AND '2007-01-02';






