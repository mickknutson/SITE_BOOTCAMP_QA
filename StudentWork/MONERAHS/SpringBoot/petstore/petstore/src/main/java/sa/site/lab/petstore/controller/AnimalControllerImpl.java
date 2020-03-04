package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.Animal.Animal;
import sa.site.lab.petstore.Animal.Cat;
import sa.site.lab.petstore.Animal.Dog;
import sa.site.lab.petstore.Dao.AnimalDao;
import sa.site.lab.petstore.service.AnimalService;

import java.util.Arrays;
import java.util.List;

@Controller
public class AnimalControllerImpl implements AnimalController {
    @Autowired
    private AnimalService service;

    @Override
    public Animal findPet(int id) {
        System.out.println("** AnimalController.FindPet():"+ id);
        return service.findPet(id);
    }

    @Override
     public List<Animal> findAll() {
        System.out.println("** AnimalController.FindAll():");


        return service.findAll();

        }

    }

