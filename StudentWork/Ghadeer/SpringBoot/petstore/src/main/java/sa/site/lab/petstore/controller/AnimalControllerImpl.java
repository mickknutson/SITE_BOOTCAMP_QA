package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/animal")//url i want to map to
public class AnimalControllerImpl implements AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model){
        System.out.println("AnimalController.findPet:"+id);

        Animal animal= service.findById(id);
        model.addAttribute("animal",animal);
        return "Animal";//smth to view in animal.html
    } //End findPet method

    /*
    accept GET request on
    http://localhost:8080/List.html
    shall send a string no a list
     */
    @GetMapping("/List.html")
    @Override
    public String findAll(Model model){
        System.out.println("AnimalController.findAll()");

        List<Animal> allAnimals=service.findAll();

        //add list to the response model
        model.addAttribute("allAnimals",allAnimals);


        return "List"; //send back the client page
    }
    //add http mapping
    @Override
    public void add(Animal animal){
        service.add(animal);
        //todo: add proper logic
    }

//    public void fillMethod(){
//        service.fillMethod();
//    }
}
