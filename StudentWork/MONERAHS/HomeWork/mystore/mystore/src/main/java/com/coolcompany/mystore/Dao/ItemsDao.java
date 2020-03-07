package com.coolcompany.mystore.Dao;

import com.coolcompany.mystore.domain.Items;

import java.util.List;

public interface ItemsDao {
    Items findById(int id);
    List<Items> findAll();
    void add(Items item);
}
