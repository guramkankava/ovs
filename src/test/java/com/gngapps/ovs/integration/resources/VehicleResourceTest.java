package com.gngapps.ovs.integration.resources;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VehicleResourceTest {

	@Autowired
	private TestRestTemplate testRestTemplate;
	private ResponseEntity<?> responseEntity;
	
	@Before
	public void setUp() {
		BasicAuthorizationInterceptor bai = new BasicAuthorizationInterceptor("user", "password");
	    testRestTemplate.getRestTemplate().getInterceptors().add(bai);
	}
	
	@Test
	public void getByFilterConnectionTest() {
		responseEntity = testRestTemplate.getForEntity("/vehicles/filtered", Object[].class); 
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
	@Test
	public void getRecentConnectionTest() {
		responseEntity = testRestTemplate.getForEntity("/vehicles/recent", Object[].class); 
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
	@Test
	public void getBrandsAndAmountConnectionTest() {
		responseEntity = testRestTemplate.getForEntity("/vehicles/sum", Map.class); 
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
	
	
	
}
