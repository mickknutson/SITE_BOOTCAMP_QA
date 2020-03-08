package com.coolcompany.mystore.Dao;

import com.coolcompany.mystore.domain.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends CrudRepository<Items,Integer> {
}
