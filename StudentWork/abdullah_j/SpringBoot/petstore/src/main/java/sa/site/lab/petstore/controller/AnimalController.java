package sa.site.lab.petstore.controller;

import org.springframework.ui.Model;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {


    String findById(int id , Model model);

    Animal findById(int id);

    String findAll(Model model);

    List<Animal> findAll();

    String add(Model model);

    String create(Animal animal);

    String delete(int id);



}


