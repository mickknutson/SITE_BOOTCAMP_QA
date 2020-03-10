package com.coolcompany.mystore.service;

import com.coolcompany.mystore.dao.ItemDao;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    @Qualifier("itemDaoImpl")
    ItemDao itemDao;

    @Override
    public void addItem(Item item) {
        itemDao.addItem(item);
    }

    @Override
    public Item findItemById(int id) {
        return itemDao.findItemById(id);
    }

    @Override
    public List<Item> findAll() {
        return itemDao.findAll();
    }

    @Override
    public void updateName(Item item, String name) {
        itemDao.updateName(item, name);
    }

    @Override
    public void deleteItemById(int id) {
        itemDao.deleteItemById(id);
    }
}
