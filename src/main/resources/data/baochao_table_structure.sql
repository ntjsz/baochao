CREATE DATABASE  IF NOT EXISTS `baochao` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `baochao`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: baochao
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `chef`
--

DROP TABLE IF EXISTS `chef`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chef` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `rarity` int DEFAULT NULL COMMENT '星级',
  `stirfry` int DEFAULT NULL COMMENT '炒',
  `boil` int DEFAULT NULL COMMENT '煮',
  `knife` int DEFAULT NULL COMMENT '切',
  `fry` int DEFAULT NULL COMMENT '炸',
  `bake` int DEFAULT NULL COMMENT '烤',
  `steam` int DEFAULT NULL COMMENT '蒸',
  `skill` varchar(45) DEFAULT NULL COMMENT '技能',
  `meat` int DEFAULT NULL COMMENT '肉类',
  `fish` int DEFAULT NULL COMMENT '鱼类',
  `vegetable` int DEFAULT NULL COMMENT '蔬菜',
  `flour` int DEFAULT NULL COMMENT '面类',
  `practice_mission` varchar(150) DEFAULT NULL COMMENT '修炼任务',
  `practice_skill` varchar(45) DEFAULT NULL COMMENT '修炼技能',
  `source` varchar(45) DEFAULT NULL COMMENT '来源',
  `sex` int DEFAULT NULL COMMENT '性别 0 - male / 1 - female',
  `sweet` int DEFAULT NULL COMMENT '甜',
  `sour` int DEFAULT NULL COMMENT '酸',
  `spicy` int DEFAULT NULL COMMENT '辣',
  `salty` int DEFAULT NULL COMMENT '咸',
  `bitter` int DEFAULT NULL COMMENT '苦',
  `fresh` int DEFAULT NULL COMMENT '鲜',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='厨师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `equipment`
--

DROP TABLE IF EXISTS `equipment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipment` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `rarity` int DEFAULT NULL COMMENT '星级',
  `source` varchar(45) DEFAULT NULL COMMENT '来源',
  `skill` varchar(150) DEFAULT NULL COMMENT '能力',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='厨具';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `equipment_skill`
--

DROP TABLE IF EXISTS `equipment_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipment_skill` (
  `id` int NOT NULL AUTO_INCREMENT,
  `equipment_id` int DEFAULT NULL,
  `category_0` varchar(45) DEFAULT NULL,
  `category_1` varchar(45) DEFAULT NULL,
  `category_2` varchar(45) DEFAULT NULL,
  `effect_num` int DEFAULT NULL,
  `effect_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='厨具效果';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `guest`
--

DROP TABLE IF EXISTS `guest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guest` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='贵客';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ingredient`
--

DROP TABLE IF EXISTS `ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingredient` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='食材';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `recipe`
--

DROP TABLE IF EXISTS `recipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe` (
  `id` int NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `rarity` int DEFAULT NULL COMMENT '星级',
  `unlock` varchar(45) DEFAULT NULL,
  `stirfry` int DEFAULT NULL COMMENT '炒',
  `boil` int DEFAULT NULL COMMENT '煮',
  `knife` int DEFAULT NULL COMMENT '切',
  `fry` int DEFAULT NULL COMMENT '炸',
  `bake` int DEFAULT NULL COMMENT '烤',
  `steam` int DEFAULT NULL COMMENT '蒸',
  `price` int DEFAULT NULL COMMENT '单价',
  `extra_price` int DEFAULT NULL COMMENT '额外售价',
  `duration` int DEFAULT NULL COMMENT '耗时',
  `count_limit` int DEFAULT NULL COMMENT '数量上限',
  `source` varchar(45) DEFAULT NULL COMMENT '来源',
  `flavor` varchar(45) DEFAULT NULL COMMENT '调料',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='菜谱';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `recipe_guest`
--

DROP TABLE IF EXISTS `recipe_guest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe_guest` (
  `id` int NOT NULL,
  `recipe_id` int DEFAULT NULL,
  `guest_id` int DEFAULT NULL,
  `rune` varchar(45) DEFAULT NULL COMMENT '符文',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='菜谱_贵客';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `recipe_ingredient`
--

DROP TABLE IF EXISTS `recipe_ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe_ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `recipe_id` int DEFAULT NULL,
  `ingredient_id` int DEFAULT NULL,
  `ingredient_count` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='菜谱-食材';
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-21 11:51:54
