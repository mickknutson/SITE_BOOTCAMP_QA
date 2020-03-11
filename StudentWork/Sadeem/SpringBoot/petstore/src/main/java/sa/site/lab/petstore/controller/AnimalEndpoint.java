package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

//@RestController
//@RequestMapping("/animal")
    public class AnimalEndpoint {
        @Autowired
        private AnimalService service;
        @GetMapping
        public List<Animal> findAll(){
            List<Animal> animals = service.findAll();
            System.out.println("** REST Animals");
            return animals;
        }
}
