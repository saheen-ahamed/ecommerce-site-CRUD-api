package com.ecs.api.service;

import com.ecs.api.entities.Cart;
import com.ecs.api.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDB {
    @Autowired
    private CartRepository repo;

    @Autowired
    private ProductDB productDB;

    public List<Cart> getAllCartItems(){
        return repo.findAll();
    }
    public Cart addToCart(int pid, int quantity){
        Cart cart = new Cart();
        cart.setPid(pid);
        cart.setQuantity(quantity);

        String productName = productDB.getNameById(pid);
        cart.setProductName(productName);

        double price = productDB.getPriceById(pid);
        cart.setTotalPrice(quantity * price);
        return repo.save(cart);

    }

//    public Cart updateCart(){
//
//    }
}
