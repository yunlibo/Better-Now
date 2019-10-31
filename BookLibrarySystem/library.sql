/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.18-log : Database - library
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `library`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin_ID` varchar(10) NOT NULL,
  `admin_password` varchar(15) NOT NULL,
  `admin_quanxian` int(15) DEFAULT NULL COMMENT '是否是管理员',
  PRIMARY KEY (`admin_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`admin_ID`,`admin_password`,`admin_quanxian`) values ('admin','admin',1),('XiaoHua','123',0),('xiaokai','123',0);

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bookid` decimal(10,0) NOT NULL DEFAULT '0' COMMENT '图书号',
  `title` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '书名',
  `author` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '作者',
  `cbs` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '出版社',
  `publish_date` datetime DEFAULT NULL COMMENT '出版日期',
  `price` decimal(10,0) DEFAULT NULL COMMENT '加个',
  `tslx` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '图书类型',
  `czy` varchar(225) CHARACTER SET utf8 DEFAULT NULL COMMENT '操作员',
  `sjmc` varchar(30) CHARACTER SET utf8 DEFAULT NULL COMMENT '书架名称',
  `rkrq` datetime DEFAULT NULL COMMENT '入库日期',
  `jccs` int(11) DEFAULT NULL COMMENT '借出数量',
  `kczl` int(11) DEFAULT NULL COMMENT '图书数量',
  `translator` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '译者',
  `txm` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '条形码',
  `bookzt` int(11) DEFAULT '1' COMMENT '图书状态 0在架 1不在架',
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `book` */

insert  into `book`(`bookid`,`title`,`author`,`cbs`,`publish_date`,`price`,`tslx`,`czy`,`sjmc`,`rkrq`,`jccs`,`kczl`,`translator`,`txm`,`bookzt`) values ('1391207','计算机网络（第4版）','[美] James F. Kurose [美] Keith W. Ross','机械工业出版社','2009-12-23 18:04:31','66','','A00302','TP312JADK001426881','2018-10-23 18:04:31',0,100,'陈鸣','9787111165057',1),('4200822','Android应用开发揭秘','杨丰盛','机械工业出版社','2018-09-23 14:15:30','73','编程',NULL,'A-1-01','2018-06-16 22:37:10',NULL,100,NULL,NULL,NULL),('4200823','Android开发入门与实战','靳岩，姚尚朗','人民邮电出版社','2009-09-19 17:52:12','55','编程','A002','TP312JADK001426881','2018-06-16 09:04:29',95,30,'邹丰','95348963',0),('5466372','Java高手真经手册','赵树刚','电子工业大学','2010-01-19 18:29:02','69','编程','A003','A21','2018-06-19 18:29:02',65,30,'邹丰','74185296',1),('5466376','疯狂Android讲义','李刚','电子工业出版社','2011-09-19 17:52:24','98','文学类','B013','TP312JADK001426881','2018-06-16 23:54:11',112,30,'邹丰','74185296',0),('5466379','Java高手真经手册','赵树刚','电子工业出版社','2010-01-19 20:51:57','69','编程','A003','A21','2018-06-19 20:51:57',0,30,'邹丰','74185296',0);

/*Table structure for table `booktype` */

DROP TABLE IF EXISTS `booktype`;

CREATE TABLE `booktype` (
  `type` varchar(255) NOT NULL COMMENT '图书类别',
  `borrow_day` int(11) NOT NULL COMMENT '可借天数',
  `day_fine` decimal(10,0) DEFAULT NULL COMMENT '图书超期每天罚款金额',
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `booktype` */

insert  into `booktype`(`type`,`borrow_day`,`day_fine`) values ('天文类',30,'1'),('文学类',30,'1'),('经济学',30,'1'),('编程',30,'1'),('语言类',30,'1');

/*Table structure for table `borrow` */

DROP TABLE IF EXISTS `borrow`;

CREATE TABLE `borrow` (
  `borrower_number` decimal(10,0) NOT NULL COMMENT '借阅卡号',
  `book_number` decimal(10,0) NOT NULL COMMENT '图书号',
  `borrower_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `book_name` varchar(20) DEFAULT NULL COMMENT '书名',
  `return_date` datetime DEFAULT NULL COMMENT '实际归还日期',
  `borrowed_date` datetime DEFAULT NULL COMMENT '借出日期',
  `fine` decimal(10,0) DEFAULT NULL COMMENT '罚款'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `borrow` */

