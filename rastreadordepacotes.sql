CREATE DATABASE  IF NOT EXISTS `rastreador` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rastreador`;
-- MySQL dump 10.13  Distrib 5.6.17, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: rastreador
-- ------------------------------------------------------
-- Server version	5.6.17-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `historico_muamba`
--

DROP TABLE IF EXISTS `historico_muamba`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historico_muamba` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `classe` varchar(255) DEFAULT NULL,
  `dataevento` datetime DEFAULT NULL,
  `date_created` datetime NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `last_updated` datetime NOT NULL,
  `local` varchar(255) DEFAULT NULL,
  `localdestino` varchar(255) DEFAULT NULL,
  `muamba_id` bigint(20) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_fij18cti89uje39hvomos3a9y` (`muamba_id`),
  CONSTRAINT `FK_fij18cti89uje39hvomos3a9y` FOREIGN KEY (`muamba_id`) REFERENCES `muamba` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historico_muamba`
--

LOCK TABLES `historico_muamba` WRITE;
/*!40000 ALTER TABLE `historico_muamba` DISABLE KEYS */;
INSERT INTO `historico_muamba` VALUES (1,0,'verde','2014-07-15 17:10:00','2014-07-16 13:36:41','Entrega Efetuada','2014-07-16 13:36:41','CEE NITEROI - NITEROI/RJ',NULL,1,'01','BDE'),(2,0,'azul','2014-07-15 11:05:00','2014-07-16 13:36:41','Saiu para entrega ao destinatário','2014-07-16 13:36:41','CEE NITEROI - NITEROI/RJ',NULL,1,'01','OEC'),(3,0,'laranja','2014-07-15 07:08:00','2014-07-16 13:36:41','Encaminhado','2014-07-16 13:36:41','CTE BENFICA - RIO DE JANEIRO/RJ','Em trânsito para CEE NITEROI - NITEROI/RJ - SANTA ROSA',1,'01','DO'),(4,0,'laranja','2014-07-14 18:00:00','2014-07-16 13:36:41','Encaminhado','2014-07-16 13:36:41','CTE CAMPINAS/GCCAP - VALINHOS/SP','Em trânsito para CTE BENFICA - RIO DE JANEIRO/RJ - BENFICA',1,'01','DO'),(5,0,'branco','2014-07-14 17:20:00','2014-07-16 13:36:41','Postado','2014-07-16 13:36:41','CTE CAMPINAS/GCCAP - VALINHOS/SP',NULL,1,'01','PO'),(6,0,'indisponivel','2014-07-16 13:12:00','2014-07-16 13:37:22','Mal encaminhado','2014-07-16 13:37:22','CDD INHOAIBA - RIO DE JANEIRO/RJ',NULL,2,'03','FC'),(7,0,'laranja','2014-07-15 18:00:00','2014-07-16 13:37:22','Encaminhado','2014-07-16 13:37:22','CTE CAMPINAS/GCCAP - VALINHOS/SP','Em trânsito para CTE BENFICA - RIO DE JANEIRO/RJ - BENFICA',2,'01','DO'),(8,0,'branco','2014-07-15 15:40:00','2014-07-16 13:37:22','Postado','2014-07-16 13:37:22','CTE CAMPINAS/GCCAP - VALINHOS/SP',NULL,2,'01','PO'),(9,0,'laranja','2014-07-15 08:25:00','2014-07-16 13:38:22','Encaminhado','2014-07-16 13:38:22','AGF BAIRRO ITOUPAVA NORTE - BLUMENAU/SC','Em trânsito para CTE FLORIANOPOLIS/GTURN3 (BLUMENAU) - BLUMENAU/SC - VORSTADT',3,'01','DO'),(10,0,'branco','2014-07-14 16:01:00','2014-07-16 13:38:22','Postado','2014-07-16 13:38:22','AGF BAIRRO ITOUPAVA NORTE - BLUMENAU/SC',NULL,3,'01','PO');
/*!40000 ALTER TABLE `historico_muamba` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `muamba`
--

DROP TABLE IF EXISTS `muamba`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `muamba` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `codigo` varchar(13) NOT NULL,
  `dataultimoenvioemail` datetime DEFAULT NULL,
  `dataultimoenviosms` datetime DEFAULT NULL,
  `dataultimostatus` datetime DEFAULT NULL,
  `date_created` datetime NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `entregue` bit(1) NOT NULL,
  `last_updated` datetime NOT NULL,
  `pais_id` bigint(20) NOT NULL,
  `usuario_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_codigo` (`usuario_id`,`codigo`),
  KEY `FK_5mg6wtjru7lajgxgstlmmgtmo` (`pais_id`),
  CONSTRAINT `FK_jwpx96tdnn2cjd2s0cftd3fi3` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `FK_5mg6wtjru7lajgxgstlmmgtmo` FOREIGN KEY (`pais_id`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muamba`
--

LOCK TABLES `muamba` WRITE;
/*!40000 ALTER TABLE `muamba` DISABLE KEYS */;
INSERT INTO `muamba` VALUES (1,2,'DF847645028BR','2014-07-15 17:10:00','2014-07-15 17:10:00','2014-07-15 17:10:00','2014-07-16 13:36:40','Placa de Video Kabum','','2014-07-16 13:36:41',1,1),(2,1,'DF847657627BR','2014-07-16 13:12:00','2014-07-16 13:12:00','2014-07-16 13:12:00','2014-07-16 13:37:22','Memoria Kabum','\0','2014-07-16 13:37:22',1,1),(3,1,'PG813782360BR','2014-07-15 08:25:00','2014-07-15 08:25:00','2014-07-15 08:25:00','2014-07-16 13:38:22','Roupas de Cama AltenburgStore','\0','2014-07-16 13:38:22',1,1);
/*!40000 ALTER TABLE `muamba` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pais` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `codigo` varchar(2) NOT NULL,
  `date_created` datetime NOT NULL,
  `descricao` varchar(50) NOT NULL,
  `imagem` varchar(50) DEFAULT NULL,
  `last_updated` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ef4wmfj2gfd7yl3bsq1rwstup` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES (1,0,'BR','2014-07-16 13:35:45','Brasil','Brazil.png','2014-07-16 13:35:45');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration_code`
--

DROP TABLE IF EXISTS `registration_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration_code` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date_created` datetime NOT NULL,
  `token` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration_code`
--

LOCK TABLES `registration_code` WRITE;
/*!40000 ALTER TABLE `registration_code` DISABLE KEYS */;
/*!40000 ALTER TABLE `registration_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regra`
--

DROP TABLE IF EXISTS `regra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regra` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `authority` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_22k1x9yv8i48fltn8mg30pknu` (`authority`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regra`
--

LOCK TABLES `regra` WRITE;
/*!40000 ALTER TABLE `regra` DISABLE KEYS */;
INSERT INTO `regra` VALUES (1,0,'usuario'),(2,0,'admin');
/*!40000 ALTER TABLE `regra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `account_expired` bit(1) NOT NULL,
  `account_locked` bit(1) NOT NULL,
  `email` varchar(255) NOT NULL,
  `enabled` bit(1) NOT NULL,
  `enviaremail` bit(1) NOT NULL,
  `enviarsms` bit(1) NOT NULL,
  `itensporpagina` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `password_expired` bit(1) NOT NULL,
  `primeironome` varchar(255) NOT NULL,
  `sobrenome` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_863n1y3x0jalatoir4325ehal` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,0,'\0','\0','liunit@gmail.com','','','\0',10,'$2a$10$26BNFV2SRqCx4AXEmoXYbe988OS7QzqVIbtEFzr066H6tGz3s6ULW','\0','Luiz','Marques','marques'),(2,0,'\0','\0','liunit@gmail.com','','','\0',0,'$2a$10$wKQ6HQ2BgjBnHat3sXkDM.wX24s/TxHd6J84oP47XM7P0JfjjaekS','\0','Administrador',NULL,'admin');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_regra`
--

DROP TABLE IF EXISTS `usuario_regra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_regra` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `regra_id` bigint(20) NOT NULL,
  `usuario_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_usuario_id` (`regra_id`,`usuario_id`),
  KEY `FK_c9e04hk36ue2k50nb2ei9i08b` (`usuario_id`),
  CONSTRAINT `FK_c9e04hk36ue2k50nb2ei9i08b` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `FK_jqgkp5de6cj7xi1t62jxsydol` FOREIGN KEY (`regra_id`) REFERENCES `regra` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_regra`
--

LOCK TABLES `usuario_regra` WRITE;
/*!40000 ALTER TABLE `usuario_regra` DISABLE KEYS */;
INSERT INTO `usuario_regra` VALUES (1,1,1),(2,2,2);
/*!40000 ALTER TABLE `usuario_regra` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-16 13:44:46
