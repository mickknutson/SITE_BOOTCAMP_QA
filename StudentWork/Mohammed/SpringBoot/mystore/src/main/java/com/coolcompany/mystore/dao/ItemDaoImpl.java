package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemDaoImpl implements ItemDao {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item findItemById(int id) {

        Optional<Item> item = itemRepository.findById(id);

        if (item.isPresent()) {
            return item.get();
        } else {
            return null;
        }

    }

    @Override
    public List<Item> findAll() {
        List<Item> itemList = new ArrayList<>();
        Iterable<Item> items = itemRepository.findAll();
        for( Item item: items){
            itemList.add(item);
        }
        return itemList;
    }

    @Override
    public void updateName(Item item, String name) {
        Item item1 = this.findItemById(item.getId());
        if ( item1 != null ){
            item.setName(name);
            itemRepository.save(item);
            System.out.println(" Name has been updated!");

        } else {
            System.out.println(" Item = NULL");
        }
    }

    @Override
    public void deleteItemById(int id) {
        itemRepository.deleteById(id);
    }
}
