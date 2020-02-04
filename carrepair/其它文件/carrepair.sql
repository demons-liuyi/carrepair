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
  `artisanNo` varchar(10) NOT NULL COMMENT '�������',
  `artisanName` varchar(20) DEFAULT NULL COMMENT '��������',
  `sex` varchar(5) DEFAULT NULL COMMENT '�����Ա�',
  `artisanClassId` int(4) DEFAULT NULL COMMENT '���ڰ���Id',
  `phone` varchar(20) DEFAULT NULL COMMENT '�ֻ���',
  `account` varchar(20) DEFAULT NULL COMMENT '�����˺�',
  `address` varchar(20) DEFAULT NULL COMMENT '��ַ',
  `birthday` date DEFAULT NULL COMMENT '��������',
  `weChat` varchar(20) DEFAULT NULL COMMENT '΢�ź�',
  `idCardNo` varchar(18) DEFAULT NULL COMMENT '���֤',
  `residence` varchar(20) DEFAULT NULL COMMENT '���ڵ�ַ',
  `bank` varchar(20) DEFAULT NULL COMMENT '��������',
  `bankAccount` varchar(20) DEFAULT NULL COMMENT '�����˺�',
  `artisanLevelId` int(4) DEFAULT NULL COMMENT '�����Ǽ�Id',
  `groupLeader` int(1) DEFAULT NULL COMMENT '�Ƿ��鳤0��1��',
  `maintainType` varchar(100) DEFAULT NULL COMMENT 'ά�޹���',
  `maintainBrand` varchar(100) DEFAULT NULL COMMENT 'ά��Ʒ��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`artisanNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisan` */

/*Table structure for table `artisanclass` */

DROP TABLE IF EXISTS `artisanclass`;

CREATE TABLE `artisanclass` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '�����Ŵ�1000��ʼ����',
  `artisanClassName` varchar(10) DEFAULT NULL COMMENT '��������',
  `artisanClassWeight` int(4) DEFAULT NULL COMMENT '���Ȩ��',
  `parentId` int(10) DEFAULT NULL COMMENT '����id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisanclass` */

/*Table structure for table `artisanlevel` */

DROP TABLE IF EXISTS `artisanlevel`;

CREATE TABLE `artisanlevel` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '�ȼ����',
  `artisanLevelName` varchar(20) DEFAULT NULL COMMENT '�ȼ�����',
  `artisanLevelWeight` int(4) DEFAULT NULL COMMENT '���Ȩ��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `artisanlevel` */

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `id` varchar(20) NOT NULL COMMENT '���ͱ��',
  `carTypeName` varchar(20) DEFAULT NULL COMMENT '��������',
  `engineId` int(4) DEFAULT NULL COMMENT '������Ʒ�����',
  `price` float DEFAULT NULL COMMENT '�ο��۸�',
  `carYearPrice` float DEFAULT NULL COMMENT '�������',
  `power` varchar(20) DEFAULT NULL COMMENT '����',
  `importOrdomestic` varchar(20) DEFAULT NULL COMMENT '���ڻ��߹���',
  `fuelLabel` varchar(20) DEFAULT NULL COMMENT 'ȼ�ͱ��',
  `load` varchar(20) DEFAULT NULL COMMENT '����',
  `carBrandId` int(4) DEFAULT NULL COMMENT '�복Ʒ�Ʊ������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`id`,`carTypeName`,`engineId`,`price`,`carYearPrice`,`power`,`importOrdomestic`,`fuelLabel`,`load`,`carBrandId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('1','�����ǵ¿�',4,480000,NULL,NULL,'����',NULL,'20��',1,NULL,NULL,NULL,NULL,NULL),