/*Table structure for table `borrower` */

DROP TABLE IF EXISTS `borrower`;

CREATE TABLE `borrower` (
  `card_number` decimal(10,0) NOT NULL COMMENT '借阅卡号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(5) NOT NULL COMMENT '性别',
  `id_card_number` varchar(30) NOT NULL COMMENT '身份证号码',
  `work_place` varchar(30) DEFAULT NULL COMMENT '单位',
  `address` varchar(30) DEFAULT NULL COMMENT '家庭住址',
  `phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `type` varchar(30) NOT NULL COMMENT '借阅者类别',
  `create_time` datetime NOT NULL COMMENT '办证日期',
  `borrowed` int(11) DEFAULT '0' COMMENT '已借书数目',
  `is_lost` int(11) DEFAULT '0' COMMENT '是否挂失\r\n1、挂失\r\n0、未挂失',
  PRIMARY KEY (`card_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `borrower` */

insert  into `borrower`(`card_number`,`name`,`sex`,`id_card_number`,`work_place`,`address`,`phone`,`type`,`create_time`,`borrowed`,`is_lost`) values ('2','陈洪晶','男','440782199109133911','五邑大学','五邑大学','13750376797','超级会员','2018-10-23 14:18:39',6,0),('3','谭苑霞','女','1','五邑大学','五邑大学','121212','普通会员','2018-10-23 14:18:39',0,0),('4','小苑','女','440782199105270458','五邑大学','女生宿舍27幢','13750371111','普通会员','2018-10-23 14:18:39',0,0),('5','ddd','男','11111','ddd','wyu','12','普通会员','2018-10-23 14:18:39',0,0),('6','小强','男','12345678','无','英国','765421','学生','2018-10-23 14:18:39',0,0);

/*Table structure for table `borrowertype` */

DROP TABLE IF EXISTS `borrowertype`;

CREATE TABLE `borrowertype` (
  `type` varchar(20) NOT NULL COMMENT '借阅者类型',
  `borrow_number` int(11) NOT NULL COMMENT '能借出书的数量',
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `borrowertype` */

insert  into `borrowertype`(`type`,`borrow_number`) values ('普通会员',5),('超级会员',10);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `card_number` decimal(10,0) NOT NULL COMMENT '借阅卡号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(5) NOT NULL COMMENT '性别',
  `id_card_number` varchar(30) NOT NULL COMMENT '身份证号码',
  `work_place` varchar(30) DEFAULT NULL COMMENT '单位',
  `address` varchar(30) DEFAULT NULL COMMENT '家庭住址',
  `phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `type` varchar(30) NOT NULL COMMENT '借阅者类别',
  `create_time` datetime NOT NULL COMMENT '办证日期',
  `borrowed` int(11) DEFAULT '0' COMMENT '已借书数目',
  `is_lost` int(11) DEFAULT '0' COMMENT '是否挂失\r\n1、挂失\r\n0、未挂失',
  PRIMARY KEY (`card_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`card_number`,`name`,`sex`,`id_card_number`,`work_place`,`address`,`phone`,`type`,`create_time`,`borrowed`,`is_lost`) values ('1','陈洪晶','男','20140123456','五邑大学','五邑大学','13750376797','超级会员','2019-12-05 00:00:00',6,0),('2','谭苑霞','女','20130123456','五邑大学','五邑大学','121212','普通会员','2019-12-05 00:00:00',0,0),('3','小苑','女','20150123456','五邑大学','女生宿舍27幢','13750371111','普通会员','2019-12-05 00:00:00',0,0),('4','ddd','男','20130123455','ddd','wyu','12','普通会员','2019-12-05 00:00:00',0,0),('5','唐僧','男','2015026343','哈尔滨工业大学','黑龙江南港','1234567','超级会员','2018-06-15 18:54:42',0,0);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `is_admin` int(11) DEFAULT NULL COMMENT '是否是管理员',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `usertype` */

DROP TABLE IF EXISTS `usertype`;

CREATE TABLE `usertype` (
  `type` varchar(20) NOT NULL COMMENT '借阅者类型',
  `borrow_number` int(11) NOT NULL COMMENT '能借出书的数量',
  PRIMARY KEY (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `usertype` */

insert  into `usertype`(`type`,`borrow_number`) values ('学生',30),('普通会员',5),('普通用户',3),('超级会员',10);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
