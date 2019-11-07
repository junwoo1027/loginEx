package com.company.domain;

public class MemberVo {

	private String id;
	private String password;
	private String writer;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", password=" + password + ", writer=" + writer + "]";
	}
	
	
}
