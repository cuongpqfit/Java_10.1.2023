-- lưu ý, thường sẽ ko update primary key
-- update tất cả dữ liệu trong bảng 
UPDATE SANPHAM2 SET
	TENSP = 'Ten san pham update',
	NUOCSX = 'VIETNAM';
	
-- khi sử dụng update thì cần phải có mệnh đề where
UPDATE SANPHAM2 SET
	TENSP = '[Update] voi where',
	NUOCSX = 'VIETNAM 2'
WHERE (MASP = 'BD02');