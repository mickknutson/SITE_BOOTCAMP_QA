package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ItemDaoDatabase {
    @Autowired
    private ItemRepositry repositry;

    public Item findById(int id) {

        Optional<Item> result =repositry.findById(id);
        if(result.isPresent()){
            return result.get();
        }else {
            return null;
        }
    }


    public void add(Item item) {


        repositry.save(item);


    }

    public void updatePrice(int id, double price) {
         Item item =findById(id);
         if(item!=null){
             item.setPrice(price);
         }


    }

    public void deleteById(int id ){
        repositry.deleteById(id);
    }

}
