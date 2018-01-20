package com.yadav.microservice.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yadav.microservice.producer.model.CustomerInfoRequest;
import com.yadav.microservice.producer.service.ProcessCustomerUpdate;

@RestController
public class CustomerAddressUpdateController {
	
	@Autowired
	private ProcessCustomerUpdate processCustomerUpdate;
	
	@PostMapping("/custUpdate")
	public ResponseEntity<Object> customerAddressUpdate(@RequestBody CustomerInfoRequest ccAddrUpdate)
	{
		processCustomerUpdate.sendUpdate(ccAddrUpdate);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}

}
