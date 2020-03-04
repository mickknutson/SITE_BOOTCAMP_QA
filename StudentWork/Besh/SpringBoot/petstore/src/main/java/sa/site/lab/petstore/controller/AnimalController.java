package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Dog;

import java.util.List;
import java.util.Map;

public interface AnimalController {
    Animal findById(int id);
    List<Animal> findAll();

    void add(Animal animal);
} // The end of class...
