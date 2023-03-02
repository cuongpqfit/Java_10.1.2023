SELECT * FROM SANPHAM2;

-- Bat dau của 1 transaction va commit
START TRANSACTION;

-- Lệnh thay đổi dữ liệu trong bảng
UPDATE SANPHAM2 SET
	TENSP = 'Ten sản phẩm update chưa commit',
	NUOCSX = 'VIETNAM 2'
WHERE (MASP = 'BB01');

-- lưu nhưng thay đổi trong transaction xuống db
COMMIT;


-- Bat dau của 1 transaction va rollback
START TRANSACTION;

-- Lệnh thay đổi dữ liệu trong bảng
UPDATE SANPHAM2 SET
	TENSP = 'Ten sản phẩm update 1 tí nữa mới rollback',
	NUOCSX = 'VIETNAM 2'
WHERE (MASP = 'BB01');

-- rollback nhưng thay đổi trong transaction xuống db
ROLLBACK;


-- Bat dau của 1 transaction va commit -> rollback
START TRANSACTION;

-- Lệnh thay đổi dữ liệu trong bảng
UPDATE SANPHAM2 SET
	TENSP = 'Ten sản phẩm update 1 tí nữa mới rollback',
	NUOCSX = 'VIETNAM 2'
WHERE (MASP = 'BB01');

-- rollback sau khi commit thì không thể về dữ liệu cũ được
COMMIT;
ROLLBACK;