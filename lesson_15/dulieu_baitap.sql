-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.11.2-MariaDB-1:10.11.2+maria~ubu2204 - mariadb.org binary distribution
-- Server OS:                    debian-linux-gnu
-- HeidiSQL Version:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for bai1
DROP DATABASE IF EXISTS `bai1`;
CREATE DATABASE IF NOT EXISTS `bai1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;
USE `bai1`;

-- Dumping structure for table bai1.CTHD
DROP TABLE IF EXISTS `CTHD`;
CREATE TABLE IF NOT EXISTS `CTHD` (
  `SOHD` int(11) DEFAULT NULL,
  `NGHD` varchar(512) DEFAULT NULL,
  `MAKH` varchar(512) DEFAULT NULL,
  `MANV` varchar(512) DEFAULT NULL,
  `TRIGIA` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table bai1.CTHD: ~23 rows (approximately)
INSERT IGNORE INTO `CTHD` (`SOHD`, `NGHD`, `MAKH`, `MANV`, `TRIGIA`) VALUES
	(1001, '23/07/2006', 'KH01', 'NV01', 320000),
	(1002, '12/8/06', 'KH01', 'NV02', 840000),
	(1003, '23/08/2006', 'KH02', 'NV01', 100000),
	(1004, '1/9/06', 'KH02', 'NV01', 180000),
	(1005, '20/10/2006', 'KH01', 'NV02', 3800000),
	(1006, '16/10/2006', 'KH01', 'NV03', 2430000),
	(1007, '28/10/2006', 'KH03', 'NV03', 510000),
	(1008, '28/10/2006', 'KH01', 'NV03', 440000),
	(1009, '28/10/2006', 'KH03', 'NV04', 200000),
	(1010, '1/11/06', 'KH01', 'NV01', 5200000),
	(1011, '4/11/06', 'KH04', 'NV03', 250000),
	(1012, '30/11/2006', 'KH05', 'NV03', 21000),
	(1013, '12/12/06', 'KH06', 'NV01', 5000),
	(1014, '31/12/2006', 'KH03', 'NV02', 3150000),
	(1015, '1/1/07', 'KH06', 'NV01', 910000),
	(1016, '1/1/07', 'KH07', 'NV02', 12500),
	(1017, '2/1/07', 'KH08', 'NV03', 35000),
	(1018, '13/01/2007', 'KH08', 'NV03', 330000),
	(1019, '13/01/2007', 'KH01', 'NV03', 30000),
	(1020, '14/01/2007', 'KH09', 'NV04', 70000),
	(1021, '16/01/2007', 'KH10', 'NV03', 67500),
	(1022, '16/01/2007', 'Null', 'NV03', 7000),
	(1023, '17/01/2007', 'Null', 'NV01', 330000);

-- Dumping structure for table bai1.HOADON
DROP TABLE IF EXISTS `HOADON`;
CREATE TABLE IF NOT EXISTS `HOADON` (
  `SOHD` int(11) DEFAULT NULL,
  `NGHD` varchar(512) DEFAULT NULL,
  `MAKH` varchar(512) DEFAULT NULL,
  `MANV` varchar(512) DEFAULT NULL,
  `TRIGIA` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table bai1.HOADON: ~23 rows (approximately)
INSERT IGNORE INTO `HOADON` (`SOHD`, `NGHD`, `MAKH`, `MANV`, `TRIGIA`) VALUES
	(1001, '23/07/2006', 'KH01', 'NV01', 320000),
	(1002, '12/8/06', 'KH01', 'NV02', 840000),
	(1003, '23/08/2006', 'KH02', 'NV01', 100000),
	(1004, '1/9/06', 'KH02', 'NV01', 180000),
	(1005, '20/10/2006', 'KH01', 'NV02', 3800000),
	(1006, '16/10/2006', 'KH01', 'NV03', 2430000),
	(1007, '28/10/2006', 'KH03', 'NV03', 510000),
	(1008, '28/10/2006', 'KH01', 'NV03', 440000),
	(1009, '28/10/2006', 'KH03', 'NV04', 200000),
	(1010, '1/11/06', 'KH01', 'NV01', 5200000),
	(1011, '4/11/06', 'KH04', 'NV03', 250000),
	(1012, '30/11/2006', 'KH05', 'NV03', 21000),
	(1013, '12/12/06', 'KH06', 'NV01', 5000),
	(1014, '31/12/2006', 'KH03', 'NV02', 3150000),
	(1015, '1/1/07', 'KH06', 'NV01', 910000),
	(1016, '1/1/07', 'KH07', 'NV02', 12500),
	(1017, '2/1/07', 'KH08', 'NV03', 35000),
	(1018, '13/01/2007', 'KH08', 'NV03', 330000),
	(1019, '13/01/2007', 'KH01', 'NV03', 30000),
	(1020, '14/01/2007', 'KH09', 'NV04', 70000),
	(1021, '16/01/2007', 'KH01', 'NV03', 67500),
	(1022, '16/01/2007', 'Null', 'NV03', 7000),
	(1023, '17/01/2007', 'Null', 'NV01', 330000);

-- Dumping structure for table bai1.KHACHHANG
DROP TABLE IF EXISTS `KHACHHANG`;
CREATE TABLE IF NOT EXISTS `KHACHHANG` (
  `MAKH` varchar(4) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `HOTEN` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `DCHI` varchar(31) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `SODT` int(11) DEFAULT NULL,
  `NGSINH` varchar(19) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `DOANHSO` int(11) DEFAULT NULL,
  `NGGN` varchar(19) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table bai1.KHACHHANG: ~10 rows (approximately)
INSERT IGNORE INTO `KHACHHANG` (`MAKH`, `HOTEN`, `DCHI`, `SODT`, `NGSINH`, `DOANHSO`, `NGGN`) VALUES
	('KH01', 'Nguyen Van A', '731 Tran Hung Dao, Nguyen Trai', 8823451, '22/10/1960', 13060000, '22/07/2006'),
	('KH02', 'Nguyen Van A', '23/5 Nguyen Trai, Q5, TpHCM', 908256478, '1974-03-04 00:00:00', 280000, '30/07/2006'),
	('KH03', 'Tran Ngoc Linh', '45 Nguyen Canh Chan, Q1, TpHCM', 938776266, '1980-12-06 00:00:00', 3860000, '2006-05-08 00:00:00'),
	('KH04', 'Nguyen Van A', '50/34 Le Dai Hanh, Q10, TpHCM', 917325476, '1965-09-03 00:00:00', 250000, '2006-02-10 00:00:00'),
	('KH05', 'Tran Ngoc Linh', '34 Truong Dinh, Q3, TpHCM', 8246108, '1950-10-03 00:00:00', 21000, '28/10/2006'),
	('KH06', 'Le Hoai Thuong', '227 Nguyen Van Cu, Q5, TpHCM', 8631738, '31/12/1981', 915000, '24/11/2006'),
	('KH07', 'Nguyen Van Tam', '32/3 Tran Binh Trong, Q5, TpHCM', 916783565, '1971-06-04 00:00:00', 12500, '2006-01-12 00:00:00'),
	('KH08', 'Phan Thi Thanh', '45/2 An Duong Vuong, Q5, TpHCM', 938435756, '1971-10-01 00:00:00', 365000, '13/12/2006'),
	('KH09', 'Le Ha Vinh', '873 Le Hong Phong, Q5, TpHCM', 8654763, '1979-03-09 00:00:00', 70000, '14/01/2007'),
	('KH10', 'Ha Duy Lap', 'NULL', 8768904, '1983-02-05 00:00:00', 67500, '16/01/2007'),
	('KH11', 'Pham Quoc Cuong', NULL, NULL, NULL, NULL, NULL);

-- Dumping structure for table bai1.NHANVIEN
DROP TABLE IF EXISTS `NHANVIEN`;
CREATE TABLE IF NOT EXISTS `NHANVIEN` (
  `MANV` varchar(512) DEFAULT NULL,
  `HOTEN` varchar(512) DEFAULT NULL,
  `DTHOAI` int(11) DEFAULT NULL,
  `NGVL` varchar(512) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table bai1.NHANVIEN: ~5 rows (approximately)
INSERT IGNORE INTO `NHANVIEN` (`MANV`, `HOTEN`, `DTHOAI`, `NGVL`) VALUES
	('NV01', 'Nguyen Nhu Nhut', 927345678, '13/4/2006'),
	('NV02', 'Le Thi Phi Yen', 987567390, '21/4/2006'),
	('NV03', 'Nguyen Van B', 997047382, '27/4/2006'),
	('NV04', 'Ngo Thanh Tuan', 913758498, '24/6/2006'),
	('NV05', 'Nguyen Thi Truc Thanh', 918590387, '20/7/2006');

-- Dumping structure for table bai1.SANPHAM
DROP TABLE IF EXISTS `SANPHAM`;
CREATE TABLE IF NOT EXISTS `SANPHAM` (
  `MASP` varchar(512) NOT NULL DEFAULT '0',
  `TENSP` varchar(512) DEFAULT NULL,
  `DVT` varchar(512) DEFAULT NULL,
  `NUOCSX` varchar(512) DEFAULT NULL,
  `GIA` double DEFAULT NULL,
  PRIMARY KEY (`MASP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table bai1.SANPHAM: ~28 rows (approximately)
