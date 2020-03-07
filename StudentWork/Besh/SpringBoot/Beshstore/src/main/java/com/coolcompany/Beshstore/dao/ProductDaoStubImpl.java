package com.coolcompany.Beshstore.dao;

import com.coolcompany.Beshstore.domain.Product;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@Repository
public class ProductDaoStubImpl implements ProductDao {
    private Map<Integer, Product> products;
    private int counter = 0;

    public ProductDaoStubImpl() {
        products = new HashMap<>();
        products.put(++counter, new Product("Chanel"));
        products.put(++counter, new Product("Dior"));
    }

    public Product findById(int id) {
        System.out.println("* ProductDao: " + id);

        if (products.containsKey(id)) {
            return products.get(id);
        } else {
            return null;
        }
        //return new Cat("Chanel");
    }//End findPet method

    @Override
    public List<Product> findAll() {
        System.out.println(" *ProductDao.findAll()");
        return products.values().stream().collect(Collectors.toList());
    }

    @Override
    public void add(Product product) {
        System.out.println(" *ProductDao.add()");
        products.put(++counter, product);
    }
}
