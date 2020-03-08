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

    public void add(Item item){
        System.out.println("** ItemController.add():");
        service.add(item);
    }

    public void deleteById(int id){
        System.out.println("** ItemController.delete():");
        service.deleteById(id);
    }

    public Item findById(int id){
        System.out.println("** ItemController.findById():");
        return service.findById(id);
    }

    public List<Item> findAll(){
        System.out.println("** ItemController.findAll():");
        return service.findAll();
    }
}
