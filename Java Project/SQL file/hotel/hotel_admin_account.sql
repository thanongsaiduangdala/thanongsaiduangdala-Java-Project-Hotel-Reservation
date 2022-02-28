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
-- Table structure for table `admin_account`
--

DROP TABLE IF EXISTS `admin_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_account` (
  `Admin_ID` int NOT NULL,
  `Admin_Email` varchar(100) DEFAULT NULL,
  `Admin_password` varchar(100) DEFAULT NULL,
  `Admin_FName` varchar(100) DEFAULT NULL,
  `Admin_LName` varchar(100) DEFAULT NULL,
  `Admin_PhoneNum` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Admin_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_account`
--

LOCK TABLES `admin_account` WRITE;
/*!40000 ALTER TABLE `admin_account` DISABLE KEYS */;
INSERT INTO `admin_account` VALUES (1,'Admin','Admin12345','Admin','Admin','123456789'),(2,'sunny.duangdal@gmail.com','sunnyduan','Sunny','Duangdala','02032187113'),(4,'vixay.nocum@gmail.com','vixay12345','vixay','nocum','02032183781'),(5,'Big.nocum@gmail.com','Big12345','Big','nocum','0203213289'),(6,'vixay.nocum1@gmail.com','vixay12345','Kaison','nocum','02023891832'),(7,'big.nocum1@gmail.com','e2','sunny','duangdala','020321312333'),(8,'sunny.duandgala1@gmail.com','Ilikeminecraft040610','sunny','duangdala','02032187113'),(9,'sunny.duangdal1@gmail.com','qwert12345','ewqe','qwewqe','02032187112'),(10,'big.nocum@gmail.com','Ilikeminecraft040610','Big','Nocum','0203213123'),(11,'big.nocu3m@gmail.com','Ilikeminecraft040610','Big','Nocum','02032131233'),(12,'sunny.duangdala3@gmail.com','Ilikeminecraft040610','sunny','duangdala','02032323'),(13,'wqewqewq','qwer1234','weqwe','qweqw','2323214314'),(14,'Pencill@gmail.com','pen123456','Penbig','pencil','020321321312'),(15,'sunny.lo2l@gmail.com','big123456','Thanongsai2','Duangdala2','02023198278391'),(16,'Big.Sinon2@gmail.com','Big12345','Big2','Sinon2','02032132'),(17,'Example2@gmail.com','Example12345','Example2','Example2','0201234567892'),(18,'sunny.duan@gmail.com','sunnyduan12345','Sunny','Duangdala','02023123213'),(19,'sunny.duan1@gmail.com','sunnyduan1234','Sunny','Duangdala','0202312321'),(20,'sunny.sunny1@gmail.com','sunny12345','Sunny','Sunny','020231231');
/*!40000 ALTER TABLE `admin_account` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-22 20:15:29
