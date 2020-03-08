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

@Controller
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController{

    @Autowired
    private AnimalService service;

    /**
     * accept GET requests on:
     * http://localhost:8080/animal/1
     * http://localhost:8080/animal/2
     * @RequestParam == QueryString variable
     * @PathVariable = "/some/path"
     */
    @GetMapping("/{id}")
    @Override
    public String findById(   @PathVariable int id,
                             Model model){
        System.out.println("* AnimalController.findById: " + id);

        Animal animal = service.findById(id);

        model.addAttribute("animal", animal);

        return "animal";

    }

    /**
     * accept GET requests on:
     * http://localhost:8080/animal/list.html
     *
     */
    @GetMapping("/list.html") // Should give us Model
    @Override
    public String findAll(Model model){
        System.out.println("* AnimalController.findAll()");

        // Get List of Animals from DB
        List<Animal> allAnimals = service.findAll();

        // Add List to Response Model:
        model.addAttribute("allAnimals", allAnimals);

        // Return View Page:
        return "list"; // send back 'list.html'
    }

    // Add HTTP Mapping
    @Override
    public void add(Animal animal){
        System.out.println("* AnimalController.add()");
        // TODO: Add PROPER Logic
    }

}
