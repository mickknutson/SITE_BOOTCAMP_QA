package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@Controller // for web, return html page
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController {

    @Autowired
    private AnimalService service;

    /**
     * accept GET requests on:
     * http://localhost:8080/animal/PK
     * http://localhost:8080/animal/1
     * @RequestParam == QueryString Variable
     * @PathVariable = "/some/path"
     */
    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model) {

        System.out.println(" * AnimalController.findById: " + id);

        Animal animal = service.findById(id);

        model.addAttribute("animal", animal);

        return "animal";
    }

    /**
     * accept GET requests on:
     * http://localhost:8080/list.html
     *
     */

    @GetMapping("/list.html") // Should give us Model
    @Override
    public String findAll(Model model) {
        System.out.println(" * AnimalController.findAll():");

        // *** Need Model Object ****

        // Get List of Animals from DB
        List<Animal> allAnimals = service.findAll();

        // Add List ro Response Model
        model.addAttribute("allAnimals", allAnimals);

        // Return View Page
        return "list"; // Name of the page i want to send back // Send back 'list.html'
    }

    // Add HTTP Mapping
    // View Add Animal HTML Page
    @GetMapping("add") // add mean add.html
    @Override
    public String add(Model model){

        System.out.println("* Animal.controller.add");
        // TODO: Add PPROPER Logic
         model.addAttribute(new Animal());
         return "add";
         // return "redirect:/animal/list.html";
    }

    //

    @PostMapping("new")
    @Override
    public String create(Animal animal){
        System.out.println("* AnimalController.create() - " + animal);

        // FIXME: NEED VALIDATION !!
        // NOTE: Add validated Animal to DataBase
        service.add(animal);

        return "redirect:/animal/list.html";
    }

    @Override
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        System.out.println("* AnimalController.delete() - "+id);
        boolean result=service.delete(id);
        System.out.println("Delete result is: "+result);


        return "redirect:/animal/list.html";

    }

}
