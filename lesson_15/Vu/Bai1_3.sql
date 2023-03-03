SELECT * FROM bai1.KHACHHANG;

-- Cập nhật giá trị LOAIKH là “Vip” đối với những khách hàng đăng ký thành viên trước ngày 1/1/2007 
-- có doanh số từ 10.000.000 trở lên hoặc khách hàng đăng ký thành viên từ 1/1/2007 trở về sau 
-- có doanh số từ 2.000.000 trở lên.
-- THEM COT LOAIKH
ALTER TABLE `bai1`.`KHACHHANG` 
ADD COLUMN `LOAIKH` VARCHAR(10) NOT NULL AFTER `NGGN`;

-- những khách hàng đăng ký thành viên trước ngày 1/1/2007 có doanh số từ 10.000.000 trở lên
--  hoặc khách hàng đăng ký thành viên từ 1/1/2007 trở về sau có doanh số từ 2.000.000 trở lên.
UPDATE KHACHHANG SET
LOAIKH = 'VIP'
WHERE (NGGN < '2007-1-1'AND DOANHSO >= 1000000) OR (NGGN >= '2007-1-1' AND DOANHSO > 2000000);
-- AND DOANHSO >= 10000000
-- OR NGGN >= '2007-1-1' AND DOANHSO >= 20000000;

SELECT * FROM bai1.KHACHHANG
where NGGN < '2007-1-1';

SELECT * FROM bai1.KHACHHANG
where NGGN >= '1/1/2007';

UPDATE KHACHHANG SET 
LOAIKH = '';