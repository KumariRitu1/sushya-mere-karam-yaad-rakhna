package com.cg.entities;

public class LoginReturnValues {
	private String role;
	private boolean success;
	
	public LoginReturnValues() {
	}

	public LoginReturnValues(String role, boolean success) {
		this.role = role;
		this.success = success;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
