package io.ooc.project.repository;

import io.ooc.project.model.Category;
import io.ooc.project.model.Item;
import io.ooc.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

    @Repository
    public interface ItemRepository extends JpaRepository<Item, Long> {
        List<Item> findItemByUser(User user);
        Item findItemByItemId(Integer id);
        //Set<Product> findProductsByProductNameContainsOrDescriptionContains(String k1, String k2);
        //if (p.getProductName().contains(keyword) || p.getDescription().contains(keyword) ||
        // p.getUser().getName().contains(keyword))
        @Override
        List<Item> findAll();
        Item findItemByItemId(int id);
        List<Item> findProductsByCategory(Category category);

}
