package sa.site.lab.petstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
@RequestMapping("/animal")
public class AnimalControllerImpl implements AnimalController {

    @Autowired
    private AnimalService animalService;
    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id,
                           Model model) {
        System.out.println("* find By Id: "+id);
        Animal animal= animalService.findById(id);

        model.addAttribute("animal", animal);
        return "animal";
    }









    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {

        //Need model object
        List <Animal> allanimals= animalService.findAll();
        model.addAttribute("allAnimals",allanimals);
        System.out.println("Animal Controller: ");
              //  animalService.findAll();
        return "list";
    }

    @Override
    public void add(Animal animal) {
        System.out.println("AnimalControllerImpl.add()");
        animalService.add(animal );
    }
}
