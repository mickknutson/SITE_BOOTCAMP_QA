package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import javax.swing.text.html.Option;
import java.util.ArrayList;
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
        Optional<Animal> result = repository.findById(id); // Beacuse it may don't find any value of the provided id, so we need to check first
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    // TODO: Must implement
    @Override
    public List<Animal> findAll() {
        System.out.println("** AnimalDaoDatabaseImpl.findAll()");
        Iterable<Animal> result = repository.findAll();

        List<Animal> animals = new ArrayList<>();

        for(Animal animal: result){
            animals.add(animal);
        }
        return animals;
    }

        // TODO: Must implement
        @Override
        public void add (Animal animal){
            System.out.println("* AnimalDaoDatabaseImpl.add() ");
            // use Spring Data Repository to access the Animal TABLE
            repository.save(animal);
        }

             public boolean delete (int id){
                 System.out.println("AnimalDaoDatabaseImpl.add()");

                 Optional<Animal> result = repository.findById(id);
                 if (result.isPresent()) {
                     Animal animal=result.get();
                     repository.deleteById(id);
//                    delete(animal);
                     return true;

                 }
                 else {
                     return false;
                 }


        }

} // The End..
