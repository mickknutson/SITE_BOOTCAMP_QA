package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;


@RestController
@RequestMapping ("/api/animal")
public class AnimalEndpointImpl {

    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model) {
        return service.findById(id).toString();
    }

    @GetMapping
    public List<Animal> findAll() {
        List<Animal> animals = service.findAll();
        System.out.println("** REST Animal" + animals);
        return animals;
    }

}

