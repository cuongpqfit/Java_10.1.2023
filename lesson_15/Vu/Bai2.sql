SELECT * FROM bai1.SANPHAM;

-- 1.In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất.
SELECT MASP, TENSP -- NUOCSX
FROM SANPHAM WHERE NUOCSX = 'TRUNG QUOC';

-- 2.In ra danh sách các sản phẩm (MASP, TENSP) có đơn vị tính là “cây”, ”quyển”.
SELECT MASP, TENSP -- DVT
FROM SANPHAM WHERE DVT = 'CAY' OR DVT = 'QUYEN';

-- 3.In ra danh sách các sản phẩm (MASP,TENSP) có mã sản phẩm bắt đầu là “B” và kết thúc là “01”.
SELECT MASP, TENSP 
FROM SANPHAM WHERE MASP LIKE  'B%01' ;

-- 4.In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 20.000 đến 30.000.
SELECT MASP, TENSP -- , NUOCSX, GIA 
FROM SANPHAM WHERE NUOCSX = 'TRUNG QUOC' AND GIA BETWEEN 20000 AND 40000 ;

SELECT MASP, TENSP , NUOCSX, GIA
FROM SANPHAM WHERE NUOCSX='TRUNG QUOC' ;

-- 5.In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” hoặc “Thái Lan” sản xuất có giá từ 20.000 đến 30.000.
SELECT MASP, TENSP , NUOCSX, GIA 
FROM SANPHAM WHERE NUOCSX IN ('TRUNG QUOC', 'THAI LAN') AND GIA BETWEEN 20000 AND 40000 ;

SELECT MASP, TENSP , NUOCSX, GIA
FROM SANPHAM WHERE NUOCSX IN ('TRUNG QUOC','THAI LAN' );

SELECT * FROM bai1.CTHD;

-- 6.In ra các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2007 và ngày 2/1/2007.
SELECT SOHD, TRIGIA , NGHD FROM CTHD
WHERE NGHD IN ('1/1/07','2/1/07');