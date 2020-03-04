package sa.site.lab.petstore.controller;

import org.w3c.dom.ls.LSOutput;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;
import java.util.Map;

public interface AnimalController {

     Animal findPet(int id);

    Map findAll();

//    void fillMethod();
}
