package sa.site.lab.petstore.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {
    //TODO::Must Implemenet

    @Autowired
    private AnimalRepository repository;

    @Override
    public Animal findById(int id) {
        System.out.println("* AnimalDaoDatabaseImpl.findPet: " + id);
        Optional<Animal> result = repository.findById(id); //search about Optional, it relates on null
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }

    }
    //TODO::Must Implemenet

    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDaoDatabaseImpl.findAll()");
        Iterable<Animal> result = repository.findAll(); //type of list to go through all the element

        List<Animal> animals = new ArrayList<>();
        for (Animal animal : result) {
            animals.add(animal);
        }
        return animals;

    }
    //TODO::Must Implement

    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalDaoDatabaseImpl.add()");
        //USING A SPRING DATA REPOSITORY TO ACCESS THE ANIMAL TABLE
        repository.save(animal);
    }
} //The End ...
