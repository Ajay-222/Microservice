package com.yadav.microservice.QuoteConsumer.exception;

import org.springframework.amqp.AmqpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@RestController
@Slf4j
public class QuoteExceptionHandler {
	
	

	@ExceptionHandler(Exception.class)
	public void handleAllException(Exception ex)
	{
		log.error(ex.getMessage());
	}
	
	@ExceptionHandler(AmqpException.class)
	public void handleUserException(Exception ex)
	{
		log.error(ex.getMessage());
	}

	
}
