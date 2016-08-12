/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.5.20 : Database - itrusukey2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`itrusukey2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `itrusukey2`;

/*Table structure for table `t_admin` */

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `role_code` bigint(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `project` varchar(200) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_admin` */

insert  into `t_admin`(`id`,`user_name`,`password`,`role_code`,`type`,`status`,`project`,`create_time`) values (1,'szy','123',1,'ROLE_SUPER','0','0','2016-08-12 16:04:28');

/*Table structure for table `t_auth` */

DROP TABLE IF EXISTS `t_auth`;

CREATE TABLE `t_auth` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `res_code` varchar(20) DEFAULT NULL,
  `role_code` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_auth` */

insert  into `t_auth`(`id`,`res_code`,`role_code`) values (1,'9002001','1'),(2,'9002002','1');

/*Table structure for table `t_resource` */

DROP TABLE IF EXISTS `t_resource`;

CREATE TABLE `t_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_res_code` varchar(200) DEFAULT NULL,
  `res_code` varchar(200) DEFAULT NULL,
  `res_role_name` varchar(400) DEFAULT NULL,
  `res_title` varchar(400) DEFAULT NULL,
  `res_url` varchar(200) DEFAULT NULL,
  `res_order` bigint(200) DEFAULT NULL,
  `res_status` bigint(2) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_resource` */

insert  into `t_resource`(`id`,`parent_res_code`,`res_code`,`res_role_name`,`res_title`,`res_url`,`res_order`,`res_status`) values (1,NULL,'9001',NULL,'业务管理',NULL,1,0),(2,NULL,'9002',NULL,'用户中心',NULL,2,0),(3,NULL,'9003',NULL,'系统管理',NULL,3,0),(4,NULL,'9004',NULL,'日志管理',NULL,4,0),(5,'9002','9002001','ROLE_WORK_ORDER','工单信息','/workOrderInfo',1,0),(6,'9002','9002002','ROLE_ENTERPRISE_INFO','信用信息','/enterpriseInfo',2,0);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(200) DEFAULT NULL,
  `real_name` varchar(200) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `tel` varchar(11) DEFAULT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`user_name`,`real_name`,`password`,`sex`,`age`,`tel`,`mail`,`address`) values (1,'szy','孙赵岩','123','M',23,'18270820216','1850026587@qq.com','深圳'),(2,'szy2','孙赵岩2','123','M',23,'18270820216','1850026587@qq.com','深圳');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
