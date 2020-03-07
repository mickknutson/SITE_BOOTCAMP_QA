package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {

    public Animal findById(int id);

    List<Animal> findAll();

    void add(Animal animal);

}
