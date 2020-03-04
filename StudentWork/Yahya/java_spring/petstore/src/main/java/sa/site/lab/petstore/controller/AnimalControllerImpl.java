package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;


@Controller
public class AnimalControllerImpl implements AnimalController{

    @Autowired
    private AnimalService service;

//    private Animal animal;
//    List<AnimalController>

    public Animal findPet(int id) {
        System.out.println("* In Controller Find pet:* " +id);
        return service.findPet(id);
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("* In Controller findAll()*");
        return service.findAll();
    }
}
