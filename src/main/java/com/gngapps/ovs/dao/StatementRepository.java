package com.gngapps.ovs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.gngapps.ovs.model.Statement;

public interface StatementRepository extends JpaRepository<Statement, Long>, QueryDslPredicateExecutor<Statement> {

}
