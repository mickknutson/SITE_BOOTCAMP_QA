package sa.site.lab.petstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;
@RestController
@RequestMapping("/api/animal")
public class AnimalEndPointImpl implements AnimalController {

    @Autowired
    AnimalService service;
@GetMapping("/id")
    public String findById(int id, Model model){
        throw new RuntimeException("not available yet");
    }

    public String findAll(Model model){
        throw new RuntimeException("dao not available yet");
    }

    public String add(Model model){
        throw new RuntimeException("dao not available yet");
    }

    @Override
    public String create (Animal animal){
        throw new RuntimeException("dao not available yet");

    }
    @Override
    public String delete (int id){
        throw new RuntimeException("dao not available yet");

    }

}
