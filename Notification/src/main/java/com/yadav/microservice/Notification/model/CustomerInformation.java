package com.yadav.microservice.Notification.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CustomerInformation {

	public CustomerInformation()
	{}
	public CustomerInformation(Long customerID,Contact contact,Address addr)
	{
		this.customerID=customerID;
		this.streetAddress=addr.getStreetAddress();
		this.city=addr.getCity();
		this.state=addr.getState();
		this.zipCode=addr.getZipCode();
		this.country=addr.getCountry();
		this.mobilePhoneNumber=contact.getMobilePhoneNumber();
		this.emailAddress=contact.getEmailAddress();
		this.faxNumber=contact.getFaxNumber();
		this.homePhoneNumber=contact.getHomePhoneNumber();
		this.businessPhoneNumber=contact.getBusinessPhoneNumber();
	}
	

	
	@Id
	private Long customerID;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String mobilePhoneNumber;
	private String emailAddress;
	private String faxNumber;
	private String homePhoneNumber;
	private String businessPhoneNumber;
}
