package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api/animal")
public class AnimalEndPointImpl {

    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String findById(@PathVariable int id, Model model) {
//        Animal animal = service.findById(id);
//        model.addAttribute("animal" , animal);
        return service.findById(id).toString();
    }

    @GetMapping
    public List<Animal> findAll(Model model) {
        List<Animal> animalList = service.findAll();
       return animalList;
    }
    
}
