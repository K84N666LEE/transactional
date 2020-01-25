package com.erp.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.erp.vo.mem_admin;

/*
 *  @ Administrator Mapper
 */
@Resource(name="ds1")
@Repository(value = "adminMapper")
//@Transactional("tm1")
public interface AdminMapper 
{
	public void            admin_update ( mem_admin admin ); // 수정 - 관리자
}