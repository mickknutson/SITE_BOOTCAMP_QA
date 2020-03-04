package sa.site.lab.petstore.service;

import java.util.Map;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalService {
    public Animal findPet(int id);

    public  Map<Integer, Animal> findAll();

}
