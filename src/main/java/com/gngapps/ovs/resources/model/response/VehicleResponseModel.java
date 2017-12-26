package com.gngapps.ovs.resources.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VehicleResponseModel {
	private String energySource;
	private String manufacturer;
	private String model;
	private double price;
}
