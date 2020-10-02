/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 10.4.14-MariaDB : Database - mitrais_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mitrais_test` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `mitrais_test`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `mobile_phone` varchar(14) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `date_birth` date DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile_phone` (`mobile_phone`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

insert  into `user`(`id`,`first_name`,`last_name`,`mobile_phone`,`gender`,`date_birth`,`email`,`created_date`,`modified_date`) values 
('4028e4f474dcb4680174dcb4bc410000','Hendra','Kurniawan','081234567','L','2014-01-02','hendra@gmail.com','2020-09-30 08:51:06','2020-09-30 08:51:06'),
('4028e4f474de0e480174de559b5a0000','Budin','Budin','089089','M',NULL,'Budin@gmail.com','2020-09-30 16:26:26','2020-09-30 16:26:26'),
('4028e4f474de5dc60174e29fdb7f0040','HENDRA','HENDRA','081234589','M','1970-01-01','krendra21@gmail.com','2020-10-01 12:26:01','2020-10-01 12:26:01'),
('4028e4f474de5dc60174e2a2fc560041','Hendra','Hendra','78787878','M','1970-01-01','krendra21@gmail.com1','2020-10-01 12:29:26','2020-10-01 12:29:26'),
('4028e4f474e63a950174e6681e810003','FAASAS','DASASAS','62112121212121','\0',NULL,'asasasasasasas@gmail.com','2020-10-02 06:03:29','2020-10-02 06:03:29'),
('4028e4f474e63a950174e66902f00004','sdasdasd','asdasdasdasd','62121213112412','\0',NULL,'adasdasdasdasdasd','2020-10-02 06:04:10','2020-10-02 06:04:10'),
('4028e4f474e63a950174e66d78250005','eqweqweqwe','qweqweqweqwe','6221212121212','-',NULL,'qweqweqweqweqweqwe','2020-10-02 06:09:22','2020-10-02 06:09:22'),
('4028e4f474e63a950174e6ff9f7e0006','KSJDjskdj','ksdjsakflaksjf','6212121021902','M','1997-12-28','heknsklkelwlks','2020-10-02 08:48:58','2020-10-02 08:48:58');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
