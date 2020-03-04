package sa.site.lab.petstore.dao;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalDao {

    Animal findPet(int id);

    List<Animal> findAll();


}
