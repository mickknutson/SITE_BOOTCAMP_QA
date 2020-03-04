package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;
import java.util.Map;

@Controller
public class AnimalControllerImpl implements AnimalController {
    @Autowired
    private AnimalService service;
    public Animal findPet(int id){
        System.out.println("AnimalController.findPet:"+id);

        return service.findPet(id);
    } //End findPet method
    @Override
    public List<Animal> findAll(){
        System.out.println("AnimalController.findAll()");

        return service.findAll();
    }
//    public void fillMethod(){
//        service.fillMethod();
//    }
}
