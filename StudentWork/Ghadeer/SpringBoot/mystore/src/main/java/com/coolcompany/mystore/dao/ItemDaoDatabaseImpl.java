package com.coolcompany.mystore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.coolcompany.mystore.domain.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemDaoDatabaseImpl implements ItemDao {
    //TODO: Must implement
    @Autowired
    private ItemRepository repository;

    public Item findById(int id) {
        System.out.println("AnimalDaoDatabaseImpl.findById" + id);
        Optional<Item> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Item> findAll() {
        System.out.println("AnimalDaoDatabaseImpl.findAll()");

        Iterable<Item> result = repository.findAll();
        List<Item> itemsList = new ArrayList<Item>();
        for (Item item : result) {
            itemsList.add(item);
        }

        return itemsList;
    }

    @Override
    public void add(Item item) {
        System.out.println("ItemDaoDatabaseImpl.add()");

        //throw new RuntimeException("dao not available yet");
        //useSpring Data repository to access the animal TABLE
        repository.save(item);
    }

}//The End......
