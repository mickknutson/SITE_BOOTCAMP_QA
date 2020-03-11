package com.coolcompany.mystore.service;

import com.coolcompany.mystore.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsService {

    Items findById(int id);

    List<Items> findAll();

    void add(Items item);
}

