package com.erp.board;

import com.erp.vo.bbs_board;
import com.erp.vo.mem_admin;
import com.erp.vo.ndm_file;

public interface BoardService
{
	public void testTransaction ( mem_admin admin, bbs_board board );
	public int  board_total     (                  bbs_board board );
	public void insert_ndm_file ( ndm_file ndm);
}
