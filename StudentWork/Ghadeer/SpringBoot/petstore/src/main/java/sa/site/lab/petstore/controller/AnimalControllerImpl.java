package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")//url i want to map to
public class AnimalControllerImpl implements AnimalController {
    @Autowired
    private AnimalService service;
    public Animal findById(int id){
        System.out.println("AnimalController.findPet:"+id);

        return service.findById(id);
    } //End findPet method

    /*
    accept GET request on
    http://localhost:8080/List.html
    shall send a string no a list
     */
    @GetMapping("/List.html")
    @Override
    public String findAll(){
        System.out.println("AnimalController.findAll()");

        List<Animal> allAnimals=service.findAll();

        return "List";//send back
    }
    public void add(Animal animal){
        service.add(animal);
    }

//    public void fillMethod(){
//        service.fillMethod();
//    }
}
