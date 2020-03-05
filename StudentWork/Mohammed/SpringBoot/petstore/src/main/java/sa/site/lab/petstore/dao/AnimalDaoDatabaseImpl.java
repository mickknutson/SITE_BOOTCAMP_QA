package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl  implements AnimalDao {

    @Autowired
    private AnimalRepository repository;

    // TODO : MUST implement !
    public Animal findById(int id) {
        System.out.println("## AniamlDaoDatabaseImpl.findPet: " + id);
        //return repository.findById(id).get(); <--- Dose not WORK!
        Optional<Animal> result = repository.findById(id);
        if (result.isPresent()){
            return result.get();
        } else {
            return null;
        }
    }

    // TODO : MUST implement !
    public List<Animal> findAll() {
        System.out.println("## AniamlDaoDatabaseImpl.findAll: ");
        List<Animal> animals = new ArrayList<>();
       // animals.addAll(repository.findAll());
       //return
        return null;
    }

    // TODO : MUST implement !
    public void add(Animal animal) {
        System.out.println("AnimalDaoDatabaseImpl.add()");
        repository.save(animal);
    }
} // end class ...
