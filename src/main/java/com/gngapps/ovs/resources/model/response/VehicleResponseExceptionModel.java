package com.gngapps.ovs.resources.model.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class VehicleResponseExceptionModel {
	private HttpStatus statusCode;
	private String errorMessage;
}
