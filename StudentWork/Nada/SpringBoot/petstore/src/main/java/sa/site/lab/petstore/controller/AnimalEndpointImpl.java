package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> Stashed changes
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;


@RestController
@RequestMapping ("/api/animal")
public class AnimalEndpointImpl {

    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
<<<<<<< Updated upstream
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public Animal findById(@PathVariable int id, Model model) {
        return service.findById(id);
=======
    public String findById(@PathVariable int id, Model model) {
        return service.findById(id).toString();
>>>>>>> Stashed changes
    }

    @GetMapping
    public List<Animal> findAll() {
        List<Animal> animals = service.findAll();
        System.out.println("** REST Animal" + animals);
        return animals;
    }

<<<<<<< Updated upstream
    public Boolean delete(int id){
        throw new RuntimeException("Not implemented yet");
    }
    public Boolean add(Animal animal){
        throw new RuntimeException("Not implemented yet");
    }
    public Boolean update(Animal animal){
        throw new RuntimeException("Not implemented yet");
    }
=======
>>>>>>> Stashed changes
}

