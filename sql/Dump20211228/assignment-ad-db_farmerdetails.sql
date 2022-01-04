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
-- Table structure for table `farmerdetails`
--

DROP TABLE IF EXISTS `farmerdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `farmerdetails` (
  `farmerID` int NOT NULL,
  `farmerName` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `landArea` double DEFAULT NULL,
  `addNo` varchar(45) DEFAULT NULL,
  `addLine01` varchar(45) DEFAULT NULL,
  `addCity` varchar(45) DEFAULT NULL,
  `subsidizedFertilizer_subfertID` int NOT NULL,
  PRIMARY KEY (`farmerID`),
  KEY `fk_farmerDetails_subsidizedFertilizer1_idx` (`subsidizedFertilizer_subfertID`),
  CONSTRAINT `fk_farmerDetails_subsidizedFertilizer1` FOREIGN KEY (`subsidizedFertilizer_subfertID`) REFERENCES `subsidizedfertilizer` (`subfertID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `farmerdetails`
--

LOCK TABLES `farmerdetails` WRITE;
/*!40000 ALTER TABLE `farmerdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `farmerdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-28 23:09:14
