package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {

    public List<Animal> findAll();

    public Animal findById(int id);

    void add(Animal animal);
}