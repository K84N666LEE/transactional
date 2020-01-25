package com.erp.vo;

import java.io.Serializable;

public class mem_admin implements Serializable  
{
	// Serialization
	private static final long serialVersionUID = 1L;

	// BASIC
	private int    mad_num     ; // 회원벙호
	private String mad_type    ; // 타입
	private String mad_part    ; // 종류
	private String mad_level   ; // 레벨
	private String mad_hname   ; // 한글명
	private String mad_ename   ; // 영문명
	private String mad_jname   ; // 일문명 외 ~
	private String mad_id      ; // 아이디
	private String mad_password; // 비밀번호
	private String mad_tel     ; // 전화번호
	private String mad_hp      ; // 휴대폰번호
	private String mad_email   ; // 이메일
	private String mad_addr1   ; // 우편번호
	private String mad_addr2   ; // 주소
	private String mad_addr3   ; // 상세주소
	private String mad_status  ; // 회원상태
	private String mad_create_u; // 입력일
	private String mad_create_d; // 입력아이디
	private String mad_update_u; // 수정일
	private String mad_update_d; // 수정아이디
	private String mad_rmk     ; // 비고

	// EXTENSION
	private String mad_pass_new; // 비밀번호
	private String save_id     ; // id 저장
	private String language    ; // 언어 선택

	public int getMad_num() {
		return mad_num;
	}
	public void setMad_num(int mad_num) {
		this.mad_num = mad_num;
	}
	public String getMad_type() {
		return mad_type;
	}
	public void setMad_type(String mad_type) {
		this.mad_type = mad_type;
	}
	public String getMad_part() {
		return mad_part;
	}
	public void setMad_part(String mad_part) {
		this.mad_part = mad_part;
	}
	public String getMad_level() {
		return mad_level;
	}
	public void setMad_level(String mad_level) {
		this.mad_level = mad_level;
	}
	public String getMad_hname() {
		return mad_hname;
	}
	public void setMad_hname(String mad_hname) {
		this.mad_hname = mad_hname;
	}
	public String getMad_ename() {
		return mad_ename;
	}
	public void setMad_ename(String mad_ename) {
		this.mad_ename = mad_ename;
	}
	public String getMad_jname() {
		return mad_jname;
	}
	public void setMad_jname(String mad_jname) {
		this.mad_jname = mad_jname;
	}
	public String getMad_id() {
		return mad_id;
	}
	public void setMad_id(String mad_id) {
		this.mad_id = mad_id;
	}
	public String getMad_password() {
		return mad_password;
	}
	public void setMad_password(String mad_password) {
		this.mad_password = mad_password;
	}
	public String getMad_tel() {
		return mad_tel;
	}
	public void setMad_tel(String mad_tel) {
		this.mad_tel = mad_tel;
	}
	public String getMad_hp() {
		return mad_hp;
	}
	public void setMad_hp(String mad_hp) {
		this.mad_hp = mad_hp;
	}
	public String getMad_email() {
		return mad_email;
	}
	public void setMad_email(String mad_email) {
		this.mad_email = mad_email;
	}
	public String getMad_addr1() {
		return mad_addr1;
	}
	public void setMad_addr1(String mad_addr1) {
		this.mad_addr1 = mad_addr1;
	}
	public String getMad_addr2() {
		return mad_addr2;
	}
	public void setMad_addr2(String mad_addr2) {
		this.mad_addr2 = mad_addr2;
	}
	public String getMad_addr3() {
		return mad_addr3;
	}
	public void setMad_addr3(String mad_addr3) {
		this.mad_addr3 = mad_addr3;
	}
	public String getMad_status() {
		return mad_status;
	}
	public void setMad_status(String mad_status) {
		this.mad_status = mad_status;
	}
	public String getMad_create_u() {
		return mad_create_u;
	}
	public void setMad_create_u(String mad_create_u) {
		this.mad_create_u = mad_create_u;
	}
	public String getMad_create_d() {
		return mad_create_d;
	}
	public void setMad_create_d(String mad_create_d) {
		this.mad_create_d = mad_create_d;
	}
	public String getMad_update_u() {
		return mad_update_u;
	}
	public void setMad_update_u(String mad_update_u) {
		this.mad_update_u = mad_update_u;
	}
	public String getMad_update_d() {
		return mad_update_d;
	}
	public void setMad_update_d(String mad_update_d) {
		this.mad_update_d = mad_update_d;
	}
	public String getMad_rmk() {
		return mad_rmk;
	}
	public void setMad_rmk(String mad_rmk) {
		this.mad_rmk = mad_rmk;
	}
	public String getSave_id() {
		return save_id;
	}
	public void setSave_id(String save_id) {
		this.save_id = save_id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMad_pass_new() {
		return mad_pass_new;
	}
	public void setMad_pass_new(String mad_pass_new) {
		this.mad_pass_new = mad_pass_new;
	}

}
