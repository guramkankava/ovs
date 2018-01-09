package com.gngapps.ovs.resources.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.gngapps.ovs.resources.exception.BadRequestException;
import com.gngapps.ovs.resources.exception.VehicleNotFoundException;
import com.gngapps.ovs.resources.model.response.ApiErrorResponseModel;

@ControllerAdvice
public class VehicleResourceExceptionHendler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({VehicleNotFoundException.class})
	public ResponseEntity<?> handleException(Exception ex) {
		ApiErrorResponseModel aerm = new ApiErrorResponseModel();
		if(ex.getClass().getSimpleName().equals("VehicleNotFoundException")) {
			aerm.setStatusCode(HttpStatus.NOT_FOUND);
			aerm.setErrorMessage(ex.getMessage());
			return new ResponseEntity<Object>(aerm, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler({BadRequestException.class})
	public ResponseEntity<?> handleRuntimeException(RuntimeException ex) {
		ApiErrorResponseModel aerm = new ApiErrorResponseModel();
		if(ex.getClass().getSimpleName().equals("BadRequestException")) {
			aerm.setStatusCode(HttpStatus.BAD_REQUEST);
			aerm.setErrorMessage(ex.getMessage());
			return new ResponseEntity<Object>(aerm, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
