package com.yadav.microservice.QuoteConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yadav.microservice.QuoteConsumer.model.CustomerInfoRequest;
import com.yadav.microservice.QuoteConsumer.service.CustomerInfoService;

@RestController
public class QuoteConsumerController {

	@Autowired
	private CustomerInfoService customerInfoService;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Object> createCustomer(@RequestBody CustomerInfoRequest custInfoReq)
	{
		customerInfoService.processCustomerUpdate(custInfoReq);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}