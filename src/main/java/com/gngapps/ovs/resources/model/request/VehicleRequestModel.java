package com.gngapps.ovs.resources.model.request;

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
public class VehicleRequestModel {
	private String energySource;
	private String manufacturer;
	private String model;
	private double price;
}
