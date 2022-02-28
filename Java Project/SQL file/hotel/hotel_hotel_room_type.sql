-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `hotel_room_type`
--

DROP TABLE IF EXISTS `hotel_room_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotel_room_type` (
  `Hotel_Room_Type_ID` int NOT NULL,
  `Hotel_ID` int DEFAULT NULL,
  `Hotel_Floor_Room_Level` int DEFAULT NULL,
  `Room_Price` int DEFAULT NULL,
  `Hotel_Room_Name` char(5) DEFAULT NULL,
  PRIMARY KEY (`Hotel_Room_Type_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel_room_type`
--

LOCK TABLES `hotel_room_type` WRITE;
/*!40000 ALTER TABLE `hotel_room_type` DISABLE KEYS */;
INSERT INTO `hotel_room_type` VALUES (1111,1,1,100,'A1'),(1121,1,1,100,'A2'),(1131,1,1,100,'A3'),(1141,1,1,100,'A4'),(1152,1,1,90,'B1'),(1162,1,1,90,'B2'),(1172,1,1,90,'B3'),(1182,1,1,90,'B4'),(1193,1,1,70,'C1'),(1211,1,2,110,'A1'),(1221,1,2,110,'A2'),(1231,1,2,110,'A3'),(1241,1,2,110,'A4'),(1252,1,2,100,'B1'),(1262,1,2,100,'B2'),(1272,1,2,100,'B3'),(1282,1,2,100,'B4'),(1293,1,2,80,'C1'),(1311,1,3,110,'A1'),(1321,1,3,110,'A2'),(1331,1,3,110,'A3'),(1341,1,3,110,'A4'),(1352,1,3,100,'B1'),(1362,1,3,100,'B2'),(1372,1,3,100,'B3'),(1382,1,3,100,'B4'),(1393,1,3,80,'C1'),(1411,1,4,120,'A1'),(1421,1,4,120,'A2'),(1431,1,4,120,'A3'),(1441,1,4,120,'A4'),(1452,1,4,110,'B1'),(1462,1,4,110,'B2'),(1472,1,4,110,'B3'),(1482,1,4,110,'B4'),(1493,1,4,90,'C1'),(1511,1,5,120,'A1'),(1521,1,5,120,'A2'),(1531,1,5,120,'A3'),(1541,1,5,120,'A4'),(1552,1,5,110,'B1'),(1562,1,5,110,'B2'),(1572,1,5,110,'B3'),(1582,1,5,110,'B4'),(1593,1,5,90,'C1'),(1611,1,6,120,'A1'),(1621,1,6,120,'A2'),(1631,1,6,120,'A3'),(1641,1,6,120,'A4'),(1652,1,6,110,'B1'),(1662,1,6,110,'B2'),(1672,1,6,110,'B3'),(1682,1,6,110,'B4'),(1693,1,6,90,'C1'),(1711,1,7,120,'A1'),(1721,1,7,120,'A2'),(1731,1,7,120,'A3'),(1741,1,7,120,'A4'),(1752,1,7,110,'B1'),(1762,1,7,110,'B2'),(1772,1,7,110,'B3'),(1782,1,7,110,'B4'),(1793,1,7,90,'C1'),(1811,1,8,130,'A1'),(1821,1,8,130,'A2'),(1831,1,8,130,'A3'),(1841,1,8,130,'A4'),(1852,1,8,120,'B1'),(1862,1,8,120,'B2'),(1872,1,8,120,'B3'),(1882,1,8,120,'B4'),(1893,1,8,100,'C1'),(1911,1,9,130,'A1'),(1921,1,9,130,'A2'),(1931,1,9,130,'A3'),(1941,1,9,130,'A4'),(1952,1,9,120,'B1'),(1962,1,9,120,'B2'),(1972,1,9,120,'B3'),(1982,1,9,120,'B4'),(1993,1,9,100,'C1'),(11011,1,10,130,'A1'),(11021,1,10,130,'A2'),(11031,1,10,130,'A3'),(11041,1,10,130,'A4'),(11052,1,10,120,'B1'),(11062,1,10,120,'B2'),(11072,1,10,120,'B3'),(11082,1,10,120,'B4'),(11093,1,10,100,'C1'),(11103,1,1,70,'C2'),(11113,1,1,70,'C3'),(11123,1,1,70,'C4'),(12103,1,2,80,'C2'),(12113,1,2,80,'C3'),(12123,1,2,80,'C4'),(13103,1,3,80,'C2'),(13113,1,3,80,'C3'),(13123,1,3,80,'C4'),(14103,1,4,90,'C2'),(14113,1,4,90,'C3'),(14123,1,4,90,'C4'),(15103,1,5,90,'C2'),(15113,1,5,90,'C3'),(15123,1,5,90,'C4'),(16103,1,6,90,'C2'),(16113,1,6,90,'C3'),(16123,1,6,90,'C4'),(17103,1,7,90,'C2'),(17113,1,7,90,'C3'),(17123,1,7,90,'C4'),(18103,1,8,100,'C2'),(18113,1,8,100,'C3'),(18123,1,8,100,'C4'),(19103,1,9,100,'C2'),(19113,1,9,100,'C3'),(19123,1,9,100,'C4'),(110103,1,10,100,'C2'),(110113,1,10,100,'C3'),(110123,1,10,100,'C4');
/*!40000 ALTER TABLE `hotel_room_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-22 20:15:28
