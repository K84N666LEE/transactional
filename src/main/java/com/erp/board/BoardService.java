package com.erp.board;

import com.erp.vo.bbs_board;
import com.erp.vo.mem_admin;

public interface BoardService
{
	public void testTransaction ( mem_admin admin, bbs_board board ); // 1개의 Session 으로 처리
	public int  board_total     (                  bbs_board board );
}
