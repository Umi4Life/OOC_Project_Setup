package io.ooc.project.Repository;

import io.ooc.project.Model.Item;
import io.ooc.project.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository("ItemRepository")
    public interface ItemRepository extends JpaRepository<Item, Long> {
        List<Item> findProductsByUser(User user);
        List<Item> findProductsByUserAndIsSellingIsTrue(User user);
        List<Item> findProductsByQuantityGreaterThanAndIsSellingIsTrue(long quantity);
        //Set<Product> findProductsByProductNameContainsOrDescriptionContains(String k1, String k2);
        //if (p.getProductName().contains(keyword) || p.getDescription().contains(keyword) ||
        // p.getUser().getName().contains(keyword))
        @Override
        List<Item> findAll();
        Item findById(int id);

}
