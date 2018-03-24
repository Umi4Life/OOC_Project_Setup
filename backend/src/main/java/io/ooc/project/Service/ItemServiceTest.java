package io.ooc.project.Service;


import io.ooc.project.Model.Item;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ItemServiceTest {

    public List<Item> getAll(Integer categoryId);

    public List<Item> getAllItem(Integer userId);

    public List<Item>getAll();

    public Item get(Integer itemId);
    public void add(Integer categoryId, Item item, MultipartFile file) throws IOException;
    public void saveItem(Item item);
    public void addItemToUser(Integer userId, Integer itemId);
    public void removeAllItems(Integer userId);
    public void delete(Integer itemId);
    public void edit(Item item,MultipartFile file);

}


