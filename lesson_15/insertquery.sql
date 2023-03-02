-- insert đầy đủ tất cả các cột
INSERT INTO SANPHAM VALUES ('BD01', 'Ten san pham BD', 'cay', 'Viet Nam', 5000);

-- insert không đầy đủ các cột
INSERT INTO SANPHAM(MASP, TENSP) VALUES ('BD03', 'ten san pham DB 021');

-- insert dữ liệu bị trùng primary key bỏ qua không làm gì
INSERT IGNORE INTO SANPHAM(MASP, TENSP) VALUES ('BD03', 'ten san pham DB 021');

-- insert dữ liệu bị trùng primary key nhưng update lại dữ liệu cũ
INSERT INTO SANPHAM(MASP, TENSP) VALUES ('BD03', 'ten san pham DB 021') 
ON DUPLICATE KEY UPDATE TENSP = 'ten san pham DB 021';

-- insert dữ liệu từ 1 bảng sang 1 bảng khác
INSERT INTO SANPHAM2(MASP,  GIA, TENSP, NUOCSX) SELECT MASP, GIA, TENSP, NUOCSX FROM SANPHAM;