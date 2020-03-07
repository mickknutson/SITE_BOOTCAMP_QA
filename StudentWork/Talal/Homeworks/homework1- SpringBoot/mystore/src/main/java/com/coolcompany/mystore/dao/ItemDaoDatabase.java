package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
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

    public List<Item> findAll(){
       Iterable<Item> result= repositry.findAll();

       List <Item> items= new ArrayList<>();
       for (Item item: result){
           items.add(item);
       }
       return items;
    }


    public void add(Item item) {


        repositry.save(item);


    }

    public Item updatePrice(int id, double price) {

        if(repositry.findById(id).isPresent()) {
            Item itemInDB = repositry.findById(id).get();
            itemInDB.setPrice(price);
            repositry.save(itemInDB);

        }else {
            return null;
        }




            Item item =findById(id);
         if(item!=null){
             item.setPrice(price);
             return item;
         } else {
             return null;
         }


    }

    public void deleteById(int id ){
        repositry.deleteById(id);
    }

}
