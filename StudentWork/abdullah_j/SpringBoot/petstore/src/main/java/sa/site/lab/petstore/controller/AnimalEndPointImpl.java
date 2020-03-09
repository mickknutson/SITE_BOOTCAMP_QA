package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api/animal") //URI
public class AnimalEndPointImpl implements AnimalController {

    @Autowired
    private AnimalService service;


    @Override
    public String findById(int id, Model model) {

        return null;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @Override
    public Animal findById(@PathVariable int id) {
        return service.findById(id);
    }


    @Override
    public String findAll(Model model) {
        return null;
    }

    @GetMapping
    @Override
    public List<Animal> findAll() {
        return service.findAll();
    }

    @Override
    public String add(Model model) {
        throw new RuntimeException("Not implemented yet");
    }


    @Override
    public String create(Animal animal) {
        throw new RuntimeException("Not implemented yet");
    }

    @Override
    public String delete(int id) {
        throw new RuntimeException("Not implemented yet");
    }


    /* public boolean delete(int id){
         throw new RuntimeException("Not implemented yet");
     }
    */
    public boolean add(int id) {
        throw new RuntimeException("Not implemented yet");
    }

    public boolean update(int id) {
        throw new RuntimeException("Not implemented yet");
    }

}
