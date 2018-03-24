package io.ooc.project.Repository;

import io.ooc.project.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    List<Category> findAll();
    Category getCategoryByCategoryId(Integer categoryId);
    Category getCategoryByCategoryName(String categoryName);
}
