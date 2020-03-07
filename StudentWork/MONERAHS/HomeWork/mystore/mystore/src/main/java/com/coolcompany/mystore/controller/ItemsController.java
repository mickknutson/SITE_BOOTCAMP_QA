package com.coolcompany.mystore.controller;

import com.coolcompany.mystore.domain.Items;

import java.util.List;

public interface ItemsController {
    public Items findById(int id);

    List<Items> findAll();

    void add(Items item);
}
