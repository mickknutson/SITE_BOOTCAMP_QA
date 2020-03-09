package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;
@RestController
@RequestMapping("/api/animal")//URI
public class AnimalEndPointImpl {

    @Autowired
    private AnimalService service;
@GetMapping("/id")
@ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public Animal findById(int id, Model model){
//        throw new RuntimeException("not available yet");
    return service.findById(id);
    }
    @GetMapping
    public List<Animal> findAll(Model model) {
        List<Animal> animals=service.findAll();
        System.out.println("** REST Animals:"+animals);
        return animals;
    }



}
