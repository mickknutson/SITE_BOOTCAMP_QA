package com.coolcompany.Beshstore.service;

import com.coolcompany.Beshstore.domain.Product;
import java.util.List;

public interface ProductService {
    Product findById(int id);
    List<Product> findAll();
    void add(Product product);
}
