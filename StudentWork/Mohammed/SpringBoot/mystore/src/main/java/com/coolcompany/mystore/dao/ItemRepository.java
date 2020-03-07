package com.coolcompany.mystore.dao;

import main.java.com.coolcompany.mystore.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer> {

    // Voodoo Magic Baby!!
}
