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
@RequestMapping("/api/animal") // URI
public class AnimalEndpointImpl{

    @Autowired
    private AnimalService service;

    // Method:

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String findById(@PathVariable int id, Model model) {
        return service.findById(id).toString();
    }

    @GetMapping()
    public List<Animal> findAll() {
    List<Animal> animals = service.findAll();
        System.out.println("** REST Animals : " + animals);
        return animals;
    }

}



