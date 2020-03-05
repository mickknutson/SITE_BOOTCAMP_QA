package sa.site.lab.petstore.controller;
import java.util.HashMap;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Dog;

import java.util.List;
import java.util.Map;

public interface AnimalController {
    Animal findbyid(int id);
    Map<Integer, Animal> findAll();
   void add(Animal animal);


    //
}
