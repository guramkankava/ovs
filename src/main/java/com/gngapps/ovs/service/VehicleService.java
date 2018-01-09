package com.gngapps.ovs.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gngapps.ovs.dao.VehicleRepository;
import com.gngapps.ovs.model.QVehicle;
import com.gngapps.ovs.model.Vehicle;
import com.gngapps.ovs.resources.exception.BadRequestException;
import com.gngapps.ovs.resources.exception.VehicleNotFoundException;
import com.querydsl.core.types.dsl.BooleanExpression;

@Service
public class VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;
	private QVehicle vehicle = QVehicle.vehicle;
	
	public List<Vehicle> getFiltered(String energySource, String manufacturer, String model, String price) throws BadRequestException, VehicleNotFoundException {
		if(energySource == null && manufacturer == null && model == null && price == null) {
			throw new BadRequestException("All request parameters are empty, al least one parameter value is requierd.");
		}
		List<String> requestParameters = new ArrayList<>(); 
		if(energySource != null) {
			requestParameters.add(energySource);
		}
		if(manufacturer != null) {
			requestParameters.add(manufacturer);
		}
		if(model != null) {
			requestParameters.add(model);
		}
		if(price != null) {
			requestParameters.add(price);
		}

		List<BooleanExpression> dslQueryes = new ArrayList<>();
		
		if(requestParameters.contains(energySource)) {
			dslQueryes.add(vehicle.energySource.eq(energySource));
		}
		if(requestParameters.contains(manufacturer)) {
			dslQueryes.add(vehicle.manufacturer.eq(manufacturer));
		} 
		if(requestParameters.contains(model)) {
			dslQueryes.add(vehicle.model.eq(model));
		} 
		if(requestParameters.contains(price)) {
			dslQueryes.add(vehicle.price.eq(price));
		}
		List<Vehicle> foundVehicles = new ArrayList<>();
		if(dslQueryes.size() == 4) {
			vehicleRepository.findAll(dslQueryes.get(0).and(dslQueryes.get(1)).and(dslQueryes.get(2)).and(dslQueryes.get(3))).forEach(foundVehicles::add);
			if(foundVehicles.isEmpty()) {
				throw new VehicleNotFoundException("No vehicle found for following criterya " + requestParameters.get(0) + ", " + requestParameters.get(1)
				+ ", " + requestParameters.get(2) + ", " + requestParameters.get(3));
			}
		}
		if(dslQueryes.size() == 3) {
			vehicleRepository.findAll(dslQueryes.get(0).and(dslQueryes.get(1)).and(dslQueryes.get(2))).forEach(foundVehicles::add);
			if(foundVehicles.isEmpty()) {
				throw new VehicleNotFoundException("No vehicle found for following criterya " + requestParameters.get(0) + ", " + requestParameters.get(1) +
				", " + requestParameters.get(2));
			}
		}
		if(dslQueryes.size() == 2) {
			vehicleRepository.findAll(dslQueryes.get(0).and(dslQueryes.get(1))).forEach(foundVehicles::add);
			if(foundVehicles.isEmpty()) {
				throw new VehicleNotFoundException("No vehicle found for following criterya " + requestParameters.get(0) + ", " + requestParameters.get(1));
			}
		}
		if(dslQueryes.size() == 1) {
			vehicleRepository.findAll(dslQueryes.get(0)).forEach(foundVehicles::add);
			if(foundVehicles.isEmpty()) {
				throw new VehicleNotFoundException("No vehicle found for following criterya " + requestParameters.get(0));
			}
		}
		return foundVehicles;
	}

	public List<Vehicle> getRecentlyUploaded() {
		return Collections.emptyList();
	}

	public Map<String, Integer> getManufacturerAndAmount() {
		return Collections.emptyMap();
	}
}
