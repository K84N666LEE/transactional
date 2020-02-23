<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<pre>

	Transactional : ${rrr}

	-- 체크

	SELECT * FROM bbs_board WHERE  bbs_num=813;

	-- 복구

	UPDATE bbs_board SET bbs_subject='333333333'                         WHERE  bbs_num=813;
	UPDATE mem_admin SET MAD_TEL='010-0000-0000', MAD_HP='010-1111-1234' WHERE  MAD_NUM=2;

</pre>