package com.coolcompany.mystore.Dao;

import com.coolcompany.mystore.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ItemsDaoStubImpl implements ItemsDao {

    Map<Integer, Items> items;
    private int counter=0;

    public ItemsDaoStubImpl() {
        items = new HashMap<>();
        items.put(++counter, new Items("AP Watch"));
        items.put(++counter, new Items("BALMAN Shirt"));
        items.put(++counter, new Items("LV Shoe"));



    }

    @Override
    public Items findById(int id) {
        System.out.println("** ItemsDao.findById():" +id);
        if (items.containsKey(id)) {
            return items.get(id);
        } else {
            return null;
        }
        }

    @Override
    public List<Items> findAll() {
        System.out.println("** ItemsDao.findAll();" );
        return items.values()
                .stream()
                .collect(Collectors.toList());

    }

    @Override
    public void add(Items item) {
        System.out.println("* ItemsDaoDatabaseImpl.add()");
        items.put(++counter,item);
    }
}
