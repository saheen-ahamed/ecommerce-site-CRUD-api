package com.ecs.api.service;

import com.ecs.api.entities.Customer;
import com.ecs.api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDB {
    @Autowired
    private CustomerRepository repo;

    public Customer signup(Customer customer){
        return repo.save(customer);
    }

}
