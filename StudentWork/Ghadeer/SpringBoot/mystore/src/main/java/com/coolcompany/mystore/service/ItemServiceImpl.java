package com.coolcompany.mystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.coolcompany.mystore.dao.ItemDao;
import com.coolcompany.mystore.domain.Item;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    @Qualifier("itemDaoDatabaseImpl")
    private ItemDao dao;

    public Item findById(int id) {
        System.out.println("ItemService.findById:" + id);

        return dao.findById(id);
    } //End findPet method

    public List<Item> findAll() {
        System.out.println("ItemService.findAll()");

        return dao.findAll();
    }
    public void add(Item item){

        dao.add(item);
    }



}
