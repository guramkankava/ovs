package com.gngapps.ovs.resources.model.response;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor(access=AccessLevel.PRIVATE)
@Getter
@Setter(value=AccessLevel.PRIVATE)
@ToString
public class VehicleResponseModel {
	private String energySource;
	private String manufacturer;
	private String model;
	private String price;
	
	public static class Builder {
		private String energySource;
		private String manufacturer;
		private String model;
		private String price;
		
		public Builder() {}
		
		public Builder setEnergySource(String energySource) {
			this.energySource = energySource;
			return this;
		}
		public Builder setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}
		public Builder setModel(String model) {
			this.model = model;
			return this;
		}
		public Builder setPrice(String price) {
			this.price = price;
			return this;
		}
		public VehicleResponseModel build() {
			VehicleResponseModel vrm = new VehicleResponseModel();
			vrm.energySource = this.energySource;
			vrm.manufacturer = this.manufacturer;
			vrm.model = this.model;
			vrm.price = this.price;
			return vrm;
		}
	}
}
