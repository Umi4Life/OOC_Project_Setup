package io.ooc.project.Service;

import io.ooc.project.Model.Category;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Havensbee on 3/19/18.
 */
public interface CategoryServiceTest {
    public List<Category> getAll();

    public Category get(Integer categoryId);

    public Category getCategoryByName(String categoryName);

    public void add(Category category);

    public void delete(Integer categoryId);

    public void edit(Category category);
}
