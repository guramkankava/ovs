package com.gngapps.ovs.resources;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gngapps.ovs.domain.Vehicle;
import com.gngapps.ovs.resources.requestmodel.VehicleModel;

@RestController
@RequestMapping(value="/vehicles")
public class VehicleResource {
	
	@RequestMapping(method=RequestMethod.GET, value="/filtered")
	public List<Vehicle> getVehiclesByFilter(VehicleModel vehicleFilter) {
		return Collections.emptyList(); 
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/recent")
	public List<Vehicle> getRecentVehicles() {
		return Collections.emptyList(); 
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/sum")
	public Map<String, Integer > getBrandsAndAmount() {
		return Collections.emptyMap();
	}
}
