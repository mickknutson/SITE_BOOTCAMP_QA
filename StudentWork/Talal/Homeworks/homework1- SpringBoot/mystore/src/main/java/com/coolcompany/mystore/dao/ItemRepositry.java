package com.coolcompany.mystore.dao;

import com.coolcompany.mystore.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepositry extends CrudRepository<Item, Integer> {
}
