/*
Navicat MySQL Data Transfer

Source Server         : local-mysql
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2018-04-20 10:58:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student_table
-- ----------------------------
DROP TABLE IF EXISTS `student_table`;
CREATE TABLE `student_table` (
  `NAME` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '姓名',
  `AGE` int(10) DEFAULT NULL COMMENT '年龄',
  `SEX` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '性别',
  `HEIGHT` double(10,0) DEFAULT NULL COMMENT '身高',
  `WEIGHT` double(10,0) DEFAULT NULL COMMENT '体重'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of student_table
-- ----------------------------
INSERT INTO `student_table` VALUES ('李四', '26', '男', '178', '61');
INSERT INTO `student_table` VALUES ('王五', '36', '男', '185', '61');
INSERT INTO `student_table` VALUES ('张三', '16', '男', '170', '61');
INSERT INTO `student_table` VALUES ('小月', '20', '女', '168', '50');
