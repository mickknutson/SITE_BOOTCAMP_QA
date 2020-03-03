package sa.site.lab.petstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

@Controller
public class AnimalControllerImpl implements Animalcontroller {

    @Autowired
    private AnimalService animalService;

    @Override
    public Animal findPet(int id) {
        return animalService.findPet(id);
    }
}
