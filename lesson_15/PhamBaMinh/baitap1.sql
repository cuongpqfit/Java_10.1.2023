I.Ngôn ngữ thao tác dữ liệu (Data Manipulation Language


--	Cập nhật giá tăng 5% đốibai1bai1 với những sản phẩm do “Thai Lan” sản xuất.

SELECT * FROM sanpham;


SELECT A.NUOCSX, A.GIA  
FROM sanpham A
WHERE A.NUOCSX = 'Thai Lan';


UPDATE sanpham A
SET A.GIA = A.GIA*1.05
WHERE A.NUOCSX = 'Thai Lan';

--	Cập nhật giá giảm 5% đối với những sản phẩm do “Trung Quoc” sản xuất có giá từ 10.000 trở xuống.

SELECT A.NUOCSX, A.GIA
FROM sanpham A
WHERE A.NUOCSX='Trung Quoc' AND A.GIA <=10000;

UPDATE sanpham A
SET A.GIA = A.GIA * 0.95
WHERE A.NUOCSX='Trung Quoc' AND A.GIA <=10000;


-- Cập nhật giá trị khachhangkhachhang là “Vip” đối với những khách hàng đăng ký thành viên trước ngày 1/1/2007 có doanh số từ 10.000.000 trở lên hoặc khách hàng đăng ký thành viên từ 1/1/2007 trở về sau có doanh số từ 2.000.000 trở lên.

SELECT A.NGGN, A.DOANHSO, A.LOAIKH
FROM KHACHHANG A
WHERE
(DATE(A.NGGN) < "2007-01-01" AND A.DOANHSO >= 10000000) 
OR (DATE(A.NGGN) > "2007-01-01" AND A.DOANHSO >= 2000000);

UPDATE khachhang A
SET A.LOAIKH = 'VIP'
WHERE
(DATE(A.NGGN) < "2007-01-01" AND A.DOANHSO >= 10000000) 
OR (DATE(A.NGGN) > "2007-01-01" AND A.DOANHSO >= 2000000);


II. Viết các câu truy vấn:

-- 1.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất.
SELECT * FROM sanpham;

SELECT A.MASP, A.TENSP,A.NUOCSX 
FROM sanpham A 
WHERE A.NUOCSX = 'Trung Quoc';

-- 2.	In ra danh sách các sản phẩm (MASP, TENSP) có đơn vị tính là “cây”, ”quyển”.

SELECT * FROM sanpham;

SELECT A.MASP, A.TENSP, A.DVT
FROM sanpham A
WHERE A.DVT = 'cay' OR A.DVT = 'quyen';

-- 3.	In ra danh sách các sản phẩm (MASP,TENSP) có mã sản phẩm bắt đầu là “B” và kết thúc là “01”.

SELECT * FROM sanpham;

SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE ( A.MASP LIKE 'B%') AND (A.MASP LIKE '%01');

-- 4.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 20.000 đến 30.000.

SELECT * FROM sanpham;

SELECT A.MASP, A.TENSP,A.NUOCSX,A.GIA
FROM sanpham A
WHERE A.NUOCSX = 'Trung Quoc' AND (A.GIA BETWEEN 20000 AND 30000);

--  5.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” hoặc “Thái Lan” sản xuất có giá từ 20.000 đến 30.000.

SELECT * FROM sanpham;

SELECT  A.MASP, A.TENSP, A.NUOCSX, A.GIA
FROM sanpham A
WHERE ( A.NUOCSX = 'Trung Quoc' OR A.NUOCSX = 'Thai Lan') AND (A.GIA BETWEEN 20000 AND 30000); 

--  6.	In ra các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2007 và ngày 2/1/2007.

SELECT * FROM hoadon;

SELECT A.TRIGIA, A.NGHD
FROM hoadon A
WHERE DATE(A.NGHD BETWEEN '2007-01-01'AND'2007-01-02') ;







