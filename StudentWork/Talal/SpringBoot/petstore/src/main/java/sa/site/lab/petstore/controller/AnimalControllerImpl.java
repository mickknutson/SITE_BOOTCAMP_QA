package sa.site.lab.petstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@Controller
public class AnimalControllerImpl implements AnimalController {

    @Autowired
    private AnimalService animalService;

    @Override
    public Animal findById(int id) {
        System.out.println("* find By Id: "+id);
        return animalService.findById(id);
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("Animal Controller: ");
        return animalService.findAll();
    }

    @Override
    public void add(Animal animal) {
        System.out.println("AnimalControllerImpl.add()");
        animalService.add(animal );
    }
}
