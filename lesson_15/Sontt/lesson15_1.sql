SELECT * FROM sanpham;
SELECT * FROM sanpham2;

-- 1.	Cập nhật giá tăng 5% đối với những sản phẩm do “Thai Lan” sản xuất.
START TRANSACTION;
UPDATE sanpham2 A SET
 A.GIA = (A.GIA * 1.05)
WHERE A.NUOCSX ="Thai Lan";

COMMIT;

-- 2.	Cập nhật giá giảm 5% đối với những sản phẩm do “Trung Quoc” sản xuất có giá từ 10.000 trở xuống.
START TRANSACTION;
UPDATE sanpham2 A SET
 A.GIA = (A.GIA * 0.95)
WHERE A.NUOCSX ="Trung Quoc" AND A.GIA <=10000;

COMMIT;

-- 1. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất 
SELECT A.MASP, A.TENSP 
FROM sanpham A
WHERE A.NUOCSX = "Trung Quoc";

-- 2.In ra danh sách các sản phẩm (MASP, TENSP) có đơn vị tính là “cây”, ”quyển”.
SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE (A.DVT = "cay") OR (A.DVT = "quyen");

-- 3.In ra danh sách các sản phẩm (MASP,TENSP) có mã sản phẩm bắt đầu là “B” và kết thúc là “01”.
SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE (A.MASP like "B%") AND (A.MASP LIKE "%01");

-- 4.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 20.000 đến 30.000.
SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE A.NUOCSX ="Trung Quoc" AND A.GIA BETWEEN 20000 AND 30000;

-- 5.	In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” hoặc “Thái Lan” sản xuất có giá từ 20.000 đến 30.000.
SELECT A.MASP, A.TENSP
FROM sanpham A
WHERE A.NUOCSX IN ("Trung Quoc","Thai Lan") AND A.GIA BETWEEN 20000 AND 30000;

-- 6.	In ra các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2007 và ngày 2/1/2007.
SELECT A.SOHD, A.TRIGIA
FROM hoadon A
WHERE A.NGHD IN("1/1/2007", "2/1/2007");

