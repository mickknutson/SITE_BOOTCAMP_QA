package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;


@RestController
@RequestMapping("/api/animals")
public class AnimalEndpointImpl
{
    @Autowired
    private AnimalService service;


    @GetMapping("/")
    public List<Animal> findAll()
    {
        List<Animal> animals = service.findAll();
        return animals;
    }

    @GetMapping("/{id}")
    public Animal findById(@PathVariable int id, Model model)
    {
        return service.findById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Animal create(@RequestBody Animal animal)
    {
        service.add(animal);
        return animal;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id)
    {
        service.delete(id);
    }
}
