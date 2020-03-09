package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.site.lab.petstore.domain.Animal;
import java.util.List;
import sa.site.lab.petstore.service.AnimalService;

//@RestController
//@RequestMapping("/animal")
public class AnimalEndpoint {
    @Autowired
    private AnimalService service;
    @GetMapping
    public List<Animal> finsAll(){
        List<Animal> animals = service.findAll();
        System.out.println("** REST Animals");
        return animals;
    }
}
