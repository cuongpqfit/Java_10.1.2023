-- Lấy tất cả dữ liệu của bảng với alias A
SELECT A.* FROM KHACHHANG A;

-- Lấy tất cả dữ liệu của bảng nhưng chỉ lấy 1 số cột
SELECT A.MAKH, A.HOTEN, A.DCHI FROM KHACHHANG A;

-- Lấy 1 phần dữ liệu của bảng sử dụng mệnh đề where sử dụng AND, OR, IS NOT NULL, 
-- Điều kiện xác định
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE (A.HOTEN = 'Nguyen Van A');

-- Xử dụng OR
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE (A.HOTEN = 'Nguyen Van A') OR (A.HOTEN = 'Tran Ngoc Linh');

-- Xử dụng AND 
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE (A.HOTEN = 'Nguyen Van A') AND (A.DCHI = '23/5 Nguyen Trai, Q5, TpHCM');

-- Xử dụng AND & OR
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE (A.HOTEN = 'Nguyen Van A') AND (A.DCHI = '23/5 Nguyen Trai, Q5, TpHCM') OR (A.HOTEN = 'Tran Ngoc Linh');


-- Xử dụng AND & OR & like
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE (A.HOTEN = 'Nguyen Van A') AND (A.DCHI LIKE '%Nguyen Trai%') OR (A.HOTEN = 'Tran Ngoc Linh');

-- Xử dụng where là không lấy NULL
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE A.DCHI IS NOT NULL;

-- Xử dụng where lấy NULL
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE A.DCHI IS NULL;

-- Xử dụng where mệnh đề IN
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE A.HOTEN IN ('Nguyen Van A', 'Le Hoai Thuong');

-- Xử dụng where mệnh đề IN với SELECT
SELECT A.MAKH, A.HOTEN, A.DCHI 
FROM KHACHHANG A
WHERE A.MAKH IN (SELECT MAKH FROM HOADON);

-- Xử dụng where mệnh đề BETWEEN giá trị nằm ở giữa 1 khoảng
SELECT A.*
FROM KHACHHANG A
WHERE A.DOANHSO BETWEEN 900000 AND 20000000;