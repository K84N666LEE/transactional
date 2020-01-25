package com.erp.vo;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class bbs_board implements Serializable  
{
	/*
	 *  Serialization
	 */
	private static final long serialVersionUID = 1L;

	/*
	 *  BOARD MAIN FIELD
	 */
	private int    bbs_num       ;
	private int    bbs_parent    ;
	private int    bbs_depth     ;
	private int    bbs_sortno    ;
	private String bbs_code      ;
	private int    bbs_type      ;
	private int    bbs_part      ;
	private int    bbs_cat1      ;
	private int    bbs_cat2      ;
	private String bbs_permit    ;
	private String bbs_top       ;
	private String bbs_name      ;
	private String bbs_subject   ;
	private String bbs_contents  ;
	private String bbs_email     ;
	private String bbs_homepage  ;
	private String bbs_secure    ;
	private String bbs_vote      ;
	private String bbs_img_url   ;
	private String bbs_count     ;
	private String bbs_ip        ;
	private String bbs_id        ;
	private String bbs_pass      ;
	private String bbs_check     ;
	private String bbs_sdate     ;
	private String bbs_edate     ;
	private String bbs_rmk       ;
	
	/*
	 *  BOARD - CONVER
	 */
	private String bbs_tel       ;
	public String getBbs_tel() {
		return bbs_tel;
	}
	public void setBbs_tel(String bbs_tel) {
		this.bbs_tel = bbs_tel;
	}
	private String txt_type      ;
	private String txt_part      ;
	private String txt_cat1      ;
	private String txt_cat2      ;

	/*
	 *  BOARD - FILE
	 */
	private int    mna_num      ; // 
	private int    mno_num_key  ; // 
	private String mna_type     ; // 
	private String mna_part     ; // 
	private int    mna_position ; // 
	private String mna_view     ; // 
	private String mna_file     ; // 
	private String mna_file_org ; // 
	private String mna_text     ; // 
	private String mna_create_u ; // 
	private String mna_create_d ; // 
	private String mna_update_u ; // 
	private String mna_update_d ; // 
	private String mna_rmk      ; // 
	
	/*
	 *  BOARD - INFOMATION
	 */
	public int getBbs_num() {
		return bbs_num;
	}
	public void setBbs_num(int bbs_num) {
		this.bbs_num = bbs_num;
	}
	public int getBbs_parent() {
		return bbs_parent;
	}
	public void setBbs_parent(int bbs_parent) {
		this.bbs_parent = bbs_parent;
	}
	public int getBbs_depth() {
		return bbs_depth;
	}
	public void setBbs_depth(int bbs_depth) {
		this.bbs_depth = bbs_depth;
	}
	public int getBbs_sortno() {
		return bbs_sortno;
	}
	public void setBbs_sortno(int bbs_sortno) {
		this.bbs_sortno = bbs_sortno;
	}
	public String getBbs_code() {
		return bbs_code;
	}
	public void setBbs_code(String bbs_code) {
		this.bbs_code = bbs_code;
	}
	public int getBbs_type() {
		return bbs_type;
	}
	public void setBbs_type(int bbs_type) {
		this.bbs_type = bbs_type;
	}
	public int getBbs_part() {
		return bbs_part;
	}
	public void setBbs_part(int bbs_part) {
		this.bbs_part = bbs_part;
	}
	public int getBbs_cat1() {
		return bbs_cat1;
	}
	public void setBbs_cat1(int bbs_cat1) {
		this.bbs_cat1 = bbs_cat1;
	}
	public int getBbs_cat2() {
		return bbs_cat2;
	}
	public void setBbs_cat2(int bbs_cat2) {
		this.bbs_cat2 = bbs_cat2;
	}
	public String getBbs_permit() {
		return bbs_permit;
	}
	public void setBbs_permit(String bbs_permit) {
		this.bbs_permit = bbs_permit;
	}
	public String getBbs_top() {
		return bbs_top;
	}
	public void setBbs_top(String bbs_top) {
		this.bbs_top = bbs_top;
	}
	public String getBbs_name() {
		return bbs_name;
	}
	public void setBbs_name(String bbs_name) {
		this.bbs_name = bbs_name;
	}
	public String getBbs_subject() {
		return bbs_subject;
	}
	public void setBbs_subject(String bbs_subject) {
		this.bbs_subject = bbs_subject;
	}
	public String getBbs_contents() {
		return bbs_contents;
	}
	public void setBbs_contents(String bbs_contents) {
		this.bbs_contents = bbs_contents;
	}
	public String getBbs_email() {
		return bbs_email;
	}
	public void setBbs_email(String bbs_email) {
		this.bbs_email = bbs_email;
	}
	public String getBbs_homepage() {
		return bbs_homepage;
	}
	public void setBbs_homepage(String bbs_homepage) {
		this.bbs_homepage = bbs_homepage;
	}
	public String getBbs_secure() {
		return bbs_secure;
	}
	public void setBbs_secure(String bbs_secure) {
		this.bbs_secure = bbs_secure;
	}
	public String getBbs_vote() {
		return bbs_vote;
	}
	public void setBbs_vote(String bbs_vote) {
		this.bbs_vote = bbs_vote;
	}
	public String getBbs_img_url() {
		return bbs_img_url;
	}
	public void setBbs_img_url(String bbs_img_url) {
		this.bbs_img_url = bbs_img_url;
	}
	public String getBbs_count() {
		return bbs_count;
	}
	public void setBbs_count(String bbs_count) {
		this.bbs_count = bbs_count;
	}
	public String getBbs_ip() {
		return bbs_ip;
	}
	public void setBbs_ip(String bbs_ip) {
		this.bbs_ip = bbs_ip;
	}
	public String getBbs_id() {
		return bbs_id;
	}
	public void setBbs_id(String bbs_id) {
		this.bbs_id = bbs_id;
	}
	public String getBbs_pass() {
		return bbs_pass;
	}
	public void setBbs_pass(String bbs_pass) {
		this.bbs_pass = bbs_pass;
	}
	public String getBbs_check() {
		return bbs_check;
	}
	public void setBbs_check(String bbs_check) {
		this.bbs_check = bbs_check;
	}
	public String getBbs_sdate() {
		return bbs_sdate;
	}
	public void setBbs_sdate(String bbs_sdate) {
		this.bbs_sdate = bbs_sdate;
	}
	public String getBbs_edate() {
		return bbs_edate;
	}
	public void setBbs_edate(String bbs_edate) {
		this.bbs_edate = bbs_edate;
	}
	public String getBbs_rmk() {
		return bbs_rmk;
	}
	public void setBbs_rmk(String bbs_rmk) {
		this.bbs_rmk = bbs_rmk;
	}
	public int getMna_num() {
		return mna_num;
	}
	public void setMna_num(int mna_num) {
		this.mna_num = mna_num;
	}
	public int getMno_num_key() {
		return mno_num_key;
	}
	public void setMno_num_key(int mno_num_key) {
		this.mno_num_key = mno_num_key;
	}
	public String getMna_type() {
		return mna_type;
	}
	public void setMna_type(String mna_type) {
		this.mna_type = mna_type;
	}
	public String getMna_part() {
		return mna_part;
	}
	public void setMna_part(String mna_part) {
		this.mna_part = mna_part;
	}
	public int getMna_position() {
		return mna_position;
	}
	public void setMna_position(int mna_position) {
		this.mna_position = mna_position;
	}
	public String getMna_view() {
		return mna_view;
	}
	public void setMna_view(String mna_view) {
		this.mna_view = mna_view;
	}
	public String getMna_file() {
		return mna_file;
	}
	public void setMna_file(String mna_file) {
		this.mna_file = mna_file;
	}
	public String getMna_file_org() {
		return mna_file_org;
	}
	public void setMna_file_org(String mna_file_org) {
		this.mna_file_org = mna_file_org;
	}
	public String getMna_text() {
		return mna_text;
	}
	public void setMna_text(String mna_text) {
		this.mna_text = mna_text;
	}
	public String getMna_create_u() {
		return mna_create_u;
	}
	public void setMna_create_u(String mna_create_u) {
		this.mna_create_u = mna_create_u;
	}
	public String getMna_create_d() {
		return mna_create_d;
	}
	public void setMna_create_d(String mna_create_d) {
		this.mna_create_d = mna_create_d;
	}
	public String getMna_update_u() {
		return mna_update_u;
	}
	public void setMna_update_u(String mna_update_u) {
		this.mna_update_u = mna_update_u;
	}
	public String getMna_update_d() {
		return mna_update_d;
	}
	public void setMna_update_d(String mna_update_d) {
		this.mna_update_d = mna_update_d;
	}
	public String getMna_rmk() {
		return mna_rmk;
	}
	public void setMna_rmk(String mna_rmk) {
		this.mna_rmk = mna_rmk;
	}

	/*
	 *  @ Text Code
	 */
	public String getTxt_type() {
		return txt_type;
	}
	public void setTxt_type(String txt_type) {
		this.txt_type = txt_type;
	}
	public String getTxt_part() {
		return txt_part;
	}
	public void setTxt_part(String txt_part) {
		this.txt_part = txt_part;
	}
	public String getTxt_cat1() {
		return txt_cat1;
	}
	public void setTxt_cat1(String txt_cat1) {
		this.txt_cat1 = txt_cat1;
	}
	public String getTxt_cat2() {
		return txt_cat2;
	}
	public void setTxt_cat2(String txt_cat2) {
		this.txt_cat2 = txt_cat2;
	}
	/*
	 *  @ File Upload
	 */
    public String toStringSimple() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
	public String toStringDefault() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
/*	public String toStringJson() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}*/    
	public String toStringMultiline() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
/*	public String toStringNoClass() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
	}*/    
	public String toStringNoFieldName() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_FIELD_NAMES_STYLE);
	}
	public String toStringShortPrefix() {
	    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
