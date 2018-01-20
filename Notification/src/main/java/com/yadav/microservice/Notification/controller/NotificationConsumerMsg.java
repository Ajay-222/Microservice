package com.yadav.microservice.Notification.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yadav.microservice.Notification.model.CustomerInfoRequest;
import com.yadav.microservice.Notification.service.CustomerInfoService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class NotificationConsumerMsg {

	@Autowired
	private CustomerInfoService customerInfoService;
	@RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void recievedMessage(CustomerInfoRequest customerInfoRequest) {
		log.info("Received Message for Customer ID>"+customerInfoRequest.getCustomerID());
		customerInfoService.processCustomerUpdate(customerInfoRequest);		
    }
}



