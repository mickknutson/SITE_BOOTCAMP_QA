package com.coolcompany.mystore.service;
import com.coolcompany.mystore.domain.Item;

import java.util.List;


public interface ItemService {

     Item findById(int id);
    List<Item> findAll();
    void add(Item item);

//    public void fillMethod();


}
