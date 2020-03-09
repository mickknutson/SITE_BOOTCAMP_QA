package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;
import sun.font.EAttribute;

import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController{

    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model){
        System.out.println("* AnimalController.findById: " + id);
        Animal animal =  service.findById(id);

        model.addAttribute("animal", animal);
        return "animal";
    }

    /**
     * accept request :
     * http:localhost:8080/list.html
     */
    @GetMapping("/list.html")
    @Override
    public String findAll(Model model){
        System.out.println("* AnimalController.findAll()");

       List<Animal> allAnimals = service.findAll();

       model.addAttribute("allAnimals", allAnimals);


        return  "list";
    }
//    View Add Animal HTML Page
    @GetMapping("add")
    @Override
    public String add(Model model){
        System.out.println("* AnimalController.add()");
//        service.add(animal);
        return  "add";

        @PostMapping("new")
                public String create(Animal animal)
        {
            System.out.println("* AnimalController.create()_" + animal);
        }
    }
}