INSERT IGNORE INTO `SANPHAM` (`MASP`, `TENSP`, `DVT`, `NUOCSX`, `GIA`) VALUES
	('BB01', 'But bi', 'cay', 'Viet Nam', 5000),
	('BB02', 'But bi', 'cay', 'Trung Quoc', 7000),
	('BB03', 'But bi', 'hop', 'Thai Lan', 100000),
	('BC01', 'But chi', 'cay', 'Trung Quoc', 3000),
	('BC02', 'But chi', 'cay', 'Thai Lan', 5000),
	('BC03', 'But chi', 'cay', 'Viet Nam', 3500),
	('BC04', 'But chi', 'hop', 'Viet Nam', 30000),
	('BD01', 'Ten san pham BD', 'cay', 'Viet Nam', 5000),
	('BD02', 'ten san pham DB 02', NULL, NULL, NULL),
	('BD03', 'ten san pham DB 021', NULL, NULL, NULL),
	('BD031', 'ten san pham DB 021', NULL, NULL, NULL),
	('ST01', 'So tay 500 trang', 'quyen', 'Trung Quoc', 40000),
	('ST02', 'So tay loai 1', 'quyen', 'Viet Nam', 55000),
	('ST03', 'So tay loai 2', 'quyen', 'Viet Nam', 51000),
	('ST04', 'So tay', 'quyen', 'Thai Lan', 55000),
	('ST05', 'So tay mong', 'quyen', 'Thai Lan', 20000),
	('ST06', 'Phan viet bang', 'hop', 'Viet Nam', 5000),
	('ST07', 'Phan khong bui', 'hop', 'Viet Nam', 7000),
	('ST08', 'Bong bang', 'cai', 'Viet Nam', 1000),
	('ST09', 'But long', 'cay', 'Viet Nam', 5000),
	('ST10', 'But long', 'cay', 'Trung Quoc', 7000),
	('TV01', 'Tap 100 giay mong', 'quyen', 'Trung Quoc', 2500),
	('TV02', 'Tap 200 giay mong', 'quyen', 'Trung Quoc', 4500),
	('TV03', 'Tap 100 giay tot', 'quyen', 'Viet Nam', 3000),
	('TV04', 'Tap 200 giay tot', 'quyen', 'Viet Nam', 5500),
	('TV05', 'Tap 100 trang', 'chuc', 'Viet Nam', 23000),
	('TV06', 'Tap 200 trang', 'chuc', 'Viet Nam', 53000),
	('TV07', 'Tap 100 trang', 'chuc', 'Trung Quoc', 34000);

