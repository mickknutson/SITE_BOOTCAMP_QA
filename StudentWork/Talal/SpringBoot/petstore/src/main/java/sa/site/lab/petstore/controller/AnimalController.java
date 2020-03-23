package sa.site.lab.petstore.controller;

import org.springframework.ui.Model;
import sa.site.lab.petstore.domain.Animal;

public interface AnimalController {
        public String  findAll(Model model);

        public String findById(int id, Model model);

        String add( Model model);

        String create(Animal aninal);


        String delete(int id);
}



