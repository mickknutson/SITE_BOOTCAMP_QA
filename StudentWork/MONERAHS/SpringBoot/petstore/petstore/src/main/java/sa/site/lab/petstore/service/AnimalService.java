package sa.site.lab.petstore.service;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.Animal.Animal;

import java.util.List;

@Repository
public interface AnimalService {

    public Animal findPet(int id);


    List<Animal> findAll();
}
