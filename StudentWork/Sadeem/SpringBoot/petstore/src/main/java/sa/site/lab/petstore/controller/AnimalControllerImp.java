package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@Controller
@RequestMapping("/animal")
public class AnimalControllerImp implements AnimalController {
       @Autowired
       private AnimalService service;

    /**
     * accept GET request on:
     * http://localhost:8080/animal/PK
     *http://localhost:8080/animal/1
     */
    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model) {
        System.out.println("* AnimalController.findpet: " +id);
        Animal animal = service.findById(id);
        model.addAttribute("animal",animal);
        return "animal";
    }

    /**
     * accept GET request on:
     * http://localhost:8080/list.html
     * @return
     */
    @Override
    @GetMapping("/list.html") //should give us model
    public String findAll(Model model){
        System.out.println("* AnimalController.findall()");
        //get list of animals from DB
        List<Animal> allAnimals = service.findAll();

        //add list of response model
        model.addAttribute("allAnimals",allAnimals);

        //return view page
        return "list"; // name of the page i want to send back //send back "list.html"
    }

    // view add animal html page
    @GetMapping("add")
    @Override
    public String add(Model model){
        System.out.println("* AnimalController.add()");
        model.addAttribute(new Animal());
        return "add";
    }

    @PostMapping("new")
    public String create(Animal animal){
        System.out.println("*AnimalController.create() -" + animal);
        return "redirect:/animal/list.html";
    }
}
