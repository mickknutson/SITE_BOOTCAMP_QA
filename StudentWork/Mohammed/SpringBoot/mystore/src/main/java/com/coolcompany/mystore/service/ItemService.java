package com.coolcompany.mystore.service;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemService {

    void addItem(Item item);
    Item findItemById(int id);
    List<Item> findAll ();
    void updateName (Item item , String name);
    void deleteItemById (int id);
}
