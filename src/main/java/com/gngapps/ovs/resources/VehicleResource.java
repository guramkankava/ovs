package com.gngapps.ovs.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gngapps.ovs.model.Vehicle;
import com.gngapps.ovs.resources.exception.BadRequestException;
import com.gngapps.ovs.resources.exception.VehicleNotFoundException;
import com.gngapps.ovs.resources.model.request.VehicleRequestModel;
import com.gngapps.ovs.resources.model.response.VehicleResponseModel;
import com.gngapps.ovs.service.VehicleService;

@RestController
@RequestMapping(value="/vehicles")
public class VehicleResource {
	
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping(method=RequestMethod.GET, value="/filtered")	 	
	public ResponseEntity<List<VehicleResponseModel>> getByFilter(@RequestParam(value="energySource", required=false) String energySource, 
			@RequestParam(value="manufacturer", required=false) String manufacturer, @RequestParam(value="model", required=false) String model, 
			@RequestParam(value="price", required=false) String price) throws VehicleNotFoundException, BadRequestException {
		List<VehicleResponseModel> vehicleResponseModelList = new ArrayList<>();
		vehicleService.getFiltered(energySource, manufacturer, model, price).forEach( (vehicle) -> {
			vehicleResponseModelList.add(new VehicleResponseModel.Builder().
					setEnergySource(vehicle.getEnergySource()).
					setManufacturer(vehicle.getManufacturer()).
					setModel(vehicle.getModel()).
					setPrice(vehicle.getPrice()).
					build());});
		return new ResponseEntity<>(vehicleResponseModelList, HttpStatus.ACCEPTED);
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
