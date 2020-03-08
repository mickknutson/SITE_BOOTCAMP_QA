package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;

public interface AnimalController {
    Animal findById(int id);

    String findAll();

    void add(Animal animal);
}
