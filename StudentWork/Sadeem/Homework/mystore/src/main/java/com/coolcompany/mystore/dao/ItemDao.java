package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemDao {
    void add(Item item);
    void delete(int id);
    Item findById(int id);
    List<Item> findAll();
}
