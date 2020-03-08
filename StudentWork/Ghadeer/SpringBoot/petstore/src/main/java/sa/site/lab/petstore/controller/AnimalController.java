package sa.site.lab.petstore.controller;

import org.w3c.dom.ls.LSOutput;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {

     Animal findById(int id);

   String findAll();
    void add(Animal animal);

}
