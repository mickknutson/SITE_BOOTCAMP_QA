package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api/animal") //URI
class AnimalEndpointImpl {
    @Autowired
    private AnimalService service;
    //METHOD:
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public Animal findById(@PathVariable int id, Model model){
        // FIXME: Add validation
        return service.findById(id);
    }

    @GetMapping
    public List<Animal> findAll(){
        List<Animal> animals = service.findAll();
        System.out.println("** REST Animals: " + animals);
        return animals;
    }

    //List<int> List<boolean< List<boolean>
    public Boolean delete(int id){
        throw new RuntimeException("Not implemented yet");
    }
    public Boolean add(Animal animal){
        throw new RuntimeException("Not implemented yet");
    }
    public Boolean update(Animal animal){
        throw new RuntimeException("Not implemented yet");
    }
} // The End...
