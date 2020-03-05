package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    @Autowired
    private AnimalRepository repository;


    // Must implement
    @Override
    public Animal findById(int id) {
        System.out.println("** AnimalDaoDatabaseImpl.findById: " + id);
       // throw new RuntimeException("Dao not available yet"); // Runtime exception is Special beaucase its not checked exception
       Optional<Animal> result = repository.findById(id); // Beacuse it may don't find any value of the provided id, so we need to check first
       if(result.isPresent()){
          return result.get();
       } else{
           return null;
       }
    }

    // TODO: Must implement
    @Override
    public List<Animal> findAll() {
        System.out.println("** AnimalDaoDatabaseImpl.findAll()" );
        throw new RuntimeException("Dao not available yet");
    }

    // TODO: Must implement
    @Override
    public void add(Animal animal){
        System.out.println("* AnimalDaoDatabaseImpl.add() ");
        // use Spring Data Repository to access the Animal TABLE
        repository.save(animal);
    }
} // The End..
