package com.gngapps.ovs.resources.model.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiErrorResponseModel {
	private HttpStatus statusCode;
	private String errorMessage;
	private List<String> errors;
}
