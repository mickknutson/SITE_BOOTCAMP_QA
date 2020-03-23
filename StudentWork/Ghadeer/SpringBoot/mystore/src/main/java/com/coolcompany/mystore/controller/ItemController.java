package com.coolcompany.mystore.controller;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemController {

     Item findById(int id);

    List<Item> findAll();
    void add(Item item);

}
