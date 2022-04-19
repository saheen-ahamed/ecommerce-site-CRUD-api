package com.ecs.api.controller;

import com.ecs.api.entities.Product;
import com.ecs.api.service.ProductDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductDbController {
    @Autowired
    private ProductDB dbService;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return dbService.insertProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return dbService.insertProducts(products);
    }

    @GetMapping("/products")
    public List<Product> listAllProduct(){
        return dbService.getAllProducts();
    }

    @GetMapping("/product/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return dbService.findByCategory(category);
    }

}
