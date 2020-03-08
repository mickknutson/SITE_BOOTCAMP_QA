package com.coolcompany.mystore.service;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemService {
    void add(Item item);
    void deleteById(int id);
    Item findById(int id);
    List<Item> findAll();
}
