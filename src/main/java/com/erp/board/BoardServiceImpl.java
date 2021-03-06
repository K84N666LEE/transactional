package com.erp.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.admin.AdminMapper;
import com.erp.vo.bbs_board;
import com.erp.vo.mem_admin;
import com.erp.vo.ndm_file;

@Service
@Transactional("tm1")
public class BoardServiceImpl implements BoardService  
{
	@Autowired
	private AdminMapper adminMapper;

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void testTransaction(mem_admin admin, bbs_board board) 
	{
		adminMapper.admin_update ( admin );
		boardMapper.update_succ1 ( board );
		boardMapper.update_succ2 ( board );
		boardMapper.update_error ( board );
	}

	@Override
	public int board_total(bbs_board board) {
		return boardMapper.board_total(board);
	}

	@Override
	public void insert_ndm_file(ndm_file ndm) {
		boardMapper.insert_ndm_file(ndm);
	}
}
