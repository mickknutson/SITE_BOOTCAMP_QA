package sa.site.lab.petstore.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sa.site.lab.petstore.domain.Animal;

public interface AnimalController {

   String findById(int id, Model model);

    String findAll(Model model);

    String add(Model model);

    String create (Animal animal);

    String delete ( int id);
}

