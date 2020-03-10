package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api/animal")
public class AnimalEndPointImpl {

    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public String findById(@PathVariable int id,
                           Model model) {
//        Animal animal = service.findById(id);
//        model.addAttribute("animal" , animal);
        if (service.findById(id) == null)
            return "";
        else
            return service.findById(id).toString();
    }

    @GetMapping
    public List<Animal> findAll(Model model) {
        List<Animal> animalList = service.findAll();
       return animalList;
    }

    @GetMapping("/add")
    public String add(Model model) {
        Animal animal = new Animal();
        model.addAttribute("animal" , animal);
        return "add";
    }

    @PostMapping("/create")
    public String create (Animal animal){
        System.out.println(animal);
        // FIXME : NEED VALIDATION!!

        // ADD VALIDATED Animal to Database !
        service.add(animal);
        return"redirect:api/animal/list.html";
    }

}
