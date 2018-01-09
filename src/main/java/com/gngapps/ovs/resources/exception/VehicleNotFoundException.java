package com.gngapps.ovs.resources.exception;

public class VehicleNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String message;
	
	public VehicleNotFoundException() {
		super();
	}
	
	public VehicleNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
