package com.erp.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.erp.vo.bbs_board;
import com.erp.vo.ndm_file;

@Resource(name="ds1")
@Repository(value="boardMapper")
public interface BoardMapper 
{
	public void update_succ1    ( bbs_board board );
	public void update_succ2    ( bbs_board board );
	public void update_error    ( bbs_board board );
	public int  board_total     ( bbs_board board );
	public void insert_ndm_file ( ndm_file ndm    );
}