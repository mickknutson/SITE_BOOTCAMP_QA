package com.coolcompany.mystore.dao;

public interface ItemsDao {

    Items findById(int id);
    List<Items> findAll();
    void add(Items item);
}

}
