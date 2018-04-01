package io.ooc.project.repository;

import io.ooc.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    List<Category> findAll();
    Category getCategoryByCategoryId(Integer categoryId);
    Category getCategoryByCategoryName(String categoryName);
}
