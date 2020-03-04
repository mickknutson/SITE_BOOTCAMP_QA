package sa.site.lab.petstore.dao;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;
import java.util.Map;

/**
 * Data access for Pet Domain Object
 */

public interface AnimalDao {
    public List<Animal> findAll();
    public Animal findPet (int id );


    }



