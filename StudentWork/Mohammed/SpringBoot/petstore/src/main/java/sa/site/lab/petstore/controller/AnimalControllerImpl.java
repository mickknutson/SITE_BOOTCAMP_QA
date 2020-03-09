package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController {

    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id ,
                           Model model) {

        System.out.println(" *AnimalController.findPet: " + id);
        Animal animal = service.findById(id);
        model.addAttribute("animal" , animal);
        return "animalInfo";
//        return service.findById(id);
    }

    /*
    accept requests of:
    http://localhost:8080/list.html
     */
    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {
        System.out.println("*AnimalController.findAll() ");
        List<Animal> allAnimals = service.findAll();
        model.addAttribute("allAnimals" , allAnimals);
        return "list"; // send back 'list.html'
//        return service.findAll();
    }

    @GetMapping("/add")
    @Override
    public String add(Model model) {
        System.out.println("* AnimalController.add");
        Animal animal = new Animal();
        model.addAttribute("animal" , animal);
        return "add";
    }
    
    @PostMapping("/create")
    @Override
    public String create (Animal animal){
        System.out.println(animal);
        // FIXME : NEED VALIDATION!!

        // ADD VALIDATED Animal to Database !
        service.add(animal);
        return"redirect:/animal/list.html";
    }

}
