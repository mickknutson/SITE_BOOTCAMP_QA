package com.coolcompany.mystore.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.coolcompany.mystore.domain.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer>  {


}
