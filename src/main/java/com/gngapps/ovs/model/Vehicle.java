package com.gngapps.ovs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class Vehicle {
	@Id
	private long id;
	private String energySource;
	private String manufacturer;
	private String model;
	private String price;
	private Date publishDate;
}
