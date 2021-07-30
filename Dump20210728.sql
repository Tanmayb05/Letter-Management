CREATE DATABASE  IF NOT EXISTS `letter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `letter`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: letter
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `branchletter`
--

DROP TABLE IF EXISTS `branchletter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branchletter` (
  `InwardRegisterNo` int DEFAULT NULL,
  `Subject` varchar(500) DEFAULT NULL,
  `Fr` varchar(50) DEFAULT NULL,
  `DateReceived` varchar(10) DEFAULT NULL,
  `Branch` varchar(50) DEFAULT NULL,
  `ToEmployee` varchar(50) DEFAULT NULL,
  `DateCompleted` varchar(10) DEFAULT NULL,
  `CompletedInDays` int DEFAULT NULL,
  `Acknowledgement` tinyint(1) DEFAULT NULL,
  `Feedback` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branchletter`
--

LOCK TABLES `branchletter` WRITE;
/*!40000 ALTER TABLE `branchletter` DISABLE KEYS */;
INSERT INTO `branchletter` VALUES (106,NULL,'John Slater','14-07-2021','Branch 4','Select To','15-07-2021',1,1,'Hi'),(103,NULL,'Isha','30-06-2021','Branch 1','Tanmay Bhuskute','14-07-2021',14,1,'Completed Finally'),(603,NULL,'Rachel','19-07-2021','Branch 2','TYTY TYTY','19-07-2021',0,1,'Done'),(509,'Health','John','20-07-2021','Branch 3','Nihal Shah','29-07-2021',9,1,'op'),(909,'Hello','qwert','21-07-2021','Branch 3','Nihal Shah',NULL,NULL,NULL,NULL),(988,'Hello','Tanmay','21-07-2021','Branch 4','ty tr',NULL,NULL,NULL,NULL),(999,'iuiu','okok','21-07-2021','Branch 4','ty tr','29-07-2021',8,1,'asdas');
/*!40000 ALTER TABLE `branchletter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branchmembers`
--

DROP TABLE IF EXISTS `branchmembers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branchmembers` (
  `id` int NOT NULL,
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Branch` varchar(45) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `PendingTask` varchar(45) DEFAULT NULL,
  `CompletedTask` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branchmembers`
--

LOCK TABLES `branchmembers` WRITE;
/*!40000 ALTER TABLE `branchmembers` DISABLE KEYS */;
INSERT INTO `branchmembers` VALUES (123,NULL,NULL,'Isha','2','Isha','Isha@1234','isha',NULL,NULL);
/*!40000 ALTER TABLE `branchmembers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clerk`
--

DROP TABLE IF EXISTS `clerk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clerk` (
  `idClerk` int NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Emailid` varchar(45) DEFAULT NULL,
  `Username` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idClerk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clerk`
--

LOCK TABLES `clerk` WRITE;
/*!40000 ALTER TABLE `clerk` DISABLE KEYS */;
INSERT INTO `clerk` VALUES (454,'Isha Dhumal','isha@gmail.com','isha.dhumal','Isha@123'),(503,'Tanmay','tanmaybhuskute8@gmail.com','tanmay','Tanmay@123');
/*!40000 ALTER TABLE `clerk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EmpID` int NOT NULL,
  `FirstName` varchar(20) DEFAULT NULL,
  `LastName` varchar(20) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Branch` varchar(50) DEFAULT NULL,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `emailID` varchar(50) DEFAULT NULL,
  `PendingTasks` int DEFAULT NULL,
  `CompletedTasks` int DEFAULT NULL,
  PRIMARY KEY (`EmpID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (101,'Tanmay','Bhuskute','Tanmay Bhuskute','Branch 1','tanmay','12345','tanmaybhuskute8',0,NULL),(201,'Amit','Jeve','Amit Jeve','Branch 3','amitjeve209','12345','amitjeve209@gmail.com',NULL,NULL),(301,'Kara','Guzman','Kara Guzman','Branch 1','kara.guzman','Kara@guzman123','kara.guzman@gmail.com',NULL,NULL),(505,'Norman','Sharp','Norman Sharp','Branch 1','norman.sharp','Norman@sharp123','norman.sharp@gmail.com',NULL,NULL),(554,'Nihal','Shah','Nihal Shah','Branch 3','NihalShah69','NihalShah@69','nihalmshah@gmail.com',NULL,NULL),(901,'Edric','Wilcher','Edric Wilcher','Branch 2','edric.wilcher','Edric@wilcher123','edric.wilcher@gmail.com',2,0),(909,'Greg','Adams','Greg Adams','Branch 2','greg.adams','Greg@adams123','greg.adams@gmail.com',NULL,NULL),(998,'Claire','Lowe','Claire Lowe','Branch 4','claire.lowe','claire@lowe123','claire.lowe@gmail.com',NULL,NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inwardregister`
--

DROP TABLE IF EXISTS `inwardregister`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inwardregister` (
  `LetterID` int NOT NULL,
  `Fr` varchar(45) DEFAULT NULL,
  `Subject` varchar(255) DEFAULT NULL,
  `Branch` varchar(45) DEFAULT NULL,
  `ToEmployee` varchar(45) DEFAULT NULL,
  `EmployeeID` varchar(45) DEFAULT NULL,
  `cDateReceived` varchar(45) DEFAULT NULL,
  `cDateSent` varchar(45) DEFAULT NULL,
  `eDateReceived` varchar(45) DEFAULT NULL,
  `eDateCompleted` varchar(45) DEFAULT NULL,
  `Acknowledgement` tinyint(1) DEFAULT NULL,
  `Progress` varchar(45) DEFAULT '0',
  `Feedback` varchar(1000) DEFAULT NULL,
  `CompletedInDays` int DEFAULT NULL,
  PRIMARY KEY (`LetterID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inwardregister`
--

LOCK TABLES `inwardregister` WRITE;
/*!40000 ALTER TABLE `inwardregister` DISABLE KEYS */;
INSERT INTO `inwardregister` VALUES (220,'Ruby Kirk','Astronaut','Branch 4','Claire Lowe',NULL,'23-06-2021','20-07-2021',NULL,NULL,NULL,'0',NULL,NULL),(232,'Water','Tank','Branch 2','Edric Wilcher',NULL,'25-07-2021','25-07-2021',NULL,'26-07-2021',1,'Incomplete',NULL,NULL),(352,'Vania Cannon','Fort','Branch 3','Amit Jeve',NULL,'14-06-2021','03-07-2021',NULL,NULL,NULL,'0',NULL,NULL),(467,'Printer','Print','Branch 2','Edric Wilcher','901','20-06-2021','25-07-2021','25-07-2021','26-07-2021',2,'Completed','popop',1),(505,'Pop','IOI','Branch 3','Amit Jeve',NULL,'24-06-2021','23-07-2021',NULL,NULL,NULL,'0',NULL,NULL),(555,'Derek','House','Branch 4','Claire Lowe','998','20-06-2021','23-07-2021','26-07-2021','26-07-2021',2,'Completed','in work',0),(667,'Reyna','Hotel','Branch 2','Edric Wilcher',NULL,'23-07-2021','25-07-2021','25-07-2021','26-07-2021',2,'Completed',NULL,1),(741,'Print','Printer','Branch 2','Edric Wilcher',NULL,'21-07-2021','25-07-2021','25-07-2021','26-07-2021',1,'CompletedIncomplete','jollyhappy',NULL),(774,'Miranda Binder','Restaurant','Branch 2','Edric Wilcher',NULL,'27-06-2021','13-07-2021','25-07-2021','26-07-2021',2,'Completed',NULL,1),(794,'Jett','Hotel','Branch','Edric Wilcher',NULL,'13-07-2021','19-07-2021',NULL,NULL,0,'0',NULL,NULL),(804,'Taylor','Swift','Branch 2','Edric Wilcher','901','30-06-2021','25-07-2021',NULL,NULL,0,'Added To Database',NULL,NULL),(805,'Eric','Listen','Branch 3','Amit Jeve',NULL,'20-07-2021','23-07-2021',NULL,NULL,NULL,'0',NULL,NULL),(809,'Isha','YUI','Branch 1','Kara Guzman',NULL,'23-07-2021','24-07-2021',NULL,NULL,NULL,'0',NULL,NULL),(819,'Yoru','Cafe','Branch 2','Edric Wilcher',NULL,'21-07-2021','22-07-2021',NULL,NULL,0,'',NULL,NULL),(888,'Nihall','SHah','Branch 2','Edric Wilcher','901','26-07-2021','30-07-2021','25-07-2021','26-07-2021',2,'Completed','Work in Progress',1),(956,'Mobile','Phone','Branch 2','Edric Wilcher',NULL,'25-07-2021','25-07-2021',NULL,NULL,0,'Added To Database',NULL,NULL),(996,'Water','Tank','Branch 1','Norman Sharp','505','23-07-2021','24-07-2021','26-07-2021','26-07-2021',2,'Completed','Hello',0),(3364,'Patrick Castillo','Water Bottle','Branch 1','Norman Sharp',NULL,'23-05-2021','14-06-2021',NULL,NULL,NULL,'0',NULL,NULL);
/*!40000 ALTER TABLE `inwardregister` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'letter'
--

--
-- Dumping routines for database 'letter'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-28 10:17:08
