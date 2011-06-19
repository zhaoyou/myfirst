-- MySQL dump 10.13  Distrib 5.1.41, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: focusrx2
-- ------------------------------------------------------
-- Server version	5.1.41-3ubuntu12.10

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
-- Current Database: `focusrx2`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `focusrx2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `focusrx2`;

--
-- Table structure for table `ATTACHMENT`
--

DROP TABLE IF EXISTS `ATTACHMENT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ATTACHMENT` (
  `ATTACHMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ATTACHMENT_NAME` varchar(255) DEFAULT NULL,
  `ATTACHMENT_PATH` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ATTACHMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ATTACHMENT`
--

LOCK TABLES `ATTACHMENT` WRITE;
/*!40000 ALTER TABLE `ATTACHMENT` DISABLE KEYS */;
/*!40000 ALTER TABLE `ATTACHMENT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BASIC_ITEM`
--

DROP TABLE IF EXISTS `BASIC_ITEM`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BASIC_ITEM` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `BRIEF_NAME` varchar(255) DEFAULT NULL,
  `FACTOR` int(11) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SECOND_DIRECTORY` bigint(20) DEFAULT NULL,
  `PROVINCE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKDBA9A8A4D621AEDB` (`SECOND_DIRECTORY`),
  KEY `FKDBA9A8A435786440` (`PROVINCE`),
  CONSTRAINT `FKDBA9A8A435786440` FOREIGN KEY (`PROVINCE`) REFERENCES `PROVINCE` (`PROVINCE_ID`),
  CONSTRAINT `FKDBA9A8A4D621AEDB` FOREIGN KEY (`SECOND_DIRECTORY`) REFERENCES `SECOND_DIRECTORY` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BASIC_ITEM`
--

LOCK TABLES `BASIC_ITEM` WRITE;
/*!40000 ALTER TABLE `BASIC_ITEM` DISABLE KEYS */;
INSERT INTO `BASIC_ITEM` VALUES (1,'非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）',1,'AZ产品',1,1),(2,'无',2,'关注的领域',1,1),(3,'无',1,'政策解释',2,1),(4,'无',2,'政策异同',2,1),(5,'无',1,'政策解释',4,1),(6,'无',2,'政策异同',4,1),(7,'省药品集中采购中心作为基本药物采购的责任主体；市、县（市、区）人民政府作为基本药物制度施行的地方责任主体，市、县（市、区）卫生行政部门负责辖区内基本药物采购的监管，组织基层医疗卫生机构在省级药品采购平台上申报采购计划，与省药品采购中心签订委托协议等。基本药物集中采购入围候选品种既是基层医疗卫生机构使用目录，同时也纳入二、三级医疗机构药品采购目录。',1,'采购范围',10,1),(8,'对用量明确的产品，实行量价同招、带量采购，促使企业进一步降低价格。对无法确定采购数量的药品，采取单一货源承诺方式进行采购，即一种药物（具体到剂型和规格）选择一家企业产品，使该企业获得全省或一定区域内该药物全部市场份额，供货区域内的所有政府办基层医疗卫生机构都由这家企业供应该药物',2,'采购方式',10,1),(9,'按照质量优先、价格合理原则',3,'采购原则',10,1),(10,'没有明确的提出是否质量分层',4,'质量分层',10,1),(11,'国家发展改革委公布的基本药物基层平均采购价格为参照，结合上年度基本药物采购价格和其他省（区、市）集中采购价格，形成集中采购参考价格',5,'限价原则',10,1),(12,'暂没有明确规定',6,'暂报价原则',10,1),(13,'原则上基本药物直接向生产企业采购，由生产企业委托经营企业配送或直接配送。在此之前，基本药物继续由入围候选品种的生产企业直接委托入围候选的配送企业统一配送。生产企业和配送企业作为供货主体，都要对药品的质量和供应一并负责。',7,'配送规则',10,1),(14,'无',8,'政策解释',10,1),(15,'无',9,'政策异同',10,1),(16,'暂时没有明确的出台文件',1,'AZ产品',12,1),(17,'无',2,'关注的领域',12,1),(18,'630种',1,'可使用的药物数目',14,1),(19,'按照规定只能使用基本药物',2,'基本药物使用规定',14,1),(20,'2010年底，实施基本药物制度的县（市、区）达到 82个，占县（市、区）总数的77%；多数医疗机构还处于过渡期，允许使用库存药物',3,'执行现状',14,1),(21,'2011年，全面执行基本药物制度',4,'实施时间表',14,1),(22,'无',5,'政策解释',14,1),(23,'无',6,'政策异同',14,1),(24,'是',1,'是否要求配备所有基药',15,1),(25,'应将基本药物作为首选药物，按规定使用一定比例的基本药物。基本药物使用比例采用基本药物销售收入额占全部药品销售收入额比例的方法计算。具体比例还没有进一步的规定',2,'基本药物使用规定',15,1),(26,'大多数医院已经配备基本药物，但是基本药物很少使用；且没有相关比例的规定限制',3,'执行现状',15,1),(27,'暂时没有明确的时间表',4,'实施时间表',15,1),(28,'无',5,'政策解释',15,1),(29,'无',6,'政策异同',15,1),(30,'无',1,'计划零差价药物数目',16,1),(31,'开始试行基本药物的医疗机构基本都开始试行零差率',2,'零差率现状',16,1),(32,'2011年，随着基本药物制度的全面试行，零差率',3,'实施时间表',16,1),(33,'无',1,'政府补贴',17,1),(34,'无',2,'收支两条线',17,1),(35,'基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围',1,'城镇职工医保',18,1),(36,'基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围',2,'新农合',18,1),(37,'基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点',1,'城镇职工医保',19,1),(38,'基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点',2,'新农合',19,1),(39,'无',1,'口服常释剂型',20,1),(40,'无',2,'注射剂',20,1),(41,'无',1,'口服常释剂型',21,1),(42,'无',2,'缓释控释剂型',21,1),(43,'无',3,'注射剂',21,1),(44,'无',1,'口服常释剂型',22,1),(45,'无',2,'吸入剂',22,1),(46,'无',3,'口服液体剂',22,1),(47,'无',1,'注射剂',23,1),(48,'无',1,'泡腾片',24,1),(49,'没有相关通用名进入目录',1,'AZ产品',1,2),(50,'无',2,'关注的领域',1,2),(51,'无',1,'政策解释',2,2),(52,'无',2,'政策异同',2,2),(53,'无',1,'政策解释',4,2),(54,'无',2,'政策异同',4,2),(55,'政府举办的基层医疗卫生机构实行政府主导、全省统一的基本药物集中招标采购和配送。严禁市（州）及以下设立采购机构或以其他形式自行招标采购。鼓励其他医疗卫生机构参加全省药品集中招标采购。',1,'采购范围',10,2),(56,'对基本药物实行量价挂钩采购，暂无法确定采购数量的品规，通过招标方式确定生产企业,确保中标企业获得采购区域内所有政府办基层医疗卫生机构的市场份额，确保每个基层医疗卫生机构使用的基本药物（具体到规格）有且只有一家企业供应。对采购量大的产品，为保障基本药物供应，可以将全省划分为2-3个区域分别招标采购。',2,'采购方式',10,2),(57,'按坚持质量优先、价格合理的原则，通过经济技术标、商务标的“双信封”方法公开招标采购',3,'采购原则',10,2),(58,'分质量层次，主要是专利药品、单独定价药品、中药保密处方、获得国家级奖项的药品、药物组合物专利药品、进入欧美日主流市场实际发生销售的药品。',4,'质量分层',10,2),(59,'采购参考价应不高于国家最高零售指导价，不高于全国基本药物基层平均采购价，不高于我省挂网限价，不高于周边省份的最低采购价。',5,'限价原则',10,2),(60,'商务标投标报价，除国家和省价格主管部门另有规定外，同厂家同通用名同质量类型药品之间不得出现剂型、规格、包装之间的价格倒挂，如有倒挂将作调平处理。同生产企业同药品品规（指通用名、剂型、规格完全相同），只能选择一种零售包装数量进行报价，且中标后须持续供应该包装药品',6,'暂报价原则',10,2),(61,'中标生产企业应在规定的时间内完成配送关系的选择，确定药品配送企业或机构，原则上，中标生产企业可直接配送或者委托获得基本药物配送资格的药品经营企业配送。中标企业对质量和供应一并负责。',7,'配送规则',10,2),(62,'无',8,'政策解释',10,2),(63,'无',9,'政策异同',10,2),(64,'没有相关产品',1,'AZ产品',12,2),(65,'无',2,'关注的领域',12,2),(66,'600种左右',1,'可使用的药物数目',14,2),(67,'按照规定只能使用基本药物',2,'基本药物使用规定',14,2),(68,'现阶段还处于过渡期，非基本药物仍然可以在社区中使用',3,'执行现状',14,2),(69,'对过渡期，还没有具体的期限',4,'实施时间表',14,2),(70,'无',5,'政策解释',14,2),(71,'无',6,'政策异同',14,2),(72,'是',1,'是否要求配备所有基药',15,2),(73,'要求优先使用基本药物，但是没有具体的使用比例的规定',2,'基本药物使用规定',15,2),(74,'大多数医院已经配备基本药物，但是基本药物很少使用；且没有相关比例的规定限制',3,'执行现状',15,2),(75,'暂时没有明确的时间表',4,'实施时间表',15,2),(76,'无',5,'政策解释',15,2),(77,'无',6,'政策异同',15,2),(78,'无',1,'计划零差价药物数目',16,2),(79,'绝大部分基本药物已经执行了药品零差价',2,'零差率现状',16,2),(80,'没有具体的时间表',3,'实施时间表',16,2),(81,'无',1,'政府补贴',17,2),(82,'无',2,'收支两条线',17,2),(83,'国家基本药物和四川省补充目录药品全部纳入基本医疗保障药品报销目录',1,'城镇职工医保',18,2),(84,'国家基本药物和四川省补充目录药品全部纳入基本医疗保障药品报销目录',2,'新农合',18,2),(85,'报销比例明显高于其他非基本药物',1,'城镇职工医保',19,2),(86,'报销比例明显高于其他非基本药物',2,'新农合',19,2),(87,'无',1,'口服常释剂型',20,2),(88,'无',2,'注射剂',20,2),(89,'无',1,'口服常释剂型',21,2),(90,'无',2,'缓释控释剂型',21,2),(91,'无',3,'注射剂',21,2),(92,'无',1,'口服常释剂型',22,2),(93,'无',2,'吸入剂',22,2),(94,'无',3,'口服液体剂',22,2),(95,'无',1,'注射剂',23,2),(96,'无',1,'泡腾片',24,2);
/*!40000 ALTER TABLE `BASIC_ITEM` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONTNETITEM`
--

DROP TABLE IF EXISTS `CONTNETITEM`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONTNETITEM` (
  `CONTENTITEM_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONTENT` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PARENTID` bigint(20) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  `BASICITEM` bigint(20) DEFAULT NULL,
  `PROVINCE` int(11) DEFAULT NULL,
  PRIMARY KEY (`CONTENTITEM_ID`),
  KEY `FK35E7D69EF04832C2` (`BASICITEM`),
  KEY `FK35E7D69E35786440` (`PROVINCE`),
  CONSTRAINT `FK35E7D69E35786440` FOREIGN KEY (`PROVINCE`) REFERENCES `PROVINCE` (`PROVINCE_ID`),
  CONSTRAINT `FK35E7D69EF04832C2` FOREIGN KEY (`BASICITEM`) REFERENCES `BASIC_ITEM` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONTNETITEM`
--

LOCK TABLES `CONTNETITEM` WRITE;
/*!40000 ALTER TABLE `CONTNETITEM` DISABLE KEYS */;
INSERT INTO `CONTNETITEM` VALUES (1,'1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，如洛汀新、代文等都进入药物目录','高血压',NULL,NULL,2,1),(2,'阿托伐他汀（立普妥）没有进入目录','高血脂',NULL,NULL,2,1),(3,'平喘药增加三种：特布他林、布地奈德、班布特罗','呼吸',NULL,NULL,2,1),(4,'抗酸药及抗溃疡药类增加三类：硫糖铝、大黄碳酸氢钠、西咪替丁','消化道',NULL,NULL,2,1),(5,'暂时没有明确的出台文件','高血压',NULL,NULL,17,1),(6,'暂时没有明确的出台文件','高血脂',NULL,NULL,17,1),(7,'暂时没有明确的出台文件','呼吸',NULL,NULL,17,1),(8,'暂时没有明确的出台文件','消化道',NULL,NULL,17,1),(9,'90%都是区政府补贴','补贴主体',NULL,NULL,33,1),(10,'目前绝大多数还是以政府补贴为主，部分市区（如南京、苏州）卫生服务中心主要以收支两条线为主；独立财政体制是以政府补贴为主','补贴方式',NULL,NULL,33,1),(11,'政府负责其举办的乡镇卫生院基本建设、设备购置、人员经费及其承担的公共卫生服务的业务经费，医务人员的工资水平要与当地事业单位工作人员平均工资水平相衔接。','收支两条线形式',NULL,NULL,34,1),(12,'区财政','收支主体',NULL,NULL,34,1),(13,'无','奥美拉唑',NULL,NULL,39,1),(14,'无','奥美拉唑',NULL,NULL,40,1),(15,'无','非洛地平',NULL,NULL,41,1),(16,'无','美托洛尔',NULL,NULL,41,1),(17,'无','赖诺普利',NULL,NULL,41,1),(18,'无','单硝酸异山梨酯',NULL,NULL,41,1),(19,'无','非洛地平',NULL,NULL,42,1),(20,'无','美托洛尔',NULL,NULL,42,1),(21,'无','美托洛尔',NULL,NULL,43,1),(22,'无','班布特罗',NULL,NULL,44,1),(23,'无','特布他林',NULL,NULL,44,1),(24,'无','扎鲁司特',NULL,NULL,44,1),(25,'无','布地奈德',NULL,NULL,45,1),(26,'无','福莫特罗',NULL,NULL,45,1),(27,'无','特布他林',NULL,NULL,45,1),(28,'无','布地奈德福莫特罗',NULL,NULL,45,1),(29,'无','特布他林',NULL,NULL,46,1),(30,'无','丙泊酚',NULL,NULL,47,1),(31,'无','罗哌卡因',NULL,NULL,47,1),(32,'无','阿司匹林',NULL,NULL,48,1),(33,'没有相关通用名进入目录','高血压',NULL,NULL,50,2),(34,'没有相关通用名进入目录','高血脂',NULL,NULL,50,2),(35,'没有相关通用名进入目录','呼吸',NULL,NULL,50,2),(36,'抗酸药及抗溃疡药类增加一类：西咪替丁','消化道',NULL,NULL,50,2),(37,'硝苯地平：30片，5.7元；60片，7.1元','高血压',NULL,NULL,65,2),(38,'辛伐他汀：4种剂型，最贵的24片，17元','高血脂',NULL,NULL,65,2),(39,'没有相关产品','呼吸',NULL,NULL,65,2),(40,'奥美拉唑：片剂，1.48元；针剂，3.05元','消化道',NULL,NULL,65,2),(41,'70%都是区政府补贴','补贴主体',NULL,NULL,81,2),(42,'目前绝大多数还是以政府补贴为主，约30%的基层医院施行了收支两条线','补贴方式',NULL,NULL,81,2),(43,'主要承担基层医院的基本建设、设备购置、人员经费及其承担的公共卫生服务的费用。','收支两条线形式',NULL,NULL,82,2),(44,'区财政','收支主体',NULL,NULL,82,2),(45,'无','奥美拉唑',NULL,NULL,87,2),(46,'无','奥美拉唑',NULL,NULL,88,2),(47,'无','非洛地平',NULL,NULL,89,2),(48,'无','美托洛尔',NULL,NULL,89,2),(49,'无','赖诺普利',NULL,NULL,89,2),(50,'无','单硝酸异山梨酯',NULL,NULL,89,2),(51,'无','非洛地平',NULL,NULL,90,2),(52,'无','美托洛尔',NULL,NULL,90,2),(53,'无','美托洛尔',NULL,NULL,91,2),(54,'无','班布特罗',NULL,NULL,92,2),(55,'无','特布他林',NULL,NULL,92,2),(56,'无','扎鲁司特',NULL,NULL,92,2),(57,'无','布地奈德',NULL,NULL,93,2),(58,'无','福莫特罗',NULL,NULL,93,2),(59,'无','特布他林',NULL,NULL,93,2),(60,'无','布地奈德福莫特罗',NULL,NULL,93,2),(61,'无','特布他林',NULL,NULL,94,2),(62,'无','丙泊酚',NULL,NULL,95,2),(63,'无','罗哌卡因',NULL,NULL,95,2),(64,'无','阿司匹林',NULL,NULL,96,2);
/*!40000 ALTER TABLE `CONTNETITEM` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DIRECTORY`
--

DROP TABLE IF EXISTS `DIRECTORY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DIRECTORY` (
  `DIRECTORY_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DIRECTORY_NAME` varchar(255) DEFAULT NULL,
  `FACTOR` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DIRECTORY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DIRECTORY`
--

LOCK TABLES `DIRECTORY` WRITE;
/*!40000 ALTER TABLE `DIRECTORY` DISABLE KEYS */;
INSERT INTO `DIRECTORY` VALUES (1,'目录部分','1'),(2,'实施范围','2'),(3,'招标采购','3'),(4,'药物使用','4'),(5,'零差率以及补偿机制','5'),(6,'支付方式','6'),(7,'药物列表','7');
/*!40000 ALTER TABLE `DIRECTORY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PROVINCE`
--

DROP TABLE IF EXISTS `PROVINCE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PROVINCE` (
  `PROVINCE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FACTOR` int(11) DEFAULT NULL,
  `PROVINCE_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PROVINCE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PROVINCE`
--

LOCK TABLES `PROVINCE` WRITE;
/*!40000 ALTER TABLE `PROVINCE` DISABLE KEYS */;
INSERT INTO `PROVINCE` VALUES (1,1,'江苏'),(2,2,'四川'),(3,3,'陕西'),(4,4,'贵州');
/*!40000 ALTER TABLE `PROVINCE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SECOND_DIRECTORY`
--

DROP TABLE IF EXISTS `SECOND_DIRECTORY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SECOND_DIRECTORY` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `CONTENT` varchar(255) DEFAULT NULL,
  `FACTOR` int(11) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `DIRECTORY` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAC260424811EAFA` (`DIRECTORY`),
  CONSTRAINT `FKAC260424811EAFA` FOREIGN KEY (`DIRECTORY`) REFERENCES `DIRECTORY` (`DIRECTORY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SECOND_DIRECTORY`
--

LOCK TABLES `SECOND_DIRECTORY` WRITE;
/*!40000 ALTER TABLE `SECOND_DIRECTORY` DISABLE KEYS */;
INSERT INTO `SECOND_DIRECTORY` VALUES (1,NULL,1,'药物目录',1),(2,NULL,2,'增补模式',1),(3,NULL,3,'增补目录遴选来源',1),(4,NULL,4,'增补目录遴选原则',1),(5,NULL,1,'实施意见',2),(6,NULL,2,'计划实施的范围',2),(7,NULL,3,'实施现状',2),(8,NULL,4,'实施的时间表和目标',2),(9,NULL,1,'招标采购的文件',3),(10,NULL,2,'文件解读',3),(11,NULL,3,'招标时间表',3),(12,NULL,4,'招标结果',3),(13,NULL,5,'药物使用执行时间',3),(14,NULL,1,'基层医院',4),(15,NULL,2,'非基层医院',4),(16,NULL,1,'零差率',5),(17,NULL,2,'补偿机制',5),(18,NULL,1,'医保的相关规定',6),(19,NULL,2,'报销比例',6),(20,NULL,1,'15消化系统药物',7),(21,NULL,1,'16循环系统药物',7),(22,NULL,1,'14呼吸系统药物',7),(23,NULL,1,'5麻醉用药物',7),(24,NULL,1,'3解热镇痛及非甾体抗炎药物',7);
/*!40000 ALTER TABLE `SECOND_DIRECTORY` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-06-18 23:27:51
