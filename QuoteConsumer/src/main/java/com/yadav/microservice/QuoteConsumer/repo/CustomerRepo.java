package com.yadav.microservice.QuoteConsumer.repo;

import org.springframework.data.repository.CrudRepository;
import com.yadav.microservice.QuoteConsumer.model.CustomerInformation;

public interface CustomerRepo extends CrudRepository<CustomerInformation, Long> {

}
