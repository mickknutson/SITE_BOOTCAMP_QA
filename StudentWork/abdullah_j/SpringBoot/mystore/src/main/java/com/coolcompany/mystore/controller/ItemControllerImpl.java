package com.coolcompany.mystore.controller;

import com.coolcompany.mystore.domain.Item;
import com.coolcompany.mystore.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ItemControllerImpl implements ItemController {

    @Autowired
    private ItemService service;

    @Override
    public void add(Item item) {

        service.add(item);
    }

    @Override
    public Item findById(int id) {
        return service.findById(id);
    }

    @Override
    public List<Item> findAll() {
        return service.findAll();
    }

    @Override
    public void updateName(int id, String newName) {
        service.updateName(id , newName);
    }

    @Override
    public void updateDescription(int id, String newDescription) {

        service.updateDescription(id , newDescription);
    }

    @Override
    public void updateCost(int id, float newCost) {

        service.updateCost(id , newCost);
    }

    @Override
    public void deleteById(int id) {

        service.deleteById(id);
    }

    @Override
    public void deleteAll() {

        service.deleteAll();
    }
}
