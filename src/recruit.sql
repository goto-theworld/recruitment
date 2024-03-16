/*
 Navicat Premium Data Transfer

 Source Server         : jkf_w02
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : zhaopin

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 04/05/2020 16:00:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `company_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司id',
  `company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司名',
  `company_logo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司logo',
  `company_stage` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司阶段',
  `company_emp_count` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '公司员工规模',
  `company_industury` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司所属行业',
  `company_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司简介',
  `company_website` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司网址',
  `company_addr_province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司地址省份',
  `company_addr_city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司地址城市',
  `company_addr_area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司地址区域',
  `company_adrr_detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司详细地址',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES (1, '阿里巴巴', 'https://tse2-mm.cn.bing.net/th/id/OIP.014ThoYOUyHCTbS4KdCtlwHaHa?w=202&h=192&c=7&o=5&pid=1.7', '上市公司', '500-1500', '互联网', '阿里巴巴网络技术有限公司', NULL, '浙江', '杭州', '', NULL, NULL, NULL, NULL);
INSERT INTO `company` VALUES (2, '五菱宏光', 'https://tse4-mm.cn.bing.net/th/id/OIP.-6bf27SMKuTAtuOpD3rf6gAAAA?w=183&h=184&c=7&o=5&pid=1.7', '上市', '1500-3000', '汽车制造', '中国五菱', '', '河南', '郑州', '', NULL, NULL, NULL, NULL);
INSERT INTO `company` VALUES (3, '腾讯科技', 'https://tse3-mm.cn.bing.net/th/id/OIP.bX8UxxGgvFeHlJBoiMoi1QHaHR?w=170&h=166&c=7&o=5&pid=1.7', '上市公司', '1000-2000', '互联网科技', '深圳市腾讯计算机系统有限公司', NULL, '广东', '深圳', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for company_admin
-- ----------------------------
DROP TABLE IF EXISTS `company_admin`;
CREATE TABLE `company_admin`  (
  `company_admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司管理员id',
  `company_id` int(11) NULL DEFAULT NULL COMMENT '公司id',
  `company_admin_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司管理员账户名',
  `company_admin_telno` bigint(18) NULL DEFAULT NULL COMMENT '公司管理员账户手机',
  `company_admin_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司管理员账户邮箱',
  `company_admin_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '公司管理员账户密码',
  `company_admin_create_time` datetime NULL DEFAULT NULL COMMENT '公司管理员账户创建时间',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`company_admin_id`) USING BTREE,
  INDEX `fk_company_admin`(`company_id`) USING BTREE,
  CONSTRAINT `fk_company_admin` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of company_admin
-- ----------------------------
INSERT INTO `company_admin` VALUES (1, 1, '赵先生', 15666666666, '942151916@qq.com', '666666', '2020-03-09 09:53:25', 0, NULL, NULL);
INSERT INTO `company_admin` VALUES (2, 2, '李先生', 18888888888, '868688686@qq.com', '888888', '2020-03-09 09:54:09', 0, NULL, NULL);
INSERT INTO `company_admin` VALUES (3, 3, '楚先生', 13224242442, '123456789@qq.com', '999999', '2020-03-02 09:54:54', 0, NULL, NULL);

-- ----------------------------
-- Table structure for company_receive_resume_record
-- ----------------------------
DROP TABLE IF EXISTS `company_receive_resume_record`;
CREATE TABLE `company_receive_resume_record`  (
  `company_receive_resume_record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司收到简历记录id',
  `company_id` int(11) NOT NULL COMMENT '公司id',
  `resume_id` int(11) NULL DEFAULT NULL COMMENT '简历id',
  `receive_time` datetime NULL DEFAULT NULL COMMENT '公司收到简历时间',
  `company_admin_id` int(11) NULL DEFAULT NULL COMMENT '公司管理员id',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`company_receive_resume_record_id`) USING BTREE,
  INDEX `fk_receive_record_company`(`company_id`) USING BTREE,
  INDEX `fk_receive_record_resume`(`resume_id`) USING BTREE,
  INDEX `fk_receive_record_admin`(`company_admin_id`) USING BTREE,
  CONSTRAINT `fk_receive_record_admin` FOREIGN KEY (`company_admin_id`) REFERENCES `company_admin` (`company_admin_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_receive_record_company` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_receive_record_resume` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `cust_id` int(18) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `cust_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `cust_telno` bigint(18) NULL DEFAULT NULL COMMENT '用户手机',
  `cust_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `cust_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `cust_regist_time` datetime NULL DEFAULT NULL COMMENT '注册时间',
  `status` int(1) NULL DEFAULT NULL COMMENT '状态',
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用字段1',
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`cust_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, 'Smith', 13783949493, '875051600@qq.com', 'abcd1234', '2019-01-13 00:00:00', 0, NULL, NULL);
INSERT INTO `customer` VALUES (2, 'me', 13271008032, '1057817729@qq.com', '1234567', '2020-03-04 17:17:17', 0, NULL, NULL);

-- ----------------------------
-- Table structure for honor
-- ----------------------------
DROP TABLE IF EXISTS `honor`;
CREATE TABLE `honor`  (
  `honor_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '获奖id',
  `resume_id` int(11) NULL DEFAULT NULL COMMENT '简历id',
  `honor_create_time` date NULL DEFAULT NULL COMMENT '获奖时间',
  `honor_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '奖项名称',
  `honor_grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '获奖等级',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`honor_id`) USING BTREE,
  INDEX `fk_honor_resume`(`resume_id`) USING BTREE,
  CONSTRAINT `fk_honor_resume` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of honor
-- ----------------------------
INSERT INTO `honor` VALUES (1, 1, '2019-12-28', '666', '6666', 0, NULL);

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job`  (
  `job_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `company_id` int(11) NULL DEFAULT NULL COMMENT '公司id',
  `job_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职位名称',
  `job_city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职位工作城市',
  `job_year` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作年限',
  `job_degree` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '学历要求',
  `job_need_number` int(11) NULL DEFAULT NULL COMMENT '招聘人数',
  `job_publish_time` datetime NULL DEFAULT NULL COMMENT '发布时间',
  `job_welfare` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '福利',
  `job_duty` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职位职责',
  `job_demand` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职位要求',
  `job_addr_detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职位具体地点',
  `job_min_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '最低薪资',
  `job_max_salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '最高薪资',
  `job_search_keyword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '搜索关键字',
  `status` int(1) NULL DEFAULT NULL COMMENT '状态',
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`job_id`) USING BTREE,
  INDEX `fk_job_company`(`company_id`) USING BTREE,
  CONSTRAINT `fk_job_company` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES (1, 1, '程序员', '郑州', '4', '本科以上', 2, '2020-03-09 18:35:47', '五险一金', '编码,Java', NULL, '河南省郑州市', 3000.00, 4500.00, 'Java,程序员,技术,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (2, 1, '前端', '杭州', '5', '本科', 4, '2020-03-13 09:16:18', '五险一金', '美化,网页', NULL, '浙江省杭州市', 6000.00, 8000.00, '技术员,工程师,HTML,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (3, 1, '项目经理', '上海', '8', '硕士及以上', 1, '2020-03-02 09:19:13', '五险一金', '管理,编程', NULL, '上海市', 4500.00, 6000.00, '管理员,技术专家,php,python,大数据,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (4, 2, '质检员', '郑州', '2', '大专及以上', 20, '2020-03-17 09:24:25', '五险一金', '质量检查', NULL, '河南省郑州市金水区', 1500.00, 1999.00, '技术,体力', 0, NULL, NULL);
INSERT INTO `job` VALUES (5, 2, '厂长', '郑州', '4', '本科及以上', 2, '2020-03-09 09:27:27', '五险一金', '管理', NULL, '河南省郑州市高新区', 4500.00, 6000.00, '管理,技术', 0, NULL, NULL);
INSERT INTO `job` VALUES (6, 2, '车间主任', '郑州', '3', '本科及以上', 3, '2020-03-02 09:28:58', '五险一金', '管理', NULL, '河南省洛阳市洛龙区', 3000.00, 4500.00, '管理', 0, NULL, NULL);
INSERT INTO `job` VALUES (7, 3, 'Java技术专家', '深圳', '5', '硕士及以上', 2, '2020-03-12 09:31:38', '应有尽有', 'Java开发,技术研究', NULL, '广东省深圳市', 16000.00, 18000.00, '研究,技术,专家,Java,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (8, 3, 'Java开发工程师', '深圳', '3', '本科及以上', 5, '2020-03-19 09:35:37', '五险一金', '程序开发', NULL, '广东省深圳市', 1000.00, 2000.00, 'Java,开发,工程师,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (9, 3, '大数据分析师', '深圳', '5', '硕士及以上', 1, '2020-03-16 09:37:17', '应有尽有', '数据分析', NULL, '广东省深圳市', 12000.00, 15000.00, '大数据,分析师,技术,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (10, 3, '发布经理', '深圳', '6', '本科及以上', 1, '2020-03-15 09:40:06', '福利多多', '项目发布', NULL, '广东省深圳市', 10000.00, 12000.00, '分析师,架构,技术,IT', 0, NULL, NULL);
INSERT INTO `job` VALUES (11, 1, '前端技术专家', '杭州', '10', '硕士及以上', 1, '2020-03-17 09:43:05', '应有尽有', '技术指导', NULL, '浙江省杭州市', 20000.00, 24000.00, '技术,分析师,大牛,IT', 0, NULL, NULL);

-- ----------------------------
-- Table structure for job_collection
-- ----------------------------
DROP TABLE IF EXISTS `job_collection`;
CREATE TABLE `job_collection`  (
  `job_collection_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '职位收藏id',
  `cust_id` int(11) NOT NULL COMMENT '用户id',
  `job_id` int(11) NULL DEFAULT NULL COMMENT '职位id',
  `collect_time` datetime NULL DEFAULT NULL COMMENT '收藏时间',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`job_collection_id`) USING BTREE,
  INDEX `fk_collect_cust`(`cust_id`) USING BTREE,
  INDEX `fk_collect_job`(`job_id`) USING BTREE,
  CONSTRAINT `fk_collect_cust` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_collect_job` FOREIGN KEY (`job_id`) REFERENCES `job` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for project_experience
-- ----------------------------
DROP TABLE IF EXISTS `project_experience`;
CREATE TABLE `project_experience`  (
  `project_experi_id` int(18) NOT NULL AUTO_INCREMENT COMMENT '项目经验id',
  `resume_id` int(11) NULL DEFAULT NULL COMMENT '简历id',
  `project_company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目所在公司名',
  `project_start_time` date NULL DEFAULT NULL COMMENT '项目经验开始时间',
  `project_end_time` datetime NULL DEFAULT NULL COMMENT '项目经验结束时间',
  `project_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目经验名称',
  `project_content_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目内容描述',
  `project_duty_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '项目职责描述',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`project_experi_id`) USING BTREE,
  INDEX `fk_project_resume`(`resume_id`) USING BTREE,
  CONSTRAINT `fk_project_resume` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of project_experience
-- ----------------------------
INSERT INTO `project_experience` VALUES (1, 1, '666', '2019-12-28', '2019-12-28 16:00:00', '666', '66666', '66666', 0, NULL, NULL);

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume`  (
  `resume_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '简历id',
  `cust_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `resume_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历名称',
  `resume_create_time` datetime NULL DEFAULT NULL COMMENT '简历创建时间',
  `resume_update_time` datetime NULL DEFAULT NULL COMMENT '简历修改时间',
  `resume_profile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中头像',
  `resume_birth` date NULL DEFAULT NULL COMMENT '简历中用户出生日期',
  `resume_telno` bigint(20) NULL DEFAULT NULL COMMENT '简历中用户手机',
  `resume_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中用户邮箱',
  `resume_gender` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中用户性别',
  `resume_leaving__working` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中用户在职或离职情况',
  `resume_live_city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中用户居住地',
  `resume_personid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中用户身份证',
  `resume_income` decimal(9, 0) NULL DEFAULT NULL COMMENT '简历中用户年收入',
  `resume_full_part_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '简历中用户兼职或全职',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`resume_id`) USING BTREE,
  INDEX `fk_resume_customer`(`cust_id`) USING BTREE,
  CONSTRAINT `fk_resume_customer` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of resume
-- ----------------------------
INSERT INTO `resume` VALUES (1, 2, '姬凯飞', '2020-03-07 14:41:46', '2020-03-17 12:26:25', 'https://pic1.zhimg.com/v2-3b4fc7e3a1195a081d0259246c38debc_1200x500.jpg', '2000-12-30', 13271154545, '666666@qq.com', 'M', '我目前不想换工作', '洛阳', '46515651561656546', 100000, '全职', 0, NULL, NULL);
INSERT INTO `resume` VALUES (2, 2, '我的简历11', '2020-03-07 15:14:09', '2020-03-07 15:14:22', 'https://pic1.zhimg.com/v2-3b4fc7e3a1195a081d0259246c38debc_1200x500.jpg', NULL, 123, '123', '男', '', '123', '123', 213, '全职', 0, '123', '123');
INSERT INTO `resume` VALUES (6, 2, '我的简历', '2020-03-17 11:47:15', '2020-03-17 11:48:10', NULL, NULL, 13271008032, '1057817729@qq.com', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL);
INSERT INTO `resume` VALUES (7, 2, '我的简历3', '2020-03-17 11:48:11', '2020-03-17 12:23:51', NULL, '2018-12-29', 13271008032, '1057817729@qq.com', NULL, '目前正在找工作', '123', '4123123123123', 123, '全职', 0, NULL, NULL);
INSERT INTO `resume` VALUES (8, 2, '我的简历', '2020-03-17 12:24:57', '2020-03-17 12:29:14', NULL, NULL, 13271008032, '1057817729@qq.com', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL);
INSERT INTO `resume` VALUES (9, 2, '我的简历', '2020-03-17 12:25:09', '2020-03-17 12:29:14', NULL, NULL, 13271008032, '1057817729@qq.com', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL);
INSERT INTO `resume` VALUES (10, 2, '我的简历', '2020-03-17 12:25:19', '2020-03-17 12:29:14', NULL, NULL, 13271008032, '1057817729@qq.com', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL);

-- ----------------------------
-- Table structure for resume_delivery_record
-- ----------------------------
DROP TABLE IF EXISTS `resume_delivery_record`;
CREATE TABLE `resume_delivery_record`  (
  `resume_delivery_record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '简历投递记录id',
  `cust_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `resume_id` int(11) NULL DEFAULT NULL COMMENT '简历id',
  `job_id` int(11) NULL DEFAULT NULL COMMENT '职位id',
  `delivery_time` datetime NULL DEFAULT NULL COMMENT '投递时间',
  `delivery_status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`resume_delivery_record_id`) USING BTREE,
  INDEX `fk_delivery_customer`(`cust_id`) USING BTREE,
  INDEX `fk_delivery_resume`(`resume_id`) USING BTREE,
  INDEX `fk_delivery_job`(`job_id`) USING BTREE,
  CONSTRAINT `fk_delivery_customer` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_delivery_job` FOREIGN KEY (`job_id`) REFERENCES `job` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_delivery_resume` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of resume_delivery_record
-- ----------------------------
INSERT INTO `resume_delivery_record` VALUES (1, 2, 2, 8, '2020-03-17 08:08:44', 0, NULL, NULL);
INSERT INTO `resume_delivery_record` VALUES (2, 2, NULL, 5, '2020-03-17 11:46:02', 0, NULL, NULL);
INSERT INTO `resume_delivery_record` VALUES (3, 2, 1, 7, '2020-03-17 12:23:23', 0, NULL, NULL);
INSERT INTO `resume_delivery_record` VALUES (4, 2, 1, 9, '2020-04-22 11:32:05', 0, NULL, NULL);

-- ----------------------------
-- Table structure for skill
-- ----------------------------
DROP TABLE IF EXISTS `skill`;
CREATE TABLE `skill`  (
  `skill_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专业技能id',
  `resume_id` int(11) NULL DEFAULT NULL COMMENT '简历id',
  `skill_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '专业技能名称',
  `skill_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '专业技能描述',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`skill_id`) USING BTREE,
  INDEX `fk_skill_resume`(`resume_id`) USING BTREE,
  CONSTRAINT `fk_skill_resume` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of skill
-- ----------------------------
INSERT INTO `skill` VALUES (1, 1, 'java', '精通', 0, NULL, NULL);
INSERT INTO `skill` VALUES (2, 1, 'php', '一般', 0, NULL, NULL);
INSERT INTO `skill` VALUES (3, 7, '123', '精通', 1, NULL, NULL);
INSERT INTO `skill` VALUES (4, 7, '123', '一般', 0, NULL, NULL);

-- ----------------------------
-- Table structure for work_experience
-- ----------------------------
DROP TABLE IF EXISTS `work_experience`;
CREATE TABLE `work_experience`  (
  `work_experi_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '工作经验id',
  `resume_id` int(11) NULL DEFAULT NULL COMMENT '简历id',
  `work_start_time` date NULL DEFAULT NULL COMMENT '工作经验开始时间',
  `work_end_time` date NULL DEFAULT NULL COMMENT '工作经验结束时间',
  `work_company_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验所在公司名称',
  `work_position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验工作职位',
  `work_department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验所在部门名称',
  `work_company_scaler` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验公司规模',
  `work_company_property` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验公司性质（外企国企私营等）',
  `work_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验工作描述',
  `work_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工作经验类型',
  `status` int(1) NULL DEFAULT NULL,
  `other1` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `other2` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`work_experi_id`) USING BTREE,
  INDEX `fk_work_resume`(`resume_id`) USING BTREE,
  CONSTRAINT `fk_work_resume` FOREIGN KEY (`resume_id`) REFERENCES `resume` (`resume_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of work_experience
-- ----------------------------
INSERT INTO `work_experience` VALUES (1, 1, '2019-12-28', '2019-12-28', '123', '123', '123', '123', '123', '123456', '123', 0, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
