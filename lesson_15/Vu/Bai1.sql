SELECT * FROM bai1.SANPHAM2;

-- 1.Cập nhật giá tăng 5% đối với những sản phẩm do “Thai Lan” sản xuất.
UPDATE SANPHAM2 SET
GIA = GIA*1.05
WHERE (NUOCSX = 'THAI LAN');

SELECT * FROM bai1.SANPHAM2
WHERE NUOCSX = 'Thai Lan';

-- Cập nhật giá giảm 5% đối với những sản phẩm do “Trung Quoc” sản xuất có giá từ 10.000 trở xuống.
UPDATE SANPHAM2 SET
GIA = GIA*0.95, IS_DELETE ='1' 
WHERE (NUOCSX = 'TRUNG QUOC') AND GIA <10000;

SELECT * FROM bai1.SANPHAM2
WHERE NUOCSX = 'TRUNG QUOC';
