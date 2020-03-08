package com.coolcompany.mystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.coolcompany.mystore.domain.Item;
import com.coolcompany.mystore.service.ItemService;

import java.util.List;

@Controller
public class ItemControllerImpl implements ItemController {
    @Autowired
    private ItemService service;
    public Item findById(int id){
        System.out.println("ItemController.findById:"+id);

        return service.findById(id);
    } //End findPet method
    @Override
    public List<Item> findAll(){
        System.out.println("AnimalController.findAll()");

        return service.findAll();
    }
    public void add(Item item){
        service.add(item);
    }

//    public void fillMethod(){
//        service.fillMethod();
//    }
}
