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
    @GetMapping ("/list.html")
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
    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalController.add()");
        service.add(animal);
        //TODO: Add PROPER
    }
}
