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
  `artisanNo` VARCHAR(10) NOT NULL COMMENT '技工编号',
  `artisanName` VARCHAR(20) DEFAULT NULL COMMENT '技工名称',
  `sex` VARCHAR(5) DEFAULT NULL COMMENT '技工性别',
  `artisanClassId` INT(4) DEFAULT NULL COMMENT '所在班组Id',
  `phone` VARCHAR(20) DEFAULT NULL COMMENT '手机号',
  `account` VARCHAR(20) DEFAULT NULL COMMENT '技工账号',
  `address` VARCHAR(20) DEFAULT NULL COMMENT '地址',
  `birthday` DATE DEFAULT NULL COMMENT '出生日期',
  `weChat` VARCHAR(20) DEFAULT NULL COMMENT '微信号',
  `idCardNo` VARCHAR(18) DEFAULT NULL COMMENT '身份证',
  `residence` VARCHAR(20) DEFAULT NULL COMMENT '户口地址',
  `bank` VARCHAR(20) DEFAULT NULL COMMENT '开户银行',
  `bankAccount` VARCHAR(20) DEFAULT NULL COMMENT '银行账号',
  `artisanLevelId` INT(4) DEFAULT NULL COMMENT '技工星级Id',
  `groupLeader` INT(1) DEFAULT NULL COMMENT '是否组长0否1是',
  `maintainType` VARCHAR(100) DEFAULT NULL COMMENT '维修工种',
  `maintainBrand` VARCHAR(100) DEFAULT NULL COMMENT '维修品牌',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`artisanNo`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `artisan` */

/*Table structure for table `artisanclass` */

DROP TABLE IF EXISTS `artisanclass`;

