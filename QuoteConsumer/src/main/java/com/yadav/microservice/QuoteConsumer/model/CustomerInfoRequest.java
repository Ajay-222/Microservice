package com.yadav.microservice.QuoteConsumer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerInfoRequest {
	
	private Long customerID;
	private Contact contact;
	private Address address;
}
