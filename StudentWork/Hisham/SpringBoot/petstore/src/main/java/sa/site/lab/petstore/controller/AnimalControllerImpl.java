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

//@requestparam == queryString
//@pathvariable ==

@Controller
@RequestMapping("/animals")
public class AnimalControllerImpl implements AnimalController
{
    @Autowired
    private AnimalService service;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model)
    {
        System.out.println("* Animal Controller.FindById : "+id);

        Animal animal = service.findById(id);

        model.addAttribute("animal",animal);

        return "/animal";
    }

    // accept requests on /list
    @GetMapping("/list.html")
    @Override
    public String findAll(Model model)
    {
        System.out.println("* Animal Controller.FindAll() : ");
        List<Animal> allAnimals = service.findAll();
        // add the animals object to the view
        model.addAttribute("allAnimals",allAnimals);
        return "/list";
    }

    @Override
    public void add(Animal animal)
    {
        System.out.println("* Animal Controller.Add() : ");

        service.add(animal);

    }
}
