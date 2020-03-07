package com.coolcompany.mystore.service;

import com.coolcompany.mystore.Dao.ItemsDao;
import com.coolcompany.mystore.Dao.ItemsDaoDatabaseImpl;
import com.coolcompany.mystore.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    @Qualifier ("itemsDaoDatabaseImpl")
    private ItemsDao dao;
    @Override
    public Items findById(int id) {
        System.out.println("ItemsService.findById():"+id);
        return dao.findById(id);
    }

    @Override
    public List<Items> findAll() {
        System.out.println("ItemsService.findAll();");
        return dao.findAll();
    }

    @Override
    public void add(Items item) {
        System.out.println("ItemsService.add();");
        dao.add(item);



    }
}
