package com.coolcompany.mystore.dao;

import org.springframework.stereotype.Repository;
import com.coolcompany.mystore.domain.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Data access for pet domain Objects
CRUD
story types:
components
Services
Repository
Controller
 */
@Repository
public class ItemDaoStubImpl implements ItemDao { //animalDao

    // Method level
    //create map

    Map<Object,Item> items = new HashMap<>();

private int counter=0;
    //    List<Animal> animals=new ArrayList<>();
    public ItemDaoStubImpl() {
//        for (int i = 0; i < 3; i++) {
//            items.put(++counter, new Item());
//        }
    }

    public Item findById(int id) {
        System.out.println("AnimalDao.findById:" + id);
//pull map
        if (items.containsKey(id)) {
            return (Item) items.get(id);
        } else
            return null;

    } //End findPet method

    public List<Item> findAll() {
        System.out.println("AnimalDao.findAll()");
        ArrayList<Item> itemsList = new ArrayList<Item>(items.values());
        return itemsList;
        //return null;
    }//end find all method
    @Override
    public void add(Item item){
        items.put(++counter, item);

    }

}//the end..
