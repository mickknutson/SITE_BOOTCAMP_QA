package sa.site.lab.petstore.service;


import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;

// @ ... ==> stereotype

// interface driven design

public interface AnimalService {

    public Animal findPet(int id);

}

