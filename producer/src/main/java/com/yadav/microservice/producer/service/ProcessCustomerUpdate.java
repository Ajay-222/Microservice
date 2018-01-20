package com.yadav.microservice.producer.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.yadav.microservice.producer.model.CustomerInfoRequest;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProcessCustomerUpdate {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;
	
	public void sendUpdate(CustomerInfoRequest ccUpdate){
		amqpTemplate.convertAndSend(exchange, "",ccUpdate);
		log.info("Sending Message for Contact Update for Customer ID=>"+ccUpdate.getCustomerID());
		
	}
	
}
