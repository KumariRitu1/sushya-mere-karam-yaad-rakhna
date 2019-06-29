package com.cg.exception;

public class UniversityException extends Exception {
	private String message;

	public UniversityException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}

}
