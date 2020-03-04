package sa.site.lab.petstore.service;

import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

//@Service //illegal
public interface AnimalService {

    Animal findPet(int id);

    List<Animal> findAll();

}
