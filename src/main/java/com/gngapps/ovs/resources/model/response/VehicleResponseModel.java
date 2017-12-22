package com.gngapps.ovs.resources.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class VehicleResponseModel {
	private String energySource;
	private String manufacturer;
	private String model;
	private double price;
}
