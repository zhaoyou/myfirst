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
  PRIMARY KEY (`ID`),
  KEY `FKDBA9A8A4D621AEDB` (`SECOND_DIRECTORY`),
  CONSTRAINT `FKDBA9A8A4D621AEDB` FOREIGN KEY (`SECOND_DIRECTORY`) REFERENCES `SECOND_DIRECTORY` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BASIC_ITEM`
--

LOCK TABLES `BASIC_ITEM` WRITE;
/*!40000 ALTER TABLE `BASIC_ITEM` DISABLE KEYS */;
INSERT INTO `BASIC_ITEM` VALUES (1,'非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）',1,'AZ产品',1),(2,'无',2,'关注的领域',1),(3,'无',1,'政策解释',2),(4,'无',2,'政策异同',2),(5,'无',1,'政策解释',4),(6,'无',2,'政策异同',4),(7,'省药品集中采购中心作为基本药物采购的责任主体；市、县（市、区）人民政府作为基本药物制度施行的地方责任主体，市、县（市、区）卫生行政部门负责辖区内基本药物采购的监管，组织基层医疗卫生机构在省级药品采购平台上申报采购计划，与省药品采购中心签订委托协议等。基本药物集中采购入围候选品种既是基层医疗卫生机构使用目录，同时也纳入二、三级医疗机构药品采购目录。',1,'采购范围',10),(8,'对用量明确的产品，实行量价同招、带量采购，促使企业进一步降低价格。对无法确定采购数量的药品，采取单一货源承诺方式进行采购，即一种药物（具体到剂型和规格）选择一家企业产品，使该企业获得全省或一定区域内该药物全部市场份额，供货区域内的所有政府办基层医疗卫生机构都由这家企业供应该药物',2,'采购方式',10),(9,'按照质量优先、价格合理原则',3,'采购原则',10),(10,'没有明确的提出是否质量分层',4,'质量分层',10),(11,'国家发展改革委公布的基本药物基层平均采购价格为参照，结合上年度基本药物采购价格和其他省（区、市）集中采购价格，形成集中采购参考价格',5,'限价原则',10),(12,'暂没有明确规定',6,'暂报价原则',10),(13,'原则上基本药物直接向生产企业采购，由生产企业委托经营企业配送或直接配送。在此之前，基本药物继续由入围候选品种的生产企业直接委托入围候选的配送企业统一配送。生产企业和配送企业作为供货主体，都要对药品的质量和供应一并负责。',7,'配送规则',10),(14,'无',8,'政策解释',10),(15,'无',9,'政策异同',10),(16,'暂时没有明确的出台文件',1,'AZ产品',12),(17,'无',2,'关注的领域',12),(18,'630种',1,'可使用的药物数目',14),(19,'按照规定只能使用基本药物',2,'基本药物使用规定',14),(20,'2010年底，实施基本药物制度的县（市、区）达到 82个，占县（市、区）总数的77%；多数医疗机构还处于过渡期，允许使用库存药物',3,'执行现状',14),(21,'2011年，全面执行基本药物制度',4,'实施时间表',14),(22,'无',5,'政策解释',14),(23,'无',6,'政策异同',14),(24,'是',1,'是否要求配备所有基药',15),(25,'应将基本药物作为首选药物，按规定使用一定比例的基本药物。基本药物使用比例采用基本药物销售收入额占全部药品销售收入额比例的方法计算。具体比例还没有进一步的规定',2,'基本药物使用规定',15),(26,'大多数医院已经配备基本药物，但是基本药物很少使用；且没有相关比例的规定限制',3,'执行现状',15),(27,'暂时没有明确的时间表',4,'实施时间表',15),(28,'无',5,'政策解释',15),(29,'无',6,'政策异同',15),(30,'无',1,'计划零差价药物数目',16),(31,'开始试行基本药物的医疗机构基本都开始试行零差率',2,'零差率现状',16),(32,'2011年，随着基本药物制度的全面试行，零差率',3,'实施时间表',16),(33,'无',1,'政府补贴',17),(34,'无',2,'收支两条线',17),(35,'基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围',1,'城镇职工医保',18),(36,'基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围',2,'新农合',18),(37,'基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点',1,'城镇职工医保',19),(38,'基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点',2,'新农合',19),(39,'无',1,'口服常释剂型',20),(40,'无',2,'注射剂',20),(41,'无',1,'口服常释剂型',21),(42,'无',2,'缓释控释剂型',21),(43,'无',3,'注射剂',21),(44,'无',1,'口服常释剂型',22),(45,'无',2,'吸入剂',22),(46,'无',3,'口服液体剂',22),(47,'无',1,'注射剂',23),(48,'无',1,'泡腾片',24);
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
  `isShowDetail` int(11) DEFAULT NULL,
  PRIMARY KEY (`CONTENTITEM_ID`),
  KEY `FK35E7D69EF04832C2` (`BASICITEM`),
  KEY `FK35E7D69E35786440` (`PROVINCE`),
  CONSTRAINT `FK35E7D69E35786440` FOREIGN KEY (`PROVINCE`) REFERENCES `PROVINCE` (`PROVINCE_ID`),
  CONSTRAINT `FK35E7D69EF04832C2` FOREIGN KEY (`BASICITEM`) REFERENCES `BASIC_ITEM` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONTNETITEM`
