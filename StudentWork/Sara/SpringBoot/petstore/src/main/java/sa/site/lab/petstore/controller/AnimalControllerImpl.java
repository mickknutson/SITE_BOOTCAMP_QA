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
    public String findById(@PathVariable int id,
                           Model model) {
        System.out.println("* AnimalController.findById: " + id);
        Animal animal = service.findById(id);
        model.addAttribute("animal", animal);
        return "animal";
    }

    /**
     * Accept requests on:
     * http://localhost:8080/list.html
     *
     * @return
     */
    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {
        System.out.println("* AnimalController.findAll()");
        // Get list of animals from DB
        List<Animal> allAnimals = service.findAll();
        //Add list to response model:
        model.addAttribute("allAnimals", allAnimals);
        // Return view page
        return "list"; // send back list.html
    }

    // Add HTTP Mapping
//    @PostMapping("/new")
    @GetMapping("add")
    @Override
    public String add(Model model) {
        System.out.println("* AnimalController.add()");
        // Add PROPER logic
//        service.add(animal);
        model.addAttribute(new Animal());
        return "add";
    }

    @PostMapping("new")
    @Override
    public String create(Animal animal) {
        System.out.println("* AnimalController.create() " + animal);
        // NOTE : VALIDATION !!!!
        service.add(animal);
        // FIXME : VALIDATION !!!!
        return "redirect:/animal/list.html";
    }

    @GetMapping("/delete/{id}")
    @Override
    public String delete(@PathVariable int id){
        System.out.println("* AnimalController.delete() - "+id);
        boolean result=service.delete(id);
        System.out.println("Delete result is: "+result);
        service.delete(id);


        return "redirect:/animal/list.html";

}
}
