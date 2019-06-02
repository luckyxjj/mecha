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

 Date: 02/06/2019 14:01:00
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
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '关于我们表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of about
-- ----------------------------
INSERT INTO `about` VALUES (3, '<div style=\"margin:0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		机甲链简介\r\n	</h3>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		隶属于机甲战士科技有限公司旗下的机甲链，是一家致力于科技创新、社交驱动的精选全球优质二手建机、农机（简称：二手机甲）的全新社交物联网服务平台。在坚持“以人为本、存善良心，做善良事”的理念下，为客户提供来自全球精选的优质二手机甲，帮助客户解决找车难、信息不对称、价格不透明、假车多、诚信无保障等诸多关系到客户切身利益问题。同时，通过分享商品给自己的亲戚、朋友、合作伙伴等，能获得与对方更频繁紧密地互动联系，还能多赚钱一份收入。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		在产业领域中，机甲链坚持不懈的三个奋斗目标:“通过社交驱动打造全球二手机甲的无界流通”、“通过科技创新与赋能打造真正具有灵魂的二手机甲与服务”、通过真善美（真诚、善良、美德）去共同创造与分享属于我们每一个平凡人的尊严与非凡价值”。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		在机甲链平台里，尊重每一件商品的物有所值，尊重每一个平凡人的努力付出，珍惜每一份人与人、人与物之间的知心相遇。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		企业文化\r\n	</h3>\r\n	<h4 class=\"bm\" style=\"font-size:30px;color:#F75518;\">\r\n		使命\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		对社会—\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		建立一个有远大抱负、操守自律、勇于创新、智慧管理的科技服务平台。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		对客户—\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		为客户提供准确、有深度、有责任的信息与资源，提供值得信赖的产品与服务。\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		对公司—\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		用真诚、善良、美德去创造与分享属于每一个平凡人的尊严与非凡价值。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		企业价值观\r\n	</h3>\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		客户至上\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		—— 换位思考，客户每一个需求都充满着信任与期待。\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		诚信正直\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		—— 平等对待，正直友善，言行坦荡，让人信赖。\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		拼搏进取\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		—— 乐观向上，勇于创新，唯有比别人更加努力，更加脚踏实地。\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		精神\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		梦在前方，路在脚下。自胜者强，自强者胜。\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		有耕耘才有收获，克难前行，用足迹印证梦想。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		企业愿景\r\n	</h3>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		推动建机·农机产业数字文明，整合优质资源，携手产业各方皆可参与并从中受益。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		平台优势\r\n	</h3>\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		全新社交物联网服务平台开创者\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		和其他电商自主搜索购物场景不同，机甲链代表的是人与人、人与物的匹配场景，通过熟人或合作伙伴之间信任关系来推荐二手机甲，以及了解用户自身对机甲品牌、机型等的偏好或习惯，再过渡到机器算法推荐。并且在购买行为中融入了更浓厚的互动体验，让原本单向、单调的买二手，进化为熟人间的信赖互动推荐购买，和亲密互动拼团，令用户享受具有信赖性而轻松的新零售体验。\r\n	</p>\r\n<br />\r\n<br />\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		提高搜索效率和降低时间成本\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		和其他自主式购物场景相比，为了避免商品琳琅满目，鱼目混杂，大大提高客户搜索效率和挑选时间，机甲链通过供应链中心化，流量社会化的方式，分别在中国及海外严格选定特定数量最为优质的一手货源，智能化主动推荐与精准匹配最具需求客户。\r\n	</p>\r\n<br />\r\n<br />\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		助力供给侧结构性改革\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:24px;text-align:justify;\">\r\n		机甲链通过方以类聚、供应集中化和聚合需求的模式创新，提高二手机甲供给侧输出，加强其透明度和输出效率，可以更快速助力畅通从新车、二手车到报废车的流通渠道，盘活二手车存量，拉动新车消费增量，淘汰老旧车废量，链条式协调推进扩大建机、农机行业消费，进而促进供给侧与需求侧融通，助力国家供给侧结构性改革。同时，积极致力于将优质的中国品牌，通过平台走向世界，为推动中国品牌更好地得到国际认可做出更多贡献。\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 黑体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		合作品牌\r\n	</h3>\r\n</div>\r\n<p style=\"text-align:center;\">\r\n	<span style=\"font-family:SimHei;\"></span><img src=\"http://localhost:8080/upload\\1559454342288zkWyGyOl8x.png\" alt=\"\" /> \r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<span style=\"font-family:SimHei;font-size:24px;background-color:#FFFFFF;\"><strong>严选合作伙伴持续扩大中……</strong></span> \r\n</p>', 0, 1, NULL, NULL, NULL);
INSERT INTO `about` VALUES (4, '<div style=\"margin:0px;padding:0px 100px 0px 40px;font-family:Regular, 方正中等线简体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		Mech-Chain &nbsp;Introductions\r\n	</h3>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Mech-chain, a subsidiary of Mech Pioneer Technology Co., Ltd. It is a Social Internet of Things (SIOT) service platform,which dedicated to technological innovation and social driving, which is a selection of global high-quality second-hand construction machinery and agricultural machinery(second-hand mecha). Adhere to the \"people-oriented, kind-hearted, do good\" concept, to provide high-quality second-hand mecha, help customers to find goods, to get complete information, to get fair price, to get real mecha, to get integrity and other customer cares. Meanwhile, by sharing goods with relatives, friends and partners, to get closer interaction as well as incomes.\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Ultimate goals of Mech-Chain: 1.Establish world class second-hand mecha business by social driving 2.Continuously technical innovation and empowerment for best mecha and corresponding service assurance 3.Win and share dignity and extraordinary value by means of truth, kindness and virtue\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		In Mech-Chain world, we will always care about customer value of each product, respect everyone’s great effort, cherish the close encounter between people and things.\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 方正中等线简体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		Mech-Chain Culture\r\n	</h3>\r\n	<h4 class=\"bm\" style=\"font-size:30px;color:#F75518;\">\r\n		Mission\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		For society——\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Establish technological service platform with grand ambition, self-discipline, innovation and intelligent.\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		For customer——\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Delivery accurate, in-depth and accountable information and resource for best product and service.\r\n	</p>\r\n<br />\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		For company——\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Win and share dignity and extraordinary value by means of truth, kindness and virtue.\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 方正中等线简体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		Mech-Chain Values\r\n	</h3>\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		Customer orientation\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		—— Focus on customer care, make every business be full of trust and expectation.\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		Integrity\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		—— Equal treatment, integrity and be friendly, keep words and deeds magnanimous, be trustworthy.\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		Enterprising spirit\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		—— Positive and aggressive for innovation, be harder and more proactive for a better world.\r\n	</p>\r\n<br />\r\n	<h4 style=\"font-size:30px;color:#F75518;\">\r\n		Belief\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Be always on the way to realize the dream; To be a victory with continuous self-improvement.\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		No pains, no gains.\r\n	</p>\r\n</div>\r\n<div style=\"margin:85px 0px 0px;padding:0px 100px 0px 40px;font-family:Regular, 方正中等线简体;font-size:medium;\">\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		Mech-Chain Vision\r\n	</h3>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Promote the digital civilization of Construction Machinery and Agricultural Machinery industry, connect high-quality resources with stakeholders in the industry for sustainable profitability.\r\n	</p>\r\n</div>\r\n<p>\r\n	<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n		Advantages of Mech-Chain\r\n	</h3>\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		The pioneer of a new mecha service platform for social internet of things\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Different from autonomously search scene of other e-commerce platform, Mech-Chain represents the matching scene between people and things. It realize second-hand mecha business by close and trust relationship between acquaintances or partners, by understanding of users\' preferences or behaviors on mecha brands and types, and then by means of recommendation of algorithm model. Instead of one-way and monotonous business model, Mech-Chain provide in-depth interaction between people and things for better experience, initiative a new mecha business model with acquaintances’ trust and recommendation as well as group purchasing.\r\n	</p>\r\n<br />\r\n<br />\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		Efficient time-cost for products searching\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		Instead of traditional e-commerce business scene and for the purpose to simplify products selection, great improvements have been done by Mech-Chain. For instance, by means of supply chain unification and data flow socialization, Mech-Chain strictly select high-quality products both from domestic and oversea market. Then provide the most propriate products and solutions to customer by means of intelligent algorithm.\r\n	</p>\r\n<br />\r\n<br />\r\n	<h4 class=\"sm\" style=\"font-size:27px;color:#F75518;\">\r\n		Contribute to supply-side structural reform\r\n	</h4>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		With innovation of product classification, supply chain centralization and market requirement unification, Mech-Chain dedicate to optimize mecha supply relationship to ensure product information transparency and business efficiency. New business model help customer to accelerate mecha life-cycle management with circulation from new to second-hand and then to discarded, result in the increase of new mecha and the activation of second-hand mecha storage and the elimination of discarded mecha. With such significant contribution, Mech-Chain will relentlessly promote the consumption of Construction Machinery and Agricultural Machinery, and contribute to state supply-side structural reform. Meanwhile, Mech-Chain will keep connection with the world as China advanced brand, to offer excellent product and service to customers.\r\n	</p>\r\n	<p style=\"color:#5C5C5C;font-size:23px;text-align:justify;\">\r\n		<br />\r\n	</p>\r\n</p>\r\n<p>\r\n	<br />\r\n</p>\r\n<h3 class=\"p-r\" style=\"font-size:32px;font-weight:normal;background-color:#F75518;color:white;text-align:center;\">\r\n	Cooperation Brand\r\n</h3>\r\n<p style=\"text-align:center;\">\r\n	<img src=\"http://localhost:8080/upload\\1559454811922Z1UOhZ5nkH.png\" alt=\"\" /> \r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<span style=\"font-family:Regular, 方正中等线简体;font-size:23px;background-color:#FFFFFF;\">High entry level for partner, continuous growth of team member…</span> \r\n</p>\r\n<p style=\"text-align:center;\">\r\n	<br />\r\n</p>\r\n<p>\r\n	<br />\r\n</p>', 1, 1, NULL, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '管理员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'E10ADC3949BA59ABBE56E057F20F883E', '', NULL, 1, 1, NULL, '2019-05-26 20:10:09', '2019-06-02 12:49:17');

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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '轮播图表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES (1, '首页banner', 'upload\\1559454199207YF9u8QuOg7.png', 'upload\\1559453946086VYmcJjv48Q.png', '1212', 1, 1, NULL, NULL, '2019-06-02 13:43:19');
INSERT INTO `banner` VALUES (2, '关于我们banner', 'upload\\1559260031415uuTX71tYNP.png', 'upload\\15592600314195dszb5OY6n.png', '1', 2, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:47:11');
INSERT INTO `banner` VALUES (3, '事业内容架构banner', 'upload\\1559260006494jykzEaPIbv.png', 'upload\\1559260006498YUJn0eCpyX.png', '1', 3, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:46:46');
INSERT INTO `banner` VALUES (4, '买机甲banner', 'upload\\1559259961427wheDInDLB1.png', 'upload\\1559259961439YgIe1A5FzP.png', '', 4, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:46:01');
INSERT INTO `banner` VALUES (5, '卖机甲banner', 'upload\\1559259919527kN3nQgra7J.png', 'upload\\1559259919532LV1Bis6qyb.png', '1', 5, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:45:19');
INSERT INTO `banner` VALUES (6, '商城入口banner', 'upload\\1559259751033NM05WOju1F.png', 'upload\\1559259751037gQiyJmTJS1.png', '1', 6, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:42:31');
INSERT INTO `banner` VALUES (7, '创客达人banner', 'upload\\1559259785776pC7tPC1OQm.png', 'upload\\1559259785797RPcJDZaXbf.png', '1', 7, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:43:05');
INSERT INTO `banner` VALUES (8, '服务保障banner', 'upload\\1559259810785vufSPhNhUR.png', 'upload\\15592598107900DEaM5nhcL.png', '1', 8, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:43:30');
INSERT INTO `banner` VALUES (9, '咨询服务banner', 'upload\\1559259862964j2cldHHWvE.png', 'upload\\1559259862970lkv3wS0GFP.png', '1', 9, 1, NULL, '2019-05-26 15:16:56', '2019-05-31 07:44:22');

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name_cn` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '中文品牌名称',
  `name_en` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '英文品牌名称',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '品牌表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of brand
-- ----------------------------
INSERT INTO `brand` VALUES (1, '小松', 'xiaosong', 1, NULL, '2019-05-26 17:16:31', '2019-06-01 23:36:47');
INSERT INTO `brand` VALUES (2, '日立', 'rili', 0, NULL, '2019-06-01 23:37:08', '2019-06-02 11:08:09');
INSERT INTO `brand` VALUES (5, '其他', 'other', 1, NULL, '2019-06-02 11:14:15', '2019-06-02 11:14:15');

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
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '买机甲表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of buying
-- ----------------------------
INSERT INTO `buying` VALUES (1, 'qqq', 0, NULL, '2019-05-26 13:32:14', '2019-05-31 23:16:27');
INSERT INTO `buying` VALUES (2, 'ooo', 1, '43243499', '2019-05-26 13:34:03', '2019-06-01 18:15:41');
INSERT INTO `buying` VALUES (3, 'hhhhh', 1, NULL, '2019-05-26 13:44:27', '2019-05-26 13:44:27');
INSERT INTO `buying` VALUES (4, '123456+', 1, NULL, '2019-05-27 23:21:27', '2019-05-27 23:21:27');
INSERT INTO `buying` VALUES (5, '4444', 1, NULL, '2019-05-27 23:25:52', '2019-05-27 23:25:52');
INSERT INTO `buying` VALUES (6, '222', 1, NULL, '2019-05-27 23:27:42', '2019-05-27 23:27:42');
INSERT INTO `buying` VALUES (7, '333', 1, NULL, '2019-05-27 23:28:50', '2019-05-27 23:28:50');
INSERT INTO `buying` VALUES (8, '111', 1, NULL, '2019-05-27 23:29:11', '2019-05-27 23:29:11');
INSERT INTO `buying` VALUES (9, 'aaa', 1, NULL, '2019-05-27 23:30:06', '2019-05-27 23:30:06');
INSERT INTO `buying` VALUES (10, 'affff', 0, NULL, '2019-05-27 23:39:45', '2019-05-31 23:15:44');
INSERT INTO `buying` VALUES (11, 'affff', 0, NULL, '2019-05-27 23:39:50', '2019-05-31 23:16:07');
INSERT INTO `buying` VALUES (12, 'affff', 0, NULL, '2019-05-27 23:39:59', '2019-05-31 23:18:27');
INSERT INTO `buying` VALUES (13, 'affff', 0, NULL, '2019-05-27 23:40:01', '2019-05-31 23:16:32');
INSERT INTO `buying` VALUES (14, '999', 1, NULL, '2019-05-27 23:41:33', '2019-05-27 23:41:33');
INSERT INTO `buying` VALUES (15, '9999', 1, '666', '2019-05-27 23:45:59', '2019-06-02 11:26:47');
INSERT INTO `buying` VALUES (16, '6633', 1, NULL, '2019-05-27 23:48:27', '2019-05-27 23:48:27');
INSERT INTO `buying` VALUES (17, '9999', 1, NULL, '2019-05-27 23:56:39', '2019-05-27 23:56:39');
INSERT INTO `buying` VALUES (18, 'jj', 1, NULL, '2019-05-27 23:57:11', '2019-05-27 23:57:11');
INSERT INTO `buying` VALUES (19, 'sss', 1, NULL, '2019-05-27 23:58:37', '2019-05-27 23:58:37');
INSERT INTO `buying` VALUES (20, 'fd', 1, NULL, '2019-05-27 23:58:53', '2019-05-27 23:58:53');
INSERT INTO `buying` VALUES (21, '额', 1, NULL, '2019-05-28 00:00:05', '2019-05-28 00:00:05');
INSERT INTO `buying` VALUES (22, '999', 1, NULL, '2019-05-30 23:28:51', '2019-05-30 23:28:51');
INSERT INTO `buying` VALUES (23, '866', 1, NULL, '2019-05-30 23:33:51', '2019-05-30 23:33:51');
INSERT INTO `buying` VALUES (24, '8555', 1, NULL, '2019-06-02 13:44:28', '2019-06-02 13:44:28');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name_cn` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '中文分类名称',
  `name_en` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '英文分类名称',
  `delete_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '删除状态 0：删除 1：正常',
  `flag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '挖掘机', 'wajueji', 1, NULL, '2019-05-26 17:05:35', '2019-06-01 23:37:49');
INSERT INTO `category` VALUES (2, '装载机', 'zhaungzaiji', 1, NULL, '2019-06-01 23:38:08', '2019-06-01 23:38:08');
INSERT INTO `category` VALUES (3, '叉车', 'chache', 1, NULL, '2019-06-01 23:38:18', '2019-06-01 23:38:18');
INSERT INTO `category` VALUES (6, '其他', 'other', 1, NULL, '2019-06-02 00:49:16', '2019-06-02 13:10:30');

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
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '机甲设备发布表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of issue
-- ----------------------------
INSERT INTO `issue` VALUES (6, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, '3344', '2019-05-31 07:39:53', '2019-06-01 18:00:00');
INSERT INTO `issue` VALUES (7, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, NULL, '2019-05-31 07:39:53', '2019-05-31 07:39:53');
INSERT INTO `issue` VALUES (8, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, NULL, '2019-05-31 07:39:53', '2019-05-31 07:39:53');
INSERT INTO `issue` VALUES (9, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, NULL, '2019-05-31 07:39:53', '2019-05-31 07:39:53');
INSERT INTO `issue` VALUES (10, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, NULL, '2019-05-31 07:39:53', '2019-06-02 11:36:53');
INSERT INTO `issue` VALUES (11, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, NULL, '2019-05-31 07:39:53', '2019-06-02 11:36:51');
INSERT INTO `issue` VALUES (12, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, NULL, '2019-05-31 07:39:53', '2019-05-31 07:39:53');
INSERT INTO `issue` VALUES (13, 'test', 'tttt', '11', '北京市', '北京市', '东城区', NULL, 22.00, '2019-05-08 00:00:00', 'upload\\1559259593806bdyDBFtCtS.png,upload\\1559259593814d0KB9bIdmB.png,upload\\1559259593818Rdmg7lyiUw.png', '77', 1, '44', '55', '66', '33', 0, 1, '666', '2019-05-31 07:39:53', '2019-06-02 11:36:03');
INSERT INTO `issue` VALUES (14, 'test', 'tttt', 'rewrr', '北京市', '北京市', '东城区', NULL, 5222.00, '2019-06-14 00:00:00', 'upload\\1559380083617GvAcbwDG7S.png,upload\\15593800836247hNkP0gQKQ.png,upload\\1559380083627BdIimhbwcP.png,upload\\1559380083631RX59ESOknh.png,upload\\15593800836342W9Kb2i9vJ.png,upload\\1559380083638ILXQAt4bCe.png,upload\\1559380083642xDyvoJ9YpD.png', 'xjj', 0, '13000000000', '22', 'ee', 'fdddf', 0, 0, NULL, '2019-06-01 17:08:03', '2019-06-02 11:35:52');
INSERT INTO `issue` VALUES (15, '装载机', '小松', 'TTTT', '福建省', '厦门市', '集美区', '', 10000.00, '2019-06-12 00:00:00', 'upload\\15594520874233oUdL44qFY.png,upload\\1559452087442FNIWiWyMq1.png,upload\\1559452087479VB7S75qtnC.png,upload\\1559452087485J5hMdXUbTm.png,upload\\1559452087489ncOKdvmzsW.png,upload\\1559452087496a6sxigooNB.png,upload\\1559452087507hPCyHPfKDI.png', '幸建建', 0, '13055518106', '1234@qq.com', 'lucky', '马力杠杠的', 0, 1, '222', '2019-06-02 13:08:07', '2019-06-02 13:08:59');

SET FOREIGN_KEY_CHECKS = 1;
