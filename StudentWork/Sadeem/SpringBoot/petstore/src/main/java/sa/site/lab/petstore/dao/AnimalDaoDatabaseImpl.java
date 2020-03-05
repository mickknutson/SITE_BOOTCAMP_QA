package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao{
    @Autowired
    private  AnimalRepository repository;

    // TODO: Must implement
    public Animal findById(int id){
        System.out.println("* AnimalDaoDatabaseImpl.findPet: " + id);
       // throw new RuntimeException("DAO not available yet");
        Optional<Animal> result =  repository.findById(id);
       if(result.isPresent()) {
           return result.get();
       }else {
           return null;
       }
    }

    // TODO: Must implement
    public List<Animal> findAll() {
        System.out.println("* AnimalDaoDatabaseImpl.findAll()");
        Iterable<Animal> result = repository.findAll();

        List<Animal> animals = new ArrayList<>();
        for (Animal animal : result) {
            animals.add(animal);
        }
        return animals;
    }

    // TODO: Must implement
    public void add(Animal animal){
        System.out.println("* AnimalDaoDatabaseImpl.add()");
        // use Spring Data Repository to access the Animal TABLE
        repository.save(animal);
    }

} // The End...