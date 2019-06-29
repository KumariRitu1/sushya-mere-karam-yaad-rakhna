package com.cg.entities;

public class Users {
	private int id;
	private String password;
	private String role;
	public Users() {
	}
	public Users(int loginId, String password) {
		this.id = loginId;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [loginId=" + id + ", password=" + password
				+ ", role=" + role + "]";
	}
}
