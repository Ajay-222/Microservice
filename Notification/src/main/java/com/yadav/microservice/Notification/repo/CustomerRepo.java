package com.yadav.microservice.Notification.repo;

import org.springframework.data.repository.CrudRepository;

import com.yadav.microservice.Notification.model.CustomerInformation;

public interface CustomerRepo extends CrudRepository<CustomerInformation, Long> {

}
