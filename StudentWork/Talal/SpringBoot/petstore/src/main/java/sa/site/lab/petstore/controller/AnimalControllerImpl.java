package sa.site.lab.petstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

/**
 * Web controller
 * Return
 * MIMI : html.text
 */

@Controller
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController {

    @Autowired
    private AnimalService animalService;
//    @GetMapping("/{id}")
//    @Override
//    public String findById(@PathVariable int id,
//                           Model model) {
//        System.out.println("* find By Id: "+id);
//        Animal animal= animalService.findById(id);
//
//        model.addAttribute("animal", animal);
//        return "animal";
//    }


    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id,
                           Model model) {
        System.out.println("* AnimalController.findById: " + id);

        Animal animal = animalService.findById(id);

        model.addAttribute("animal", animal);

        return "animal";

    }


//    @GetMapping("/list.html")
//    @Override
//    public String findAll(Model model) {
//
//        //Need model object
//        List <Animal> allanimals= animalService.findAll();
//        model.addAttribute("allAnimals",allanimals);
//        System.out.println("Animal Controller: ");
//              //  animalService.findAll();
//        return "list";
//    }

    @GetMapping("/list.html") // Should give us Model
    @Override
    public String findAll(Model model) {
        System.out.println("* AnimalController.findAll()");

        // Get List of Animals from DB
        List<Animal> allAnimals = animalService.findAll();

        // Add List to Response Model:
        model.addAttribute("allAnimals", allAnimals);

        // Return View Page:
        return "list"; // send back 'list.html'
    }


//    @GetMapping("add")
//    @Override
//    public String add(Model model) {
//        System.out.println("AnimalControllerImpl.add()");
//        model.addAttribute(new Animal());
//        //animalService.add(animal );
//        return"add";
//    }


    // View Add Animal HTML page
    @GetMapping("add")
    @Override
    public String add(Model model) {
        System.out.println("* AnimalController.add()");

        model.addAttribute(new Animal());

        return "add";
    }


//
//    @PostMapping("new")
//    @Override
//    public String create(Animal animal){
//        System.out.println("* AnimalController.create() - " + animal);
//
//        // FIXME: NEED VALIDATION !!!!!
//
//        // NOTE: Add validated Animal to Database
//        animalService.add(animal);
//
//        return "redirect:/animal/list.html";
//    }


    @PostMapping("new")
    @Override
    public String create(Animal animal) {
        System.out.println("* AnimalController.create() - " + animal);

        // FIXME: NEED VALIDATION !!!!!

        // NOTE: Add validated Animal to Database
        animalService.add(animal);

        return "redirect:/animal/list.html";
    }

    @GetMapping("delete/{id}")
    @Override
    public String delete(@PathVariable int id) {

        System.out.println("* AnimalController.dekete() - " + id);

       boolean result =  animalService.delete(id);
        System.out.println("delete result is: "+result);
        //TODO: Handle it in HTML

        return "redirect:/animal/list.html";
    }
}
