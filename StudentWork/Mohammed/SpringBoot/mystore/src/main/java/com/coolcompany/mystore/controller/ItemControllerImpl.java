package com.coolcompany.mystore.controller;

import com.coolcompany.mystore.domain.Item;
import com.coolcompany.mystore.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ItemControllerImpl implements ItemController {

    @Autowired
    ItemService itemService;


    @Override
    public void addItem(Item item) {
        itemService.addItem(item);
    }

    @Override
    public Item findItemById(int id) {
        return itemService.findItemById(id);
    }

    @Override
    public List<Item> findAll() {
        return itemService.findAll();
    }

    @Override
    public void updateName(Item item, String name) {
        itemService.updateName(item , name);
    }

    @Override
    public void deleteItemById(int id) {
        itemService.deleteItemById(id);
    }
}
