package sa.site.lab.petstore.service;

import java.util.Map;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalService {
    Animal findByID(int id);

    List<Animal> findAll();

    void add(Animal animal);
}
