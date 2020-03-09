package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@Controller
@RequestMapping ("/animal")
public class AnimalControllerImpl implements AnimalController {
    @Autowired
    private AnimalService service;

    /**
     * access GET requests on:
     * http://localhost:8080/animal1/1
     * http://localhost:8080/animal1/2
     * @param id
     * @return
     */
    @GetMapping ("{id}")
    @Override
    public String findById(@PathVariable int id, Model model) {
        System.out.println("* AnimalController.findById(): " + id);
        Animal animal = service.findById(id);

        model.addAttribute("animal",animal);
        return "animal";
    }

    /**
     * accept GET requests on:
     * http://localhost:8080/animal/list.html
     *
     */
    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {
        System.out.println("* AnimalController.findAll()");
        // Get list of animals from DB
        List<Animal> allAnimals = service.findAll();
        // Add list to response model
        model.addAttribute("allAnimals",allAnimals);
        return "list"; //send back 'List.html'
        //return service.findAll();
    }

    // Add HTTP mapping
    // View Add Animal HTML Page
    @GetMapping("add")
    @Override
    public String add(Model model) {
        System.out.println("* AnimalController.add()");
        model.addAttribute(new Animal());
        //return "redirect: /animal/list.html";
        return "add";
        //service.add(animal);
    }
    @PostMapping("new")
    public String create (Animal animal){
        System.out.println("* AnimalController.create() -" + animal);

        //FIXME: Need Validation !!!!
        // NOTE: Add Validated animal to DB

        service.add(animal);
        return "redirect:/animal/list.html";
    }
}
