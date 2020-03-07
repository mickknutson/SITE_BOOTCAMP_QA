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
    private ItemRepository repository;


    @Override
    public void add(Item item) {
        repository.save(item);
    }

    @Override
    public Item findById(int id) {
        Optional<Item> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Item> findAll() {
        Iterable<Item> result = repository.findAll();
        List<Item> items = new ArrayList<>();
        for (Item item: result){
            items.add(item);
        }

        return items;
    }

    @Override
    public void updateName(int id, String newName) {

        Item item = findById(id);

        if (item != null){
            String oldName = item.getName();
            item.setName(newName);
            repository.save(item);
            System.out.println("Item's name with id #" + id + " has been updated from '"
                    + oldName + "' to '" + newName + "'");
        }
        else{
            System.out.println("No item with this id!");
        }


    }

    @Override
    public void updateDescription(int id, String newDescription) {

        Item item = findById(id);

        if (item != null){
            String oldDescription = item.getDescription();
            item.setDescription(newDescription);
            repository.save(item);
            System.out.println("Item's description with id #" + id + " has been updated from '"
                    + oldDescription + "' to '" + newDescription + "'");
        }
        else{
            System.out.println("No item with this id!");
        }
    }

    @Override
    public void updateCost(int id, float newCost) {

        Item item = findById(id);

        if (item != null){
            float oldCost = item.getCost();
            item.setCost(newCost);
            repository.save(item);
            System.out.println("Item's cost with id #" + id + " has been updated from '$"
                    + oldCost + "' to '$" + newCost + "'");
        }
        else{
            System.out.println("No item with this id!");
        }

    }

    @Override
    public void deleteById(int id) {

        if (findById(id) != null){
            repository.deleteById(id);
            System.out.println("One Item deleted");
        }else{
            System.out.println("No item with this id!");
        }

    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
        System.out.println("All items have been deleted");
    }
}
