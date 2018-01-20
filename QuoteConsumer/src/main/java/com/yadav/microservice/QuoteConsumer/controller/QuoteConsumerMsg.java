package com.yadav.microservice.QuoteConsumer.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yadav.microservice.QuoteConsumer.model.CustomerInfoRequest;
import com.yadav.microservice.QuoteConsumer.service.CustomerInfoService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class QuoteConsumerMsg {

	@Autowired
	private CustomerInfoService customerInfoService;
	@RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void recievedMessage(CustomerInfoRequest customerInfoRequest) {
		log.info("Received Message for Customer ID>"+customerInfoRequest.getCustomerID());
		customerInfoService.processCustomerUpdate(customerInfoRequest);		
    }
}



