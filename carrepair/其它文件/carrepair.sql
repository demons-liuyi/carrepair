/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.18-log : Database - carrepair
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`carrepair` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `carrepair`;

/*Table structure for table `artisan` */

DROP TABLE IF EXISTS `artisan`;

CREATE TABLE `artisan` (
  `artisanNo` varchar(10) NOT NULL COMMENT '技工编号',
  `artisanName` varchar(20) DEFAULT NULL COMMENT '技工名称',
  `sex` varchar(5) DEFAULT NULL COMMENT '技工性别',
  `artisanClassId` int(4) DEFAULT NULL COMMENT '所在班组Id',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `account` varchar(20) DEFAULT NULL COMMENT '技工账号',
  `address` varchar(20) DEFAULT NULL COMMENT '地址',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `weChat` varchar(20) DEFAULT NULL COMMENT '微信号',
  `idCardNo` varchar(18) DEFAULT NULL COMMENT '身份证',
  `residence` varchar(20) DEFAULT NULL COMMENT '户口地址',
  `bank` varchar(20) DEFAULT NULL COMMENT '开户银行',
  `bankAccount` varchar(20) DEFAULT NULL COMMENT '银行账号',
  `artisanLevelId` int(4) DEFAULT NULL COMMENT '技工星级Id',
  `groupLeader` int(1) DEFAULT NULL COMMENT '是否组长0否1是',
  `maintainType` varchar(100) DEFAULT NULL COMMENT '维修工种',
  `maintainBrand` varchar(100) DEFAULT NULL COMMENT '维修品牌',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`artisanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisan` */

/*Table structure for table `artisanclass` */

DROP TABLE IF EXISTS `artisanclass`;

CREATE TABLE `artisanclass` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '班组编号从1000开始自增',
  `artisanClassName` varchar(10) DEFAULT NULL COMMENT '班组名称',
  `artisanClassWeight` int(4) DEFAULT NULL COMMENT '提成权重',
  `parentId` int(10) DEFAULT NULL COMMENT '父级id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisanclass` */

/*Table structure for table `artisanlevel` */

DROP TABLE IF EXISTS `artisanlevel`;

CREATE TABLE `artisanlevel` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '等级编号',
  `artisanLevelName` varchar(20) DEFAULT NULL COMMENT '等级名称',
  `artisanLevelWeight` int(4) DEFAULT NULL COMMENT '提成权重',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisanlevel` */

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `id` varchar(20) NOT NULL COMMENT '车型编号',
  `carTypeName` varchar(20) DEFAULT NULL COMMENT '车型名称',
  `engineId` int(4) DEFAULT NULL COMMENT '发动机品牌外键',
  `price` float DEFAULT NULL COMMENT '参考价格',
  `carYearPrice` float DEFAULT NULL COMMENT '车辆年款',
  `power` varchar(20) DEFAULT NULL COMMENT '功率',
  `importOrdomestic` varchar(20) DEFAULT NULL COMMENT '进口或者国产',
  `fuelLabel` varchar(20) DEFAULT NULL COMMENT '燃油编号',
  `deadweight` varchar(20) DEFAULT NULL COMMENT '载重',
  `carBrandId` int(4) DEFAULT NULL COMMENT '与车品牌表相关联',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`id`,`carTypeName`,`engineId`,`price`,`carYearPrice`,`power`,`importOrdomestic`,`fuelLabel`,`deadweight`,`carBrandId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('1','重汽汕德卡',4,480000,NULL,NULL,'国产',NULL,'20吨',1,NULL,NULL,NULL,NULL,NULL),
('10','一汽解放J7',4,330000,NULL,NULL,'国产',NULL,'18吨',4,NULL,NULL,NULL,NULL,NULL),
('11','一汽解放J6P',3,350000,NULL,NULL,'国产',NULL,'20吨',4,NULL,NULL,NULL,NULL,NULL),
('12','上汽红岩杰狮自卸车',4,220000,NULL,NULL,'国产',NULL,'12吨',5,NULL,NULL,NULL,NULL,NULL),
('13','上汽红岩杰狮牵引车',4,240000,NULL,NULL,'国产',NULL,'10吨',5,NULL,NULL,NULL,NULL,NULL),
('14','上汽红岩新金刚自卸车',3,200000,NULL,NULL,'国产',NULL,'10吨',5,NULL,NULL,NULL,NULL,NULL),
('15','上汽红岩杰卡自卸车',2,180000,NULL,NULL,'国产',NULL,'10吨',5,NULL,NULL,NULL,NULL,NULL),
('16','上汽红岩杰卡牵引车',1,170000,NULL,NULL,'国产',NULL,'8吨',5,NULL,NULL,NULL,NULL,NULL),
('17','大运重卡',4,330000,NULL,NULL,'国产',NULL,'25吨',6,NULL,NULL,NULL,NULL,NULL),
('18','东风华神',4,180000,NULL,NULL,'国产',NULL,'3吨',6,NULL,NULL,NULL,NULL,NULL),
('2','重汽豪沃',3,420000,NULL,NULL,'国产',NULL,'22吨',1,NULL,NULL,NULL,NULL,NULL),
('3','重汽豪翰',3,450000,NULL,NULL,'国产',NULL,'21吨',1,NULL,NULL,NULL,NULL,NULL),
('4','重汽斯太尔',1,470000,NULL,NULL,'国产',NULL,'22吨',1,NULL,NULL,NULL,NULL,NULL),
('5','丰田雷凌',2,150000,NULL,NULL,'进口',NULL,'3吨',2,NULL,NULL,NULL,NULL,NULL),
('6','丰田汉兰达',1,180000,NULL,NULL,'进口',NULL,'3吨',2,NULL,NULL,NULL,NULL,NULL),
('7','德龙X3000',3,320000,NULL,NULL,'国产',NULL,'15吨',3,NULL,NULL,NULL,NULL,NULL),
('8','德龙H6000',4,250000,NULL,NULL,'国产',NULL,'14吨',3,NULL,NULL,NULL,NULL,NULL),
('9','德御',3,280000,NULL,NULL,'国产',NULL,'15吨',3,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '汽车品牌编号',
  `carBrandName` varchar(20) DEFAULT NULL COMMENT '汽车品牌名称',
  `firstletter` varchar(10) DEFAULT NULL COMMENT '汽车首字母',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `carbrand` */

insert  into `carbrand`(`id`,`carBrandName`,`firstletter`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'中国重汽','A',NULL,NULL,NULL,NULL,NULL),
(2,'丰田','F',NULL,NULL,NULL,NULL,NULL),
(3,'陕汽重卡','B',NULL,NULL,NULL,NULL,NULL),
(4,'中国一汽','K',NULL,NULL,NULL,NULL,NULL),
(5,'上汽红岩','H',NULL,NULL,NULL,NULL,NULL),
(6,'其他重型车','Z',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carinfo` */

DROP TABLE IF EXISTS `carinfo`;

CREATE TABLE `carinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `carNumber` varchar(20) DEFAULT NULL COMMENT '车牌号码',
  `carBrandId` int(11) DEFAULT NULL COMMENT '与车辆品牌关联',
  `carId` int(11) DEFAULT NULL COMMENT '与车型表关联',
  `carer` varchar(20) DEFAULT NULL COMMENT '驾驶员',
  `carerPhone` varchar(50) DEFAULT NULL COMMENT '驾驶员电话',
  `bornDate` date DEFAULT NULL COMMENT '出生日期',
  `affiliation` varchar(20) DEFAULT NULL COMMENT '车辆归属',
  `drivingLicence` date DEFAULT NULL COMMENT '驾驶证到期时间',
  `carNumber1` varchar(20) DEFAULT NULL COMMENT '车架号',
  `engineNumber` varchar(20) DEFAULT NULL COMMENT '发动机号',
  `yearPrice` float DEFAULT NULL COMMENT '车辆年款，w为单位',
  `mileage` float DEFAULT NULL COMMENT '车辆里程',
  `engineId` int(11) DEFAULT NULL COMMENT '与发动机表关联',
  `deadweight` varchar(20) DEFAULT NULL COMMENT '载重',
  `buyDate` datetime DEFAULT NULL COMMENT '购买日期',
  `dutyDate` datetime DEFAULT NULL COMMENT '上牌日期',
  `carCheckDate` datetime DEFAULT NULL COMMENT '车检日期',
  `fuelOilType` varchar(20) DEFAULT NULL COMMENT '燃油类别',
  `carSeries` varchar(20) DEFAULT NULL COMMENT '车系',
  `Jqinsurance` varchar(20) DEFAULT NULL COMMENT '交强保险公司',
  `Jqinsurancedate` date DEFAULT NULL COMMENT '交强保险到期时间',
  `Syinsurance` varchar(30) DEFAULT NULL COMMENT '商业保险公司',
  `Syinsurancedate` date DEFAULT NULL COMMENT '商业保险到期时间',
  `maintain` float DEFAULT NULL COMMENT '下次保养里程',
  `maintaindate` date DEFAULT NULL COMMENT '下次保养日期',
  `clientid` varchar(100) DEFAULT NULL COMMENT '客户编号',
  `insuredcar` varchar(20) DEFAULT NULL COMMENT '在我投保车',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其他字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `carinfo` */

insert  into `carinfo`(`id`,`carNumber`,`carBrandId`,`carId`,`carer`,`carerPhone`,`bornDate`,`affiliation`,`drivingLicence`,`carNumber1`,`engineNumber`,`yearPrice`,`mileage`,`engineId`,`deadweight`,`buyDate`,`dutyDate`,`carCheckDate`,`fuelOilType`,`carSeries`,`Jqinsurance`,`Jqinsurancedate`,`Syinsurance`,`Syinsurancedate`,`maintain`,`maintaindate`,`clientid`,`insuredcar`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'湘A12356',2,6,'伟星','16634555987','1996-12-22','公司车','2020-02-20','LE42131831L436672','345347K',2001,10000,1,'21吨','2002-03-05 00:00:00','2003-04-01 00:00:00','2003-12-21 00:00:00','汽油',NULL,'阳光人寿保险','2004-01-01','阳光人寿保险','2004-01-01',20000,'2004-05-05','00000CU12348','1',NULL,NULL,NULL,NULL,NULL),
(2,'湘B54352',2,5,'张伟','18884343221','1995-10-21','公司车','2022-03-21','LL4123123J1245332','432234K',2018,5000,1,'3吨','2018-12-12 00:00:00','2018-12-21 00:00:00','2019-01-21 00:00:00','汽油',NULL,'阳光人寿保险','2018-12-25','阳光人寿保险','2018-12-30',18000,'2020-09-21','00000CU12348','2',NULL,NULL,NULL,NULL,NULL),
(3,'湘C53453',3,8,'菲力','17759342092','1994-11-21','公司车','2023-04-22','LL1432423F1435323','423422K',2015,12000,3,'14吨','2015-05-23 00:00:00','2015-12-23 00:00:00','2016-01-01 00:00:00','汽油',NULL,'平安人寿保险','2015-06-23','阳光人寿保险','2015-12-29',250000,'2017-12-21','00000CU12349','1',NULL,NULL,NULL,NULL,NULL),
(4,'湘B12432',1,3,'齐齐','18876444728','1986-02-13','公司车','2020-02-26','LE42131831L436123','345547K',2001,10000,3,'21吨','2020-01-29 00:00:00','2020-02-05 00:00:00','2020-02-28 00:00:00','汽油','','人寿保险','2020-03-04','平安人寿保险','2020-03-07',20000,'2020-01-16','00000CU12353','2',NULL,NULL,NULL,NULL,NULL),
(5,'湘B45432',6,18,'菲菲','18899277826','1988-02-10','公司车','2020-03-07','LL4123123J1245532','436634K',2018,1000,2,'20吨','2018-02-13 00:00:00','2018-03-14 00:00:00','2020-02-13 00:00:00','汽油','','阳光人寿保险','2020-02-12','人寿保险','2020-02-20',30000,'2020-03-05','00000CU12352','1',NULL,NULL,NULL,NULL,NULL),
(6,'湘B88872',2,6,'憨憨','17773999287','1994-03-16','公司车','2020-02-25','LL4123123J1245543','412634K',2018,10000,1,'1','2020-02-18 00:00:00','2020-02-18 00:00:00','2020-03-06 00:00:00','汽油','','阳光人寿保险','2020-02-19','阳光人寿保险','2020-02-29',300000,'2020-02-11','00000CU12354','1','',NULL,NULL,NULL,NULL),
(7,'湘B88726',2,6,'旺旺','19982738276','1994-03-09','公司车','2020-02-28','LL4123123J1245543','432634K',2018,15000,1,'1','2020-02-11 00:00:00','2020-02-19 00:00:00','2020-03-05 00:00:00','汽油','','阳光人寿保险','2020-03-04','阳光人寿保险','2020-03-06',300000,'2020-02-10','00000CU12355','2',NULL,NULL,NULL,NULL,NULL),
(12,'湘B123123',4,11,'qwe','qwe',NULL,'公司车',NULL,'12','12',12,NULL,1,'',NULL,NULL,NULL,'','','阳光人寿保险',NULL,'阳光人寿保险',NULL,12,NULL,'00000CU12352','2',NULL,NULL,NULL,NULL,NULL),
(16,'123',4,10,'123','123','2020-02-11','公司车','2020-02-13','123','123',123,123,1,'123','2020-02-18 00:00:00','2020-02-07 00:00:00','2020-01-28 00:00:00','123','123','阳光人寿保险','2020-02-11','阳光人寿保险','2020-02-03',123,'2020-02-04','00000CU12348','1',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `cashier` */

DROP TABLE IF EXISTS `cashier`;

CREATE TABLE `cashier` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '收银id',
  `totalNum` float DEFAULT NULL COMMENT '总金额',
  `cashierstatic` varchar(10) DEFAULT NULL COMMENT '结算状态',
  `paymentType` varchar(10) DEFAULT NULL COMMENT '支付方式',
  `invoiceNo` varchar(10) DEFAULT NULL COMMENT '发票表id',
  `cashiertime` datetime DEFAULT NULL COMMENT '结算时间',
  `staffId` varchar(10) DEFAULT NULL COMMENT '员工表id检查该员工的角色是否有权限使用内部券',
  `onCredit` float DEFAULT NULL COMMENT '挂账金额',
  `interior` float DEFAULT NULL COMMENT '内部免单金额',
  `clientId` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `change` float DEFAULT NULL COMMENT '找零',
  `Number` varchar(10) DEFAULT NULL COMMENT '销售单号',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `cashier` */

insert  into `cashier`(`id`,`totalNum`,`cashierstatic`,`paymentType`,`invoiceNo`,`cashiertime`,`staffId`,`onCredit`,`interior`,`clientId`,`change`,`Number`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,1000,'已支付','现金',NULL,'2020-02-11 20:13:52','SWE001',NULL,NULL,'00000CU12349',NULL,'RNG202001','1',NULL,NULL,NULL,NULL),
(2,2000,'已支付','微信',NULL,'2020-02-11 20:16:28','ZXC001',NULL,NULL,'00000CU12350',NULL,'RNG202002','1',NULL,NULL,NULL,NULL),
(3,5000,'已支付','支付宝',NULL,'2020-02-11 20:17:41','SWE003',NULL,NULL,'00000CU12353',NULL,'IG202002','2',NULL,NULL,NULL,NULL);

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `number` varchar(20) NOT NULL COMMENT '客户编码',
  `name` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `linkman` varchar(20) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机',
  `address` varchar(20) DEFAULT NULL COMMENT '地址',
  `borndate` date DEFAULT NULL COMMENT '生日',
  `paymentDays` int(11) DEFAULT NULL COMMENT '账期，天为单位',
  `paymentSize` int(11) DEFAULT NULL COMMENT '挂账额度，w为单位',
  `staffNo` varchar(10) DEFAULT NULL COMMENT '与员工表关联',
  `counselorName` varchar(20) DEFAULT NULL COMMENT '顾问电话',
  `sheng` varchar(10) DEFAULT NULL COMMENT '省',
  `shi` varchar(10) DEFAULT NULL COMMENT '市',
  `qv` varchar(10) DEFAULT NULL COMMENT '区',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `taxpayerNumber` varchar(20) DEFAULT NULL COMMENT '纳税人识别号',
  `registerPhone` varchar(20) DEFAULT NULL COMMENT '注册电话',
  `bank` varchar(20) DEFAULT NULL COMMENT '开户银行',
  `bankNumber` varchar(20) DEFAULT NULL COMMENT '银行账号',
  `registerAddress` varchar(20) DEFAULT NULL COMMENT '注册地址',
  `other` varchar(20) DEFAULT NULL COMMENT '其他',
  `typeId` int(4) DEFAULT '1' COMMENT '与客户类别表关联',
  `carNo` varchar(10) DEFAULT NULL COMMENT '与车辆表关联',
  `date` date DEFAULT NULL COMMENT '注册日期',
  `Integral` int(10) DEFAULT NULL COMMENT '积分',
  `onCredit` float DEFAULT NULL COMMENT '挂账金额',
  `deposit` float DEFAULT NULL COMMENT '定金金额',
  `petCard` float DEFAULT NULL COMMENT '储值卡余额',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

insert  into `client`(`number`,`name`,`linkman`,`phone`,`address`,`borndate`,`paymentDays`,`paymentSize`,`staffNo`,`counselorName`,`sheng`,`shi`,`qv`,`remark`,`taxpayerNumber`,`registerPhone`,`bank`,`bankNumber`,`registerAddress`,`other`,`typeId`,`carNo`,`date`,`Integral`,`onCredit`,`deposit`,`petCard`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('00000CU12348','莉莉','周小容','13122332987','湖南省株洲市荷塘区','1998-02-02',10,10000,'ZXC001','13442355323','湖南','株洲','荷塘区','无','243432213','18893888273','工商银行','876789574832789','湖南省株洲市荷塘区红旗广场支行',NULL,2,NULL,'2020-01-05',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12349','湾湾','刘小平','14232322145','湖南省长沙市天心区','1999-03-05',10,5000,'ASD003','18598237648','湖南','长沙','天心区','无','534325321','18643436373','兴业银行','898574839432285','湖南省株洲市新华东路支行',NULL,3,NULL,'2020-01-03',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12350','点点','小蜜','13487699820','湖南省长沙市雨花区雨花亭','1997-02-05',3,11111,'SWE003','15323245675','湖南','长沙','雨花区','无','123123123','13143566432','建设银行','12312321423543534','湖南省长沙市雨花区雨花亭支行',NULL,1,NULL,'2020-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12351','晓晓','王婉','18890887672','湖南省株洲市石峰区','1995-02-16',3,1234,'SWE003','15323245675','湖南','株洲','石峰区','无','123124214123123','14567567543','农业银行','12398878312','湖南省株洲市石峰区响石广场支行',NULL,1,NULL,'2020-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12352','科科','小七','18893777876','湖南省长沙市天心区','1994-02-09',2,1000,'ASD003','18843242211','湖南','长沙','天心区','无','123124125123123','14423566785','工商银行','717948322394239423','湖南省长沙市天心区支行',NULL,1,NULL,'2020-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12353','可可','王德发','18893777628','湖南省株洲市天元区','1997-03-13',3,1000,'SWE002','13156734327','湖南','株洲','天元区','无','','','','','',NULL,1,NULL,'2020-02-07',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12354','憨憨','铁铁','188992773621','湖南省株洲市荷塘区','1994-03-09',3,1000,'ZXC001','13442355323','湖南','株洲','荷塘区','无','','','','','',NULL,1,NULL,'2020-02-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12355','旺旺','霸霸','19982738276','湖南省株洲市芦淞区','1994-03-09',4,1000,'SWE003','15323245675','湖南','株洲','芦淞区','无','','','','','',NULL,1,NULL,'2020-02-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `clienttype` */

DROP TABLE IF EXISTS `clienttype`;

CREATE TABLE `clienttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户类别编号',
  `clientType` varchar(20) DEFAULT NULL COMMENT '客户类别',
  `validity` int(11) DEFAULT NULL COMMENT '有效期，年为单位',
  `cost` float DEFAULT NULL COMMENT '会费',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `type` varchar(20) DEFAULT NULL COMMENT '类别',
  `discount` float DEFAULT NULL COMMENT '折扣',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `clienttype` */

insert  into `clienttype`(`id`,`clientType`,`validity`,`cost`,`address`,`type`,`discount`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'标准客户',5,500,NULL,'标准价',0.95,'非会员',NULL,NULL,NULL,NULL),
(2,'会员客户',5,888,NULL,'会员价',0.88,'会员',NULL,NULL,NULL,NULL),
(3,'协议客户',5,1000,NULL,'协议价',0.8,'非会员',NULL,NULL,NULL,NULL),
(4,'索赔客户',5,1288,NULL,'索赔价',0.78,'非会员',NULL,NULL,NULL,NULL),
(5,'保险客户',5,1588,NULL,'保险价',0.72,'会员',NULL,NULL,NULL,NULL);

/*Table structure for table `commodity` */

DROP TABLE IF EXISTS `commodity`;

CREATE TABLE `commodity` (
  `commodityNo` varchar(10) NOT NULL COMMENT '商品编号',
  `name` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `brand` varchar(20) DEFAULT NULL COMMENT '商品品牌',
  `carType` varchar(20) DEFAULT NULL COMMENT '适用车型',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `CommdityTypeId` int(4) DEFAULT NULL COMMENT '与商品类别表关联',
  `income` varchar(20) DEFAULT NULL COMMENT '收入分类',
  `original` varchar(20) DEFAULT NULL COMMENT '原厂副厂',
  `commodityGrade` varchar(20) DEFAULT NULL COMMENT '商品等级',
  `commodityPlace` varchar(20) DEFAULT NULL COMMENT '商品产地',
  `manufacturerNumber` varchar(10) DEFAULT NULL COMMENT '与厂商表关联',
  `firmNumber` varchar(20) DEFAULT NULL COMMENT '原厂编码',
  `barCode` varchar(20) DEFAULT NULL COMMENT '条形码',
  `size` varchar(20) DEFAULT NULL COMMENT '规格',
  `volume` varchar(20) DEFAULT NULL COMMENT '体积',
  `weight` varchar(20) DEFAULT NULL COMMENT '毛重',
  `suttle` varchar(20) DEFAULT NULL COMMENT '净重',
  `primeCost` float DEFAULT NULL COMMENT '进货价格',
  `sellway` varchar(20) DEFAULT NULL COMMENT '售价方式',
  `markupPercentage` float DEFAULT NULL COMMENT '加价率',
  `code` varchar(20) DEFAULT NULL COMMENT '互换码',
  `NormalPrice` float DEFAULT NULL COMMENT '标准价',
  `vipPrice` float DEFAULT NULL COMMENT 'vip价',
  `memberPrice` float DEFAULT NULL COMMENT '会员价',
  `negotiatedPrice` float DEFAULT NULL COMMENT '协议价',
  `claimPrice` float DEFAULT NULL COMMENT '索赔价',
  `insurancePrice` float DEFAULT NULL COMMENT '保险价',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`commodityNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `commodity` */

/*Table structure for table `commoditytype` */

DROP TABLE IF EXISTS `commoditytype`;

CREATE TABLE `commoditytype` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '商品分类编号',
  `typeName` varchar(20) DEFAULT NULL COMMENT '商品分类名称',
  `parentId` int(4) DEFAULT NULL COMMENT '商品父级id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `commoditytype` */

/*Table structure for table `completed` */

DROP TABLE IF EXISTS `completed`;

CREATE TABLE `completed` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yesOrno` int(11) DEFAULT NULL COMMENT '合格否 1=合格，0=不合格',
  `predicttime` datetime DEFAULT NULL COMMENT '预计完工时间',
  `nowtime` datetime DEFAULT NULL COMMENT '实际完工时间',
  `reason` varchar(30) DEFAULT NULL COMMENT '误工原因',
  `workid` varchar(10) DEFAULT NULL COMMENT '质检员，与员工表关联',
  `dutyid` varchar(10) DEFAULT NULL COMMENT '责任人，与员工表关联',
  `price` float DEFAULT NULL COMMENT '处罚金额',
  `count` int(11) DEFAULT NULL COMMENT '返工数',
  `fgreason` varchar(20) DEFAULT NULL COMMENT '返工原因',
  `wjid` varchar(20) DEFAULT NULL COMMENT '维修或救援id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `completed` */

insert  into `completed`(`id`,`yesOrno`,`predicttime`,`nowtime`,`reason`,`workid`,`dutyid`,`price`,`count`,`fgreason`,`wjid`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(10,0,'2020-02-15 00:00:00','2020-02-15 00:00:00',NULL,NULL,NULL,1212,1,'','WGQ20200214134851',NULL,NULL,NULL,NULL,NULL),
(11,1,'2020-02-15 00:00:00','2020-02-16 00:00:00',NULL,NULL,NULL,NULL,1,NULL,'WGQ20200213153913',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `departmentName` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `departmentTypeName` varchar(20) DEFAULT NULL COMMENT '部门类型名称',
  `parentId` int(4) DEFAULT NULL COMMENT '父级id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`id`,`departmentName`,`departmentTypeName`,`parentId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'北京德召文卡车系统','北京德召文卡车系统',0,NULL,NULL,NULL,NULL,NULL),
(2,'0000-成高','北京德召文卡车系统',1,NULL,NULL,NULL,NULL,NULL),
(3,'管钱部','管理部',2,NULL,NULL,NULL,NULL,NULL),
(4,'客服部','服务部门',2,NULL,NULL,NULL,NULL,NULL),
(5,'售后服务部','管理部',2,NULL,NULL,NULL,NULL,NULL),
(6,'备件部','管理部',2,NULL,NULL,NULL,NULL,NULL),
(7,'技术部','服务部门',2,NULL,NULL,NULL,NULL,NULL),
(8,'市场部','管理部',2,NULL,NULL,NULL,NULL,NULL),
(9,'机电组','维修班组',7,NULL,NULL,NULL,NULL,NULL),
(10,'钣金组','维修班组',7,NULL,NULL,NULL,NULL,NULL),
(11,'喷漆组','维修班组',7,NULL,NULL,NULL,NULL,NULL),
(12,'美容组','维修班组',7,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `dimission` */

DROP TABLE IF EXISTS `dimission`;

CREATE TABLE `dimission` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `staffId` varchar(10) DEFAULT NULL COMMENT '员工id',
  `dimissionDate` date DEFAULT NULL COMMENT '离职日期',
  `dimissionCause` varchar(100) DEFAULT NULL COMMENT '离职原因',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `dimission` */

insert  into `dimission`(`id`,`staffId`,`dimissionDate`,`dimissionCause`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(22,'ASD002','2020-02-06','我不想干了',NULL,NULL,NULL,NULL,NULL),
(23,'ASD003','2020-02-06','我也不想干了',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `enginebrand` */

DROP TABLE IF EXISTS `enginebrand`;

CREATE TABLE `enginebrand` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '发动机品牌编号',
  `engineBrandName` varchar(20) DEFAULT NULL COMMENT '发动机品牌名称',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `enginebrand` */

insert  into `enginebrand`(`id`,`engineBrandName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'帕金斯发动机',NULL,NULL,NULL,NULL,NULL),
(2,'康明斯发动机',NULL,NULL,NULL,NULL,NULL),
(3,'卡特发动机',NULL,NULL,NULL,NULL,NULL),
(4,'上柴发动机',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `ewitem` */

DROP TABLE IF EXISTS `ewitem`;

CREATE TABLE `ewitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '项目名称',
  `priceType` varchar(30) DEFAULT NULL COMMENT '价类',
  `price` float DEFAULT NULL COMMENT '价格',
  `remark` varchar(30) DEFAULT NULL COMMENT '备注',
  `rescueid` varchar(30) DEFAULT NULL COMMENT '与救援关联',
  `repairid` varchar(20) DEFAULT NULL COMMENT '与维修表关联',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ewitem` */

/*Table structure for table `getgood` */

DROP TABLE IF EXISTS `getgood`;

CREATE TABLE `getgood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodid` int(11) DEFAULT NULL COMMENT '与物料表关联',
  `count` int(11) DEFAULT NULL COMMENT '需求数量',
  `item` varchar(20) DEFAULT NULL COMMENT '对应项目',
  `priceType` varchar(100) DEFAULT NULL COMMENT '价类',
  `discountsPrice` varchar(100) DEFAULT NULL COMMENT '优惠后单价',
  `wjid` varchar(100) DEFAULT NULL COMMENT '维修或救援id',
  `warehouse` varchar(100) DEFAULT NULL COMMENT '仓库',
  `isRepair` varchar(100) DEFAULT NULL COMMENT '是否领料0否1是',
  `cause` varchar(40) DEFAULT NULL COMMENT '免单原因',
  `type` varchar(40) DEFAULT NULL COMMENT '类别',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `getgood` */

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `invoiceNo` varchar(10) NOT NULL COMMENT '发票表单号',
  `money` float DEFAULT NULL COMMENT '发票金额',
  `invoiceType` varchar(10) DEFAULT NULL COMMENT '发票类型',
  `invoiceDate` datetime DEFAULT NULL COMMENT '开票时间',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`invoiceNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `invoice` */

/*Table structure for table `item_repair` */

DROP TABLE IF EXISTS `item_repair`;

CREATE TABLE `item_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isRepair` int(11) DEFAULT NULL COMMENT '是救援还是维修，救援=0',
  `wjid` int(11) DEFAULT NULL COMMENT '救援或者维修表id',
  `itemid` int(11) DEFAULT NULL COMMENT '项目id',
  `teamid` int(11) DEFAULT NULL COMMENT '班组id',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `priceType` varchar(100) DEFAULT NULL COMMENT '价类',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `item_repair` */

/*Table structure for table `itemtype` */

DROP TABLE IF EXISTS `itemtype`;

CREATE TABLE `itemtype` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `itemTypeName` varchar(20) DEFAULT NULL COMMENT '名称',
  `parentId` int(4) DEFAULT NULL COMMENT '父级id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `itemtype` */

/*Table structure for table `jurisdiction` */

DROP TABLE IF EXISTS `jurisdiction`;

CREATE TABLE `jurisdiction` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `jurisdictionName` varchar(20) DEFAULT NULL COMMENT '权限名称',
  `ename` varchar(20) DEFAULT NULL COMMENT '英文名称',
  `catalog` int(11) DEFAULT NULL COMMENT '0是目录1是功能',
  `parentId` int(11) DEFAULT NULL COMMENT '权限父id',
  `path` varchar(20) DEFAULT NULL COMMENT '权限路径',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `jurisdiction` */

insert  into `jurisdiction`(`id`,`jurisdictionName`,`ename`,`catalog`,`parentId`,`path`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'人事行政',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(2,'系统维护',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(3,'主数据',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(4,'客户档案',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(5,'前台结算',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(6,'维修',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(7,'组织架构',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(8,'岗位定义',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(9,'离职登记',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(10,'通讯名录',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(11,'技工星级',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(12,'班组技工',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(13,'外勤车辆',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(14,'员工角色控制',NULL,0,2,NULL,NULL,NULL,NULL,NULL,NULL),
(15,'发动机品牌',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(16,'车型档案',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(17,'维修项目',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(18,'商品资料',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(19,'供货单位',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(20,'客户资料',NULL,0,4,NULL,NULL,NULL,NULL,NULL,NULL),
(21,'车辆资料',NULL,0,4,NULL,NULL,NULL,NULL,NULL,NULL),
(22,'结算中心',NULL,0,5,NULL,NULL,NULL,NULL,NULL,NULL),
(23,'会员充值卡',NULL,0,5,NULL,NULL,NULL,NULL,NULL,NULL),
(24,'维修接车',NULL,0,6,NULL,NULL,NULL,NULL,NULL,NULL),
(25,'竣工检验',NULL,0,6,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `legworkcat` */

DROP TABLE IF EXISTS `legworkcat`;

CREATE TABLE `legworkcat` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `licensePlateNumber` varchar(20) NOT NULL COMMENT '车牌号',
  `brand` varchar(20) DEFAULT NULL COMMENT '品牌',
  `model` varchar(20) DEFAULT NULL COMMENT '车型',
  `mileage` varchar(20) DEFAULT NULL COMMENT '当前里程',
  `artisanClassId` int(4) DEFAULT NULL COMMENT '所在班组',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `legworkcat` */

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '联系人id',
  `name` varchar(20) DEFAULT NULL COMMENT '联系人名称',
  `position` varchar(20) DEFAULT NULL COMMENT '职位',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(20) DEFAULT NULL COMMENT 'email',
  `manufacturerNumber` varchar(10) DEFAULT NULL COMMENT '与厂商表关联',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `linkman` */

/*Table structure for table `maintainregist` */

DROP TABLE IF EXISTS `maintainregist`;

CREATE TABLE `maintainregist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `maintainName` varchar(20) DEFAULT NULL COMMENT '保养名称',
  `mileage` float DEFAULT NULL COMMENT '计划里程',
  `mileageDate` date DEFAULT NULL COMMENT '计划日期',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `sjmileage` float DEFAULT NULL COMMENT '实际里程',
  `Sjmileagedate` date DEFAULT NULL COMMENT '实际日期',
  `otherone` varchar(100) DEFAULT NULL COMMENT '车牌号',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `maintainregist` */

insert  into `maintainregist`(`id`,`maintainName`,`mileage`,`mileageDate`,`remark`,`sjmileage`,`Sjmileagedate`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(2,'换后视镜',111,'2020-02-20',NULL,222,'2020-02-26','湘A12356',NULL,NULL,NULL,NULL),
(3,'111',111,'2020-02-25',NULL,111,'2020-02-21','湘A12356',NULL,NULL,NULL,NULL);

/*Table structure for table `maintenanceitems` */

DROP TABLE IF EXISTS `maintenanceitems`;

CREATE TABLE `maintenanceitems` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '项目编号',
  `itemsName` varchar(20) DEFAULT NULL COMMENT '项目名称',
  `typeId` int(4) DEFAULT NULL COMMENT '与几种类别表关联',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `normalPrice` float DEFAULT NULL COMMENT '标准价',
  `memberPrice` float DEFAULT NULL COMMENT '会员价',
  `vipPrice` float DEFAULT NULL COMMENT 'Vip价',
  `negotiatedPrice` float DEFAULT NULL COMMENT '协议价',
  `claimPrice` float DEFAULT NULL COMMENT '索赔价',
  `insurancePrice` float DEFAULT NULL COMMENT '保险价',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `maintenanceitems` */

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `number` varchar(10) NOT NULL COMMENT '厂商编号',
  `name` varchar(20) DEFAULT NULL COMMENT '厂商名称',
  `address` varchar(20) DEFAULT NULL COMMENT '地址',
  `manage` varchar(20) DEFAULT NULL COMMENT '经营状态',
  `url` varchar(20) DEFAULT NULL COMMENT '网址',
  `bank` varchar(20) DEFAULT NULL COMMENT '开户行',
  `bankNumber` varchar(20) DEFAULT NULL COMMENT '银行账号',
  `payment` varchar(20) DEFAULT NULL COMMENT '付款方式',
  `laver` varchar(20) DEFAULT NULL COMMENT '厂商等级',
  `brank` varchar(20) DEFAULT NULL COMMENT '经营品牌',
  `type` varchar(20) DEFAULT NULL COMMENT '厂商类别',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturer` */

/*Table structure for table `materialrequire_good` */

DROP TABLE IF EXISTS `materialrequire_good`;

CREATE TABLE `materialrequire_good` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `requireid` int(11) DEFAULT NULL COMMENT '与需求表关联',
  `goodid` int(11) DEFAULT NULL COMMENT '与物料表关联',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `item` varchar(20) DEFAULT NULL COMMENT '对应项目',
  `warehouse` varchar(20) DEFAULT NULL COMMENT '仓库',
  `Isget` int(11) DEFAULT NULL COMMENT '是否领料1=是；0=否',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `materialrequire_good` */

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int(4) NOT NULL COMMENT '岗位id',
  `postName` varchar(20) DEFAULT NULL COMMENT '岗位名称',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `post` */

insert  into `post`(`id`,`postName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'展厅经理',NULL,NULL,NULL,NULL,NULL),
(2,'销售顾问',NULL,NULL,NULL,NULL,NULL),
(3,'销售员',NULL,NULL,NULL,NULL,NULL),
(4,'库管员',NULL,NULL,NULL,NULL,NULL),
(5,'移车员',NULL,NULL,NULL,NULL,NULL),
(6,'qwe',NULL,NULL,NULL,NULL,NULL),
(8,'123',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `repair` */

DROP TABLE IF EXISTS `repair`;

CREATE TABLE `repair` (
  `number` varchar(20) NOT NULL COMMENT '维修编号',
  `carinfoId` int(11) DEFAULT NULL COMMENT '与车辆信息表关联',
  `staffno` varchar(10) DEFAULT NULL COMMENT '与员工关联',
  `oil` varchar(30) DEFAULT NULL COMMENT '进厂油量',
  `type` varchar(20) DEFAULT NULL COMMENT '业务类别',
  `worktime` varchar(20) DEFAULT NULL COMMENT '施工班次',
  `getman` varchar(20) DEFAULT NULL COMMENT '接车人',
  `overworkdate` datetime DEFAULT NULL COMMENT '预计完工时间',
  `nowworkDate` datetime DEFAULT NULL COMMENT '实际完工时间',
  `setter` varchar(20) DEFAULT NULL COMMENT '结算方式',
  `company` varchar(20) DEFAULT NULL COMMENT '赔款公司',
  `befor` datetime DEFAULT NULL COMMENT '上次进场时间',
  `price` float DEFAULT NULL COMMENT '预估金额',
  `remark` varchar(40) DEFAULT NULL COMMENT '备注',
  `state` varchar(20) DEFAULT NULL COMMENT '报修陈述',
  `fault` varchar(30) DEFAULT NULL COMMENT '故障描述',
  `faultreasult` varchar(30) DEFAULT NULL COMMENT '故障原因',
  `status` varchar(20) DEFAULT NULL COMMENT '维修状态',
  `orderTime` datetime DEFAULT NULL COMMENT '开单时间',
  `stockDater` datetime DEFAULT NULL COMMENT '结算时间',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `repair` */

insert  into `repair`(`number`,`carinfoId`,`staffno`,`oil`,`type`,`worktime`,`getman`,`overworkdate`,`nowworkDate`,`setter`,`company`,`befor`,`price`,`remark`,`state`,`fault`,`faultreasult`,`status`,`orderTime`,`stockDater`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('RNG202001',4,'SWE003','满','中轻型车','白天','钟超','2020-02-03 16:39:53','2020-02-02 16:39:59','现结','中国平安保险',NULL,200,'第一次进厂','刹车有问题','刹车有问题','刹车片老化','完工','2020-02-02 16:13:49','2020-02-02 20:13:55',NULL,NULL,NULL,NULL,NULL),
('RNG202002',5,'SWE003','满','中轻型车','白天','超级管理员','2020-02-05 16:50:21','2020-02-04 16:50:23','现结','中国平安保险',NULL,100,'','贴膜','贴膜','贴膜','完工','2020-02-04 16:50:45','2020-02-04 16:50:47',NULL,NULL,NULL,NULL,NULL),
('RNG202003',5,'ZXC001','满','中轻型车','白天','钟超','2020-02-04 22:36:17','2020-02-04 22:36:24','现结','中国平安保险',NULL,100,NULL,'换胎','换胎','换胎','完工','2020-02-04 22:37:18','2020-02-04 22:37:20',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `rescue` */

DROP TABLE IF EXISTS `rescue`;

CREATE TABLE `rescue` (
  `number` varchar(30) NOT NULL COMMENT '救援编号',
  `carinfoid` int(11) DEFAULT NULL COMMENT '与车辆信息表关联',
  `staffno` varchar(10) DEFAULT NULL COMMENT '与员工关联',
  `rescueTeamid` int(11) DEFAULT NULL COMMENT '派工班组与班组表关联',
  `type` varchar(20) DEFAULT NULL COMMENT '业务类别',
  `worktimes` varchar(20) DEFAULT NULL COMMENT '施工班次',
  `getman` varchar(20) DEFAULT NULL COMMENT '接车人',
  `workdate` datetime DEFAULT NULL COMMENT '派工时间',
  `nowdate` datetime DEFAULT NULL COMMENT '出发时间',
  `address` varchar(20) DEFAULT NULL COMMENT '出发地址',
  `car` varchar(30) DEFAULT NULL COMMENT '驾驶车辆',
  `liche` float DEFAULT NULL COMMENT '行驶里程',
  `worktime` datetime DEFAULT NULL COMMENT '施工时间',
  `overtime` datetime DEFAULT NULL COMMENT '结束时间',
  `rescueaddress` varchar(40) DEFAULT NULL COMMENT '救援地址',
  `setter` varchar(30) DEFAULT NULL COMMENT '结算方式',
  `company` varchar(30) DEFAULT NULL COMMENT '赔款公司',
  `price` float DEFAULT NULL COMMENT '预估金额',
  `remark` varchar(30) DEFAULT NULL COMMENT '备注',
  `state` varchar(30) DEFAULT NULL COMMENT '报修陈述',
  `fault` varchar(30) DEFAULT NULL COMMENT '故障描述',
  `faultreasult` varchar(30) DEFAULT NULL COMMENT '故障原因',
  `status` varchar(30) DEFAULT NULL COMMENT '维修状态',
  `orderTime` datetime DEFAULT NULL COMMENT '开单时间',
  `stockDater` datetime DEFAULT NULL COMMENT '结算时间',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `rescue` */

insert  into `rescue`(`number`,`carinfoid`,`staffno`,`rescueTeamid`,`type`,`worktimes`,`getman`,`workdate`,`nowdate`,`address`,`car`,`liche`,`worktime`,`overtime`,`rescueaddress`,`setter`,`company`,`price`,`remark`,`state`,`fault`,`faultreasult`,`status`,`orderTime`,`stockDater`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('IG202001',4,'SWE003',0,'中轻型车','夜晚','万泽乐','2020-02-04 22:33:47','2020-02-04 22:33:52','北京街区','湘B54352',200,'2020-02-04 22:34:04','2020-02-04 22:34:06','天津工业区','现结','中国平安保险',500,'第一次救援',NULL,NULL,NULL,'接车','2020-02-02 17:12:38','2020-02-02 20:12:43',NULL,NULL,NULL,NULL,NULL),
('IG202002',5,'ZXC001',0,'中轻型车','白天','钟超','2020-02-02 19:03:08','2020-02-02 19:03:11','北京街区','湘B523F4',200,'2020-02-02 19:05:22','2020-02-02 19:05:24','天津工业区','现结','中国平安保险',500,'第一次救援','','','','接车','2020-02-04 17:12:38','2020-02-02 20:12:43',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `roleName` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `role_jurisdiction` */

DROP TABLE IF EXISTS `role_jurisdiction`;

CREATE TABLE `role_jurisdiction` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `roleid` int(4) DEFAULT NULL COMMENT '角色id',
  `jurisdictionId` int(4) DEFAULT NULL COMMENT '权限id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=596 DEFAULT CHARSET=utf8;

/*Data for the table `role_jurisdiction` */

insert  into `role_jurisdiction`(`id`,`roleid`,`jurisdictionId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(221,2,1,'1',NULL,NULL,NULL,NULL),
(222,2,8,'2',NULL,NULL,NULL,NULL),
(223,2,7,'1',NULL,NULL,NULL,NULL),
(224,2,9,'1',NULL,NULL,NULL,NULL),
(225,2,10,'1',NULL,NULL,NULL,NULL),
(226,2,11,'1',NULL,NULL,NULL,NULL),
(227,2,12,'1',NULL,NULL,NULL,NULL),
(228,2,13,'1',NULL,NULL,NULL,NULL),
(229,2,2,'1',NULL,NULL,NULL,NULL),
(230,2,14,'2',NULL,NULL,NULL,NULL),
(231,2,3,'1',NULL,NULL,NULL,NULL),
(232,2,15,'2',NULL,NULL,NULL,NULL),
(233,2,16,'1',NULL,NULL,NULL,NULL),
(234,2,17,'1',NULL,NULL,NULL,NULL),
(235,2,18,'1',NULL,NULL,NULL,NULL),
(236,2,19,'1',NULL,NULL,NULL,NULL),
(237,2,4,'1',NULL,NULL,NULL,NULL),
(238,2,20,'2',NULL,NULL,NULL,NULL),
(239,2,21,'1',NULL,NULL,NULL,NULL),
(240,2,5,'1',NULL,NULL,NULL,NULL),
(241,2,22,'2',NULL,NULL,NULL,NULL),
(242,2,23,'1',NULL,NULL,NULL,NULL),
(243,2,6,'1',NULL,NULL,NULL,NULL),
(244,2,25,'2',NULL,NULL,NULL,NULL),
(245,2,24,'1',NULL,NULL,NULL,NULL),
(246,1,1,'1',NULL,NULL,NULL,NULL),
(247,1,2,'1',NULL,NULL,NULL,NULL),
(248,1,3,'1',NULL,NULL,NULL,NULL),
(249,1,4,'1',NULL,NULL,NULL,NULL),
(250,1,5,'1',NULL,NULL,NULL,NULL),
(251,1,6,'1',NULL,NULL,NULL,NULL),
(252,1,7,'1',NULL,NULL,NULL,NULL),
(253,1,8,'1',NULL,NULL,NULL,NULL),
(254,1,9,'1',NULL,NULL,NULL,NULL),
(255,1,10,'1',NULL,NULL,NULL,NULL),
(256,1,11,'1',NULL,NULL,NULL,NULL),
(257,1,12,'1',NULL,NULL,NULL,NULL),
(258,1,13,'1',NULL,NULL,NULL,NULL),
(259,1,14,'1',NULL,NULL,NULL,NULL),
(260,1,15,'1',NULL,NULL,NULL,NULL),
(261,1,16,'1',NULL,NULL,NULL,NULL),
(262,1,17,'1',NULL,NULL,NULL,NULL),
(263,1,18,'1',NULL,NULL,NULL,NULL),
(264,1,19,'1',NULL,NULL,NULL,NULL),
(265,1,20,'1',NULL,NULL,NULL,NULL),
(266,1,21,'1',NULL,NULL,NULL,NULL),
(267,1,22,'1',NULL,NULL,NULL,NULL),
(268,1,23,'1',NULL,NULL,NULL,NULL),
(269,1,24,'1',NULL,NULL,NULL,NULL),
(270,1,25,'1',NULL,NULL,NULL,NULL),
(271,3,1,'1',NULL,NULL,NULL,NULL),
(272,3,2,'1',NULL,NULL,NULL,NULL),
(273,3,3,'1',NULL,NULL,NULL,NULL),
(274,3,4,'1',NULL,NULL,NULL,NULL),
(275,3,5,'1',NULL,NULL,NULL,NULL),
(276,3,6,'1',NULL,NULL,NULL,NULL),
(277,3,7,'1',NULL,NULL,NULL,NULL),
(278,3,8,'1',NULL,NULL,NULL,NULL),
(279,3,9,'1',NULL,NULL,NULL,NULL),
(280,3,10,'1',NULL,NULL,NULL,NULL),
(281,3,11,'1',NULL,NULL,NULL,NULL),
(282,3,12,'1',NULL,NULL,NULL,NULL),
(283,3,13,'1',NULL,NULL,NULL,NULL),
(284,3,14,'1',NULL,NULL,NULL,NULL),
(285,3,15,'1',NULL,NULL,NULL,NULL),
(286,3,16,'1',NULL,NULL,NULL,NULL),
(287,3,17,'1',NULL,NULL,NULL,NULL),
(288,3,18,'1',NULL,NULL,NULL,NULL),
(289,3,19,'1',NULL,NULL,NULL,NULL),
(290,3,20,'1',NULL,NULL,NULL,NULL),
(291,3,21,'1',NULL,NULL,NULL,NULL),
(292,3,22,'1',NULL,NULL,NULL,NULL),
(293,3,23,'1',NULL,NULL,NULL,NULL),
(294,3,24,'1',NULL,NULL,NULL,NULL),
(295,3,25,'1',NULL,NULL,NULL,NULL),
(296,4,1,'1',NULL,NULL,NULL,NULL),
(297,4,2,'1',NULL,NULL,NULL,NULL),
(298,4,3,'1',NULL,NULL,NULL,NULL),
(299,4,4,'1',NULL,NULL,NULL,NULL),
(300,4,5,'1',NULL,NULL,NULL,NULL),
(301,4,6,'1',NULL,NULL,NULL,NULL),
(302,4,7,'1',NULL,NULL,NULL,NULL),
(303,4,8,'1',NULL,NULL,NULL,NULL),
(304,4,9,'1',NULL,NULL,NULL,NULL),
(305,4,10,'1',NULL,NULL,NULL,NULL),
(306,4,11,'1',NULL,NULL,NULL,NULL),
(307,4,12,'1',NULL,NULL,NULL,NULL),
(308,4,13,'1',NULL,NULL,NULL,NULL),
(309,4,14,'1',NULL,NULL,NULL,NULL),
(310,4,15,'1',NULL,NULL,NULL,NULL),
(311,4,16,'1',NULL,NULL,NULL,NULL),
(312,4,17,'1',NULL,NULL,NULL,NULL),
(313,4,18,'1',NULL,NULL,NULL,NULL),
(314,4,19,'1',NULL,NULL,NULL,NULL),
(315,4,20,'1',NULL,NULL,NULL,NULL),
(316,4,21,'1',NULL,NULL,NULL,NULL),
(317,4,22,'1',NULL,NULL,NULL,NULL),
(318,4,23,'1',NULL,NULL,NULL,NULL),
(319,4,24,'1',NULL,NULL,NULL,NULL),
(320,4,25,'1',NULL,NULL,NULL,NULL),
(321,5,1,'1',NULL,NULL,NULL,NULL),
(322,5,2,'1',NULL,NULL,NULL,NULL),
(323,5,3,'1',NULL,NULL,NULL,NULL),
(324,5,4,'1',NULL,NULL,NULL,NULL),
(325,5,5,'1',NULL,NULL,NULL,NULL),
(326,5,6,'1',NULL,NULL,NULL,NULL),
(327,5,7,'1',NULL,NULL,NULL,NULL),
(328,5,8,'1',NULL,NULL,NULL,NULL),
(329,5,9,'1',NULL,NULL,NULL,NULL),
(330,5,10,'1',NULL,NULL,NULL,NULL),
(331,5,11,'1',NULL,NULL,NULL,NULL),
(332,5,12,'1',NULL,NULL,NULL,NULL),
(333,5,13,'1',NULL,NULL,NULL,NULL),
(334,5,14,'1',NULL,NULL,NULL,NULL),
(335,5,15,'1',NULL,NULL,NULL,NULL),
(336,5,16,'1',NULL,NULL,NULL,NULL),
(337,5,17,'1',NULL,NULL,NULL,NULL),
(338,5,18,'1',NULL,NULL,NULL,NULL),
(339,5,19,'1',NULL,NULL,NULL,NULL),
(340,5,20,'1',NULL,NULL,NULL,NULL),
(341,5,21,'1',NULL,NULL,NULL,NULL),
(342,5,22,'1',NULL,NULL,NULL,NULL),
(343,5,23,'1',NULL,NULL,NULL,NULL),
(344,5,24,'1',NULL,NULL,NULL,NULL),
(345,5,25,'1',NULL,NULL,NULL,NULL),
(471,6,1,NULL,NULL,NULL,NULL,NULL),
(472,6,2,NULL,NULL,NULL,NULL,NULL),
(473,6,3,NULL,NULL,NULL,NULL,NULL),
(474,6,4,NULL,NULL,NULL,NULL,NULL),
(475,6,5,NULL,NULL,NULL,NULL,NULL),
(476,6,6,NULL,NULL,NULL,NULL,NULL),
(477,6,7,NULL,NULL,NULL,NULL,NULL),
(478,6,8,NULL,NULL,NULL,NULL,NULL),
(479,6,9,NULL,NULL,NULL,NULL,NULL),
(480,6,10,NULL,NULL,NULL,NULL,NULL),
(481,6,11,NULL,NULL,NULL,NULL,NULL),
(482,6,12,NULL,NULL,NULL,NULL,NULL),
(483,6,13,NULL,NULL,NULL,NULL,NULL),
(484,6,14,NULL,NULL,NULL,NULL,NULL),
(485,6,15,NULL,NULL,NULL,NULL,NULL),
(486,6,16,NULL,NULL,NULL,NULL,NULL),
(487,6,17,NULL,NULL,NULL,NULL,NULL),
(488,6,18,NULL,NULL,NULL,NULL,NULL),
(489,6,19,NULL,NULL,NULL,NULL,NULL),
(490,6,20,NULL,NULL,NULL,NULL,NULL),
(491,6,21,NULL,NULL,NULL,NULL,NULL),
(492,6,22,NULL,NULL,NULL,NULL,NULL),
(493,6,23,NULL,NULL,NULL,NULL,NULL),
(494,6,24,NULL,NULL,NULL,NULL,NULL),
(495,6,25,NULL,NULL,NULL,NULL,NULL),
(571,8,1,'2',NULL,NULL,NULL,NULL),
(572,8,2,'2',NULL,NULL,NULL,NULL),
(573,8,3,'2',NULL,NULL,NULL,NULL),
(574,8,4,'2',NULL,NULL,NULL,NULL),
(575,8,5,'2',NULL,NULL,NULL,NULL),
(576,8,6,'2',NULL,NULL,NULL,NULL),
(577,8,7,'2',NULL,NULL,NULL,NULL),
(578,8,8,'2',NULL,NULL,NULL,NULL),
(579,8,9,'2',NULL,NULL,NULL,NULL),
(580,8,10,'2',NULL,NULL,NULL,NULL),
(581,8,11,'2',NULL,NULL,NULL,NULL),
(582,8,12,'2',NULL,NULL,NULL,NULL),
(583,8,13,'2',NULL,NULL,NULL,NULL),
(584,8,14,'2',NULL,NULL,NULL,NULL),
(585,8,15,'2',NULL,NULL,NULL,NULL),
(586,8,16,'2',NULL,NULL,NULL,NULL),
(587,8,17,'2',NULL,NULL,NULL,NULL),
(588,8,18,'2',NULL,NULL,NULL,NULL),
(589,8,19,'2',NULL,NULL,NULL,NULL),
(590,8,20,'2',NULL,NULL,NULL,NULL),
(591,8,21,'2',NULL,NULL,NULL,NULL),
(592,8,22,'2',NULL,NULL,NULL,NULL),
(593,8,23,'2',NULL,NULL,NULL,NULL),
(594,8,24,'2',NULL,NULL,NULL,NULL),
(595,8,25,'2',NULL,NULL,NULL,NULL);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffNo` varchar(10) NOT NULL COMMENT '员工编号',
  `name` varchar(20) DEFAULT NULL COMMENT '员工姓名',
  `sex` varchar(5) DEFAULT NULL COMMENT '员工性别',
  `departmentId` int(4) DEFAULT NULL COMMENT '部门id',
  `account` varchar(10) DEFAULT NULL COMMENT '员工账号',
  `password` varchar(8) DEFAULT '88888888' COMMENT '员工密码',
  `postId` int(4) DEFAULT NULL COMMENT '岗位id',
  `physicalCondition` varchar(50) DEFAULT NULL COMMENT '身体状况',
  `height` varchar(10) DEFAULT NULL COMMENT '身高',
  `nativePlace` varchar(20) DEFAULT NULL COMMENT '籍贯',
  `nation` varchar(10) DEFAULT NULL COMMENT '民族',
  `maritalStatus` varchar(10) DEFAULT NULL COMMENT '婚姻状态',
  `educationBackground` varchar(10) DEFAULT NULL COMMENT '学历',
  `school` varchar(10) DEFAULT NULL COMMENT '毕业学校',
  `major` varchar(50) DEFAULT NULL COMMENT '专业',
  `professionalQualification` varchar(50) DEFAULT NULL COMMENT '专业资格',
  `property` varchar(50) DEFAULT NULL COMMENT '属性',
  `degree` varchar(50) DEFAULT NULL COMMENT '学位',
  `authorizedStrength` varchar(50) DEFAULT NULL COMMENT '编制',
  `idCardNo` varchar(50) DEFAULT '18' COMMENT '身份证',
  `residence` varchar(50) DEFAULT NULL COMMENT '户口地址',
  `presentAddress` varchar(50) DEFAULT NULL COMMENT '现住地址',
  `contactNumber` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机',
  `email` varchar(50) DEFAULT NULL COMMENT 'email',
  `depositBank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `bankAccount` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `emergencyContact` varchar(50) DEFAULT NULL COMMENT '紧急联系人',
  `emergencyPhone` varchar(50) DEFAULT NULL COMMENT '紧急联系人联系电话',
  `dateOnBoard` date DEFAULT NULL COMMENT '入职日期',
  `theTrialDue` date DEFAULT NULL COMMENT '试用到期',
  `birthdayDate` date DEFAULT NULL COMMENT '出生日期',
  `contractStart` date DEFAULT NULL COMMENT '合同开始',
  `agreementEnds` date DEFAULT NULL COMMENT '合同结束',
  `cardNumber` varchar(20) DEFAULT NULL COMMENT '卡自编号',
  `internalCardNo` varchar(20) DEFAULT NULL COMMENT '卡内部号',
  `referrer` varchar(20) DEFAULT NULL COMMENT '推荐人',
  `wholeOrderDiscountRight` varchar(20) DEFAULT NULL COMMENT '整单折扣权',
  `timeDiscountRight` varchar(20) DEFAULT NULL COMMENT '工时折扣权',
  `rightToDiscount` varchar(20) DEFAULT NULL COMMENT '商品折扣权',
  `rightOfRelief` varchar(20) DEFAULT NULL COMMENT '减免权',
  `jobResume` varchar(1000) DEFAULT NULL COMMENT '工作简历',
  `educationexperience` varchar(1000) DEFAULT NULL COMMENT '教育经历',
  `memberOfFamily` varchar(1000) DEFAULT NULL COMMENT '家庭成员',
  `disciplinaryRecords` varchar(1000) DEFAULT NULL COMMENT '奖惩记录',
  `employmentAdvice` varchar(1000) DEFAULT NULL COMMENT '聘用意见',
  `picture` varchar(1000) DEFAULT NULL COMMENT '员工相片',
  `roleId` int(4) DEFAULT NULL COMMENT '角色表id',
  `isDimission` int(2) DEFAULT '0' COMMENT '0为在职1为已离职',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`staffNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`staffNo`,`name`,`sex`,`departmentId`,`account`,`password`,`postId`,`physicalCondition`,`height`,`nativePlace`,`nation`,`maritalStatus`,`educationBackground`,`school`,`major`,`professionalQualification`,`property`,`degree`,`authorizedStrength`,`idCardNo`,`residence`,`presentAddress`,`contactNumber`,`phone`,`email`,`depositBank`,`bankAccount`,`emergencyContact`,`emergencyPhone`,`dateOnBoard`,`theTrialDue`,`birthdayDate`,`contractStart`,`agreementEnds`,`cardNumber`,`internalCardNo`,`referrer`,`wholeOrderDiscountRight`,`timeDiscountRight`,`rightToDiscount`,`rightOfRelief`,`jobResume`,`educationexperience`,`memberOfFamily`,`disciplinaryRecords`,`employmentAdvice`,`picture`,`roleId`,`isDimission`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('ASD002','克莱尔','女',9,'sdf','88888888',2,'良好',NULL,NULL,'汉族',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'18834535222','16623423663','1234237783@qq.com',NULL,NULL,NULL,'14124546574','2019-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL),
('ASD003','墨菲','男',12,'xcv','88888888',3,'良好',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'17775345332','18843242211','2312213453@qq.com',NULL,NULL,NULL,'14245657543',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL),
('SWE001','史蒂夫','男',3,'qwe','88888888',2,'良好','173','湖南','壮族','已婚','本科','湖南农业大学','计算机软件','中级工程师','记考勤记薪','一本','在编','430202199910011022','湖南省株洲市荷塘区','湖南省长沙市天元区','13142000286','13142000286','1525532629@qq.com','中国银行','74327342374238123','詹姆斯','15276222983','2019-02-02','2019-05-02','1999-10-01','2019-05-02','2020-05-02','2993827192','2131232131','凯文','1','1','1','1','1','1','1','1','1','1',1,0,NULL,NULL,NULL,NULL,NULL),
('SWE002','科比','男',4,'asd','88888888',3,'良好','188','湖南',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'12243545465','13156734327','3288321354@qq.com',NULL,NULL,NULL,'14248894324',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
('SWE003','蒂格','男',6,'zxc','88888888',4,'良好',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'15687846453','15323245675','2377894392@qq.com',NULL,NULL,NULL,'13456333423',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
('ZXC001','帕克','男',11,'ert','88888888',5,'良好',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'14565435322','13442355323','3231877432@qq.com',NULL,NULL,NULL,'14343253442',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `work` */

DROP TABLE IF EXISTS `work`;

CREATE TABLE `work` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '分工id',
  `instationWhite` int(4) DEFAULT NULL COMMENT '站内白天',
  `instationBlack` int(4) DEFAULT NULL COMMENT '站内晚上',
  `outsideWhite` int(4) DEFAULT NULL COMMENT '站外白天',
  `outsideBlack` int(4) DEFAULT NULL COMMENT '站外晚上',
  `workTime` datetime DEFAULT NULL COMMENT '工作时间',
  `artisanClassId` int(4) DEFAULT NULL COMMENT '技工班组id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
