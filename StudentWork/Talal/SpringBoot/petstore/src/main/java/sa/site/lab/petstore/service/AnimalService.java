package sa.site.lab.petstore.service;


import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

// @ ... ==> stereotype

// interface driven design

public interface AnimalService {

    public Animal findById(int id);
    public List<Animal> findAll();
    void add (Animal animal);

}

