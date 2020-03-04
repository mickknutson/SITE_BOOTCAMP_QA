package sa.site.lab.petstore.controller;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface Animalcontroller {

  public List <Animal> findAll();

    public Animal findPet(int id);
}