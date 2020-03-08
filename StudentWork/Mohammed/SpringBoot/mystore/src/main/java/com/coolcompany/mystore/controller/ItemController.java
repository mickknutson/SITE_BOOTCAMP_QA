package com.coolcompany.mystore.controller;

import java.util.List;
import com.coolcompany.mystore.domain.Item;

public interface ItemController {

    void addItem(Item item);
    Item findItemById(int id);
    List<Item> findAll ();
    void updateName (Item item , String name);
    void deleteItemById (int id);
}
