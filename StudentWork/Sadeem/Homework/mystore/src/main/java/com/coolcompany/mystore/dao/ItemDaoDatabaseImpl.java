package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemDaoDatabaseImpl implements ItemDao {
    @Autowired
    private ItemRepository repository;

    @Override
   public void add(Item item){
        repository.save(item);
   }

    @Override
    public void deleteById(int id){
        repository.deleteById(id);
   }

   @Override
   public Item findById(int id){
       Optional<Item> result =  repository.findById(id);
       if(result.isPresent()) {
           return result.get();
       }else {
           return null;
       }
   }

   @Override
   public List<Item> findAll(){
       Iterable<Item> result = repository.findAll();
       List<Item> items = new ArrayList<>();
       for (Item item : result) {
           items.add(item);
       }
       return items;
   }
}

