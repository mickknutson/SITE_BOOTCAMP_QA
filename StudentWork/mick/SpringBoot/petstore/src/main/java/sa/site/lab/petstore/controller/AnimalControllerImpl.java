package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import javax.validation.Valid;
import java.util.Calendar;
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


    // View Add Animal HTML page
    @GetMapping("add")
    @Override
    public String add(Model model){
        System.out.println("* AnimalController.add()");

        model.addAttribute(new Animal());

        return "add";
    }

    @PostMapping("new")
    public String create(Animal animal){
        System.out.println("* AnimalController.create() - " + animal);

        return "redirect:/animal/list.html";
    }


} // The End...
