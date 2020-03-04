package sa.site.lab.petstore.service;


import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

// @ ... ==> stereotype

// interface driven design

public interface AnimalService {

    public List<Animal> findAll();
    public Animal findPet(int id);

}

