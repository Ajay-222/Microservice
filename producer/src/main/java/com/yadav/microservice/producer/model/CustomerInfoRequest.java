package com.yadav.microservice.producer.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerInfoRequest {
	@NotNull
	private Long customerID;
	private Contact contact;
	private Address address;
}
