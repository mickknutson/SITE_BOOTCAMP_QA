package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api/animal")//uri for the entire this class
public class AnimalEndpointImpl{

    @Autowired
    private AnimalService service;

    //@PathVariable = "/some/path"
    @GetMapping("/{id}")//uri, mapping

    public String findById(@PathVariable int id, Model model){

        return service.findById(id).toString();
    }

    @GetMapping
    public List<Animal> findAll(){
        List<Animal> animals = service.findAll();
        System.out.println("REST Animals: " + animals);
        return animals;
    }
    public Boolean add (Animal animal){
        throw new RuntimeException("NOt implemented yet");
    }
    public Boolean delete (int id){
        throw new RuntimeException("NOt implemented yet");
    }
    public Boolean update (Animal animal){
        throw new RuntimeException("NOt implemented yet");
    }


}
