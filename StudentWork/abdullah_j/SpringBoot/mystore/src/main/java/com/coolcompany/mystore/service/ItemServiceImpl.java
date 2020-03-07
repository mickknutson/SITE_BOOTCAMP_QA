package com.coolcompany.mystore.service;

import com.coolcompany.mystore.dao.ItemDao;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemDao dao;

    @Override
    public void add(Item item) {
        dao.add(item);
    }

    @Override
    public Item findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Item> findAll() {
        return dao.findAll();
    }

    @Override
    public void updateName(int id, String newName) {
        dao.updateName(id,newName);
    }

    @Override
    public void updateDescription(int id, String newDescription) {
        dao.updateDescription(id , newDescription);
    }

    @Override
    public void updateCost(int id, float newCost) {
        dao.updateCost(id , newCost);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void deleteAll() {
        dao.deleteAll();
    }
}
