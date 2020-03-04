package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;


@Controller
public class AnimalControllerImpl implements AnimalController{

    @Autowired
    private AnimalService service;

//    private Animal animal;
//    List<AnimalController>

    public Animal findById(int id) {
        System.out.println("* In Controller findById:* " +id);
        return service.findById(id);
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("* In Controller findAll()*");
        return service.findAll();
    }

    @Override
    public void add(Animal animal) {
        System.out.println("Animal controller.add()");
        service.add(animal);
    }
}
