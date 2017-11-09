package com.mianshi.entity;

import java.util.Date;

public class User {
	private String id;
	private String username;
	private String password;
	private Date registDate;
	private Date loginDate;
	public User(String id, String username, String password, Date registDate,
			Date loginDate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.registDate = registDate;
		this.loginDate = loginDate;
	}
	public User(String username, String password, Date registDate) {
		super();
		this.username = username;
		this.password = password;
		this.registDate = registDate;
	}
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", registDate=" + registDate + ", loginDate="
				+ loginDate + "]";
	}
	
	
	
}
