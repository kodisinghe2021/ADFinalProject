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
-- Table structure for table `fertilizer`
--

DROP TABLE IF EXISTS `fertilizer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fertilizer` (
  `fertilizerID` int NOT NULL,
  `buyingQnt` double DEFAULT NULL,
  `sellingQnt` double DEFAULT NULL,
  `log_logID` int NOT NULL,
  `dailyIncome_incomeID` int NOT NULL,
  `dailyExpences_payID` int NOT NULL,
  `subsidizedFertilizer_subfertID` int NOT NULL,
  `fertilizerDistributing_fertDisID` int NOT NULL,
  PRIMARY KEY (`fertilizerID`),
  KEY `fk_fertilizer_log1_idx` (`log_logID`),
  KEY `fk_fertilizer_dailyIncome1_idx` (`dailyIncome_incomeID`),
  KEY `fk_fertilizer_dailyExpences1_idx` (`dailyExpences_payID`),
  KEY `fk_fertilizer_subsidizedFertilizer1_idx` (`subsidizedFertilizer_subfertID`),
  CONSTRAINT `fk_fertilizer_dailyExpences1` FOREIGN KEY (`dailyExpences_payID`) REFERENCES `dailyexpences` (`payID`),
  CONSTRAINT `fk_fertilizer_dailyIncome1` FOREIGN KEY (`dailyIncome_incomeID`) REFERENCES `dailyincome` (`incomeID`),
  CONSTRAINT `fk_fertilizer_log1` FOREIGN KEY (`log_logID`) REFERENCES `log` (`logID`),
  CONSTRAINT `fk_fertilizer_subsidizedFertilizer1` FOREIGN KEY (`subsidizedFertilizer_subfertID`) REFERENCES `subsidizedfertilizer` (`subfertID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fertilizer`
--

LOCK TABLES `fertilizer` WRITE;
/*!40000 ALTER TABLE `fertilizer` DISABLE KEYS */;
/*!40000 ALTER TABLE `fertilizer` ENABLE KEYS */;
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