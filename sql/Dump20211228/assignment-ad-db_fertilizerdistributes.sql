-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: assignment-ad-db
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
-- Table structure for table `fertilizerdistributes`
--

DROP TABLE IF EXISTS `fertilizerdistributes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fertilizerdistributes` (
  `subfertDistributing_subDistributibgID` int NOT NULL,
  `farmerDetails_farmerID` int NOT NULL,
  `distributeDate` varchar(45) DEFAULT NULL,
  `quentity` double DEFAULT NULL,
  PRIMARY KEY (`subfertDistributing_subDistributibgID`,`farmerDetails_farmerID`),
  KEY `fk_subfertDistributing_has_farmerDetails_farmerDetails1_idx` (`farmerDetails_farmerID`),
  KEY `fk_subfertDistributing_has_farmerDetails_subfertDistributin_idx` (`subfertDistributing_subDistributibgID`),
  CONSTRAINT `fk_subfertDistributing_has_farmerDetails_farmerDetails1` FOREIGN KEY (`farmerDetails_farmerID`) REFERENCES `farmerdetails` (`farmerID`),
  CONSTRAINT `fk_subfertDistributing_has_farmerDetails_subfertDistributing1` FOREIGN KEY (`subfertDistributing_subDistributibgID`) REFERENCES `subfertdistributing` (`subDistributibgID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fertilizerdistributes`
--

LOCK TABLES `fertilizerdistributes` WRITE;
/*!40000 ALTER TABLE `fertilizerdistributes` DISABLE KEYS */;
/*!40000 ALTER TABLE `fertilizerdistributes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-28 23:09:09
