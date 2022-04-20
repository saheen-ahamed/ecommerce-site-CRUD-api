package com.ecs.api.controller;

import com.ecs.api.entities.Cart;
import com.ecs.api.service.CartDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartDbController {
    @Autowired
    private CartDB dbServices;

    @GetMapping("/allCartItems")
    public List<Cart> cartItems(){
        return dbServices.getAllCartItems();
    }

    @PostMapping("/addCart/{pid}/{quantity}")
    public Cart addCart(@PathVariable int pid, @PathVariable int quantity){
        return dbServices.addToCart(pid, quantity);
    }

}
