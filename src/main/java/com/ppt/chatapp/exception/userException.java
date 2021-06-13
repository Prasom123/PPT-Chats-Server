package com.ppt.chatapp.exception;

public class userException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private final String message;

	public userException() {
		this.message = "Exception occured in userDetails";
		
	}

	public userException(String message, Throwable cause) {
		super();
		this.message = message;
		
	}

	public userException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
