package sa.site.lab.petstore.controller;

import org.springframework.ui.Model;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalController {

    public Animal findById(int id);
    String findAll(Model model);
    void add(Animal animal);
}
