package com.coolcompany.mystore.controller;

public interface ItemsController {

    public Items findById(int id);

        List<Items> findAll();

        void add(Items item);
    }
}
