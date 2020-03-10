package com.coolcompany.Beshstore.dao;

import com.coolcompany.Beshstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductDaoDatabaseImpl implements ProductDao{
    @Autowired
    private ProductRepository repository;
    public Product findById(int id){
        System.out.println("ProductDaoDatabaseImpl.findById" + id);
        Optional<Product> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            return null;
        }
    }
    public List<Product> findAll(){
        System.out.println("ProductDaoDatabaseImpl.findAll");
        Iterable<Product> result = repository.findAll();
        List<Product> products = new ArrayList<>();
        for (Product product : result){
            products.add(product);
        }
        return products;
    }
    public void add (Product product){
        System.out.println("ProductDaoDatabaseImpl.add()");
        repository.save(product);
    }

    @Override
    public void updateName(String name, int id) {
        System.out.println("ProductDaoDatabaseImpl.add()");
    }
}
