package com.coolcompany.Beshstore.dao;

import com.coolcompany.Beshstore.domain.Product;
import java.util.List;

public interface ProductDao {
    Product findById (int id);
    List<Product> findAll();
    void add(Product product);
}
