/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : db_mecha

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 30/05/2019 07:57:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for about
-- ----------------------------
DROP TABLE IF EXISTS `about`;
CREATE TABLE `about`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(15000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '内容',
  `type` tinyint(4) NOT NULL DEFAULT 0 COMMENT '类型 0：中文 1：英文',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '关于我们表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of about
-- ----------------------------
INSERT INTO `about` VALUES (3, '<div style=\"margin:0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		机甲链简介\r\n	</h3>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		隶属于机甲战士科技有限公司旗下的机甲链，是一家致力于科技创新、社交驱动的精选全球优质二手建机、农机（简称：二手机甲）的全新社交物联网服务平台。在坚持“以人为本、存善良心，做善良事”的理念下，为客户提供来自全球精选的优质二手机甲，帮助客户解决找车难、信息不对称、价格不透明、假车多、诚信无保障等诸多关系到客户切身利益问题。同时，通过分享商品给自己的亲戚、朋友、合作伙伴等，能获得与对方更频繁紧密地互动联系，还能多赚钱一份收入。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		在产业领域中，机甲链坚持不懈的三个奋斗目标:“通过社交驱动打造全球二手机甲的无界流通”、“通过科技创新与赋能打造真正具有灵魂的二手机甲与服务”、通过真善美（真诚、善良、美德）去共同创造与分享属于我们每一个平凡人的尊严与非凡价值”。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		在机甲链平台里，尊重每一件商品的物有所值，尊重每一个平凡人的努力付出，珍惜每一份人与人、人与物之间的知心相遇。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		企业文化\r\n	</h3>\r\n	<h4 class=\"bm\" style=\"font-size:30px;color:#F75518;\">\r\n		使命\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		对社会—\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		建立一个有远大抱负、操守自律、勇于创新、智慧管理的科技服务平台。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		对客户—\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		为客户提供准确、有深度、有责任的信息与资源，提供值得信赖的产品与服务。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		对公司—\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		用真诚、善良、美德去创造与分享属于每一个平凡人的尊严与非凡价值。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		企业价值观\r\n	</h3>\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		客户至上\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		—— 换位思考，客户每一个需求都充满着信任与期待。\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		诚信正直\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		—— 平等对待，正直友善，言行坦荡，让人信赖。\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		拼搏进取\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		—— 乐观向上，勇于创新，唯有比别人更加努力，更加脚踏实地。\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		精神\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		梦在前方，路在脚下。自胜者强，自强者胜。\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		有耕耘才有收获，克难前行，用足迹印证梦想。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		企业愿景\r\n	</h3>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		推动建机·农机产业数字文明，整合优质资源，携手产业各方皆可参与并从中受益。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		平台优势\r\n	</h3>\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		全新社交物联网服务平台开创者\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		和其他电商自主搜索购物场景不同，机甲链代表的是人与人、人与物的匹配场景，通过熟人或合作伙伴之间信任关系来推荐二手机甲，以及了解用户自身对机甲品牌、机型等的偏好或习惯，再过渡到机器算法推荐。并且在购买行为中融入了更浓厚的互动体验，让原本单向、单调的买二手，进化为熟人间的信赖互动推荐购买，和亲密互动拼团，令用户享受具有信赖性而轻松的新零售体验。\r\n	</p>\r\n<br />\r\n<br />\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		提高搜索效率和降低时间成本\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		和其他自主式购物场景相比，为了避免商品琳琅满目，鱼目混杂，大大提高客户搜索效率和挑选时间，机甲链通过供应链中心化，流量社会化的方式，分别在中国及海外严格选定特定数量最为优质的一手货源，智能化主动推荐与精准匹配最具需求客户。\r\n	</p>\r\n<br />\r\n<br />\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		助力供给侧结构性改革\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		机甲链通过方以类聚、供应集中化和聚合需求的模式创新，提高二手机甲供给侧输出，加强其透明度和输出效率，可以更快速助力畅通从新车、二手车到报废车的流通渠道，盘活二手车存量，拉动新车消费增量，淘汰老旧车废量，链条式协调推进扩大建机、农机行业消费，进而促进供给侧与需求侧融通，助力国家供给侧结构性改革。同时，积极致力于将优质的中国品牌，通过平台走向世界，为推动中国品牌更好地得到国际认可做出更多贡献。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		合作品牌\r\n	</h3>\r\n</div>\r\n<div>\r\n	<br />\r\n</div>', 0, 1, NULL, '2019-05-27 00:25:36', '2019-05-27 22:20:29');
INSERT INTO `about` VALUES (4, 'content', 1, 1, NULL, '2019-05-27 00:25:45', '2019-05-27 00:25:45');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '密码',
  `salt` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '盐值',
  `last_login` datetime(0) NULL DEFAULT NULL COMMENT '最后一次登录时间',
  `type` tinyint(4) NOT NULL DEFAULT 1 COMMENT '角色 0：超级管理员 1：普通用户',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '管理员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'lucky', 'D0970714757783E6CF17B26FB8E2298F', '', NULL, 1, 1, NULL, '2019-05-26 20:10:09', '2019-05-26 20:10:09');

-- ----------------------------
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '名称',
  `url_cn` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '中文链接',
  `url_en` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '英文链接',
  `run_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '跳转路径',
  `type` tinyint(255) NOT NULL COMMENT '类型 1：首页 2：关于我们 3：事业内容架构 4：买机甲 5：卖机甲 6：商城入口 7：创客达人招募 8：服务保障 9：咨询服务',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '轮播图表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES (1, '首页banner', 'upload\\1559141643237RU2wI8Nypd.png', 'upload\\1559141643278tghPmOrhul.png', '1212', 1, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 23:59:24');
INSERT INTO `banner` VALUES (2, '关于我们banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 2, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:11');
INSERT INTO `banner` VALUES (3, '事业内容架构banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 3, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:12');
INSERT INTO `banner` VALUES (4, '买机甲banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '', 4, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:24:29');
INSERT INTO `banner` VALUES (5, '卖机甲banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 5, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:13');
INSERT INTO `banner` VALUES (6, '商城入口banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 6, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:15');
INSERT INTO `banner` VALUES (7, '创客达人banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 7, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:16');
INSERT INTO `banner` VALUES (8, '服务保障banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 8, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:18');
INSERT INTO `banner` VALUES (9, '咨询服务banner', '\\upload\\1559086659378NMTQMruiLI.png', '\\upload\\1559086659378NMTQMruiLI.png', '1', 9, 1, NULL, '2019-05-26 15:16:56', '2019-05-29 21:26:19');

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '品牌名称',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '品牌表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES (1, 'tttt', 1, NULL, '2019-05-26 17:16:31', '2019-05-26 17:16:31');

-- ----------------------------
-- Table structure for buying
-- ----------------------------
DROP TABLE IF EXISTS `buying`;
CREATE TABLE `buying`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `contact` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '联系方式',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '买机甲表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of buying
-- ----------------------------
INSERT INTO `buying` VALUES (1, 'qqq', 1, NULL, '2019-05-26 13:32:14', '2019-05-26 13:32:14');
INSERT INTO `buying` VALUES (2, 'ooo', 1, NULL, '2019-05-26 13:34:03', '2019-05-26 13:34:03');
INSERT INTO `buying` VALUES (3, 'hhhhh', 1, NULL, '2019-05-26 13:44:27', '2019-05-26 13:44:27');
INSERT INTO `buying` VALUES (4, '123456+', 1, NULL, '2019-05-27 23:21:27', '2019-05-27 23:21:27');
INSERT INTO `buying` VALUES (5, '4444', 1, NULL, '2019-05-27 23:25:52', '2019-05-27 23:25:52');
INSERT INTO `buying` VALUES (6, '222', 1, NULL, '2019-05-27 23:27:42', '2019-05-27 23:27:42');
INSERT INTO `buying` VALUES (7, '333', 1, NULL, '2019-05-27 23:28:50', '2019-05-27 23:28:50');
INSERT INTO `buying` VALUES (8, '111', 1, NULL, '2019-05-27 23:29:11', '2019-05-27 23:29:11');
INSERT INTO `buying` VALUES (9, 'aaa', 1, NULL, '2019-05-27 23:30:06', '2019-05-27 23:30:06');
INSERT INTO `buying` VALUES (10, 'affff', 1, NULL, '2019-05-27 23:39:45', '2019-05-27 23:39:45');
INSERT INTO `buying` VALUES (11, 'affff', 1, NULL, '2019-05-27 23:39:50', '2019-05-27 23:39:50');
INSERT INTO `buying` VALUES (12, 'affff', 1, NULL, '2019-05-27 23:39:59', '2019-05-27 23:39:59');
INSERT INTO `buying` VALUES (13, 'affff', 1, NULL, '2019-05-27 23:40:01', '2019-05-27 23:40:01');
INSERT INTO `buying` VALUES (14, '999', 1, NULL, '2019-05-27 23:41:33', '2019-05-27 23:41:33');
INSERT INTO `buying` VALUES (15, '9999', 1, NULL, '2019-05-27 23:45:59', '2019-05-27 23:45:59');
INSERT INTO `buying` VALUES (16, '6633', 1, NULL, '2019-05-27 23:48:27', '2019-05-27 23:48:27');
INSERT INTO `buying` VALUES (17, '9999', 1, NULL, '2019-05-27 23:56:39', '2019-05-27 23:56:39');
INSERT INTO `buying` VALUES (18, 'jj', 1, NULL, '2019-05-27 23:57:11', '2019-05-27 23:57:11');
INSERT INTO `buying` VALUES (19, 'sss', 1, NULL, '2019-05-27 23:58:37', '2019-05-27 23:58:37');
INSERT INTO `buying` VALUES (20, 'fd', 1, NULL, '2019-05-27 23:58:53', '2019-05-27 23:58:53');
INSERT INTO `buying` VALUES (21, '额', 1, NULL, '2019-05-28 00:00:05', '2019-05-28 00:00:05');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '分类名称',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'test', 1, NULL, '2019-05-26 17:05:35', '2019-05-26 17:05:35');

-- ----------------------------
-- Table structure for counseling
-- ----------------------------
DROP TABLE IF EXISTS `counseling`;
CREATE TABLE `counseling`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(5000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '内容',
  `type` tinyint(4) NOT NULL DEFAULT 0 COMMENT '类型 0：中文 1：英文',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '咨询服务表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of counseling
-- ----------------------------
INSERT INTO `counseling` VALUES (1, '<p>\r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		咨询电话：+86 18558919898\r\n	</p>\r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		<br />\r\n	</p>\r\n<span style=\"font-family:微软雅黑;font-size:0px;background-color:#FFFFFF;\">&nbsp;</span> \r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		需求服务：service@mech-chain.com\r\n	</p>\r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		<br />\r\n	</p>\r\n<span style=\"font-family:微软雅黑;font-size:0px;background-color:#FFFFFF;\"></span> \r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		微信咨询：taojijia\r\n	</p>\r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		<br />\r\n	</p>\r\n<span style=\"font-family:微软雅黑;font-size:0px;background-color:#FFFFFF;\">&nbsp;</span> \r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		战略合作：robin@mech-chain.com\r\n	</p>\r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		<br />\r\n	</p>\r\n<span style=\"font-family:微软雅黑;font-size:0px;background-color:#FFFFFF;\"></span> \r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		腾讯QQ：1067491265\r\n	</p>\r\n	<p style=\"font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		<br />\r\n	</p>\r\n<span style=\"font-family:微软雅黑;font-size:0px;background-color:#FFFFFF;\">&nbsp;</span> \r\n	<div class=\"d-ib\" style=\"margin:0px;padding:0px;font-size:30px;font-family:微软雅黑;background-color:#FFFFFF;\">\r\n		总部地址：中国龙岩经济技术开发区\r\n	</div>\r\n</p>', 0, 1, NULL, '2019-05-27 22:45:14', '2019-05-27 23:05:30');
INSERT INTO `counseling` VALUES (2, 'English', 1, 1, NULL, '2019-05-27 22:45:28', '2019-05-27 22:45:28');

-- ----------------------------
-- Table structure for issue
-- ----------------------------
DROP TABLE IF EXISTS `issue`;
CREATE TABLE `issue`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '分类名称',
  `brand_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '品牌名称',
  `unit_type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '设备型号',
  `province` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '省',
  `city` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '市',
  `district` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '区',
  `address` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '' COMMENT '详细地址',
  `expected_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '期望价格',
  `delivery_time` datetime(0) NULL DEFAULT NULL COMMENT '出厂年限',
  `img_url` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '车辆图片',
  `linkman` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '联系人',
  `sex` tinyint(4) NOT NULL DEFAULT 0 COMMENT '性别 0：男 1：女',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `mail` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `wechat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '微信',
  `using_experience` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '使用经历',
  `status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '审核状态 0 ：未审核 1：已审核',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '机甲设备发布表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of issue
-- ----------------------------
INSERT INTO `issue` VALUES (1, 'test', 'tttt', '11', '北京市', '北京市', '请选择使用县', NULL, 100.00, '2019-05-28 00:00:00', 'D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559058337445Bm6VOB0yL6.png', '88', 0, '111222', '122', '999', '9999', 0, 1, NULL, '2019-05-28 23:45:45', '2019-05-28 23:45:45');
INSERT INTO `issue` VALUES (2, 'test', 'tttt', 'ttt', '北京市', '北京市', '请选择使用县', NULL, 500.00, '2019-05-22 00:00:00', 'D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559059823049RYp8Fgg6Qc.png,D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\15590598669397lIN0ETNsX.png,D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\15590599032340B2U6lIOEd.png', 'eee', 0, '888', '99', '552', 'retre', 0, 1, NULL, '2019-05-29 00:12:24', '2019-05-29 00:12:24');
INSERT INTO `issue` VALUES (3, 'test', 'tttt', 'ttt', '北京市', '北京市', '请选择使用县', NULL, 500.00, '2019-05-22 00:00:00', 'D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559060107977hbthF9lgBc.png,D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\15590601086390T2ZNVM1Zk.png,D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559060109247kuTtczBqFP.png', 'eee', 0, '888', '99', '552', 'retre', 0, 1, NULL, '2019-05-29 00:15:27', '2019-05-29 00:15:27');
INSERT INTO `issue` VALUES (4, 'test', 'tttt', 'fs', '山西省', '朔州市', '山阴县', NULL, 522.00, '2019-05-16 00:00:00', 'D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559086096401WRVv3mbEAe.png,D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559086099502DoFuJn0zbX.png', '88555', 1, '13055555555', '22', 'ff', 'fds', 0, 1, NULL, '2019-05-29 07:28:21', '2019-05-29 07:28:21');
INSERT INTO `issue` VALUES (5, 'test', 'tttt', 'dsad', '北京市', '北京市', '东城区', NULL, 200.00, '2019-05-03 00:00:00', 'D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559086659365LRbDccN6Bz.png,D:\\ideaProject\\mecha\\src\\main\\webapp\\upload\\1559086659378NMTQMruiLI.png', 'sd', 0, '333', 's', 'dd', 'fdsa', 0, 1, NULL, '2019-05-29 07:37:43', '2019-05-29 07:37:43');

SET FOREIGN_KEY_CHECKS = 1;
