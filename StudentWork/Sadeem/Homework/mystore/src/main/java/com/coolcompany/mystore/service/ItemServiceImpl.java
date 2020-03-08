package com.coolcompany.mystore.service;

import com.coolcompany.mystore.dao.ItemDao;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    @Qualifier ("")
   private ItemDao itemDao;

   public void add(Item item){
       System.out.println("** ItemService.add():");
       itemDao.add(item);
   }

   public void deleteById(int id){
       System.out.println("** ItemService.delete():");
       itemDao.deleteById(id);
   }

   public Item findById(int id){
       System.out.println("** ItemService.findById():");
       return itemDao.findById(id);
   }

   public List<Item> findAll(){
       System.out.println("** ItemService.findAll():");
       return itemDao.findAll();
   }

}
