package sa.site.lab.petstore.service;


import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalService
{
     Animal findPet(int id);
     List<Animal> findAll();

}
