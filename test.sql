/*
Navicat MySQL Data Transfer

Source Server         : 192.168.28.28
Source Server Version : 50157
Source Host           : 192.168.28.28:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50157
File Encoding         : 65001

Date: 2018-06-06 11:01:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL COMMENT '账号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `userName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
