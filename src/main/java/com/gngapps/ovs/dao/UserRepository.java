package com.gngapps.ovs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.gngapps.ovs.model.User;

public interface UserRepository extends JpaRepository<User, Long>, QueryDslPredicateExecutor<User> {

}
