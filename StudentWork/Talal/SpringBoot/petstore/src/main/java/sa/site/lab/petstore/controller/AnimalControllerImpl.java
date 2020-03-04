package sa.site.lab.petstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@Controller
public class AnimalControllerImpl implements Animalcontroller {

    @Autowired
    private AnimalService animalService;

    @Override
    public List<Animal> findAll() {
        System.out.println("Animal Controller: ");
        return animalService.findAll();
    }

    @Override
    public Animal findPet(int id) {
        System.out.println("* findPet: "+id);
        return animalService.findPet(id);
    }
}
