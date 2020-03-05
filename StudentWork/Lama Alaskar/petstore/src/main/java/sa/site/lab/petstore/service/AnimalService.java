package sa.site.lab.petstore.service;

import sa.site.lab.petstore.domain.Animal;

import java.util.Map;

public interface AnimalService { //interface Driven design
    public Animal findPet(int id);

    Map<Integer, Animal> findAll();

    void add(Animal animal);
}
