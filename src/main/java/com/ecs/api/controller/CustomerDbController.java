package com.ecs.api.controller;

import com.ecs.api.entities.Customer;
import com.ecs.api.service.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerDbController {
    @Autowired
    private CustomerDB dbService;

    @PostMapping("/signup")
    public Customer signUp(@RequestBody Customer customer){
        return dbService.createCustomer(customer);
    }

    @GetMapping("/login/{username}/{password}")
    public String customerLogin(@PathVariable String username, @PathVariable String password){
        return dbService.customerLogin(username, password);
    }


}
