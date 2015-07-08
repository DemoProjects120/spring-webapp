package com.rootnext.webapp.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjoy on 7/8/15.
 */
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    String name;
    @OneToMany(targetEntity = Product.class, mappedBy = "category")
    @JsonManagedReference
    List<Product> products;

    public Category() {
        this.products = new ArrayList<Product>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public void removeProduct(Product p){
        products.remove(p);
    }
}
