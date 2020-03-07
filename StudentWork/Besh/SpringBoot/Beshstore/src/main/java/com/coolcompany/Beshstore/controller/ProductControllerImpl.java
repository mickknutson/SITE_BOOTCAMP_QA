package com.coolcompany.Beshstore.controller;

import com.coolcompany.Beshstore.domain.Product;
import com.coolcompany.Beshstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductControllerImpl implements ProductController{
    @Autowired
    private ProductService service;
    public Product findById(int id){
        System.out.println("* ProductController.findByID" + id);
        return service.findById(id);
    }
    @Override
    public List<Product> findAll() {
        System.out.println("* ProductController.findAll");
        return service.findAll();
    }

    @Override
    public void add(Product product) {
        System.out.println("* ProductController..add");
        service.add(product);
    }
}
