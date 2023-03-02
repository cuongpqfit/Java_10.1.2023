-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: bai1
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoadon` (
  `SOHD` int NOT NULL,
  `NGHD` date NOT NULL,
  `MAKH` varchar(4) COLLATE utf8mb3_unicode_ci NOT NULL,
  `MANV` varchar(4) COLLATE utf8mb3_unicode_ci NOT NULL,
  `TRIGIA` double NOT NULL,
  PRIMARY KEY (`SOHD`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
INSERT INTO `hoadon` VALUES (1001,'2006-07-23','KH01','NV01',320000),(1002,'2006-08-12','KH01','NV02',840000),(1003,'2006-08-23','KH02','NV01',100000);
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `MAKH` char(4) COLLATE utf8mb3_unicode_ci NOT NULL,
  `HOTEN` varchar(40) COLLATE utf8mb3_unicode_ci NOT NULL,
  `DCHI` varchar(50) COLLATE utf8mb3_unicode_ci NOT NULL,
  `SODT` varchar(20) COLLATE utf8mb3_unicode_ci NOT NULL,
  `NGSINH` date NOT NULL,
  `DOANHSO` decimal(15,2) NOT NULL,
  `NGDK` date NOT NULL,
  PRIMARY KEY (`MAKH`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES ('KH01','Nguyen Van A','731 Tran Hung Dao, Q5, TpHCM','08823451','1960-10-22',13060000.00,'2006-07-22'),('KH02','Tran Ngoc Han','23/5 Nguyen Trai, Q5, TpHCM','0908256478','1974-04-03',280000.00,'2006-07-30'),('KH03','Tran Ngoc Linh','45 Nguyen Canh Chan, Q1, TpHCM','0938776266','1980-06-12',3860000.00,'2006-08-05');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MANV` char(4) COLLATE utf8mb3_unicode_ci NOT NULL,
  `HOTEN` varchar(40) COLLATE utf8mb3_unicode_ci NOT NULL,
  `SODT` varchar(20) COLLATE utf8mb3_unicode_ci NOT NULL,
  `NGVL` date NOT NULL,
  PRIMARY KEY (`MANV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES ('NV01','Nguyen Nhu Nhut','0927345678','2006-04-13'),('NV02','Le Thi Phi Yen','0987567390','2006-04-21'),('NV03','NV03','0997047382','2006-04-27');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `MASP` char(4) COLLATE utf8mb3_unicode_ci NOT NULL,
  `TENSP` varchar(40) COLLATE utf8mb3_unicode_ci NOT NULL,
  `DVT` varchar(20) COLLATE utf8mb3_unicode_ci NOT NULL,
  `NUOCSX` varchar(40) COLLATE utf8mb3_unicode_ci NOT NULL,
  `GIA` double NOT NULL,
  PRIMARY KEY (`MASP`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES ('BC01','But chi','cay','Trung Quoc',3000),('BB01','But bi','cay','Viet Nam',5000),('TV01','Tap 100 giay mong','quyen','Trung Quoc',2500);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sohd`
--

DROP TABLE IF EXISTS `sohd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sohd` (
  `SOHD` int NOT NULL,
  `MASP` char(4) COLLATE utf8mb3_unicode_ci NOT NULL,
  `SL` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sohd`
--

LOCK TABLES `sohd` WRITE;
/*!40000 ALTER TABLE `sohd` DISABLE KEYS */;
INSERT INTO `sohd` VALUES (1001,'TV02',10),(1001,'ST01',5),(1001,'BC01',5);
/*!40000 ALTER TABLE `sohd` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-01  1:23:27
