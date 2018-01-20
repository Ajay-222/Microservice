package com.yadav.microservice.Notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yadav.microservice.Notification.model.CustomerInfoRequest;
import com.yadav.microservice.Notification.model.CustomerInformation;
import com.yadav.microservice.Notification.repo.CustomerRepo;

@Service
public class CustomerInfoService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public void processCustomerUpdate(CustomerInfoRequest custInfoReq)
	{
		CustomerInformation customer = new CustomerInformation(custInfoReq.getCustomerID(),custInfoReq.getContact(),custInfoReq.getAddress());
		
		customerRepo.save(customer);
	}

}
