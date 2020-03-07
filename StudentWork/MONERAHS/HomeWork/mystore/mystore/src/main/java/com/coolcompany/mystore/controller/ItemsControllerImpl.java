package com.coolcompany.mystore.controller;

import com.coolcompany.mystore.domain.Items;
import com.coolcompany.mystore.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ItemsControllerImpl implements ItemsController{
    @Autowired
    private ItemsService service;

    @Override
    public Items findById(int id) {
        System.out.println("** ItemsController.FindById():" + id);
        return service.findById(id);
    }

    @Override
    public List<Items> findAll() {
        System.out.println("** ItemsController.findAll();");
        return service.findAll();    }

    @Override
    public void add(Items item) {
        System.out.println("** ItemsController.add() ");
        service.add(item);
    }
}
