package com.gngapps.ovs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {
	
	@Id
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobileNumber;
}
