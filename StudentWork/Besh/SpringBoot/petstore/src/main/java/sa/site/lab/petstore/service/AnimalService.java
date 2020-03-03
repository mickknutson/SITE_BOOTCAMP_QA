package sa.site.lab.petstore.service;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalService {
    public Animal findPet(int id);

    public  List<Animal> findAll();
}
