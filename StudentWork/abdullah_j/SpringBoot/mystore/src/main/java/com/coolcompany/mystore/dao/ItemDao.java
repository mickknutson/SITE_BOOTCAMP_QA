package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.domain.Item;

import java.util.List;

public interface ItemDao {

    void add(Item item);

    Item findById(int id);

    List<Item> findAll();

    void updateName(int id , String newName);

    void updateDescription(int id , String newDescription);

    void updateCost(int id , float newCost);

    void deleteById(int id);

    void deleteAll();

}
