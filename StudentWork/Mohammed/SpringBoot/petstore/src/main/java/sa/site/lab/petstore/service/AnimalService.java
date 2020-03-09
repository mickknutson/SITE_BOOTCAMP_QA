package sa.site.lab.petstore.service;

import sa.site.lab.petstore.domain.Animal;

import java.util.List;

/*
Illegal :
AnimalService service = new AnimalService();


Interface driven Design 
 */
public interface AnimalService {

    public Animal findById(int id);
    List<Animal> findAll();
    void add(Animal animal);
    boolean delete(int id);


}
