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

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController {


    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id , Model model) {

        System.out.println("*** AnimalController.FindPet(" + id + ") ***");
        Animal animal = service.findById(id);

        model.addAttribute("animal" , animal);

        return "animal";
    }

    // accept request on:
    //http://localhost:8080/list.html
    @GetMapping("/list.html") //should give us model
    @Override
    public String findAll(Model model) {
        System.out.println("*** AnimalController.findAll() ***");

        // Need model object
        List<Animal> allAnimals = service.findAll();

        model.addAttribute("allAnimals" , allAnimals);

        return "List";
    }

    @Override
    public void add(Animal animal) {
        System.out.println("*** AnimalController.add() ***");
        service.add(animal);
    }
}
