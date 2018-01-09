package com.gngapps.ovs.resources.exception;

public class BadRequestException extends Exception {
	
	private String message;
	
	public BadRequestException() {
		super();
	}
	
	public BadRequestException(String message) {
		super(message);
		this.message = message;
	}
	
}
