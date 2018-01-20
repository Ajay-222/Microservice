package com.yadav.microservice.producer.model;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Address {
	@NotNull
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
}