--

LOCK TABLES `CONTNETITEM` WRITE;
/*!40000 ALTER TABLE `CONTNETITEM` DISABLE KEYS */;
INSERT INTO `CONTNETITEM` VALUES (1,'非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）','AZ产品',0,NULL,1,1,0),(2,'详细','关注的领域',0,NULL,2,1,1),(3,'无','政策解释',0,NULL,3,1,0),(4,'无','政策异同',0,NULL,4,1,0),(5,'无','政策解释',0,NULL,5,1,0),(6,'无','政策异同',0,NULL,6,1,0),(7,'省药品集中采购中心作为基本药物采购的责任主体；市、县（市、区）人民政府作为基本药物制度施行的地方责任主体，市、县（市、区）卫生行政部门负责辖区内基本药物采购的监管，组织基层医疗卫生机构在省级药品采购平台上申报采购计划，与省药品采购中心签订委托协议等。基本药物集中采购入围候选品种既是基层医疗卫生机构使用目录，同时也纳入二、三级医疗机构药品采购目录。','采购范围',0,NULL,7,1,0),(8,'对用量明确的产品，实行量价同招、带量采购，促使企业进一步降低价格。对无法确定采购数量的药品，采取单一货源承诺方式进行采购，即一种药物（具体到剂型和规格）选择一家企业产品，使该企业获得全省或一定区域内该药物全部市场份额，供货区域内的所有政府办基层医疗卫生机构都由这家企业供应该药物','采购方式',0,NULL,8,1,0),(9,'按照质量优先、价格合理原则','采购原则',0,NULL,9,1,0),(10,'没有明确的提出是否质量分层','质量分层',0,NULL,10,1,0),(11,'国家发展改革委公布的基本药物基层平均采购价格为参照，结合上年度基本药物采购价格和其他省（区、市）集中采购价格，形成集中采购参考价格','限价原则',0,NULL,11,1,0),(12,'暂没有明确规定','暂报价原则',0,NULL,12,1,0),(13,'原则上基本药物直接向生产企业采购，由生产企业委托经营企业配送或直接配送。在此之前，基本药物继续由入围候选品种的生产企业直接委托入围候选的配送企业统一配送。生产企业和配送企业作为供货主体，都要对药品的质量和供应一并负责。','配送规则',0,NULL,13,1,0),(14,'无','政策解释',0,NULL,14,1,0),(15,'无','政策异同',0,NULL,15,1,0),(16,'暂时没有明确的出台文件','AZ产品',0,NULL,16,1,0),(17,'详细','关注的领域',0,NULL,17,1,1),(18,'630种','可使用的药物数目',0,NULL,18,1,0),(19,'按照规定只能使用基本药物','基本药物使用规定',0,NULL,19,1,0),(20,'2010年底，实施基本药物制度的县（市、区）达到 82个，占县（市、区）总数的77%；多数医疗机构还处于过渡期，允许使用库存药物','执行现状',0,NULL,20,1,0),(21,'2011年，全面执行基本药物制度','实施时间表',0,NULL,21,1,0),(22,'无','政策解释',0,NULL,22,1,0),(23,'无','政策异同',0,NULL,23,1,0),(24,'是','是否要求配备所有基药',0,NULL,24,1,0),(25,'应将基本药物作为首选药物，按规定使用一定比例的基本药物。基本药物使用比例采用基本药物销售收入额占全部药品销售收入额比例的方法计算。具体比例还没有进一步的规定','基本药物使用规定',0,NULL,25,1,0),(26,'大多数医院已经配备基本药物，但是基本药物很少使用；且没有相关比例的规定限制','执行现状',0,NULL,26,1,0),(27,'暂时没有明确的时间表','实施时间表',0,NULL,27,1,0),(28,'无','政策解释',0,NULL,28,1,0),(29,'无','政策异同',0,NULL,29,1,0),(30,'无','计划零差价药物数目',0,NULL,30,1,0),(31,'开始试行基本药物的医疗机构基本都开始试行零差率','零差率现状',0,NULL,31,1,0),(32,'2011年，随着基本药物制度的全面试行，零差率','实施时间表',0,NULL,32,1,0),(33,'详细','政府补贴',0,NULL,33,1,1),(34,'详细','收支两条线',0,NULL,34,1,1),(35,'基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围','城镇职工医保',0,NULL,35,1,0),(36,'基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围','新农合',0,NULL,36,1,0),(37,'基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点','城镇职工医保',0,NULL,37,1,0),(38,'基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点','新农合',0,NULL,38,1,0),(39,'详细','口服常释剂型',0,NULL,39,1,1),(40,'详细','注射剂',0,NULL,40,1,1),(41,'详细','口服常释剂型',0,NULL,41,1,1),(42,'详细','缓释控释剂型',0,NULL,42,1,1),(43,'详细','注射剂',0,NULL,43,1,1),(44,'详细','口服常释剂型',0,NULL,44,1,1),(45,'详细','吸入剂',0,NULL,45,1,1),(46,'详细','口服液体剂',0,NULL,46,1,1),(47,'详细','注射剂',0,NULL,47,1,1),(48,'详细','泡腾片',0,NULL,48,1,1),(49,'没有相关通用名进入目录','AZ产品',0,NULL,1,2,0),(50,'详细','关注的领域',0,NULL,2,2,1),(51,'无','政策解释',0,NULL,3,2,0),(52,'无','政策异同',0,NULL,4,2,0),(53,'无','政策解释',0,NULL,5,2,0),(54,'无','政策异同',0,NULL,6,2,0),(55,'政府举办的基层医疗卫生机构实行政府主导、全省统一的基本药物集中招标采购和配送。严禁市（州）及以下设立采购机构或以其他形式自行招标采购。鼓励其他医疗卫生机构参加全省药品集中招标采购。','采购范围',0,NULL,7,2,0),(56,'对基本药物实行量价挂钩采购，暂无法确定采购数量的品规，通过招标方式确定生产企业,确保中标企业获得采购区域内所有政府办基层医疗卫生机构的市场份额，确保每个基层医疗卫生机构使用的基本药物（具体到规格）有且只有一家企业供应。对采购量大的产品，为保障基本药物供应，可以将全省划分为2-3个区域分别招标采购。','采购方式',0,NULL,8,2,0),(57,'按坚持质量优先、价格合理的原则，通过经济技术标、商务标的“双信封”方法公开招标采购','采购原则',0,NULL,9,2,0),(58,'分质量层次，主要是专利药品、单独定价药品、中药保密处方、获得国家级奖项的药品、药物组合物专利药品、进入欧美日主流市场实际发生销售的药品。','质量分层',0,NULL,10,2,0),(59,'采购参考价应不高于国家最高零售指导价，不高于全国基本药物基层平均采购价，不高于我省挂网限价，不高于周边省份的最低采购价。','限价原则',0,NULL,11,2,0),(60,'商务标投标报价，除国家和省价格主管部门另有规定外，同厂家同通用名同质量类型药品之间不得出现剂型、规格、包装之间的价格倒挂，如有倒挂将作调平处理。同生产企业同药品品规（指通用名、剂型、规格完全相同），只能选择一种零售包装数量进行报价，且中标后须持续供应该包装药品','暂报价原则',0,NULL,12,2,0),(61,'中标生产企业应在规定的时间内完成配送关系的选择，确定药品配送企业或机构，原则上，中标生产企业可直接配送或者委托获得基本药物配送资格的药品经营企业配送。中标企业对质量和供应一并负责。','配送规则',0,NULL,13,2,0),(62,'无','政策解释',0,NULL,14,2,0),(63,'无','政策异同',0,NULL,15,2,0),(64,'没有相关产品','AZ产品',0,NULL,16,2,0),(65,'详细','关注的领域',0,NULL,17,2,1),(66,'600种左右','可使用的药物数目',0,NULL,18,2,0),(67,'按照规定只能使用基本药物','基本药物使用规定',0,NULL,19,2,0),(68,'现阶段还处于过渡期，非基本药物仍然可以在社区中使用','执行现状',0,NULL,20,2,0),(69,'对过渡期，还没有具体的期限','实施时间表',0,NULL,21,2,0),(70,'无','政策解释',0,NULL,22,2,0),(71,'无','政策异同',0,NULL,23,2,0),(72,'是','是否要求配备所有基药',0,NULL,24,2,0),(73,'要求优先使用基本药物，但是没有具体的使用比例的规定','基本药物使用规定',0,NULL,25,2,0),(74,'大多数医院已经配备基本药物，但是基本药物很少使用；且没有相关比例的规定限制','执行现状',0,NULL,26,2,0),(75,'暂时没有明确的时间表','实施时间表',0,NULL,27,2,0),(76,'无','政策解释',0,NULL,28,2,0),(77,'无','政策异同',0,NULL,29,2,0),(78,'无','计划零差价药物数目',0,NULL,30,2,0),(79,'绝大部分基本药物已经执行了药品零差价','零差率现状',0,NULL,31,2,0),(80,'没有具体的时间表','实施时间表',0,NULL,32,2,0),(81,'详细','政府补贴',0,NULL,33,2,1),(82,'详细','收支两条线',0,NULL,34,2,1),(83,'国家基本药物和四川省补充目录药品全部纳入基本医疗保障药品报销目录','城镇职工医保',0,NULL,35,2,0),(84,'国家基本药物和四川省补充目录药品全部纳入基本医疗保障药品报销目录','新农合',0,NULL,36,2,0),(85,'报销比例明显高于其他非基本药物','城镇职工医保',0,NULL,37,2,0),(86,'报销比例明显高于其他非基本药物','新农合',0,NULL,38,2,0),(87,'详细','口服常释剂型',0,NULL,39,2,1),(88,'详细','注射剂',0,NULL,40,2,1),(89,'详细','口服常释剂型',0,NULL,41,2,1),(90,'详细','缓释控释剂型',0,NULL,42,2,1),(91,'详细','注射剂',0,NULL,43,2,1),(92,'详细','口服常释剂型',0,NULL,44,2,1),(93,'详细','吸入剂',0,NULL,45,2,1),(94,'详细','口服液体剂',0,NULL,46,2,1),(95,'详细','注射剂',0,NULL,47,2,1),(96,'详细','泡腾片',0,NULL,48,2,1),(97,'1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，如洛汀新、代文等都进入药物目录','高血压',2,NULL,NULL,1,0),(98,'阿托伐他汀（立普妥）没有进入目录','高血脂',2,NULL,NULL,1,0),(99,'平喘药增加三种：特布他林、布地奈德、班布特罗','呼吸',2,NULL,NULL,1,0),(100,'抗酸药及抗溃疡药类增加三类：硫糖铝、大黄碳酸氢钠、西咪替丁','消化道',2,NULL,NULL,1,0),(101,'暂时没有明确的出台文件','高血压',17,NULL,NULL,1,0),(102,'暂时没有明确的出台文件','高血脂',17,NULL,NULL,1,0),(103,'暂时没有明确的出台文件','呼吸',17,NULL,NULL,1,0),(104,'暂时没有明确的出台文件','消化道',17,NULL,NULL,1,0),(105,'90%都是区政府补贴','补贴主体',33,NULL,NULL,1,0),(106,'目前绝大多数还是以政府补贴为主，部分市区（如南京、苏州）卫生服务中心主要以收支两条线为主；独立财政体制是以政府补贴为主','补贴方式',33,NULL,NULL,1,0),(107,'政府负责其举办的乡镇卫生院基本建设、设备购置、人员经费及其承担的公共卫生服务的业务经费，医务人员的工资水平要与当地事业单位工作人员平均工资水平相衔接。','收支两条线形式',34,NULL,NULL,1,0),(108,'区财政','收支主体',34,NULL,NULL,1,0),(109,'无','奥美拉唑',39,NULL,NULL,1,0),(110,'无','奥美拉唑',40,NULL,NULL,1,0),(111,'无','非洛地平',41,NULL,NULL,1,0),(112,'无','美托洛尔',41,NULL,NULL,1,0),(113,'无','赖诺普利',41,NULL,NULL,1,0),(114,'无','单硝酸异山梨酯',41,NULL,NULL,1,0),(115,'无','非洛地平',42,NULL,NULL,1,0),(116,'无','美托洛尔',42,NULL,NULL,1,0),(117,'无','美托洛尔',43,NULL,NULL,1,0),(118,'无','班布特罗',44,NULL,NULL,1,0),(119,'无','特布他林',44,NULL,NULL,1,0),(120,'无','扎鲁司特',44,NULL,NULL,1,0),(121,'无','布地奈德',45,NULL,NULL,1,0),(122,'无','福莫特罗',45,NULL,NULL,1,0),(123,'无','特布他林',45,NULL,NULL,1,0),(124,'无','布地奈德福莫特罗',45,NULL,NULL,1,0),(125,'无','特布他林',46,NULL,NULL,1,0),(126,'无','丙泊酚',47,NULL,NULL,1,0),(127,'无','罗哌卡因',47,NULL,NULL,1,0),(128,'无','阿司匹林',48,NULL,NULL,1,0),(129,'没有相关通用名进入目录','高血压',50,NULL,NULL,2,0),(130,'没有相关通用名进入目录','高血脂',50,NULL,NULL,2,0),(131,'没有相关通用名进入目录','呼吸',50,NULL,NULL,2,0),(132,'抗酸药及抗溃疡药类增加一类：西咪替丁','消化道',50,NULL,NULL,2,0),(133,'硝苯地平：30片，5.7元；60片，7.1元','高血压',65,NULL,NULL,2,0),(134,'辛伐他汀：4种剂型，最贵的24片，17元','高血脂',65,NULL,NULL,2,0),(135,'没有相关产品','呼吸',65,NULL,NULL,2,0),(136,'奥美拉唑：片剂，1.48元；针剂，3.05元','消化道',65,NULL,NULL,2,0),(137,'70%都是区政府补贴','补贴主体',81,NULL,NULL,2,0),(138,'目前绝大多数还是以政府补贴为主，约30%的基层医院施行了收支两条线','补贴方式',81,NULL,NULL,2,0),(139,'主要承担基层医院的基本建设、设备购置、人员经费及其承担的公共卫生服务的费用。','收支两条线形式',82,NULL,NULL,2,0),(140,'区财政','收支主体',82,NULL,NULL,2,0),(141,'无','奥美拉唑',87,NULL,NULL,2,0),(142,'无','奥美拉唑',88,NULL,NULL,2,0),(143,'无','非洛地平',89,NULL,NULL,2,0),(144,'无','美托洛尔',89,NULL,NULL,2,0),(145,'无','赖诺普利',89,NULL,NULL,2,0),(146,'无','单硝酸异山梨酯',89,NULL,NULL,2,0),(147,'无','非洛地平',90,NULL,NULL,2,0),(148,'无','美托洛尔',90,NULL,NULL,2,0),(149,'无','美托洛尔',91,NULL,NULL,2,0),(150,'无','班布特罗',92,NULL,NULL,2,0),(151,'无','特布他林',92,NULL,NULL,2,0),(152,'无','扎鲁司特',92,NULL,NULL,2,0),(153,'无','布地奈德',93,NULL,NULL,2,0),(154,'无','福莫特罗',93,NULL,NULL,2,0),(155,'无','特布他林',93,NULL,NULL,2,0),(156,'无','布地奈德福莫特罗',93,NULL,NULL,2,0),(157,'无','特布他林',94,NULL,NULL,2,0),(158,'无','丙泊酚',95,NULL,NULL,2,0),(159,'无','罗哌卡因',95,NULL,NULL,2,0),(160,'无','阿司匹林',96,NULL,NULL,2,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PROVINCE`
--

LOCK TABLES `PROVINCE` WRITE;
/*!40000 ALTER TABLE `PROVINCE` DISABLE KEYS */;
INSERT INTO `PROVINCE` VALUES (1,1,'江苏'),(2,2,'四川');
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

-- Dump completed on 2011-06-19 22:23:05
