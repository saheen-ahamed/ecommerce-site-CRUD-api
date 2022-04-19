package com.ecs.api.controller;

import com.ecs.api.entities.Customer;
import com.ecs.api.service.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDbController {
    @Autowired
    private CustomerDB dbService;

    @PostMapping("/signup")
    public Customer signup(@RequestBody Customer customer){
        return dbService.signup(customer);
    }
}
