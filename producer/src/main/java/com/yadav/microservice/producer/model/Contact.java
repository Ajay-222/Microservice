package com.yadav.microservice.producer.model;

import lombok.Data;

@Data
public class Contact {
	private String mobilePhoneNumber;
	private String emailAddress;
	private String faxNumber;
	private String homePhoneNumber;
	private String businessPhoneNumber;
}
