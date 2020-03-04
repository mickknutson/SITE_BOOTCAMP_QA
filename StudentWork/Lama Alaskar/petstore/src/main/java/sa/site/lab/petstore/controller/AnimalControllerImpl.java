package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.service.AnimalService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AnimalControllerImpl implements AnimalController {

    @Autowired
    private AnimalService animalService;

    @Override
    public Animal findPet(int id) {
        return animalService.findPet(id);
    }

    @Override
    public List<Animal> findAll() {
        List<Animal> animals=new ArrayList<>();
        animals.add(new Cat("kitty"));
        return animals;
    }
}
