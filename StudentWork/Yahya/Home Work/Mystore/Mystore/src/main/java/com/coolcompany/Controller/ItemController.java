package com.coolcompany.Controller;

import java.util.List;
import com.coolcompany.Domain.Item;

public interface ItemController {

    void addItem(Item item);
    Item findItemById(int id);
    List<Item> findAll ();
    void updateName (Item item , String name);
    void deleteItemById (int id);
}
