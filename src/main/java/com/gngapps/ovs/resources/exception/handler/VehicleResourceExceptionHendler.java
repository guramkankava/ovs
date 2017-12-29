package com.gngapps.ovs.resources.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.gngapps.ovs.resources.exception.VehicleNotFoundException;
import com.gngapps.ovs.resources.model.response.VehicleResponseExceptionModel;

@ControllerAdvice
public class VehicleResourceExceptionHendler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(VehicleNotFoundException.class)
	public ResponseEntity<?> handleException(Exception ex) {
		return new ResponseEntity<Object>(new VehicleResponseExceptionModel(HttpStatus.NOT_FOUND, ex.getMessage()), HttpStatus.NOT_FOUND);
	}
}
