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

    public Animal findPet (int id){
        return service.findPet(id);
    }
    public List<Animal> findAll(){
        return service.findAll();
    }
}
