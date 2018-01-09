package com.gngapps.ovs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.gngapps.ovs.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>, QueryDslPredicateExecutor<Vehicle> {
	
}
