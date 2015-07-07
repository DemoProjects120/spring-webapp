package com.rootnext.webapp.models.repositories;

import com.rootnext.webapp.models.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sanjoy on 7/7/15.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
