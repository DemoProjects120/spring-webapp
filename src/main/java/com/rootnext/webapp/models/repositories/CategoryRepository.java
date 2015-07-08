package com.rootnext.webapp.models.repositories;

import com.rootnext.webapp.models.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sanjoy on 7/8/15.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
