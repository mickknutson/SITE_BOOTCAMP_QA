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
public class AnimalControllerImpl implements AnimalController{

    @Autowired
    private AnimalService service;

//    private Animal animal;
//    List<AnimalController>


    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id , Model model) {
        System.out.println("* In Controller findById:* " +id);
       Animal animal = service.findById(id);
       model.addAttribute("animal" , animal);
       return "animal";

    }

    /*
    * accept get mapping on:
    * http://localhsot:8080/list.html
    *
    * html html html html html html nader from the html page
    *
    * */

    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {
        System.out.println("* In Controller findAll()*");
        List<Animal> animals = service.findAll();

        model.addAttribute("allAnimals" , animals);
        return "list"; // send back index.html
    }

    @Override
    @GetMapping("/add.html")
    public String add(Model model) {
        System.out.println("Animal controller.add()");
        model.addAttribute(new Animal());
        return "add";
    }

    @PostMapping("new")
    @Override
    public String create(Animal animal){
        System.out.println("Animal controller Create()" + animal);
        //FIXME: add validation here
        //NOTE: add validated animal from the DB
        service.add(animal);

        return "redirect:/animal/list.html";

    }

    @GetMapping("/delete/{id}")
    @Override
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/animal/list.html";
    }
}
