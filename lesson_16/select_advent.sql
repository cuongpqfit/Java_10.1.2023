SELECT * from HOADON; 

-- Select với function Sum để tính tổng giá trị cùa cột
Select SUM(A.TRIGIA) AS "Tong_Doanh_So" 
FROM HOADON A
WHERE A.MAKH = 'KH01';

SELECT * from HOADON A
WHERE A.MAKH = 'KH01';

-- Select với function Count * để đếm số hàng
Select Count(*) AS "Tong_So_Hàng" 
FROM HOADON A
WHERE A.MAKH = 'KH01';


-- Select với function Count * để đếm số hàng
Select Count(*) AS "Tong_So_Hàng" 
FROM HOADON A
WHERE A.MAKH = 'KH01';

-- Select với function Count theo cột để đếm số hàng thì chỉ đếm những hàng có cột != null
Select Count(TRIGIA) AS "Tong_So_Hàng" 
FROM HOADON A
WHERE A.MAKH = 'KH01';


-- Select với function MIN lấy giá trị nhỏ nhất của cột != null
Select MIN(TRIGIA) AS "Đơn hàng nhỏ nhất" 
FROM HOADON A
WHERE A.MAKH = 'KH01';

-- Select với function MAX lấy giá trị lớn nhất của cột != null
Select MAX(TRIGIA) AS "Đơn hàng lớn nhất" 
FROM HOADON A
WHERE A.MAKH = 'KH01';

-- Select với function AVG trung bình giá trị của cột
Select AVG(TRIGIA) AS "Đơn hàng giá trị trung bình" 
FROM HOADON A
WHERE A.MAKH = 'KH01';


SELECT * from HOADON A
WHERE A.MAKH = 'KH10';

-- SELECT  lam tron
Select ROUND() (AVG(TRIGIA))  AS "Đơn hàng giá trị trung bình" 
FROM HOADON A
WHERE A.MAKH = 'KH10';


-- Select với GROUP BY
Select *
from HOADON h 
Group by h.MAKH


-- 
KH01  38.000
KH02  xxxxxx
KH03  yyyyyy

-- Select với GROUP BY kết hợp các funtion để tính toán
Select sum(h.TRIGIA) as 'Tong_GTDH', count(h.TRIGIA) as 'So hàng', h.MAKH , h.*
from HOADON h 
Group by h.MAKH


-- Select với ORDER BY
Select sum(h.TRIGIA) as 'Tong_GTDH', count(h.TRIGIA) as 'So_hang', h.MAKH , h.*
from HOADON h 
Group by h.MAKH
ORDER BY Tong_GTDH  ASC -- Giảm | ASC tăng


-- Select với HAVING
Select sum(h.TRIGIA) as 'Tong_GTDH', count(h.TRIGIA) as 'So_hang', h.MAKH , h.*
from HOADON h
where h.TRIGIA is not null
Group by h.MAKH
Having Tong_GTDH > 1000000
ORDER BY Tong_GTDH  ASC;  -- Giảm | ASC tăng

-- Lưu ý thứ tự viết trong câu SELECT 
- select -> from -> where -> group by -> HAVING -> ORDER by


-- Select với giới hạn kết quả trả về
Select sum(h.TRIGIA) as 'Tong_GTDH', count(h.TRIGIA) as 'So_hang', h.MAKH , h.*
from HOADON h
where h.TRIGIA is not null
Group by h.MAKH
Having Tong_GTDH > 1000000
ORDER BY Tong_GTDH  ASC
LIMIT 10;