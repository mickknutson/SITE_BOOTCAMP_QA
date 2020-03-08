package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemDao {

    Item findById(int id);

    List<Item> findAll();
    void add(Item item);

    //public void fillMethod();
}
