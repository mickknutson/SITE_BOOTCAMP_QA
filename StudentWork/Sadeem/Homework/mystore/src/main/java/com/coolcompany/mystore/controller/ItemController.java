package com.coolcompany.mystore.controller;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemController {
    void add(Item item);
    void delete(int id);
    Item findById(int id);
    List<Item> findAll();
}
