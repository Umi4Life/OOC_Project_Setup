package io.ooc.project.service;

import io.ooc.project.model.Category;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
public interface CategoryService {
    List<Category> getAll();

    Category get(Integer categoryId);

    Category getCategoryByName(String categoryName);

    void add(Category category);

    void delete(Integer categoryId);

    void edit(Category category);
}
