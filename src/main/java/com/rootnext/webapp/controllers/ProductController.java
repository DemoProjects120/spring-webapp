package com.rootnext.webapp.controllers;

import com.rootnext.webapp.models.Product;
import com.rootnext.webapp.models.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sanjoy on 7/7/15.
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Product> list(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id){
        return productRepository.findOne(id);
    }


}
