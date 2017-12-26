package com.gngapps.ovs.resources;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gngapps.ovs.resources.model.request.VehicleRequestModel;
import com.gngapps.ovs.resources.model.response.VehicleResponseModel;

@RestController
@RequestMapping(value="/vehicles")
public class VehicleResource {
	
	@RequestMapping(method=RequestMethod.GET, value="/filtered")
	public List<VehicleResponseModel> getByFilter(VehicleRequestModel vehicleRequestModel) {
		return Collections.emptyList();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/recent")
	public List<VehicleResponseModel> getRecent() {
		return Collections.emptyList(); 
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/sum")
	public Map<String, Integer> getBrandsAndAmount() {
		return Collections.emptyMap();
	}
}
