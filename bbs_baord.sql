
-- bbs_board

CREATE TABLE IF NOT EXISTS `bbs_board` (
  `bbs_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '일련번호',
  `bbs_parent` int(11) NOT NULL DEFAULT 0 COMMENT '댓글번호',
  `bbs_depth` int(3) NOT NULL DEFAULT 0 COMMENT '뎃글순서',
  `bbs_sortno` int(11) NOT NULL DEFAULT 1 COMMENT '정렬순서',
  `bbs_code` char(11) DEFAULT NULL COMMENT '게시판코드',
  `bbs_type` int(11) DEFAULT NULL COMMENT '대분류',
  `bbs_part` int(11) DEFAULT NULL COMMENT '중분류',
  `bbs_cat1` int(11) DEFAULT NULL,
  `bbs_cat2` int(11) DEFAULT NULL,
  `bbs_permit` char(1) DEFAULT NULL COMMENT '게시글허가',
  `bbs_top` char(1) DEFAULT NULL COMMENT 'TOP',
  `bbs_name` varchar(98) DEFAULT NULL COMMENT '작성자',
  `bbs_subject` varchar(255) DEFAULT NULL COMMENT '제목',
  `bbs_contents` text DEFAULT NULL COMMENT '내용',
  `bbs_email` varchar(50) DEFAULT NULL COMMENT '이메일',
  `bbs_homepage` varchar(98) DEFAULT NULL COMMENT '홈페이지',
  `bbs_secure` char(1) DEFAULT NULL COMMENT '비밀글',
  `bbs_vote` int(8) NOT NULL DEFAULT 0 COMMENT '추천',
  `bbs_img_url` varchar(98) DEFAULT NULL COMMENT '이미지URL',
  `bbs_count` int(8) NOT NULL DEFAULT 0 COMMENT '조회수',
  `bbs_ip` varchar(15) DEFAULT NULL COMMENT '접근IP',
  `bbs_id` varchar(20) DEFAULT NULL COMMENT '입력ID',
  `bbs_pass` varchar(20) DEFAULT NULL COMMENT '암호',
  `bbs_check` char(1) DEFAULT NULL COMMENT '글체크',
  `bbs_sdate` datetime DEFAULT NULL COMMENT '입력일',
  `bbs_edate` datetime DEFAULT NULL COMMENT '수정일',
  `bbs_rmk` char(1) DEFAULT NULL COMMENT '비고',
  PRIMARY KEY (`bbs_num`),
  KEY `bbs_code` (`bbs_code`),
  KEY `idx_top` (`bbs_depth`,`bbs_code`,`bbs_top`),
  KEY `bbs_sortno` (`bbs_sortno`),
  KEY `bbs_type` (`bbs_type`),
  KEY `bbs_permit` (`bbs_permit`),
  KEY `bbs_secure` (`bbs_secure`),
  KEY `bbs_count` (`bbs_count`),
  KEY `bbs_id_2` (`bbs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='기본게시판';


INSERT INTO `bbs_board` (`bbs_num`, `bbs_parent`, `bbs_depth`, `bbs_sortno`, `bbs_code`, `bbs_type`, `bbs_part`, `bbs_cat1`, `bbs_cat2`, `bbs_permit`, `bbs_top`, `bbs_name`, `bbs_subject`, `bbs_contents`, `bbs_email`, `bbs_homepage`, `bbs_secure`, `bbs_vote`, `bbs_img_url`, `bbs_count`, `bbs_ip`, `bbs_id`, `bbs_pass`, `bbs_check`, `bbs_sdate`, `bbs_edate`, `bbs_rmk`) VALUES
	(813, 0, 0, 0, 'java', 50, 110, 0, 0, 'Y', 'N', '관리자', '@@나오면안되지만@@', '@@@@@', NULL, NULL, NULL, 0, NULL, 31, '127.0.0.1', 'admin', NULL, NULL, '2018-10-15 00:20:54', '2018-10-15 00:20:54', NULL),
	(818, 0, 0, 0, 'java', 2, 12, 0, 0, 'Y', 'N', '관리자', '222222222222', '<p>111111111111111111111</p>\r\n', NULL, NULL, NULL, 0, NULL, 0, '127.0.0.1', 'admin', NULL, NULL, '2020-01-19 13:18:44', '2020-01-19 13:18:44', NULL);
