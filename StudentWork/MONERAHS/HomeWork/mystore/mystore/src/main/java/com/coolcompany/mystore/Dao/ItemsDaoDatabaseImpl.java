package com.coolcompany.mystore.Dao;

import com.coolcompany.mystore.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemsDaoDatabaseImpl implements ItemsDao {

    @Autowired
    private ItemsRepository repository;

    @Override
    public Items findById(int id) {
        System.out.println(" * ItemsDaoDatabaseImpl.findById: "+id);
        Optional<Items> result = repository.findById(id); //search about Optional, it relates on null
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Items> findAll() {
        System.out.println("* ItemsDaoDatabaseImpl.findAll()");
        Iterable<Items> result = repository.findAll(); //type of list to go through all the element

        List<Items> items = new ArrayList<>();
        for (Items item : result) {
            items.add(item);
        }
        return items;

    }

    @Override
    public void add(Items item) {
        System.out.println("* ItemsDaoDatabaseImpl.add()");
        repository.save(item);

    }
}
