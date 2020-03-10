package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

@RestController
@RequestMapping("/api/animal") // URI
public class AnimalEndpointImpl {

    @Autowired

    private AnimalService service;

    @GetMapping("/{id}")
    public Animal findById(@PathVariable int id, Model model) {
        return service.findById(id);
    }

    public String findAll(Model model) {
        throw new RuntimeException("NOT IMPLEMENTED.");
    }

}
