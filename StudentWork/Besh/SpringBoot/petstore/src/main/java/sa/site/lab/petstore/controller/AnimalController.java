package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;
import java.util.Map;

public interface AnimalController {
    Animal findPet(int id);
    Map<Integer, Animal> findAll();

} // The end of class...
