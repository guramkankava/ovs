package com.gngapps.ovs.resources.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class VehicleRequestModel {
	private String energySource;
	private String manufacturer;
	private String model;
	private double price;
}
