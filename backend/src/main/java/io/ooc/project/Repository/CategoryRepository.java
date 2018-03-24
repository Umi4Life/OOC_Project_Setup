package io.ooc.project.Repository;

import io.ooc.project.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    List<Category> findAll();
<<<<<<< HEAD
    Category findById(int id);

=======
    Category getCategoryByCategoryId(Integer categoryId);
    Category getCategoryByCategoryName(String categoryName);
>>>>>>> 5813c72b4ad1d3c9e652cff5148fb7cf1f76ce9b
}
