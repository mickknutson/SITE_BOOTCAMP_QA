package sa.site.lab.petstore.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;
import java.util.Map;

import java.util.List;

@Controller
public class AnimalControllerImpl implements AnimalController{
    @Autowired
    private AnimalService service;

    @Override
    public Animal findPet (int id)
    {
        System.out.println("* AnimalController.findPet: " + id);
        return service.findPet(id);
    }

    @Override
    public  Map<Integer, Animal>findAll(){
        System.out.println("* finaAll()");
        return service.findAll();
    }
}
