package io.ooc.project.service;


import io.ooc.project.model.Item;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ItemService {

    List<Item> getAll(Integer categoryId);

    List<Item> getAllItem(Integer userId);

    List<Item>getAll();

    Item get(Integer itemId);
    void add(Integer categoryId, Item item, MultipartFile file) throws IOException;
    void saveItem(Item item);
    void addItemToUser(Integer userId, Integer itemId);
    void removeAllItems(Integer userId);
    void delete(Integer itemId);
    void edit(Item item,MultipartFile file);

}


