package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

/**
 * API Endpoint controller
 *
 * return Json or xml
 *
 * we need: URI, Method
 * URI for entire class is:
 * http://localhost:8080/api/animal
 */
@RestController
@RequestMapping("/api/animal") // URI
public class AnimalEndpointImpl  {

    @Autowired
    private AnimalService service;

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String findById(@PathVariable int id, Model model) {
        // throw new RuntimeException("Not Yet Implemented ");
        return service.findById(id).toString();
    }


    public String findAll(Model model) {
        return null;
    }

//    @GetMapping("{id}")
//    public Animal findById(@PathVariable int id, Model model) {
//        // throw new RuntimeException("Not Yet Implemented ");
//
//    }



    public List<Animal> findAll() {
       // throw new RuntimeException("Not Yet Implemented ");

        List<Animal> animals= service.findAll();
        System.out.println("** REST Animals "+ animals);
        return animals;

    }




    public String add(Model model) {
        throw new RuntimeException("Not Yet Implemented ");

    }


    public String create(Animal aninal) {
        throw new RuntimeException("Not Yet Implemented ");

    }


    public String delete(int id) {
        throw new RuntimeException("Not Yet Implemented ");

    }

//    public boolean delete (int id){
//         throw  new RuntimeException("Not Implemented yet");
//
//    }
}
