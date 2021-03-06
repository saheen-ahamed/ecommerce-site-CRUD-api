package com.ecs.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private int quantity;
    private double price;
}