('10','һ�����J7',4,330000,NULL,NULL,'����',NULL,'18��',4,NULL,NULL,NULL,NULL,NULL),
('11','һ�����J6P',3,350000,NULL,NULL,'����',NULL,'20��',4,NULL,NULL,NULL,NULL,NULL),
('12','�������ҽ�ʨ��ж��',4,220000,NULL,NULL,'����',NULL,'12��',5,NULL,NULL,NULL,NULL,NULL),
('13','�������ҽ�ʨǣ����',4,240000,NULL,NULL,'����',NULL,'10��',5,NULL,NULL,NULL,NULL,NULL),
('14','���������½����ж��',3,200000,NULL,NULL,'����',NULL,'10��',5,NULL,NULL,NULL,NULL,NULL),
('15','�������ҽܿ���ж��',2,180000,NULL,NULL,'����',NULL,'10��',5,NULL,NULL,NULL,NULL,NULL),
('16','�������ҽܿ�ǣ����',1,170000,NULL,NULL,'����',NULL,'8��',5,NULL,NULL,NULL,NULL,NULL),
('17','�����ؿ�',4,330000,NULL,NULL,'����',NULL,'25��',6,NULL,NULL,NULL,NULL,NULL),
('18','���绪��',4,180000,NULL,NULL,'����',NULL,'3��',6,NULL,NULL,NULL,NULL,NULL),
('2','��������',3,420000,NULL,NULL,'����',NULL,'22��',1,NULL,NULL,NULL,NULL,NULL),
('3','��������',3,450000,NULL,NULL,'����',NULL,'21��',1,NULL,NULL,NULL,NULL,NULL),
('4','����˹̫��',1,470000,NULL,NULL,'����',NULL,'22��',1,NULL,NULL,NULL,NULL,NULL),
('5','��������',2,150000,NULL,NULL,'����',NULL,'3��',2,NULL,NULL,NULL,NULL,NULL),
('6','���ﺺ����',1,180000,NULL,NULL,'����',NULL,'3��',2,NULL,NULL,NULL,NULL,NULL),
('7','����X3000',3,320000,NULL,NULL,'����',NULL,'15��',3,NULL,NULL,NULL,NULL,NULL),
('8','����H6000',4,250000,NULL,NULL,'����',NULL,'14��',3,NULL,NULL,NULL,NULL,NULL),
('9','����',3,280000,NULL,NULL,'����',NULL,'15��',3,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `car_client` */

DROP TABLE IF EXISTS `car_client`;

CREATE TABLE `car_client` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `carid` varchar(20) DEFAULT NULL COMMENT '�������',
  `clientid` varchar(20) DEFAULT NULL COMMENT '1�ͻ����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `car_client` */

insert  into `car_client`(`id`,`carid`,`clientid`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'1','00000CU123',NULL,NULL,NULL,NULL,NULL),
(2,'2','00000CU123',NULL,NULL,NULL,NULL,NULL),
(3,'3','00000CU234',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '����Ʒ�Ʊ��',
  `carBrandName` varchar(20) DEFAULT NULL COMMENT '����Ʒ������',
  `firstletter` varchar(10) DEFAULT NULL COMMENT '��������ĸ',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `carbrand` */

insert  into `carbrand`(`id`,`carBrandName`,`firstletter`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'�й�����','A',NULL,NULL,NULL,NULL,NULL),
(2,'����','F',NULL,NULL,NULL,NULL,NULL),
(3,'�����ؿ�','B',NULL,NULL,NULL,NULL,NULL),
(4,'�й�һ��','K',NULL,NULL,NULL,NULL,NULL),
(5,'��������','H',NULL,NULL,NULL,NULL,NULL),
(6,'�������ͳ�','Z',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `carinfo` */

DROP TABLE IF EXISTS `carinfo`;

CREATE TABLE `carinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '���',
  `carNumber` varchar(20) DEFAULT NULL COMMENT '���ƺ���',
  `carBrandId` int(11) DEFAULT NULL COMMENT '�복��Ʒ�ƹ���',
  `carId` int(11) DEFAULT NULL COMMENT '�복�ͱ����',
  `carer` varchar(20) DEFAULT NULL COMMENT '��ʻԱ',
  `carerPhone` varchar(50) DEFAULT NULL COMMENT '��ʻԱ�绰',
  `bornDate` date DEFAULT NULL COMMENT '��������',
  `affiliation` varchar(20) DEFAULT NULL COMMENT '��������',
  `drivingLicence` date DEFAULT NULL COMMENT '��ʻ֤����ʱ��',
  `carNumber1` varchar(20) DEFAULT NULL COMMENT '���ܺ�',
  `engineNumber` varchar(20) DEFAULT NULL COMMENT '��������',
  `yearPrice` float DEFAULT NULL COMMENT '������wΪ��λ',
  `mileage` float DEFAULT NULL COMMENT '�������',
  `engineId` int(11) DEFAULT NULL COMMENT '�뷢���������',
  `load` varchar(20) DEFAULT NULL COMMENT '����',
  `buyDate` datetime DEFAULT NULL COMMENT '��������',
  `dutyDate` datetime DEFAULT NULL COMMENT '��������',
  `carCheckDate` datetime DEFAULT NULL COMMENT '��������',
  `fuelOilType` varchar(20) DEFAULT NULL COMMENT 'ȼ�����',
  `carSeries` varchar(20) DEFAULT NULL COMMENT '��ϵ',
  `Jqinsurance` varchar(20) DEFAULT NULL COMMENT '��ǿ���չ�˾',
  `Jqinsurancedate` date DEFAULT NULL COMMENT '��ǿ���յ���ʱ��',
  `Syinsurance` varchar(30) DEFAULT NULL COMMENT '��ҵ���չ�˾',
  `Syinsurancedate` date DEFAULT NULL COMMENT '��ҵ���յ���ʱ��',
  `maintain` float DEFAULT NULL COMMENT '�´α������',
  `maintaindate` date DEFAULT NULL COMMENT '�´α�������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `carinfo` */

insert  into `carinfo`(`id`,`carNumber`,`carBrandId`,`carId`,`carer`,`carerPhone`,`bornDate`,`affiliation`,`drivingLicence`,`carNumber1`,`engineNumber`,`yearPrice`,`mileage`,`engineId`,`load`,`buyDate`,`dutyDate`,`carCheckDate`,`fuelOilType`,`carSeries`,`Jqinsurance`,`Jqinsurancedate`,`Syinsurance`,`Syinsurancedate`,`maintain`,`maintaindate`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'��A12356',1,3,'ΰ��','16634555987','1996-12-22','��˾��','2020-02-20','LE42131831L436672','345347K',2001,10000,NULL,NULL,'2002-03-05 00:00:00','2003-04-01 00:00:00','2003-12-21 00:00:00','����',NULL,'̫ƽ����','2004-01-01','���ٱ���','2004-01-01',20000,'2004-05-05',NULL,NULL,NULL,NULL,NULL),
(2,'��B54352',2,5,'��ΰ','18884343221','1995-10-21','��˾��','2022-03-21','LL4123123J1245332','432234K',2018,5000,NULL,NULL,'2018-12-12 00:00:00','2018-12-21 00:00:00','2019-01-21 00:00:00','����',NULL,'���ٱ���','2018-12-25','̫ƽ����','2018-12-30',18000,'2020-09-21',NULL,NULL,NULL,NULL,NULL),
(3,'��C53453',3,8,'����','17759342092','1994-11-21','��˾��','2023-04-22','LL1432423F1435323','423422K',2015,12000,NULL,NULL,'2015-05-23 00:00:00','2015-12-23 00:00:00','2016-01-01 00:00:00','����',NULL,'ƽ�����ٱ���','2015-06-23','�������ٱ���','2015-12-29',250000,'2017-12-21',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `cashier` */

DROP TABLE IF EXISTS `cashier`;

CREATE TABLE `cashier` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `totalNum` float DEFAULT NULL COMMENT '�ܽ��',
  `cashierstatic` varchar(10) DEFAULT NULL COMMENT '����״̬',
  `paymentType` varchar(10) DEFAULT NULL COMMENT '֧����ʽ',
  `invoiceNo` varchar(10) DEFAULT NULL COMMENT '��Ʊ��id',
  `cashiertime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `staffId` varchar(10) DEFAULT NULL COMMENT 'Ա����id����Ա���Ľ�ɫ�Ƿ���Ȩ��ʹ���ڲ�ȯ',
  `onCredit` float DEFAULT NULL COMMENT '���˽��',
  `interior` float DEFAULT NULL COMMENT '�ڲ��ⵥ���',
  `clientId` varchar(20) DEFAULT NULL COMMENT '�ͻ����',
  `change` float DEFAULT NULL COMMENT '����',
  `Number` varchar(10) DEFAULT NULL COMMENT '���۵���',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `cashier` */

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `number` varchar(20) NOT NULL COMMENT '�ͻ�����',
  `name` varchar(20) DEFAULT NULL COMMENT '�ͻ�����',
  `linkman` varchar(20) DEFAULT NULL COMMENT '��ϵ��',
  `phone` varchar(20) DEFAULT NULL COMMENT '�ֻ�',
  `address` varchar(20) DEFAULT NULL COMMENT '��ַ',
  `borndate` date DEFAULT NULL COMMENT '����',
  `paymentDays` int(11) DEFAULT NULL COMMENT '���ڣ���Ϊ��λ',
  `paymentSize` int(11) DEFAULT NULL COMMENT '���˶�ȣ�wΪ��λ',
  `staffNo` varchar(10) DEFAULT NULL COMMENT '��Ա�������',
  `counselorName` varchar(20) DEFAULT NULL COMMENT '���ʵ绰',
  `sheng` varchar(10) DEFAULT NULL COMMENT 'ʡ',
  `shi` varchar(10) DEFAULT NULL COMMENT '��',
  `qv` varchar(10) DEFAULT NULL COMMENT '��',
  `remark` varchar(50) DEFAULT NULL COMMENT '��ע',
  `taxpayerNumber` varchar(20) DEFAULT NULL COMMENT '��˰��ʶ���',
  `registerPhone` varchar(20) DEFAULT NULL COMMENT 'ע��绰',
  `bank` varchar(20) DEFAULT NULL COMMENT '��������',
  `bankNumber` varchar(20) DEFAULT NULL COMMENT '�����˺�',
  `registerAddress` varchar(20) DEFAULT NULL COMMENT 'ע���ַ',
  `other` varchar(20) DEFAULT NULL COMMENT '����',
  `typeId` int(4) DEFAULT NULL COMMENT '��ͻ��������',
  `carNo` varchar(10) DEFAULT NULL COMMENT '�복�������',
  `date` date DEFAULT NULL COMMENT 'ע������',
  `Integral` int(10) DEFAULT NULL COMMENT '����',
  `onCredit` float DEFAULT NULL COMMENT '���˽��',
  `deposit` float DEFAULT NULL COMMENT '������',
  `petCard` float DEFAULT NULL COMMENT '��ֵ�����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

insert  into `client`(`number`,`name`,`linkman`,`phone`,`address`,`borndate`,`paymentDays`,`paymentSize`,`staffNo`,`counselorName`,`sheng`,`shi`,`qv`,`remark`,`taxpayerNumber`,`registerPhone`,`bank`,`bankNumber`,`registerAddress`,`other`,`typeId`,`carNo`,`date`,`Integral`,`onCredit`,`deposit`,`petCard`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('00000CU123','ŷŷ','��С��','13122332987','����ʡ�����к�����','1998-02-02',10,10000,'ASD002','17489222873','����ʡ','������','������','��','243432213','18893888273','��������','876789574832789','����ʡ�����к���������㳡֧��',NULL,2,NULL,'2020-01-05',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU234','����','��Сƽ','14232322145','����ʡ��ɳ��������','1999-03-05',10,5000,'ASD003','18598237648','����ʡ','������','������','��','534325321','18643436373','��ҵ����','898574839432285','����ʡ�������»���·֧��',NULL,3,NULL,'2020-01-03',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `clienttype` */

DROP TABLE IF EXISTS `clienttype`;

CREATE TABLE `clienttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '�ͻ������',
  `clientType` varchar(20) DEFAULT NULL COMMENT '�ͻ����',
  `validity` int(11) DEFAULT NULL COMMENT '��Ч�ڣ���Ϊ��λ',
  `cost` float DEFAULT NULL COMMENT '���',
  `address` varchar(50) DEFAULT NULL COMMENT '��ַ',
  `type` varchar(20) DEFAULT NULL COMMENT '���',
  `discount` float DEFAULT NULL COMMENT '�ۿ�',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `clienttype` */

insert  into `clienttype`(`id`,`clientType`,`validity`,`cost`,`address`,`type`,`discount`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'��׼�ͻ�',5,500,NULL,'��׼��',0.95,NULL,NULL,NULL,NULL,NULL),
(2,'��Ա�ͻ�',5,888,NULL,'��Ա��',0.88,NULL,NULL,NULL,NULL,NULL),
(3,'Э��ͻ�',5,1000,NULL,'Э���',0.8,NULL,NULL,NULL,NULL,NULL),
(4,'����ͻ�',5,1288,NULL,'�����',0.78,NULL,NULL,NULL,NULL,NULL),
(5,'���տͻ�',5,1588,NULL,'���ռ�',0.72,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `coinspray` */

DROP TABLE IF EXISTS `coinspray`;

CREATE TABLE `coinspray` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '������',
  `coinSprayName` varchar(20) DEFAULT NULL COMMENT '��������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coinspray` */

/*Table structure for table `commodity` */

DROP TABLE IF EXISTS `commodity`;

CREATE TABLE `commodity` (
  `commodityNo` varchar(10) NOT NULL COMMENT '��Ʒ���',
  `name` varchar(20) DEFAULT NULL COMMENT '��Ʒ����',
  `brand` varchar(20) DEFAULT NULL COMMENT '��ƷƷ��',
  `carType` varchar(20) DEFAULT NULL COMMENT '���ó���',
  `unit` varchar(10) DEFAULT NULL COMMENT '��λ',
  `CommdityTypeId` int(4) DEFAULT NULL COMMENT '����Ʒ�������',
  `income` varchar(20) DEFAULT NULL COMMENT '�������',
  `original` varchar(20) DEFAULT NULL COMMENT 'ԭ������',
  `commodityGrade` varchar(20) DEFAULT NULL COMMENT '��Ʒ�ȼ�',
  `commodityPlace` varchar(20) DEFAULT NULL COMMENT '��Ʒ����',
  `manufacturerNumber` varchar(10) DEFAULT NULL COMMENT '�볧�̱����',
  `firmNumber` varchar(20) DEFAULT NULL COMMENT 'ԭ������',
  `barCode` varchar(20) DEFAULT NULL COMMENT '������',
  `size` varchar(20) DEFAULT NULL COMMENT '���',
  `volume` varchar(20) DEFAULT NULL COMMENT '���',
  `weight` varchar(20) DEFAULT NULL COMMENT 'ë��',
  `suttle` varchar(20) DEFAULT NULL COMMENT '����',
  `primeCost` float DEFAULT NULL COMMENT '�����۸�',
  `sellway` varchar(20) DEFAULT NULL COMMENT '�ۼ۷�ʽ',
  `markupPercentage` float DEFAULT NULL COMMENT '�Ӽ���',
  `code` varchar(20) DEFAULT NULL COMMENT '������',
  `NormalPrice` float DEFAULT NULL COMMENT '��׼��',
  `vipPrice` float DEFAULT NULL COMMENT 'vip��',
  `memberPrice` float DEFAULT NULL COMMENT '��Ա��',
  `negotiatedPrice` float DEFAULT NULL COMMENT 'Э���',
  `claimPrice` float DEFAULT NULL COMMENT '�����',
  `insurancePrice` float DEFAULT NULL COMMENT '���ռ�',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`commodityNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `commodity` */

/*Table structure for table `commoditytype` */

DROP TABLE IF EXISTS `commoditytype`;

CREATE TABLE `commoditytype` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '��Ʒ������',
  `typeName` varchar(20) DEFAULT NULL COMMENT '��Ʒ��������',
  `parentId` int(4) DEFAULT NULL COMMENT '��Ʒ����id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `commoditytype` */

/*Table structure for table `completed` */

DROP TABLE IF EXISTS `completed`;

CREATE TABLE `completed` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yesOrno` int(11) DEFAULT NULL COMMENT '�ϸ�� 1=�ϸ�0=���ϸ�',
  `predicttime` datetime DEFAULT NULL COMMENT 'Ԥ���깤ʱ��',
  `nowtime` datetime DEFAULT NULL COMMENT 'ʵ���깤ʱ��',
  `reason` varchar(30) DEFAULT NULL COMMENT '��ԭ��',
  `workid` varchar(10) DEFAULT NULL COMMENT '�ʼ�Ա����Ա�������',
  `dutyid` varchar(10) DEFAULT NULL COMMENT '�����ˣ���Ա�������',
  `price` float DEFAULT NULL COMMENT '�������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `completed` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `departmentName` varchar(20) DEFAULT NULL COMMENT '��������',
  `departmentTypeName` varchar(20) DEFAULT NULL COMMENT '������������',
  `parentId` int(4) DEFAULT NULL COMMENT '����id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`id`,`departmentName`,`departmentTypeName`,`parentId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'���������Ŀ���ϵͳ','���������Ŀ���ϵͳ',0,NULL,NULL,NULL,NULL,NULL),
(2,'0000-�ɸ�','���������Ŀ���ϵͳ',1,NULL,NULL,NULL,NULL,NULL),
(3,'��Ǯ��','����',2,NULL,NULL,NULL,NULL,NULL),
(4,'�ͷ���','������',2,NULL,NULL,NULL,NULL,NULL),
(5,'�ۺ����','����',2,NULL,NULL,NULL,NULL,NULL),
(6,'������','����',2,NULL,NULL,NULL,NULL,NULL),
(7,'������','������',2,NULL,NULL,NULL,NULL,NULL),
(8,'�г���','����',2,NULL,NULL,NULL,NULL,NULL),
(9,'������','ά�ް���',7,NULL,NULL,NULL,NULL,NULL),
(10,'�ӽ���','ά�ް���',7,NULL,NULL,NULL,NULL,NULL),
(11,'������','ά�ް���',7,NULL,NULL,NULL,NULL,NULL),
(12,'������','ά�ް���',7,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `dimission` */

DROP TABLE IF EXISTS `dimission`;

CREATE TABLE `dimission` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `staffId` varchar(10) DEFAULT NULL COMMENT 'Ա��id',
  `dimissionDate` date DEFAULT NULL COMMENT '��ְ����',
  `dimissionCause` varchar(100) DEFAULT NULL COMMENT '��ְԭ��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `dimission` */

insert  into `dimission`(`id`,`staffId`,`dimissionDate`,`dimissionCause`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(18,'ASD002','2020-02-03','�Ҳ������',NULL,NULL,NULL,NULL,NULL),
(19,'SWE001','2020-02-03','��Ҳ�������',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `enginebrand` */

DROP TABLE IF EXISTS `enginebrand`;

CREATE TABLE `enginebrand` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '������Ʒ�Ʊ��',
  `engineBrandName` varchar(20) DEFAULT NULL COMMENT '������Ʒ������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `enginebrand` */

insert  into `enginebrand`(`id`,`engineBrandName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'����˹������',NULL,NULL,NULL,NULL,NULL),
(2,'����˹������',NULL,NULL,NULL,NULL,NULL),
(3,'���ط�����',NULL,NULL,NULL,NULL,NULL),
(4,'�ϲ񷢶���',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `ewitem` */

DROP TABLE IF EXISTS `ewitem`;

CREATE TABLE `ewitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '��Ŀ����',
  `priceType` varchar(30) DEFAULT NULL COMMENT '����',
  `price` float DEFAULT NULL COMMENT '�۸�',
  `remark` varchar(30) DEFAULT NULL COMMENT '��ע',
  `rescueid` varchar(30) DEFAULT NULL COMMENT '���Ԯ����',
  `repairid` varchar(20) DEFAULT NULL COMMENT '��ά�ޱ����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ewitem` */

/*Table structure for table `getgood` */

DROP TABLE IF EXISTS `getgood`;

CREATE TABLE `getgood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodid` int(11) DEFAULT NULL COMMENT '�����ϱ����',
  `count` int(11) DEFAULT NULL COMMENT '��������',
  `item` varchar(20) DEFAULT NULL COMMENT '��Ӧ��Ŀ',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `getgood` */

/*Table structure for table `invoice` */

DROP TABLE IF EXISTS `invoice`;

CREATE TABLE `invoice` (
  `invoiceNo` varchar(10) NOT NULL COMMENT '��Ʊ����',
  `money` float DEFAULT NULL COMMENT '��Ʊ���',
  `invoiceType` varchar(10) DEFAULT NULL COMMENT '��Ʊ����',
  `invoiceDate` datetime DEFAULT NULL COMMENT '��Ʊʱ��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`invoiceNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `invoice` */

/*Table structure for table `item_repair` */

DROP TABLE IF EXISTS `item_repair`;

CREATE TABLE `item_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isRepair` int(11) DEFAULT NULL COMMENT '�Ǿ�Ԯ����ά�ޣ���Ԯ=0',
  `wjid` int(11) DEFAULT NULL COMMENT '��Ԯ����ά�ޱ�id',
  `itemid` int(11) DEFAULT NULL COMMENT '��Ŀid',
  `teamid` int(11) DEFAULT NULL COMMENT '����id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `item_repair` */

/*Table structure for table `jurisdiction` */

DROP TABLE IF EXISTS `jurisdiction`;

CREATE TABLE `jurisdiction` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '���',
  `jurisdictionName` varchar(20) DEFAULT NULL COMMENT 'Ȩ������',
  `ename` varchar(20) DEFAULT NULL COMMENT 'Ӣ������',
  `catalog` int(11) DEFAULT NULL COMMENT '0��Ŀ¼1�ǹ���',
  `parentId` int(11) DEFAULT NULL COMMENT 'Ȩ�޸�id',
  `path` varchar(20) DEFAULT NULL COMMENT 'Ȩ��·��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `jurisdiction` */

/*Table structure for table `legworkcat` */

DROP TABLE IF EXISTS `legworkcat`;

CREATE TABLE `legworkcat` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `licensePlateNumber` varchar(20) NOT NULL COMMENT '���ƺ�',
  `brand` varchar(20) DEFAULT NULL COMMENT 'Ʒ��',
  `model` varchar(20) DEFAULT NULL COMMENT '����',
  `mileage` varchar(20) DEFAULT NULL COMMENT '��ǰ���',
  `artisanClassId` int(4) DEFAULT NULL COMMENT '���ڰ���',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `legworkcat` */

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '��ϵ��id',
  `name` varchar(20) DEFAULT NULL COMMENT '��ϵ������',
  `position` varchar(20) DEFAULT NULL COMMENT 'ְλ',
  `phone` varchar(20) DEFAULT NULL COMMENT '�ֻ�',
  `telephone` varchar(20) DEFAULT NULL COMMENT '�绰',
  `email` varchar(20) DEFAULT NULL COMMENT 'email',
  `manufacturerNumber` varchar(10) DEFAULT NULL COMMENT '�볧�̱����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `linkman` */

/*Table structure for table `maintain` */

DROP TABLE IF EXISTS `maintain`;

CREATE TABLE `maintain` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '�������',
  `maintaiNname` varchar(20) DEFAULT NULL COMMENT '��������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `maintain` */

/*Table structure for table `maintainregist` */

DROP TABLE IF EXISTS `maintainregist`;

CREATE TABLE `maintainregist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `maintainName` varchar(20) DEFAULT NULL COMMENT '��������',
  `mileage` float DEFAULT NULL COMMENT '�ƻ����',
  `mileageDate` date DEFAULT NULL COMMENT '�ƻ�����',
  `remark` varchar(50) DEFAULT NULL COMMENT '��ע',
  `sjmileage` float DEFAULT NULL COMMENT 'ʵ�����',
  `Sjmileagedate` date DEFAULT NULL COMMENT 'ʵ������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `maintainregist` */

/*Table structure for table `maintenanceitems` */

DROP TABLE IF EXISTS `maintenanceitems`;

CREATE TABLE `maintenanceitems` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '��Ŀ���',
  `itemsName` varchar(20) DEFAULT NULL COMMENT '��Ŀ����',
  `typeId` int(4) DEFAULT NULL COMMENT '�뼸���������',
  `remark` varchar(50) DEFAULT NULL COMMENT '��ע',
  `normalPrice` float DEFAULT NULL COMMENT '��׼��',
  `memberPrice` float DEFAULT NULL COMMENT '��Ա��',
  `vipPrice` float DEFAULT NULL COMMENT 'Vip��',
  `negotiatedPrice` float DEFAULT NULL COMMENT 'Э���',
  `claimPrice` float DEFAULT NULL COMMENT '�����',
  `insurancePrice` float DEFAULT NULL COMMENT '���ռ�',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `maintenanceitems` */

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `number` varchar(10) NOT NULL COMMENT '���̱��',
  `name` varchar(20) DEFAULT NULL COMMENT '��������',
  `address` varchar(20) DEFAULT NULL COMMENT '��ַ',
  `manage` varchar(20) DEFAULT NULL COMMENT '��Ӫ״̬',
  `url` varchar(20) DEFAULT NULL COMMENT '��ַ',
  `bank` varchar(20) DEFAULT NULL COMMENT '������',
  `bankNumber` varchar(20) DEFAULT NULL COMMENT '�����˺�',
  `payment` varchar(20) DEFAULT NULL COMMENT '���ʽ',
  `laver` varchar(20) DEFAULT NULL COMMENT '���̵ȼ�',
  `brank` varchar(20) DEFAULT NULL COMMENT '��ӪƷ��',
  `type` varchar(20) DEFAULT NULL COMMENT '�������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manufacturer` */

/*Table structure for table `materialrequire_good` */

DROP TABLE IF EXISTS `materialrequire_good`;

CREATE TABLE `materialrequire_good` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `requireid` int(11) DEFAULT NULL COMMENT '����������',
  `goodid` int(11) DEFAULT NULL COMMENT '�����ϱ����',
  `count` int(11) DEFAULT NULL COMMENT '����',
  `item` varchar(20) DEFAULT NULL COMMENT '��Ӧ��Ŀ',
  `warehouse` varchar(20) DEFAULT NULL COMMENT '�ֿ�',
  `Isget` int(11) DEFAULT NULL COMMENT '�Ƿ�����1=�ǣ�0=��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `materialrequire_good` */

/*Table structure for table `minorrepair` */

DROP TABLE IF EXISTS `minorrepair`;

CREATE TABLE `minorrepair` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT 'С�ޱ��',
  `minorRepairName` varchar(20) DEFAULT NULL COMMENT 'С������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `minorrepair` */

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '��λid',
  `postName` varchar(20) DEFAULT NULL COMMENT '��λ����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `post` */

insert  into `post`(`id`,`postName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'չ������',NULL,NULL,NULL,NULL,NULL),
(2,'���۹���',NULL,NULL,NULL,NULL,NULL),
(3,'����Ա',NULL,NULL,NULL,NULL,NULL),
(4,'���Ա',NULL,NULL,NULL,NULL,NULL),
(5,'�Ƴ�Ա',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `repair` */

DROP TABLE IF EXISTS `repair`;

CREATE TABLE `repair` (
  `number` varchar(20) NOT NULL COMMENT 'ά�ޱ��',
  `carinfoId` int(11) DEFAULT NULL COMMENT '�복����Ϣ�����',
  `staffno` varchar(10) DEFAULT NULL COMMENT '��Ա������',
  `oil` varchar(30) DEFAULT NULL COMMENT '��������',
  `type` varchar(20) DEFAULT NULL COMMENT 'ҵ�����',
  `worktime` varchar(20) DEFAULT NULL COMMENT 'ʩ�����',
  `getman` varchar(20) DEFAULT NULL COMMENT '�ӳ���',
  `overworkdate` datetime DEFAULT NULL COMMENT 'Ԥ���깤ʱ��',
  `nowworkDate` datetime DEFAULT NULL COMMENT 'ʵ���깤ʱ��',
  `setter` varchar(20) DEFAULT NULL COMMENT '���㷽ʽ',
  `company` varchar(20) DEFAULT NULL COMMENT '��˾',
  `befor` datetime DEFAULT NULL COMMENT '�ϴν���ʱ��',
  `price` float DEFAULT NULL COMMENT 'Ԥ�����',
  `remark` varchar(40) DEFAULT NULL COMMENT '��ע',
  `state` varchar(20) DEFAULT NULL COMMENT '���޳���',
  `fault` varchar(30) DEFAULT NULL COMMENT '��������',
  `faultreasult` varchar(30) DEFAULT NULL COMMENT '����ԭ��',
  `status` varchar(20) DEFAULT NULL COMMENT 'ά��״̬',
  `orderTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `stockDater` datetime DEFAULT NULL COMMENT '����ʱ��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `repair` */

/*Table structure for table `rescue` */

DROP TABLE IF EXISTS `rescue`;

CREATE TABLE `rescue` (
  `number` varchar(30) NOT NULL COMMENT '��Ԯ���',
  `carinfoid` int(11) DEFAULT NULL COMMENT '�복����Ϣ�����',
  `staffno` varchar(10) DEFAULT NULL COMMENT '��Ա������',
  `rescueTeamid` int(11) DEFAULT NULL COMMENT '�ɹ��������������',
  `type` varchar(20) DEFAULT NULL COMMENT 'ҵ�����',
  `worktimes` varchar(20) DEFAULT NULL COMMENT 'ʩ�����',
  `getman` varchar(20) DEFAULT NULL COMMENT '�ӳ���',
  `workdate` datetime DEFAULT NULL COMMENT '�ɹ�ʱ��',
  `nowdate` datetime DEFAULT NULL COMMENT '����ʱ��',
  `address` varchar(20) DEFAULT NULL COMMENT '������ַ',
  `car` varchar(30) DEFAULT NULL COMMENT '��ʻ����',
  `liche` float DEFAULT NULL COMMENT '��ʻ���',
  `worktime` datetime DEFAULT NULL COMMENT 'ʩ��ʱ��',
  `overtime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `rescueaddress` varchar(40) DEFAULT NULL COMMENT '��Ԯ��ַ',
  `setter` varchar(30) DEFAULT NULL COMMENT '���㷽ʽ',
  `company` varchar(30) DEFAULT NULL COMMENT '��˾',
  `price` float DEFAULT NULL COMMENT 'Ԥ�����',
  `remark` varchar(30) DEFAULT NULL COMMENT '��ע',
  `state` varchar(30) DEFAULT NULL COMMENT '���޳���',
  `fault` varchar(30) DEFAULT NULL COMMENT '��������',
  `faultreasult` varchar(30) DEFAULT NULL COMMENT '����ԭ��',
  `status` varchar(30) DEFAULT NULL COMMENT 'ά��״̬',
  `orderTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `stockDater` datetime DEFAULT NULL COMMENT '����ʱ��',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `rescue` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '��ɫid',
  `roleName` varchar(20) DEFAULT NULL COMMENT '��ɫ����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

/*Table structure for table `role_jurisdiction` */

DROP TABLE IF EXISTS `role_jurisdiction`;

CREATE TABLE `role_jurisdiction` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '���',
  `roleid` int(4) DEFAULT NULL COMMENT '��ɫid',
  `jurisdictionId` int(4) DEFAULT NULL COMMENT 'Ȩ��id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_jurisdiction` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffNo` varchar(10) NOT NULL COMMENT 'Ա�����',
  `name` varchar(20) DEFAULT NULL COMMENT 'Ա������',
  `sex` varchar(5) DEFAULT NULL COMMENT 'Ա���Ա�',
  `departmentId` int(4) DEFAULT NULL COMMENT '����id',
  `account` varchar(10) DEFAULT NULL COMMENT 'Ա���˺�',
  `password` varchar(8) DEFAULT '88888888' COMMENT 'Ա������',
  `postId` int(4) DEFAULT NULL COMMENT '��λid',
  `physicalCondition` varchar(50) DEFAULT NULL COMMENT '����״��',
  `height` varchar(10) DEFAULT NULL COMMENT '���',
  `nativePlace` varchar(20) DEFAULT NULL COMMENT '����',
  `nation` varchar(10) DEFAULT NULL COMMENT '����',
  `maritalStatus` varchar(10) DEFAULT NULL COMMENT '����״̬',
  `educationBackground` varchar(10) DEFAULT NULL COMMENT 'ѧ��',
  `school` varchar(10) DEFAULT NULL COMMENT '��ҵѧУ',
  `major` varchar(50) DEFAULT NULL COMMENT 'רҵ',
  `professionalQualification` varchar(50) DEFAULT NULL COMMENT 'רҵ�ʸ�',
  `property` varchar(50) DEFAULT NULL COMMENT '����',
  `degree` varchar(50) DEFAULT NULL COMMENT 'ѧλ',
  `authorizedStrength` varchar(50) DEFAULT NULL COMMENT '����',
  `idCardNo` varchar(50) DEFAULT '18' COMMENT '���֤',
  `residence` varchar(50) DEFAULT NULL COMMENT '���ڵ�ַ',
  `presentAddress` varchar(50) DEFAULT NULL COMMENT '��ס��ַ',
  `contactNumber` varchar(50) DEFAULT NULL COMMENT '��ϵ�绰',
  `phone` varchar(50) DEFAULT NULL COMMENT '�ֻ�',
  `email` varchar(50) DEFAULT NULL COMMENT 'email',
  `depositBank` varchar(50) DEFAULT NULL COMMENT '��������',
  `bankAccount` varchar(50) DEFAULT NULL COMMENT '�����˺�',
  `emergencyContact` varchar(50) DEFAULT NULL COMMENT '������ϵ��',
  `emergencyPhone` varchar(50) DEFAULT NULL COMMENT '������ϵ����ϵ�绰',
  `dateOnBoard` date DEFAULT NULL COMMENT '��ְ����',
  `theTrialDue` date DEFAULT NULL COMMENT '���õ���',
  `birthdayDate` date DEFAULT NULL COMMENT '��������',
  `contractStart` date DEFAULT NULL COMMENT '��ͬ��ʼ',
  `agreementEnds` date DEFAULT NULL COMMENT '��ͬ����',
  `cardNumber` varchar(20) DEFAULT NULL COMMENT '���Ա��',
  `internalCardNo` varchar(20) DEFAULT NULL COMMENT '���ڲ���',
  `referrer` varchar(20) DEFAULT NULL COMMENT '�Ƽ���',
  `wholeOrderDiscountRight` varchar(20) DEFAULT NULL COMMENT '�����ۿ�Ȩ',
  `timeDiscountRight` varchar(20) DEFAULT NULL COMMENT '��ʱ�ۿ�Ȩ',
  `rightToDiscount` varchar(20) DEFAULT NULL COMMENT '��Ʒ�ۿ�Ȩ',
  `rightOfRelief` varchar(20) DEFAULT NULL COMMENT '����Ȩ',
  `jobResume` varchar(1000) DEFAULT NULL COMMENT '��������',
  `educationexperience` varchar(1000) DEFAULT NULL COMMENT '��������',
  `memberOfFamily` varchar(1000) DEFAULT NULL COMMENT '��ͥ��Ա',
  `disciplinaryRecords` varchar(1000) DEFAULT NULL COMMENT '���ͼ�¼',
  `employmentAdvice` varchar(1000) DEFAULT NULL COMMENT 'Ƹ�����',
  `picture` varchar(1000) DEFAULT NULL COMMENT 'Ա����Ƭ',
  `roleId` int(4) DEFAULT NULL COMMENT '��ɫ��id',
  `isDimission` int(2) DEFAULT '0' COMMENT '0Ϊ��ְ1Ϊ����ְ',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`staffNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`staffNo`,`name`,`sex`,`departmentId`,`account`,`password`,`postId`,`physicalCondition`,`height`,`nativePlace`,`nation`,`maritalStatus`,`educationBackground`,`school`,`major`,`professionalQualification`,`property`,`degree`,`authorizedStrength`,`idCardNo`,`residence`,`presentAddress`,`contactNumber`,`phone`,`email`,`depositBank`,`bankAccount`,`emergencyContact`,`emergencyPhone`,`dateOnBoard`,`theTrialDue`,`birthdayDate`,`contractStart`,`agreementEnds`,`cardNumber`,`internalCardNo`,`referrer`,`wholeOrderDiscountRight`,`timeDiscountRight`,`rightToDiscount`,`rightOfRelief`,`jobResume`,`educationexperience`,`memberOfFamily`,`disciplinaryRecords`,`employmentAdvice`,`picture`,`roleId`,`isDimission`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('ASD002','������','Ů',9,'sdf','88888888',2,'����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'18834535222','16623423663','1234237783@qq.com',NULL,NULL,NULL,'14124546574','2019-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL),
('ASD003','ī��','��',12,'xcv','88888888',3,'����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'17775345332','18843242211','2312213453@qq.com',NULL,NULL,NULL,'14245657543',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
('SWE001','ʷ�ٷ�','��',3,'qwe','88888888',2,'����','173','����','׳��','�ѻ�','����','����ũҵ��ѧ','��������','�м�����ʦ','�ǿ��ڼ�н','һ��','�ڱ�','430202199910011022','����ʡ�����к�����','����ʡ��ɳ����Ԫ��','13142000286','13142000286','1525532629@qq.com','�й�����','74327342374238123','ղķ˹','15276222983','2019-02-02','2019-05-02','1999-10-01','2019-05-02','2020-05-02','2993827192','2131232131','����','1','1','1','1','1','1','1','1','1','1',1,1,NULL,NULL,NULL,NULL,NULL),
('SWE002','�Ʊ�','��',4,'asd','88888888',3,'����','188','����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'12243545465','13156734327','3288321354@qq.com',NULL,NULL,NULL,'14248894324',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
('SWE003','�ٸ�','��',6,'zxc','88888888',4,'����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'15687846453','15323245675','2377894392@qq.com',NULL,NULL,NULL,'13456333423',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL),
('ZXC001','����','��',11,'ert','88888888',5,'����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'14565435322','13442355323','3231877432@qq.com',NULL,NULL,NULL,'14343253442',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `work` */

DROP TABLE IF EXISTS `work`;

CREATE TABLE `work` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '�ֹ�id',
  `instationWhite` int(4) DEFAULT NULL COMMENT 'վ�ڰ���',
  `instationBlack` int(4) DEFAULT NULL COMMENT 'վ������',
  `outsideWhite` int(4) DEFAULT NULL COMMENT 'վ�����',
  `outsideBlack` int(4) DEFAULT NULL COMMENT 'վ������',
  `workTime` datetime DEFAULT NULL COMMENT '����ʱ��',
  `artisanClassId` int(4) DEFAULT NULL COMMENT '��������id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `work` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