CREATE TABLE `artisanclass` (
  `id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '班组编号从1000开始自增',
  `artisanClassName` VARCHAR(10) DEFAULT NULL COMMENT '班组名称',
  `artisanClassWeight` INT(4) DEFAULT NULL COMMENT '提成权重',
  `parentId` INT(10) DEFAULT NULL COMMENT '父级id',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `artisanclass` */

/*Table structure for table `artisanlevel` */

DROP TABLE IF EXISTS `artisanlevel`;

CREATE TABLE `artisanlevel` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '等级编号',
  `artisanLevelName` VARCHAR(20) DEFAULT NULL COMMENT '等级名称',
  `artisanLevelWeight` INT(4) DEFAULT NULL COMMENT '提成权重',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `artisanlevel` */

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `id` VARCHAR(20) NOT NULL COMMENT '车型编号',
  `carTypeName` VARCHAR(20) DEFAULT NULL COMMENT '车型名称',
  `engineId` INT(4) DEFAULT NULL COMMENT '发动机品牌外键',
  `price` FLOAT DEFAULT NULL COMMENT '参考价格',
  `carYearPrice` FLOAT DEFAULT NULL COMMENT '车辆年款',
  `power` VARCHAR(20) DEFAULT NULL COMMENT '功率',
  `importOrdomestic` VARCHAR(20) DEFAULT NULL COMMENT '进口或者国产',
  `fuelLabel` VARCHAR(20) DEFAULT NULL COMMENT '燃油编号',
  `load` VARCHAR(20) DEFAULT NULL COMMENT '载重',
  `carBrandId` INT(4) DEFAULT NULL COMMENT '与车品牌表相关联',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

INSERT  INTO `car`(`id`,`carTypeName`,`engineId`,`price`,`carYearPrice`,`power`,`importOrdomestic`,`fuelLabel`,`load`,`carBrandId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
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

/*Table structure for table `car_client` */

DROP TABLE IF EXISTS `car_client`;

CREATE TABLE `car_client` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `carid` VARCHAR(20) DEFAULT NULL COMMENT '车辆编号',
  `clientid` VARCHAR(20) DEFAULT NULL COMMENT '1客户编号',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `car_client` */

INSERT  INTO `car_client`(`id`,`carid`,`clientid`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(1,'1','00000CU123',NULL,NULL,NULL,NULL,NULL),
(2,'2','00000CU123',NULL,NULL,NULL,NULL,NULL),
(3,'3','00000CU234',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '汽车品牌编号',
  `carBrandName` VARCHAR(20) DEFAULT NULL COMMENT '汽车品牌名称',
  `firstletter` VARCHAR(10) DEFAULT NULL COMMENT '汽车首字母',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `carbrand` */

INSERT  INTO `carbrand`(`id`,`carBrandName`,`firstletter`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(1,'中国重汽','A',NULL,NULL,NULL,NULL,NULL),
(2,'丰田','F',NULL,NULL,NULL,NULL,NULL),
(3,'陕汽重卡','B',NULL,NULL,NULL,NULL,NULL),
(4,'中国一汽','K',NULL,NULL,NULL,NULL,NULL),
(5,'上汽红岩','H',NULL,NULL,NULL,NULL,NULL),
(6,'其他重型车','Z',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carinfo` */

DROP TABLE IF EXISTS `carinfo`;

CREATE TABLE `carinfo` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `carNumber` VARCHAR(20) DEFAULT NULL COMMENT '车牌号码',
  `carBrandId` INT(11) DEFAULT NULL COMMENT '与车辆品牌关联',
  `carId` INT(11) DEFAULT NULL COMMENT '与车型表关联',
  `carer` VARCHAR(20) DEFAULT NULL COMMENT '驾驶员',
  `carerPhone` VARCHAR(50) DEFAULT NULL COMMENT '驾驶员电话',
  `bornDate` DATE DEFAULT NULL COMMENT '出生日期',
  `affiliation` VARCHAR(20) DEFAULT NULL COMMENT '车辆归属',
  `drivingLicence` DATE DEFAULT NULL COMMENT '驾驶证到期时间',
  `carNumber1` VARCHAR(20) DEFAULT NULL COMMENT '车架号',
  `engineNumber` VARCHAR(20) DEFAULT NULL COMMENT '发动机号',
  `yearPrice` FLOAT DEFAULT NULL COMMENT '车辆年款，w为单位',
  `mileage` FLOAT DEFAULT NULL COMMENT '车辆里程',
  `engineId` INT(11) DEFAULT NULL COMMENT '与发动机表关联',
  `load` VARCHAR(20) DEFAULT NULL COMMENT '载重',
  `buyDate` DATETIME DEFAULT NULL COMMENT '购买日期',
  `dutyDate` DATETIME DEFAULT NULL COMMENT '上牌日期',
  `carCheckDate` DATETIME DEFAULT NULL COMMENT '车检日期',
  `fuelOilType` VARCHAR(20) DEFAULT NULL COMMENT '燃油类别',
  `carSeries` VARCHAR(20) DEFAULT NULL COMMENT '车系',
  `Jqinsurance` VARCHAR(20) DEFAULT NULL COMMENT '交强保险公司',
  `Jqinsurancedate` DATE DEFAULT NULL COMMENT '交强保险到期时间',
  `Syinsurance` VARCHAR(30) DEFAULT NULL COMMENT '商业保险公司',
  `Syinsurancedate` DATE DEFAULT NULL COMMENT '商业保险到期时间',
  `maintain` FLOAT DEFAULT NULL COMMENT '下次保养里程',
  `maintaindate` DATE DEFAULT NULL COMMENT '下次保养日期',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `carinfo` */

INSERT  INTO `carinfo`(`id`,`carNumber`,`carBrandId`,`carId`,`carer`,`carerPhone`,`bornDate`,`affiliation`,`drivingLicence`,`carNumber1`,`engineNumber`,`yearPrice`,`mileage`,`engineId`,`load`,`buyDate`,`dutyDate`,`carCheckDate`,`fuelOilType`,`carSeries`,`Jqinsurance`,`Jqinsurancedate`,`Syinsurance`,`Syinsurancedate`,`maintain`,`maintaindate`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(1,'湘A12356',1,3,'伟星','16634555987','1996-12-22','公司车','2020-02-20','LE42131831L436672','345347K',2001,10000,NULL,NULL,'2002-03-05 00:00:00','2003-04-01 00:00:00','2003-12-21 00:00:00','汽油',NULL,'太平洋保险','2004-01-01','人寿保险','2004-01-01',20000,'2004-05-05',NULL,NULL,NULL,NULL,NULL),
(2,'湘B54352',2,5,'张伟','18884343221','1995-10-21','公司车','2022-03-21','LL4123123J1245332','432234K',2018,5000,NULL,NULL,'2018-12-12 00:00:00','2018-12-21 00:00:00','2019-01-21 00:00:00','汽油',NULL,'人寿保险','2018-12-25','太平洋保险','2018-12-30',18000,'2020-09-21',NULL,NULL,NULL,NULL,NULL),
(3,'湘C53453',3,8,'菲力','17759342092','1994-11-21','公司车','2023-04-22','LL1432423F1435323','423422K',2015,12000,NULL,NULL,'2015-05-23 00:00:00','2015-12-23 00:00:00','2016-01-01 00:00:00','汽油',NULL,'平安人寿保险','2015-06-23','阳光人寿保险','2015-12-29',250000,'2017-12-21',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `cashier` */

DROP TABLE IF EXISTS `cashier`;

CREATE TABLE `cashier` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '收银id',
  `totalNum` FLOAT DEFAULT NULL COMMENT '总金额',
  `cashierstatic` VARCHAR(10) DEFAULT NULL COMMENT '结算状态',
  `paymentType` VARCHAR(10) DEFAULT NULL COMMENT '支付方式',
  `invoiceNo` VARCHAR(10) DEFAULT NULL COMMENT '发票表id',
  `cashiertime` DATETIME DEFAULT NULL COMMENT '结算时间',
  `staffId` VARCHAR(10) DEFAULT NULL COMMENT '员工表id检查该员工的角色是否有权限使用内部券',
  `onCredit` FLOAT DEFAULT NULL COMMENT '挂账金额',
  `interior` FLOAT DEFAULT NULL COMMENT '内部免单金额',
  `clientId` VARCHAR(20) DEFAULT NULL COMMENT '客户编号',
  `change` FLOAT DEFAULT NULL COMMENT '找零',
  `Number` VARCHAR(10) DEFAULT NULL COMMENT '销售单号',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `cashier` */

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `number` VARCHAR(20) NOT NULL COMMENT '客户编码',
  `name` VARCHAR(20) DEFAULT NULL COMMENT '客户名称',
  `linkman` VARCHAR(20) DEFAULT NULL COMMENT '联系人',
  `phone` VARCHAR(20) DEFAULT NULL COMMENT '手机',
  `address` VARCHAR(20) DEFAULT NULL COMMENT '地址',
  `borndate` DATE DEFAULT NULL COMMENT '生日',
  `paymentDays` INT(11) DEFAULT NULL COMMENT '账期，天为单位',
  `paymentSize` INT(11) DEFAULT NULL COMMENT '挂账额度，w为单位',
  `staffNo` VARCHAR(10) DEFAULT NULL COMMENT '与员工表关联',
  `counselorName` VARCHAR(20) DEFAULT NULL COMMENT '顾问电话',
  `sheng` VARCHAR(10) DEFAULT NULL COMMENT '省',
  `shi` VARCHAR(10) DEFAULT NULL COMMENT '市',
  `qv` VARCHAR(10) DEFAULT NULL COMMENT '区',
  `remark` VARCHAR(50) DEFAULT NULL COMMENT '备注',
  `taxpayerNumber` VARCHAR(20) DEFAULT NULL COMMENT '纳税人识别号',
  `registerPhone` VARCHAR(20) DEFAULT NULL COMMENT '注册电话',
  `bank` VARCHAR(20) DEFAULT NULL COMMENT '开户银行',
  `bankNumber` VARCHAR(20) DEFAULT NULL COMMENT '银行账号',
  `registerAddress` VARCHAR(20) DEFAULT NULL COMMENT '注册地址',
  `other` VARCHAR(20) DEFAULT NULL COMMENT '其他',
  `typeId` INT(4) DEFAULT NULL COMMENT '与客户类别表关联',
  `carNo` VARCHAR(10) DEFAULT NULL COMMENT '与车辆表关联',
  `date` DATE DEFAULT NULL COMMENT '注册日期',
  `Integral` INT(10) DEFAULT NULL COMMENT '积分',
  `onCredit` FLOAT DEFAULT NULL COMMENT '挂账金额',
  `deposit` FLOAT DEFAULT NULL COMMENT '定金金额',
  `petCard` FLOAT DEFAULT NULL COMMENT '储值卡余额',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

INSERT  INTO `client`(`number`,`name`,`linkman`,`phone`,`address`,`borndate`,`paymentDays`,`paymentSize`,`staffNo`,`counselorName`,`sheng`,`shi`,`qv`,`remark`,`taxpayerNumber`,`registerPhone`,`bank`,`bankNumber`,`registerAddress`,`other`,`typeId`,`carNo`,`date`,`Integral`,`onCredit`,`deposit`,`petCard`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
('00000CU123','欧欧','周小容','13122332987','湖南省株洲市荷塘区','1998-02-02',10,10000,'ASD002','17489222873','湖南省','株洲市','荷塘区','无','243432213','18893888273','工商银行','876789574832789','湖南省株洲市荷塘区红旗广场支行',NULL,2,NULL,'2020-01-05',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU234','湾湾','刘小平','14232322145','湖南省长沙市天心区','1999-03-05',10,5000,'ASD003','18598237648','湖南省','株洲市','荷塘区','无','534325321','18643436373','兴业银行','898574839432285','湖南省株洲市新华东路支行',NULL,3,NULL,'2020-01-03',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `clienttype` */

DROP TABLE IF EXISTS `clienttype`;

CREATE TABLE `clienttype` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '客户类别编号',
  `clientType` VARCHAR(20) DEFAULT NULL COMMENT '客户类别',
  `validity` INT(11) DEFAULT NULL COMMENT '有效期，年为单位',
  `cost` FLOAT DEFAULT NULL COMMENT '会费',
  `address` VARCHAR(50) DEFAULT NULL COMMENT '地址',
  `type` VARCHAR(20) DEFAULT NULL COMMENT '类别',
  `discount` FLOAT DEFAULT NULL COMMENT '折扣',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `clienttype` */

INSERT  INTO `clienttype`(`id`,`clientType`,`validity`,`cost`,`address`,`type`,`discount`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(1,'标准客户',5,500,NULL,'标准价',0.95,NULL,NULL,NULL,NULL,NULL),
(2,'会员客户',5,888,NULL,'会员价',0.88,NULL,NULL,NULL,NULL,NULL),
(3,'协议客户',5,1000,NULL,'协议价',0.8,NULL,NULL,NULL,NULL,NULL),
(4,'索赔客户',5,1288,NULL,'索赔价',0.78,NULL,NULL,NULL,NULL,NULL),
(5,'保险客户',5,1588,NULL,'保险价',0.72,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `coinspray` */

DROP TABLE IF EXISTS `coinspray`;

CREATE TABLE `coinspray` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '钣喷编号',
  `coinSprayName` VARCHAR(20) DEFAULT NULL COMMENT '钣喷名称',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `coinspray` */

/*Table structure for table `commodity` */

DROP TABLE IF EXISTS `commodity`;

CREATE TABLE `commodity` (
  `commodityNo` VARCHAR(10) NOT NULL COMMENT '商品编号',
  `name` VARCHAR(20) DEFAULT NULL COMMENT '商品名称',
  `brand` VARCHAR(20) DEFAULT NULL COMMENT '商品品牌',
  `carType` VARCHAR(20) DEFAULT NULL COMMENT '适用车型',
  `unit` VARCHAR(10) DEFAULT NULL COMMENT '单位',
  `CommdityTypeId` INT(4) DEFAULT NULL COMMENT '与商品类别表关联',
  `income` VARCHAR(20) DEFAULT NULL COMMENT '收入分类',
  `original` VARCHAR(20) DEFAULT NULL COMMENT '原厂副厂',
  `commodityGrade` VARCHAR(20) DEFAULT NULL COMMENT '商品等级',
  `commodityPlace` VARCHAR(20) DEFAULT NULL COMMENT '商品产地',
  `manufacturerNumber` VARCHAR(10) DEFAULT NULL COMMENT '与厂商表关联',
  `firmNumber` VARCHAR(20) DEFAULT NULL COMMENT '原厂编码',
  `barCode` VARCHAR(20) DEFAULT NULL COMMENT '条形码',
  `size` VARCHAR(20) DEFAULT NULL COMMENT '规格',
  `volume` VARCHAR(20) DEFAULT NULL COMMENT '体积',
  `weight` VARCHAR(20) DEFAULT NULL COMMENT '毛重',
  `suttle` VARCHAR(20) DEFAULT NULL COMMENT '净重',
  `primeCost` FLOAT DEFAULT NULL COMMENT '进货价格',
  `sellway` VARCHAR(20) DEFAULT NULL COMMENT '售价方式',
  `markupPercentage` FLOAT DEFAULT NULL COMMENT '加价率',
  `code` VARCHAR(20) DEFAULT NULL COMMENT '互换码',
  `NormalPrice` FLOAT DEFAULT NULL COMMENT '标准价',
  `vipPrice` FLOAT DEFAULT NULL COMMENT 'vip价',
  `memberPrice` FLOAT DEFAULT NULL COMMENT '会员价',
  `negotiatedPrice` FLOAT DEFAULT NULL COMMENT '协议价',
  `claimPrice` FLOAT DEFAULT NULL COMMENT '索赔价',
  `insurancePrice` FLOAT DEFAULT NULL COMMENT '保险价',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`commodityNo`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `commodity` */

/*Table structure for table `commoditytype` */

DROP TABLE IF EXISTS `commoditytype`;

CREATE TABLE `commoditytype` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '商品分类编号',
  `typeName` VARCHAR(20) DEFAULT NULL COMMENT '商品分类名称',
  `parentId` INT(4) DEFAULT NULL COMMENT '商品父级id',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `commoditytype` */

/*Table structure for table `completed` */

DROP TABLE IF EXISTS `completed`;

CREATE TABLE `completed` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `yesOrno` INT(11) DEFAULT NULL COMMENT '合格否 1=合格，0=不合格',
  `predicttime` DATETIME DEFAULT NULL COMMENT '预计完工时间',
  `nowtime` DATETIME DEFAULT NULL COMMENT '实际完工时间',
  `reason` VARCHAR(30) DEFAULT NULL COMMENT '误工原因',
  `workid` VARCHAR(10) DEFAULT NULL COMMENT '质检员，与员工表关联',
  `dutyid` VARCHAR(10) DEFAULT NULL COMMENT '责任人，与员工表关联',
  `price` FLOAT DEFAULT NULL COMMENT '处罚金额',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `completed` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `departmentName` VARCHAR(20) DEFAULT NULL COMMENT '部门名称',
  `departmentTypeName` VARCHAR(20) DEFAULT NULL COMMENT '部门类型名称',
  `parentId` INT(4) DEFAULT NULL COMMENT '父级id',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

INSERT  INTO `department`(`id`,`departmentName`,`departmentTypeName`,`parentId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
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
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `staffId` VARCHAR(10) DEFAULT NULL COMMENT '员工id',
  `dimissionDate` DATE DEFAULT NULL COMMENT '离职日期',
  `dimissionCause` VARCHAR(100) DEFAULT NULL COMMENT '离职原因',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `dimission` */

INSERT  INTO `dimission`(`id`,`staffId`,`dimissionDate`,`dimissionCause`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(18,'ASD002','2020-02-03','我不想干了',NULL,NULL,NULL,NULL,NULL),
(19,'SWE001','2020-02-03','我也不想干了',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `enginebrand` */

DROP TABLE IF EXISTS `enginebrand`;

CREATE TABLE `enginebrand` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '发动机品牌编号',
  `engineBrandName` VARCHAR(20) DEFAULT NULL COMMENT '发动机品牌名称',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `enginebrand` */

INSERT  INTO `enginebrand`(`id`,`engineBrandName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(1,'帕金斯发动机',NULL,NULL,NULL,NULL,NULL),
(2,'康明斯发动机',NULL,NULL,NULL,NULL,NULL),
(3,'卡特发动机',NULL,NULL,NULL,NULL,NULL),
(4,'上柴发动机',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `ewitem` */

DROP TABLE IF EXISTS `ewitem`;

CREATE TABLE `ewitem` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) DEFAULT NULL COMMENT '项目名称',
  `priceType` VARCHAR(30) DEFAULT NULL COMMENT '价类',
  `price` FLOAT DEFAULT NULL COMMENT '价格',
  `remark` VARCHAR(30) DEFAULT NULL COMMENT '备注',
  `rescueid` VARCHAR(30) DEFAULT NULL COMMENT '与救援关联',
  `repairid` VARCHAR(20) DEFAULT NULL COMMENT '与维修表关联',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `ewitem` */

/*Table structure for table `getgood` */

DROP TABLE IF EXISTS `getgood`;

CREATE TABLE `getgood` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `goodid` INT(11) DEFAULT NULL COMMENT '与物料表关联',
  `count` INT(11) DEFAULT NULL COMMENT '需求数量',
  `item` VARCHAR(20) DEFAULT NULL COMMENT '对应项目',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `getgood` */

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `invoiceNo` VARCHAR(10) NOT NULL COMMENT '发票表单号',
  `money` FLOAT DEFAULT NULL COMMENT '发票金额',
  `invoiceType` VARCHAR(10) DEFAULT NULL COMMENT '发票类型',
  `invoiceDate` DATETIME DEFAULT NULL COMMENT '开票时间',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`invoiceNo`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `invoice` */

/*Table structure for table `item_repair` */

DROP TABLE IF EXISTS `item_repair`;

CREATE TABLE `item_repair` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `isRepair` INT(11) DEFAULT NULL COMMENT '是救援还是维修，救援=0',
  `wjid` INT(11) DEFAULT NULL COMMENT '救援或者维修表id',
  `itemid` INT(11) DEFAULT NULL COMMENT '项目id',
  `teamid` INT(11) DEFAULT NULL COMMENT '班组id',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `item_repair` */

/*Table structure for table `jurisdiction` */

DROP TABLE IF EXISTS `jurisdiction`;

CREATE TABLE `jurisdiction` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `jurisdictionName` VARCHAR(20) DEFAULT NULL COMMENT '权限名称',
  `ename` VARCHAR(20) DEFAULT NULL COMMENT '英文名称',
  `catalog` INT(11) DEFAULT NULL COMMENT '0是目录1是功能',
  `parentId` INT(11) DEFAULT NULL COMMENT '权限父id',
  `path` VARCHAR(20) DEFAULT NULL COMMENT '权限路径',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `jurisdiction` */

/*Table structure for table `legworkcat` */

DROP TABLE IF EXISTS `legworkcat`;

CREATE TABLE `legworkcat` (
  `id` INT(4) NOT NULL AUTO_INCREMENT,
  `licensePlateNumber` VARCHAR(20) NOT NULL COMMENT '车牌号',
  `brand` VARCHAR(20) DEFAULT NULL COMMENT '品牌',
  `model` VARCHAR(20) DEFAULT NULL COMMENT '车型',
  `mileage` VARCHAR(20) DEFAULT NULL COMMENT '当前里程',
  `artisanClassId` INT(4) DEFAULT NULL COMMENT '所在班组',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `legworkcat` */

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '联系人id',
  `name` VARCHAR(20) DEFAULT NULL COMMENT '联系人名称',
  `position` VARCHAR(20) DEFAULT NULL COMMENT '职位',
  `phone` VARCHAR(20) DEFAULT NULL COMMENT '手机',
  `telephone` VARCHAR(20) DEFAULT NULL COMMENT '电话',
  `email` VARCHAR(20) DEFAULT NULL COMMENT 'email',
  `manufacturerNumber` VARCHAR(10) DEFAULT NULL COMMENT '与厂商表关联',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `linkman` */

/*Table structure for table `maintain` */

DROP TABLE IF EXISTS `maintain`;

CREATE TABLE `maintain` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '保养编号',
  `maintaiNname` VARCHAR(20) DEFAULT NULL COMMENT '保养名称',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `maintain` */

/*Table structure for table `maintainregist` */

DROP TABLE IF EXISTS `maintainregist`;

CREATE TABLE `maintainregist` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `maintainName` VARCHAR(20) DEFAULT NULL COMMENT '保养名称',
  `mileage` FLOAT DEFAULT NULL COMMENT '计划里程',
  `mileageDate` DATE DEFAULT NULL COMMENT '计划日期',
  `remark` VARCHAR(50) DEFAULT NULL COMMENT '备注',
  `sjmileage` FLOAT DEFAULT NULL COMMENT '实际里程',
  `Sjmileagedate` DATE DEFAULT NULL COMMENT '实际日期',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `maintainregist` */

/*Table structure for table `maintenanceitems` */

DROP TABLE IF EXISTS `maintenanceitems`;

CREATE TABLE `maintenanceitems` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '项目编号',
  `itemsName` VARCHAR(20) DEFAULT NULL COMMENT '项目名称',
  `typeId` INT(4) DEFAULT NULL COMMENT '与几种类别表关联',
  `remark` VARCHAR(50) DEFAULT NULL COMMENT '备注',
  `normalPrice` FLOAT DEFAULT NULL COMMENT '标准价',
  `memberPrice` FLOAT DEFAULT NULL COMMENT '会员价',
  `vipPrice` FLOAT DEFAULT NULL COMMENT 'Vip价',
  `negotiatedPrice` FLOAT DEFAULT NULL COMMENT '协议价',
  `claimPrice` FLOAT DEFAULT NULL COMMENT '索赔价',
  `insurancePrice` FLOAT DEFAULT NULL COMMENT '保险价',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `maintenanceitems` */

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `number` VARCHAR(10) NOT NULL COMMENT '厂商编号',
  `name` VARCHAR(20) DEFAULT NULL COMMENT '厂商名称',
  `address` VARCHAR(20) DEFAULT NULL COMMENT '地址',
  `manage` VARCHAR(20) DEFAULT NULL COMMENT '经营状态',
  `url` VARCHAR(20) DEFAULT NULL COMMENT '网址',
  `bank` VARCHAR(20) DEFAULT NULL COMMENT '开户行',
  `bankNumber` VARCHAR(20) DEFAULT NULL COMMENT '银行账号',
  `payment` VARCHAR(20) DEFAULT NULL COMMENT '付款方式',
  `laver` VARCHAR(20) DEFAULT NULL COMMENT '厂商等级',
  `brank` VARCHAR(20) DEFAULT NULL COMMENT '经营品牌',
  `type` VARCHAR(20) DEFAULT NULL COMMENT '厂商类别',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturer` */

/*Table structure for table `materialrequire_good` */

DROP TABLE IF EXISTS `materialrequire_good`;

CREATE TABLE `materialrequire_good` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `requireid` INT(11) DEFAULT NULL COMMENT '与需求表关联',
  `goodid` INT(11) DEFAULT NULL COMMENT '与物料表关联',
  `count` INT(11) DEFAULT NULL COMMENT '数量',
  `item` VARCHAR(20) DEFAULT NULL COMMENT '对应项目',
  `warehouse` VARCHAR(20) DEFAULT NULL COMMENT '仓库',
  `Isget` INT(11) DEFAULT NULL COMMENT '是否领料1=是；0=否',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `materialrequire_good` */

/*Table structure for table `minorrepair` */

DROP TABLE IF EXISTS `minorrepair`;

CREATE TABLE `minorrepair` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '小修编号',
  `minorRepairName` VARCHAR(20) DEFAULT NULL COMMENT '小修名称',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它?侄?',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `minorrepair` */

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '岗位id',
  `postName` VARCHAR(20) DEFAULT NULL COMMENT '岗位名称',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `post` */

INSERT  INTO `post`(`id`,`postName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) VALUES 
(1,'展厅经理',NULL,NULL,NULL,NULL,NULL),
(2,'销售顾问',NULL,NULL,NULL,NULL,NULL),
(3,'销售员',NULL,NULL,NULL,NULL,NULL),
(4,'库管员',NULL,NULL,NULL,NULL,NULL),
(5,'移车员',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `repair` */

DROP TABLE IF EXISTS `repair`;

CREATE TABLE `repair` (
  `number` VARCHAR(20) NOT NULL COMMENT '维修编号',
  `carinfoId` INT(11) DEFAULT NULL COMMENT '与车辆信息表关联',
  `staffno` VARCHAR(10) DEFAULT NULL COMMENT '与员工关联',
  `oil` VARCHAR(30) DEFAULT NULL COMMENT '进厂油量',
  `type` VARCHAR(20) DEFAULT NULL COMMENT '业务类别',
  `worktime` VARCHAR(20) DEFAULT NULL COMMENT '施工班次',
  `getman` VARCHAR(20) DEFAULT NULL COMMENT '接车人',
  `overworkdate` DATETIME DEFAULT NULL COMMENT '预计完工时间',
  `nowworkDate` DATETIME DEFAULT NULL COMMENT '实际完工时间',
  `setter` VARCHAR(20) DEFAULT NULL COMMENT '结算方式',
  `company` VARCHAR(20) DEFAULT NULL COMMENT '赔款公司',
  `befor` DATETIME DEFAULT NULL COMMENT '上次进场时间',
  `price` FLOAT DEFAULT NULL COMMENT '预估金额',
  `remark` VARCHAR(40) DEFAULT NULL COMMENT '备注',
  `state` VARCHAR(20) DEFAULT NULL COMMENT '报修陈述',
  `fault` VARCHAR(30) DEFAULT NULL COMMENT '故障描述',
  `faultreasult` VARCHAR(30) DEFAULT NULL COMMENT '故障原因',
  `status` VARCHAR(20) DEFAULT NULL COMMENT '维修状态',
  `orderTime` DATETIME DEFAULT NULL COMMENT '开单时间',
  `stockDater` DATETIME DEFAULT NULL COMMENT '结算时间',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `repair` */

/*Table structure for table `rescue` */

DROP TABLE IF EXISTS `rescue`;

CREATE TABLE `rescue` (
  `number` VARCHAR(30) NOT NULL COMMENT '救援编号',
  `carinfoid` INT(11) DEFAULT NULL COMMENT '与车辆信息表关联',
  `staffno` VARCHAR(10) DEFAULT NULL COMMENT '与员工关联',
  `rescueTeamid` INT(11) DEFAULT NULL COMMENT '派工班组与班组表关联',
  `type` VARCHAR(20) DEFAULT NULL COMMENT '业务类别',
  `worktimes` VARCHAR(20) DEFAULT NULL COMMENT '施工班次',
  `getman` VARCHAR(20) DEFAULT NULL COMMENT '接车人',
  `workdate` DATETIME DEFAULT NULL COMMENT '派工时间',
  `nowdate` DATETIME DEFAULT NULL COMMENT '出发时间',
  `address` VARCHAR(20) DEFAULT NULL COMMENT '出发地址',
  `car` VARCHAR(30) DEFAULT NULL COMMENT '驾驶车辆',
  `liche` FLOAT DEFAULT NULL COMMENT '行驶里程',
  `worktime` DATETIME DEFAULT NULL COMMENT '施工时间',
  `overtime` DATETIME DEFAULT NULL COMMENT '结束时间',
  `rescueaddress` VARCHAR(40) DEFAULT NULL COMMENT '救援地址',
  `setter` VARCHAR(30) DEFAULT NULL COMMENT '结算方式',
  `company` VARCHAR(30) DEFAULT NULL COMMENT '赔款公司',
  `price` FLOAT DEFAULT NULL COMMENT '预估金额',
  `remark` VARCHAR(30) DEFAULT NULL COMMENT '备注',
  `state` VARCHAR(30) DEFAULT NULL COMMENT '报修陈述',
  `fault` VARCHAR(30) DEFAULT NULL COMMENT '故障描述',
  `faultreasult` VARCHAR(30) DEFAULT NULL COMMENT '故障原因',
  `status` VARCHAR(30) DEFAULT NULL COMMENT '维修状态',
  `orderTime` DATETIME DEFAULT NULL COMMENT '开单时间',
  `stockDater` DATETIME DEFAULT NULL COMMENT '结算时间',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `rescue` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `roleName` VARCHAR(20) DEFAULT NULL COMMENT '角色名称',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字??',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `role_jurisdiction` */

DROP TABLE IF EXISTS `role_jurisdiction`;

CREATE TABLE `role_jurisdiction` (
  `id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `roleid` INT(4) DEFAULT NULL COMMENT '角色id',
  `jurisdictionId` INT(4) DEFAULT NULL COMMENT '权限id',
  `otherone` VARCHAR(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` VARCHAR(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` VARCHAR(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` VARCHAR(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` VARCHAR(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `role_jurisdiction` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffNo` VARCHAR(10) NOT NULL COMMENT '员工编号',
  `name` VARCHAR(20) DEFAULT NULL COMMENT '员工姓名',
  `sex` VARCHAR(5) DEFAULT NULL COMMENT '员工性别',
  `departmentId` INT(4) DEFAULT NULL COMMENT '部门id',
  `account` VARCHAR(10) DEFAULT NULL COMMENT '员工账号',
  `password` VARCHAR(8) DEFAULT '88888888' COMMENT '员工密码',
  `postId` INT(4) DEFAULT NULL COMMENT '岗位id',
  `physicalCondition` VARCHAR(50) DEFAULT NULL COMMENT '身体状况',
  `height` VARCHAR(10) DEFAULT NULL COMMENT '身高',
  `nativePlace` VARCHAR(20) DEFAULT NULL COMMENT '籍贯',
  `nation` VARCHAR(10) DEFAULT NULL COMMENT '民族',
  `maritalStatus` VARCHAR(10) DEFAULT NULL COMMENT '婚姻状态',
  `educationBackground` VARCHAR(10) DEFAULT NULL COMMENT '学历',
  `school` VARCHAR(10) DEFAULT NULL COMMENT '毕业学校',
  `major` VARCHAR(50) DEFAULT NULL COMMENT '专业',
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
('ASD002','克莱尔','女',9,'sdf','88888888',2,'良好',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'18834535222','16623423663','1234237783@qq.com',NULL,NULL,NULL,'14124546574','2019-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL),
('ASD003','墨菲','男',12,'xcv','88888888',3,'良好',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'17775345332','18843242211','2312213453@qq.com',NULL,NULL,NULL,'14245657543',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
('SWE001','史蒂夫','男',3,'qwe','88888888',2,'良好','173','湖南','壮族','已婚','本科','湖南农业大学','计算机软件','中级工程师','记考勤记薪','一本','在编','430202199910011022','湖南省株洲市荷塘区','湖南省长沙市天元区','13142000286','13142000286','1525532629@qq.com','中国银行','74327342374238123','詹姆斯','15276222983','2019-02-02','2019-05-02','1999-10-01','2019-05-02','2020-05-02','2993827192','2131232131','凯文','1','1','1','1','1','1','1','1','1','1',1,1,NULL,NULL,NULL,NULL,NULL),
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
