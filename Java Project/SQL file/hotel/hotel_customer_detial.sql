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
-- Table structure for table `customer_detial`
--

DROP TABLE IF EXISTS `customer_detial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_detial` (
  `Customer_ID` int NOT NULL,
  `Customer_First_Name` varchar(100) DEFAULT NULL,
  `Customer_Last_Name` varchar(100) DEFAULT NULL,
  `Customer_Email` varchar(100) DEFAULT NULL,
  `Customer_stay_Detail_ID` int DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_detial`
--

LOCK TABLES `customer_detial` WRITE;
/*!40000 ALTER TABLE `customer_detial` DISABLE KEYS */;
INSERT INTO `customer_detial` VALUES (1,'Vixay2','Nocum2','Vixa2y.nocum2@gmail.com',1),(2,'Suny','Duang','sunny.sjdka@gmail.com',2),(3,'Vixay2','Vonpanya2','Vonpanya2@gmail.com',3),(4,'sunny','duangdala','sunny.shdakjsd2@gmail.com',4),(5,'sunny','duangdala','wjelkwjl@gmail.com',5),(6,'big','idklastname','big.idklastname@gmail.com',6),(7,'First Nameeqwe','qweqweq','weqweqw',7),(8,'First Nameweqw','qweqw','qweqwe@gmail.com',8),(9,'First Namewewqe','qweqw','eqwe',9),(10,'big','nocmm','bigsdkjaskdjla@gmail.com',10),(11,'qwewq','ewqeqw','qweqwqeqwe',11),(12,'First Nameerq','qweqwe','qweqweq',12),(13,'wqeqw','eqwe','wqeqwe',13),(14,'First Nameweqw','qweqwe','wqeqweqwe',14),(15,'First Nameqewqe','qwewqeq','wewqewqewq',15),(16,'weqwe','qwewqe','wqeqwewqe',16),(17,'wqe','wqewq','wqewqe',17),(18,'qwewq','ewqeqwe','qwewqewqe',18),(19,'wqeqw','eqweqw','eqwewqeq',19),(20,'wqewq','ewqewq','qweqweqw',20),(21,'weqwe','wqeqwe','qweqweqwe',21),(22,'First Nameweq','qweqwe','qweqweqwe',22),(23,'First Namewwqe','wqeqwe','qweqweqwe',23),(24,'wqewq','ewqewq','eqweqwe',24),(25,'First Nameewqe','wqeqweqwe','qwewqewqe',25),(26,'First Nameweqw','eqweqw','ewqewqewq',26),(27,'sunny','sdjaskdjl','lol',27),(28,'wqeqwe','qweqweq','wqeqweqwe',28),(29,'sdsada','sadsa','sadasdas',29),(30,'qweqw','wqeqwe','qwewqeqw',30),(31,'wqeqwe','qwewq','qwewqeqwe',31),(32,'weqwewqeqw','qwewqewqe','qwewqewqe',32),(33,'wqewqeqwe','qwewqewq','qweqwewqeqw',33),(34,'wqewqeqwe','qwewqewq','qweqwewqe',34),(35,'qwewqeqwewq','wqeqweqweq','qweqweqwewq',35),(36,'weqweqwewqe','qweqwewqe','qwewqewqe',36),(37,'erwerwer','ewrwerwerw','qwrqwrq',37),(38,'eqweqwe','qweqweqw','qweqweqwe',38),(39,'wqewqeqweqw','qwewqeqwe','qwewqewq',39),(40,'wewqewqeqwe','wqeqweqwe','qwewqeqw',40),(41,'qwqqeqwe','Last Nameqeqe','qweqweqwe',41),(42,'wqeqweqweq','wqeqweqwe','wqeqweqwe',42),(43,'wewqewq','qwewqeqw','ewqewqewq',43),(44,'wqewqe','qweqweqw','eqweqw',44),(45,'yae','miko','yae.miko@gmail.com',45),(46,'sunny2','duangdala2','sunny.duangdal2@gmail.com',46),(47,'Yae','Miko','Yae.miko@gmail.com',47),(48,'uiyhuyuiyi','hjljhjk','dfgdfgfgfg',48),(49,'uyuiyi','hgjhgjgj','oiuyiouiouio',49),(50,'Sunny','Duangdala','sunny.duangdal@gmail.com',50),(51,'sdasdasd','asdasdas','asdasdasd',51),(52,'sund','sadas','sdkalkld',52),(53,'sunny','duangdal','sunny.duangdal@gmail.com',53),(54,'wqeqwe','wqewqe','wqewqe',54),(56,'v','s','vs@gmail;.com',56),(57,'qwewq','wqeqw','eqwewq',57),(58,'First Namewewqeq','ewqewq','ewqeqw',58),(59,'Big','Son','Big.Son@gmail.com',59),(60,'big','come','bigcome@gmail.com',60),(61,'LOL','weqwe','lohahah@gmail.com',61),(62,'Big','Sinon','Big.Sinon@gmail.com',62),(63,'Big','Big','Big@gmail.com',63),(64,'weqwe','ewqeqw','wqeqw',64),(65,'Sunny','Sunny','Sunny@gmail.com',65),(66,'Big','Big','Big@gmail.com',66),(67,'sunny','duan','sunny@gmail.com',67),(68,'sunny','sunny','sunny.sunny@gmail.com',68),(69,'big2','big1','big.big22@gmail.com',69);
/*!40000 ALTER TABLE `customer_detial` ENABLE KEYS */;
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
