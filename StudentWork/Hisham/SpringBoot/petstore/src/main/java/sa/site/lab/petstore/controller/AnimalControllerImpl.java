package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/list")
    @Override
    public String findAll(Model model)
    {
        System.out.println("* Animal Controller.FindAll() : ");
        List<Animal> allAnimals = service.findAll();
        // add the animals object to the view
        model.addAttribute("allAnimals",allAnimals);
        return "/list";
    }

    @GetMapping("/add")
    @Override
    public String add(Model model)
    {
        System.out.println("* Animal Controller.Add() : ");

        model.addAttribute(new Animal());



        return "add";
    }

    @PostMapping("new")
    @Override
    public String create(Animal animal)
    {
        System.out.println("added "+animal);
        service.add(animal);

        return "redirect:/animals/list";


    }


    @GetMapping("/delete/{id}")
    @Override
    public String delete (@PathVariable int id)
    {
        System.out.println("deleted "+id);
        service.delete(id);


        return "redirect:/animals/list";
    }









}
