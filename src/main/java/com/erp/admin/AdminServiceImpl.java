package com.erp.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.vo.mem_admin;

/*
 *  @ Administrator ServiceImpl
 */
@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public void admin_update(mem_admin admin) {
		adminMapper.admin_update(admin);
	}
}
