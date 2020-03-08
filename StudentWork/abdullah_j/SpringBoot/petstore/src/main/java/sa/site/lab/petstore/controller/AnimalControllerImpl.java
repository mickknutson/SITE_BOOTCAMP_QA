package sa.site.lab.petstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@Controller
@RequestMapping("/")
public class AnimalControllerImpl implements AnimalController {


    @Autowired
    private AnimalService service;

    @Override
    public Animal findById(int id) {
        System.out.println("*** AnimalController.FindPet(" + id + ") ***");
        return service.findById(id);
    }

    // accept request on:
    //http://localhost:8080/list.html
    @GetMapping("/list.html")
    @Override
    public String findAll() {
        System.out.println("*** AnimalController.findAll() ***");
        List<Animal> allAnimals = service.findAll();
        return "List";
    }

    @Override
    public void add(Animal animal) {
        System.out.println("*** AnimalController.add() ***");
        service.add(animal);
    }
}
