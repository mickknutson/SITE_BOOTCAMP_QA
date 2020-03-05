package sa.site.lab.petstore.Dao;


import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import javax.persistence.Id;
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
       Optional<Animal> result= repository.findById(id); //search about Optional, it relates on null
        if (result.isPresent()){
            return result.get();
        }else{
            return null;
        }

    }
    //TODO::Must Implemenet

    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDaoDatabaseImpl.findAll()");
        throw new RuntimeException("DAO not available yet");

    }
    //TODO::Must Implemenet

    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalDaoDatabaseImpl.add()");
        //USING A SPRING DATA REPOSITORY TO ACCESS THE ANIMAL TABLE
        repository.save(animal);
    }
} //The End ...