-- Dumping structure for table bai1.SANPHAM2
DROP TABLE IF EXISTS `SANPHAM2`;
CREATE TABLE IF NOT EXISTS `SANPHAM2` (
  `MASP` varchar(512) NOT NULL DEFAULT '0',
  `TENSP` varchar(512) DEFAULT NULL,
  `GIA` double DEFAULT NULL,
  `NUOCSX` varchar(512) DEFAULT NULL,
  `IS_DELETE` int(11) DEFAULT NULL,
  `Them_Cot` int(11) DEFAULT NULL,
  PRIMARY KEY (`MASP`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table bai1.SANPHAM2: ~27 rows (approximately)
INSERT IGNORE INTO `SANPHAM2` (`MASP`, `TENSP`, `GIA`, `NUOCSX`, `IS_DELETE`, `Them_Cot`) VALUES
	('BB01', 'Ten sản phẩm update 1 tí nữa mới rollback', 5000, 'VIETNAM 2', NULL, NULL),
	('BB02', 'But bi', 7000, 'Trung Quoc', NULL, NULL),
	('BB03', 'But bi', 100000, 'Thai Lan', NULL, NULL),
	('BC01', 'But chi', 3000, 'Trung Quoc', NULL, NULL),
	('BC02', 'But chi', 5000, 'Thai Lan', NULL, NULL),
	('BC03', 'But chi', 3500, 'Viet Nam', 1, NULL),
	('BC04', 'But chi', 30000, 'Viet Nam', NULL, NULL),
	('BD01', 'Ten san pham BD', 5000, 'Viet Nam', NULL, NULL),
	('ST01', 'So tay 500 trang', 40000, 'Trung Quoc', NULL, NULL),
	('ST02', 'So tay loai 1', 55000, 'Viet Nam', NULL, NULL),
	('ST03', 'So tay loai 2', 51000, 'Viet Nam', NULL, NULL),
	('ST04', 'So tay', 55000, 'Thai Lan', NULL, NULL),
	('ST05', 'So tay mong', 20000, 'Thai Lan', NULL, NULL),
	('ST06', 'Phan viet bang', 5000, 'Viet Nam', NULL, NULL),
	('ST07', 'Phan khong bui', 7000, 'Viet Nam', NULL, NULL),
	('ST08', 'Bong bang', 1000, 'Viet Nam', NULL, NULL),
	('ST09', 'But long', 5000, 'Viet Nam', NULL, NULL),
	('ST10', 'But long', 7000, 'Trung Quoc', NULL, NULL),
	('TV01', 'Tap 100 giay mong', 2500, 'Trung Quoc', NULL, NULL),
	('TV02', 'Tap 200 giay mong', 4500, 'Trung Quoc', NULL, NULL),
	('TV03', 'Tap 100 giay tot', 3000, 'Viet Nam', NULL, NULL),
	('TV04', 'Tap 200 giay tot', 5500, 'Viet Nam', NULL, NULL),
	('TV05', 'Tap 100 trang', 23000, 'Viet Nam', NULL, NULL),
	('TV06', 'Tap 200 trang', 53000, 'Viet Nam', NULL, NULL),
	('TV07', 'Tap 100 trang', 34000, 'Trung Quoc', NULL, NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
hoadontable1table1db_namesdb_name2sakiladb_name2db_name2cthd