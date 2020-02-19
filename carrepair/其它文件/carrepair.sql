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
  `deadweight` varchar(20) DEFAULT NULL COMMENT '����',
  `carBrandId` int(4) DEFAULT NULL COMMENT '�복Ʒ�Ʊ������',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`id`,`carTypeName`,`engineId`,`price`,`carYearPrice`,`power`,`importOrdomestic`,`fuelLabel`,`deadweight`,`carBrandId`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
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
  `deadweight` varchar(20) DEFAULT NULL COMMENT '����',
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
  `clientid` varchar(100) DEFAULT NULL COMMENT '�ͻ����',
  `insuredcar` varchar(20) DEFAULT NULL COMMENT '����Ͷ����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `carinfo` */

insert  into `carinfo`(`id`,`carNumber`,`carBrandId`,`carId`,`carer`,`carerPhone`,`bornDate`,`affiliation`,`drivingLicence`,`carNumber1`,`engineNumber`,`yearPrice`,`mileage`,`engineId`,`deadweight`,`buyDate`,`dutyDate`,`carCheckDate`,`fuelOilType`,`carSeries`,`Jqinsurance`,`Jqinsurancedate`,`Syinsurance`,`Syinsurancedate`,`maintain`,`maintaindate`,`clientid`,`insuredcar`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'��A12356',2,6,'ΰ��','16634555987','1996-12-22','��˾��','2020-02-20','LE42131831L436672','345347K',2001,10000,1,'21��','2002-03-05 00:00:00','2003-04-01 00:00:00','2003-12-21 00:00:00','����',NULL,'�������ٱ���','2004-01-01','�������ٱ���','2004-01-01',20000,'2004-05-05','00000CU12348','1',NULL,NULL,NULL,NULL,NULL),
(2,'��B54352',2,5,'��ΰ','18884343221','1995-10-21','��˾��','2022-03-21','LL4123123J1245332','432234K',2018,5000,1,'3��','2018-12-12 00:00:00','2018-12-21 00:00:00','2019-01-21 00:00:00','����',NULL,'�������ٱ���','2018-12-25','�������ٱ���','2018-12-30',18000,'2020-09-21','00000CU12348','2',NULL,NULL,NULL,NULL,NULL),
(3,'��C53453',3,8,'����','17759342092','1994-11-21','��˾��','2023-04-22','LL1432423F1435323','423422K',2015,12000,3,'14��','2015-05-23 00:00:00','2015-12-23 00:00:00','2016-01-01 00:00:00','����',NULL,'ƽ�����ٱ���','2015-06-23','�������ٱ���','2015-12-29',250000,'2017-12-21','00000CU12349','1',NULL,NULL,NULL,NULL,NULL),
(4,'��B12432',1,3,'����','18876444728','1986-02-13','��˾��','2020-02-26','LE42131831L436123','345547K',2001,10000,3,'21��','2020-01-29 00:00:00','2020-02-05 00:00:00','2020-02-28 00:00:00','����','','���ٱ���','2020-03-04','ƽ�����ٱ���','2020-03-07',20000,'2020-01-16','00000CU12353','2',NULL,NULL,NULL,NULL,NULL),
(5,'��B45432',6,18,'�Ʒ�','18899277826','1988-02-10','��˾��','2020-03-07','LL4123123J1245532','436634K',2018,1000,2,'20��','2018-02-13 00:00:00','2018-03-14 00:00:00','2020-02-13 00:00:00','����','','�������ٱ���','2020-02-12','���ٱ���','2020-02-20',30000,'2020-03-05','00000CU12352','1',NULL,NULL,NULL,NULL,NULL),
(6,'��B88872',2,6,'����','17773999287','1994-03-16','��˾��','2020-02-25','LL4123123J1245543','412634K',2018,10000,1,'1','2020-02-18 00:00:00','2020-02-18 00:00:00','2020-03-06 00:00:00','����','','�������ٱ���','2020-02-19','�������ٱ���','2020-02-29',300000,'2020-02-11','00000CU12354','1','',NULL,NULL,NULL,NULL),
(7,'��B88726',2,6,'����','19982738276','1994-03-09','��˾��','2020-02-28','LL4123123J1245543','432634K',2018,15000,1,'1','2020-02-11 00:00:00','2020-02-19 00:00:00','2020-03-05 00:00:00','����','','�������ٱ���','2020-03-04','�������ٱ���','2020-03-06',300000,'2020-02-10','00000CU12355','2',NULL,NULL,NULL,NULL,NULL),
(12,'��B123123',4,11,'qwe','qwe',NULL,'��˾��',NULL,'12','12',12,NULL,1,'',NULL,NULL,NULL,'','','�������ٱ���',NULL,'�������ٱ���',NULL,12,NULL,'00000CU12352','2',NULL,NULL,NULL,NULL,NULL),
(16,'123',4,10,'123','123','2020-02-11','��˾��','2020-02-13','123','123',123,123,1,'123','2020-02-18 00:00:00','2020-02-07 00:00:00','2020-01-28 00:00:00','123','123','�������ٱ���','2020-02-11','�������ٱ���','2020-02-03',123,'2020-02-04','00000CU12348','1',NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `cashier` */

insert  into `cashier`(`id`,`totalNum`,`cashierstatic`,`paymentType`,`invoiceNo`,`cashiertime`,`staffId`,`onCredit`,`interior`,`clientId`,`change`,`Number`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,1000,'��֧��','�ֽ�',NULL,'2020-02-11 20:13:52','SWE001',NULL,NULL,'00000CU12349',NULL,'RNG202001','1',NULL,NULL,NULL,NULL),
(2,2000,'��֧��','΢��',NULL,'2020-02-11 20:16:28','ZXC001',NULL,NULL,'00000CU12350',NULL,'RNG202002','1',NULL,NULL,NULL,NULL),
(3,5000,'��֧��','֧����',NULL,'2020-02-11 20:17:41','SWE003',NULL,NULL,'00000CU12353',NULL,'IG202002','2',NULL,NULL,NULL,NULL);

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
  `typeId` int(4) DEFAULT '1' COMMENT '��ͻ��������',
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
('00000CU12348','����','��С��','13122332987','����ʡ�����к�����','1998-02-02',10,10000,'ZXC001','13442355323','����','����','������','��','243432213','18893888273','��������','876789574832789','����ʡ�����к���������㳡֧��',NULL,2,NULL,'2020-01-05',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12349','����','��Сƽ','14232322145','����ʡ��ɳ��������','1999-03-05',10,5000,'ASD003','18598237648','����','��ɳ','������','��','534325321','18643436373','��ҵ����','898574839432285','����ʡ�������»���·֧��',NULL,3,NULL,'2020-01-03',0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12350','���','С��','13487699820','����ʡ��ɳ���껨���껨ͤ','1997-02-05',3,11111,'SWE003','15323245675','����','��ɳ','�껨��','��','123123123','13143566432','��������','12312321423543534','����ʡ��ɳ���껨���껨֧ͤ��',NULL,1,NULL,'2020-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12351','����','����','18890887672','����ʡ������ʯ����','1995-02-16',3,1234,'SWE003','15323245675','����','����','ʯ����','��','123124214123123','14567567543','ũҵ����','12398878312','����ʡ������ʯ������ʯ�㳡֧��',NULL,1,NULL,'2020-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12352','�ƿ�','С��','18893777876','����ʡ��ɳ��������','1994-02-09',2,1000,'ASD003','18843242211','����','��ɳ','������','��','123124125123123','14423566785','��������','717948322394239423','����ʡ��ɳ��������֧��',NULL,1,NULL,'2020-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12353','�ɿ�','���·�','18893777628','����ʡ��������Ԫ��','1997-03-13',3,1000,'SWE002','13156734327','����','����','��Ԫ��','��','','','','','',NULL,1,NULL,'2020-02-07',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12354','����','����','188992773621','����ʡ�����к�����','1994-03-09',3,1000,'ZXC001','13442355323','����','����','������','��','','','','','',NULL,1,NULL,'2020-02-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('00000CU12355','����','�԰�','19982738276','����ʡ������«����','1994-03-09',4,1000,'SWE003','15323245675','����','����','«����','��','','','','','',NULL,1,NULL,'2020-02-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `clienttype` */

insert  into `clienttype`(`id`,`clientType`,`validity`,`cost`,`address`,`type`,`discount`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'��׼�ͻ�',5,500,NULL,'��׼��',0.95,'�ǻ�Ա',NULL,NULL,NULL,NULL),
(2,'��Ա�ͻ�',5,888,NULL,'��Ա��',0.88,'��Ա',NULL,NULL,NULL,NULL),
(3,'Э��ͻ�',5,1000,NULL,'Э���',0.8,'�ǻ�Ա',NULL,NULL,NULL,NULL),
(4,'����ͻ�',5,1288,NULL,'�����',0.78,'�ǻ�Ա',NULL,NULL,NULL,NULL),
(5,'���տͻ�',5,1588,NULL,'���ռ�',0.72,'��Ա',NULL,NULL,NULL,NULL);

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
  `count` int(11) DEFAULT NULL COMMENT '������',
  `fgreason` varchar(20) DEFAULT NULL COMMENT '����ԭ��',
  `wjid` varchar(20) DEFAULT NULL COMMENT 'ά�޻��Ԯid',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `completed` */

insert  into `completed`(`id`,`yesOrno`,`predicttime`,`nowtime`,`reason`,`workid`,`dutyid`,`price`,`count`,`fgreason`,`wjid`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(10,0,'2020-02-15 00:00:00','2020-02-15 00:00:00',NULL,NULL,NULL,1212,1,'','WGQ20200214134851',NULL,NULL,NULL,NULL,NULL),
(11,1,'2020-02-15 00:00:00','2020-02-16 00:00:00',NULL,NULL,NULL,NULL,1,NULL,'WGQ20200213153913',NULL,NULL,NULL,NULL,NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `dimission` */

insert  into `dimission`(`id`,`staffId`,`dimissionDate`,`dimissionCause`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(22,'ASD002','2020-02-06','�Ҳ������',NULL,NULL,NULL,NULL,NULL),
(23,'ASD003','2020-02-06','��Ҳ�������',NULL,NULL,NULL,NULL,NULL);

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
  `priceType` varchar(100) DEFAULT NULL COMMENT '����',
  `discountsPrice` varchar(100) DEFAULT NULL COMMENT '�Żݺ󵥼�',
  `wjid` varchar(100) DEFAULT NULL COMMENT 'ά�޻��Ԯid',
  `warehouse` varchar(100) DEFAULT NULL COMMENT '�ֿ�',
  `isRepair` varchar(100) DEFAULT NULL COMMENT '�Ƿ�����0��1��',
  `cause` varchar(40) DEFAULT NULL COMMENT '�ⵥԭ��',
  `type` varchar(40) DEFAULT NULL COMMENT '���',
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
  `count` int(11) DEFAULT NULL COMMENT '����',
  `priceType` varchar(100) DEFAULT NULL COMMENT '����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `item_repair` */

/*Table structure for table `itemtype` */

DROP TABLE IF EXISTS `itemtype`;

CREATE TABLE `itemtype` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '���',
  `itemTypeName` varchar(20) DEFAULT NULL COMMENT '����',
  `parentId` int(4) DEFAULT NULL COMMENT '����id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `itemtype` */

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
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

/*Data for the table `jurisdiction` */

insert  into `jurisdiction`(`id`,`jurisdictionName`,`ename`,`catalog`,`parentId`,`path`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'��������',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(2,'ϵͳά��',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(3,'������',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(4,'�ͻ�����',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(5,'ǰ̨����',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(6,'ά��',NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL),
(7,'��֯�ܹ�',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(8,'��λ����',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(9,'��ְ�Ǽ�',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(10,'ͨѶ��¼',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(11,'�����Ǽ�',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(12,'���鼼��',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(13,'���ڳ���',NULL,0,1,NULL,NULL,NULL,NULL,NULL,NULL),
(14,'Ա����ɫ����',NULL,0,2,NULL,NULL,NULL,NULL,NULL,NULL),
(15,'������Ʒ��',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(16,'���͵���',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(17,'ά����Ŀ',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(18,'��Ʒ����',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(19,'������λ',NULL,0,3,NULL,NULL,NULL,NULL,NULL,NULL),
(20,'�ͻ�����',NULL,0,4,NULL,NULL,NULL,NULL,NULL,NULL),
(21,'��������',NULL,0,4,NULL,NULL,NULL,NULL,NULL,NULL),
(22,'��������',NULL,0,5,NULL,NULL,NULL,NULL,NULL,NULL),
(23,'��Ա��ֵ��',NULL,0,5,NULL,NULL,NULL,NULL,NULL,NULL),
(24,'ά�޽ӳ�',NULL,0,6,NULL,NULL,NULL,NULL,NULL,NULL),
(25,'��������',NULL,0,6,NULL,NULL,NULL,NULL,NULL,NULL);

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
  `otherone` varchar(100) DEFAULT NULL COMMENT '���ƺ�',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `maintainregist` */

insert  into `maintainregist`(`id`,`maintainName`,`mileage`,`mileageDate`,`remark`,`sjmileage`,`Sjmileagedate`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(2,'�����Ӿ�',111,'2020-02-20',NULL,222,'2020-02-26','��A12356',NULL,NULL,NULL,NULL),
(3,'111',111,'2020-02-25',NULL,111,'2020-02-21','��A12356',NULL,NULL,NULL,NULL);

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

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int(4) NOT NULL COMMENT '��λid',
  `postName` varchar(20) DEFAULT NULL COMMENT '��λ����',
  `otherone` varchar(100) DEFAULT NULL COMMENT '�����ֶ�1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '�����ֶ�2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '�����ֶ�3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '�����ֶ�4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '�����ֶ�5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `post` */

insert  into `post`(`id`,`postName`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
(1,'չ������',NULL,NULL,NULL,NULL,NULL),
(2,'���۹���',NULL,NULL,NULL,NULL,NULL),
(3,'����Ա',NULL,NULL,NULL,NULL,NULL),
(4,'���Ա',NULL,NULL,NULL,NULL,NULL),
(5,'�Ƴ�Ա',NULL,NULL,NULL,NULL,NULL),
(6,'qwe',NULL,NULL,NULL,NULL,NULL),
(8,'123',NULL,NULL,NULL,NULL,NULL);

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

insert  into `repair`(`number`,`carinfoId`,`staffno`,`oil`,`type`,`worktime`,`getman`,`overworkdate`,`nowworkDate`,`setter`,`company`,`befor`,`price`,`remark`,`state`,`fault`,`faultreasult`,`status`,`orderTime`,`stockDater`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('RNG202001',4,'SWE003','��','�����ͳ�','����','�ӳ�','2020-02-03 16:39:53','2020-02-02 16:39:59','�ֽ�','�й�ƽ������',NULL,200,'��һ�ν���','ɲ��������','ɲ��������','ɲ��Ƭ�ϻ�','�깤','2020-02-02 16:13:49','2020-02-02 20:13:55',NULL,NULL,NULL,NULL,NULL),
('RNG202002',5,'SWE003','��','�����ͳ�','����','��������Ա','2020-02-05 16:50:21','2020-02-04 16:50:23','�ֽ�','�й�ƽ������',NULL,100,'','��Ĥ','��Ĥ','��Ĥ','�깤','2020-02-04 16:50:45','2020-02-04 16:50:47',NULL,NULL,NULL,NULL,NULL),
('RNG202003',5,'ZXC001','��','�����ͳ�','����','�ӳ�','2020-02-04 22:36:17','2020-02-04 22:36:24','�ֽ�','�й�ƽ������',NULL,100,NULL,'��̥','��̥','��̥','�깤','2020-02-04 22:37:18','2020-02-04 22:37:20',NULL,NULL,NULL,NULL,NULL);

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

insert  into `rescue`(`number`,`carinfoid`,`staffno`,`rescueTeamid`,`type`,`worktimes`,`getman`,`workdate`,`nowdate`,`address`,`car`,`liche`,`worktime`,`overtime`,`rescueaddress`,`setter`,`company`,`price`,`remark`,`state`,`fault`,`faultreasult`,`status`,`orderTime`,`stockDater`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values 
('IG202001',4,'SWE003',0,'�����ͳ�','ҹ��','������','2020-02-04 22:33:47','2020-02-04 22:33:52','��������','��B54352',200,'2020-02-04 22:34:04','2020-02-04 22:34:06','���ҵ��','�ֽ�','�й�ƽ������',500,'��һ�ξ�Ԯ',NULL,NULL,NULL,'�ӳ�','2020-02-02 17:12:38','2020-02-02 20:12:43',NULL,NULL,NULL,NULL,NULL),
('IG202002',5,'ZXC001',0,'�����ͳ�','����','�ӳ�','2020-02-02 19:03:08','2020-02-02 19:03:11','��������','��B523F4',200,'2020-02-02 19:05:22','2020-02-02 19:05:24','���ҵ��','�ֽ�','�й�ƽ������',500,'��һ�ξ�Ԯ','','','','�ӳ�','2020-02-04 17:12:38','2020-02-02 20:12:43',NULL,NULL,NULL,NULL,NULL);

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
('ASD002','������','Ů',9,'sdf','88888888',2,'����',NULL,NULL,'����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'18834535222','16623423663','1234237783@qq.com',NULL,NULL,NULL,'14124546574','2019-02-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL),
('ASD003','ī��','��',12,'xcv','88888888',3,'����',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'18',NULL,NULL,'17775345332','18843242211','2312213453@qq.com',NULL,NULL,NULL,'14245657543',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL),
('SWE001','ʷ�ٷ�','��',3,'qwe','88888888',2,'����','173','����','׳��','�ѻ�','����','����ũҵ��ѧ','��������','�м�����ʦ','�ǿ��ڼ�н','һ��','�ڱ�','430202199910011022','����ʡ�����к�����','����ʡ��ɳ����Ԫ��','13142000286','13142000286','1525532629@qq.com','�й�����','74327342374238123','ղķ˹','15276222983','2019-02-02','2019-05-02','1999-10-01','2019-05-02','2020-05-02','2993827192','2131232131','����','1','1','1','1','1','1','1','1','1','1',1,0,NULL,NULL,NULL,NULL,NULL),
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
