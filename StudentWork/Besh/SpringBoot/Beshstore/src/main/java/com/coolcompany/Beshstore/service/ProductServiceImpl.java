package com.coolcompany.Beshstore.service;


import com.coolcompany.Beshstore.dao.ProductDao;
import com.coolcompany.Beshstore.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    @Qualifier("productDaoDatabaseImpl")
    private ProductDao dao;

    @Override
    public Product findById(int id){
        System.out.println("* ProductService.findPet: " + id);
        return dao.findById(id);
    }
    @Override
    public List<Product> findAll(){
        System.out.println("* ProductService.findAll");
        return dao.findAll();
    }

    @Override
    public void add(Product product) {
        System.out.println("* ProductService.add");
        dao.add(product);
    }
    @Override
    public void updateName (String name, int id) {
        dao.updateName(name, id);
    }
}
