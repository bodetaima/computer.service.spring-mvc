-- MySQL dump 10.13  Distrib 8.0.19, for Linux (x86_64)
--
-- Host: localhost    Database: computer_services
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `computers`
--

DROP TABLE IF EXISTS `computers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `computers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `computer_model` varchar(255) DEFAULT NULL,
  `cpu_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `hdd_id` int DEFAULT NULL,
  `mainboard_id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `order_id` int DEFAULT NULL,
  `psu_id` int DEFAULT NULL,
  `ram_id` int DEFAULT NULL,
  `ssd_id` int DEFAULT NULL,
  `vga_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computers`
--

LOCK TABLES `computers` WRITE;
/*!40000 ALTER TABLE `computers` DISABLE KEYS */;
/*!40000 ALTER TABLE `computers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operations`
--

DROP TABLE IF EXISTS `operations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `operation_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operations`
--

LOCK TABLES `operations` WRITE;
/*!40000 ALTER TABLE `operations` DISABLE KEYS */;
/*!40000 ALTER TABLE `operations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_service_plan_operations`
--

DROP TABLE IF EXISTS `order_service_plan_operations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_service_plan_operations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `ospo_code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  `service_plan_operation_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_service_plan_operations`
--

LOCK TABLES `order_service_plan_operations` WRITE;
/*!40000 ALTER TABLE `order_service_plan_operations` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_service_plan_operations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `customer_id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `order_code` varchar(255) DEFAULT NULL,
  `service_plan_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `part_types`
--

DROP TABLE IF EXISTS `part_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `part_types` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `is_parent_type` tinyint(1) DEFAULT '0',
  `parent_type_id` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` longtext,
  `created_by` int DEFAULT '0',
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT '0',
  `updated_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `part_types`
--

LOCK TABLES `part_types` WRITE;
/*!40000 ALTER TABLE `part_types` DISABLE KEYS */;
INSERT INTO `part_types` VALUES (1,'mainboard',0,'8','Motherboard','Motherboard of the PC',0,'2020-05-15 12:01:12.000000',_binary '\0',0,'2020-05-15 12:33:02.000000'),(2,'cpu',0,'8','CPU','CPU of the PC',0,'2020-05-15 12:01:14.000000',_binary '\0',0,'2020-05-15 12:33:04.000000'),(3,'ram',0,'8','RAM','RAM of the PC',0,'2020-05-15 12:02:03.000000',_binary '\0',0,'2020-05-15 12:33:06.000000'),(4,'gpu',0,'8','GPU','GPU of the PC',0,'2020-05-15 12:03:46.000000',_binary '\0',0,'2020-05-15 12:33:05.000000'),(5,'psu',0,'8','PSU','PSU of the PC',0,'2020-05-15 12:04:34.000000',_binary '\0',0,'2020-05-15 12:33:07.000000'),(6,'hdd',0,'9','HDD','HDD of the PC',0,'2020-05-15 12:05:26.000000',_binary '\0',0,'2020-05-15 12:33:08.000000'),(7,'ssd',0,'9','SSD','SSD of the PC',0,'2020-05-15 12:06:00.000000',_binary '\0',0,'2020-05-15 12:33:09.000000'),(8,'component',1,'0','Linh kiện máy tính','Linh kiện máy tính',0,'2020-05-15 17:10:36.000000',_binary '\0',0,'2020-05-15 17:10:44.000000'),(9,'storage',1,'0','Thiết bị lưu trữ','Thiết bị lưu trữ',0,'2020-05-15 17:13:21.000000',_binary '\0',0,'2020-05-15 17:13:29.000000');
/*!40000 ALTER TABLE `part_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parts`
--

DROP TABLE IF EXISTS `parts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parts` (
  `id` int NOT NULL AUTO_INCREMENT,
  `part_type_id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `description` longtext,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parts`
--

LOCK TABLES `parts` WRITE;
/*!40000 ALTER TABLE `parts` DISABLE KEYS */;
INSERT INTO `parts` VALUES (1,4,'ASUS ROG STRIX RTX 2080 Super-8G GAMING',13699000,'Phiên bản RTX 2080 Super cao cấp của Asus',1,'2020-05-15 14:59:11.661000',_binary '\0',1,'2020-06-24 00:15:48.722000'),(2,4,'INNO3D GTX 1660 Super TWIN X2',5899000,'Phiên bản GTX 1660 Super giá rẻ của Inno3D',1,'2020-05-15 14:59:46.373000',_binary '\0',1,'2020-06-24 00:17:19.553000'),(3,2,'CPU Intel Xeon E-2236 (3.4GHz turbo up to 4.8GHz, 6 nhân, 12 luồng, 12 MB Cache, 80W)',7999000,'Dòng sản phẩm máy trạm cơ bản, giá rẻ của Intel hướng đến đối tượng khách hàng cơ bản muốn làm quen với sự ưu việt của nền tảng Intel Xeon.',1,'2020-05-15 16:14:07.722000',_binary '\0',1,'2020-06-24 00:18:03.928000');
/*!40000 ALTER TABLE `parts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permissions`
--

DROP TABLE IF EXISTS `permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permissions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `permission_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissions`
--

LOCK TABLES `permissions` WRITE;
/*!40000 ALTER TABLE `permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_permissions`
--

DROP TABLE IF EXISTS `role_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_permissions` (
  `role_id` int NOT NULL,
  `permission_id` int NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`),
  UNIQUE KEY `UK_qfkbccnh2c5o4tc7akq5x11wv` (`permission_id`),
  CONSTRAINT `FKegdk29eiy7mdtefy5c7eirr6e` FOREIGN KEY (`permission_id`) REFERENCES `permissions` (`id`),
  CONSTRAINT `FKn5fotdgk8d1xvo8nav9uv3muc` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_permissions`
--

LOCK TABLES `role_permissions` WRITE;
/*!40000 ALTER TABLE `role_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `role_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,0,'2020-04-27 22:32:04.000000',_binary '\0',0,'2020-04-27 22:32:11.000000','ROLE_USER','User role'),(2,0,'2020-04-27 22:32:05.000000',_binary '\0',0,'2020-04-27 22:32:12.000000','ROLE_CUSTOMER','Customer role'),(3,0,'2020-04-27 22:32:06.000000',_binary '\0',0,'2020-04-27 22:32:12.000000','ROLE_ADMIN','Admin role');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_plan_operations`
--

DROP TABLE IF EXISTS `service_plan_operations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_plan_operations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `operation_id` varchar(255) DEFAULT NULL,
  `service_plan_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_plan_operations`
--

LOCK TABLES `service_plan_operations` WRITE;
/*!40000 ALTER TABLE `service_plan_operations` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_plan_operations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_plans`
--

DROP TABLE IF EXISTS `service_plans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_plans` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `initial_price` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `service_plan_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_plans`
--

LOCK TABLES `service_plans` WRITE;
/*!40000 ALTER TABLE `service_plans` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_plans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_roles` (
  `user_id` int NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`),
  CONSTRAINT `FKh8ciramu9cc9q3qcqiv4ue8a6` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  CONSTRAINT `FKhfh9dx7w3ubf1co1vdev94g3f` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1,1),(2,1),(2,3);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_by` int DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `deleted` bit(1) NOT NULL,
  `updated_by` int DEFAULT NULL,
  `updated_date` datetime(6) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birth_date` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `user_code` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,0,'2020-04-27 22:32:44.776000',_binary '\0',0,'2020-04-27 22:32:44.776000',NULL,NULL,'tranphongbb@outlook.com',NULL,'$2a$10$4PaBQNEXkpO.Bi4f8VpwAufKHpexe5VoYXnx0KwF3dGjoVXa0k1l6',NULL,NULL,NULL,'tranphongbb'),(2,0,'2020-04-27 22:33:15.555000',_binary '\0',0,'2020-04-27 22:33:15.555000',NULL,NULL,'admin@wefixit.com',NULL,'$2a$10$MnXKKqUh7eXb7GkkANglbu5GVdtsPNYwMtlaeUEL9TnehX539CqK6',NULL,NULL,NULL,'root');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-23 17:44:17
