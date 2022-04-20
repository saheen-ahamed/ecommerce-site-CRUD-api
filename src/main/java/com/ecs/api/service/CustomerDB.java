package com.ecs.api.service;

import com.ecs.api.entities.Customer;
import com.ecs.api.entities.Session;
import com.ecs.api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDB {
    @Autowired
    private CustomerRepository repo;

    public Customer createCustomer(Customer customer){
        return repo.save(customer);
    }
    public String customerLogin(String username, String password){
      Customer customer = repo.findByUsername(username);
      if (password.equals(customer.getPassword())) {
          int sessionNum = (int)Math.floor(Math.random()*100);
          Session session = new Session(sessionNum, customer.getId());
          return "login successful, user id "
                  + customer.getId()
                  + " username " + customer.getUsername();
      } else
          return "login was unsuccessful";
    }
}
