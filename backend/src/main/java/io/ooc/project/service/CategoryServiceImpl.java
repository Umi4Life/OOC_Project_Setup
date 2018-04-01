package io.ooc.project.service;

import io.ooc.project.model.Category;
import io.ooc.project.repository.BillableRepository;
import io.ooc.project.repository.CategoryRepository;
import io.ooc.project.repository.ItemRepository;
import io.ooc.project.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private SessionFactory sessionFactory;

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BillableRepository billableRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category get(Integer categoryId) {
        return categoryRepository.getCategoryByCategoryId(categoryId);
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return categoryRepository.getCategoryByCategoryName(categoryName);
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void delete(Integer categoryId) {
       Category category =  categoryRepository.getCategoryByCategoryId(categoryId);
       categoryRepository.delete(category);
    }

    @Override
    public void edit(Category category) {
        categoryRepository.save(category);

    }
}
