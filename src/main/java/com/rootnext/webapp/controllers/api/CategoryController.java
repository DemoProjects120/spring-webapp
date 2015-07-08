package com.rootnext.webapp.controllers.api;

import com.rootnext.webapp.models.Category;
import com.rootnext.webapp.models.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sanjoy on 7/8/15.
 */
@RestController
@RequestMapping("api")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public Iterable<Category> list(){
        return categoryRepository.findAll();
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Category get(@PathVariable("id") Long id){
        return categoryRepository.findOne(id);
    }
}
