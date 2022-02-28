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
-- Table structure for table `rating`
--

DROP TABLE IF EXISTS `rating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rating` (
  `Rating_ID` int NOT NULL,
  `Hotel_ID` int DEFAULT NULL,
  `Rating_Value` int DEFAULT NULL,
  `Customer_Email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Rating_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rating`
--

LOCK TABLES `rating` WRITE;
/*!40000 ALTER TABLE `rating` DISABLE KEYS */;
INSERT INTO `rating` VALUES (1,1,8,'sunny.duandgal@gmail.com'),(2,1,7,'thanon@gmail.com'),(3,1,7,'Thans@gmail.com'),(4,1,8,'sunny2@gmail.com'),(5,1,7,'KK@gmail.com'),(6,1,8,'CCY@gmail.com'),(7,1,10,'Pew@gmail.com'),(8,1,10,'Pew@gmail.com'),(9,1,3,'Pew@gmail.com'),(10,1,0,'lol@gmail.com'),(11,1,0,'lol@gmail.com'),(12,1,0,'lol@fmail.com'),(13,1,10,'sunny.duangdal@gmail.com'),(14,1,10,'wqeqwe'),(15,1,10,'sunny.duangdala1@gmail.com'),(16,1,10,'sunny.duangdala2@gmail.com'),(17,1,10,'sunny.duangdala@gmail.com'),(18,1,8,'wqeqweqwe'),(19,1,8,'sjdak@gmail.com'),(20,1,10,'sunny.sjdka@gmail.com'),(21,1,8,'big.idklastname@gmail.com'),(22,1,0,'Big.Sinon@gmail.com'),(23,1,5,'Big@gmail.com'),(24,1,10,'sunny.sunny@gmail.com');
/*!40000 ALTER TABLE `rating` ENABLE KEYS */;
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
