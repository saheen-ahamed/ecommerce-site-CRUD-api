package com.ecs.api.service;

import com.ecs.api.entities.Product;
import com.ecs.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDB {
    @Autowired
    private ProductRepository repo;

    public Product insertProduct(Product product){
       return repo.save(product);
    }

    public List<Product> insertProducts(List<Product> products){
        return repo.saveAll(products);
    }

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public List<Product> findByCategory(String category){
        return repo.findByCategory(category);
    }



}
