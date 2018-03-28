package io.ooc.project.Service;

import io.ooc.project.Model.Category;
import io.ooc.project.Model.Item;
import io.ooc.project.Model.User;
import io.ooc.project.Repository.CategoryRepository;
import io.ooc.project.Repository.ItemRepository;
import io.ooc.project.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemServiceTest {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<Item> getAll(Integer categoryId) {
        Category cat = categoryRepository.getCategoryByCategoryId(categoryId);
        return itemRepository.findProductsByCategory(cat);
    }

    @Override
    public List<Item> getAllItem(Integer userId) {
        User user = userRepository.findUserByUserId(userId);
        return itemRepository.findItemByUser(user);
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item get(Integer itemId) {
        return itemRepository.findItemByItemId(itemId);
    }

    @Override
    public void add(Integer categoryId, Item item, MultipartFile file) throws IOException {
        // original file, this creates new object ??
        item.setItemImage(file.getBytes());
        item.setItemId(item.getItemId());
        item.setItemName(item.getItemName());
        item.setItemContent(item.getItemContent());
        item.setItemPrice(item.getItemPrice());

        itemRepository.save(item);

        Category cat = categoryRepository.getCategoryByCategoryId(categoryId);
        cat.getItem().add(item);

        categoryRepository.save(cat);
    }

    @Override
    public void saveItem(Item item) { 	// To save item  //
        itemRepository.save(item);
    }

    @Override
    public void addItemToUser(Integer userId, Integer itemId) {
        Item item = itemRepository.findItemByItemId(itemId);

        User user = userRepository.findUserByUserId(userId);
        user.getItem().add(item);
    }

    @Override
    public void removeAllItems(Integer userId) {
        User user = userRepository.findUserByUserId(userId);
        user.getItem().clear();
    }

    @Override
    public void delete(Integer itemId) {
        Item item = itemRepository.findItemByItemId(itemId);
        itemRepository.delete(item);
    }

    @Override
    public void edit(Item item, MultipartFile file) {
        itemRepository.save(item); // this is what original method does...
    }
}
