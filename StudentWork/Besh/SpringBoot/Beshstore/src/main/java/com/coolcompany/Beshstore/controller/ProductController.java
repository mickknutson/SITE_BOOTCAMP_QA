package com.coolcompany.Beshstore.controller;

import com.coolcompany.Beshstore.domain.Product;
import java.util.List;

public interface ProductController {
    Product findById(int id);
    List<Product> findAll();
    void add(Product product);
    void updateName (String name, int id);
}
