package com.gngapps.ovs.resources;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gngapps.ovs.resources.exception.VehicleNotFoundException;
import com.gngapps.ovs.resources.model.request.VehicleRequestModel;
import com.gngapps.ovs.resources.model.response.VehicleResponseModel;

@RestController
@RequestMapping(value="/vehicles")
public class VehicleResource {
	
	@RequestMapping(method=RequestMethod.GET, value="/filtered")
	public ResponseEntity<List<VehicleResponseModel>> getByFilter(RequestEntity<VehicleRequestModel> requestEntity) throws VehicleNotFoundException {
		return new ResponseEntity<>(Collections.emptyList(), HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/recent")
	public ResponseEntity<List<VehicleResponseModel>> getRecent() {
		return new ResponseEntity<>(Collections.emptyList(), HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/sum")
	public ResponseEntity<Map<String, Integer>> getBrandsAndAmount() {
		return new ResponseEntity<Map<String,Integer>>(Collections.emptyMap(), HttpStatus.OK);
	}
}
