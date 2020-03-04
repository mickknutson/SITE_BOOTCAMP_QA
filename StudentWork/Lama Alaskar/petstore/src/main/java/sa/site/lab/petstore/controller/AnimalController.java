package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {
    Animal findPet(int id);

    List<Animal> findAll();


}
