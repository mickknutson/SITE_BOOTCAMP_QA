package sa.site.lab.petstore.controller;

import org.hibernate.loader.plan.spi.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import javax.servlet.http.PushBuilder;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * accept GET request on:
 * http://localhost:8080/list.html
 * @return
 */
@Controller
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController {
    @Autowired
    private AnimalService service;

    /**
     * accept GET request on:
     * http://localhost:8080/animal/1
     * @return
     */
    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model) {
        System.out.println("** AnimalController.FindById():" + id);
        Animal animal = service.findById(id);
        model.addAttribute("animal",animal);
        return "animal";
    }

    @Override
    @GetMapping("/list.html") //should give us Model
    public String findAll(Model model) {
        System.out.println("** AnimalController.FindAll():");

        //Need Model Object
        //Get List of Animals from DB
        List<Animal> allAnimals =  service.findAll();
        //Add List to Response Model:
        model.addAttribute("allAnimals",allAnimals);

        //Return View Page:
        return "list"; //send back list.html

    }
    //Add HTTP Mapping
    //View Add Animal HTML page
    @GetMapping("add")
    @Override
    public String add(Model model) {
        System.out.println("** AnimalController.add() ");
        model.addAttribute(new Animal());
        return "add";

    }
    @PostMapping("new")
    public String Create(Animal animal){
        System.out.println(" * AnimalController.create() - "+animal);
        return "redirect:/animal/list.html";
    }

}

