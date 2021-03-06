package com.gngapps.ovs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.joda.time.DateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Statement {
	@Id
	private long id;
	private DateTime creationDate;
	@ManyToOne
	private User user;
	@OneToOne
	private Vehicle vehicle;
	
}
