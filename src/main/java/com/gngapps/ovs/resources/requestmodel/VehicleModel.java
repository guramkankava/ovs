package com.gngapps.ovs.resources.requestmodel;

public class VehicleModel {
	private String energySource;
	private String manufacturer;
	private String model;
	private double price;
	
	public String getEnergySource() {
		return energySource;
	}
	public void setEnergySource(String energySource) {
		this.energySource = energySource;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
