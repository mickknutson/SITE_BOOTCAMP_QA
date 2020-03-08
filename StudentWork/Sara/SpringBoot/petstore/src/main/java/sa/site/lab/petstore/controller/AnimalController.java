package sa.site.lab.petstore.controller;

import org.springframework.ui.Model;
import sa.site.lab.petstore.domain.Animal;

public interface AnimalController {
    String findById(int id,Model model);

    String findAll(Model model);

    void add(Animal animal);
}
