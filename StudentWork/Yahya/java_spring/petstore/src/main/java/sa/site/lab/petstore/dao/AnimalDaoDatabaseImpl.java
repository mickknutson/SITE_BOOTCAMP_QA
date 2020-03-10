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
        Iterable<Animal> result = repository.findAll();
        List<Animal> animals = new ArrayList<>();
        for( Animal animal: result){
            animals.add(animal);
        }
        return animals;
    }

    // TODO : MUST implement !
    public void add(Animal animal) {
        System.out.println("AnimalDaoDatabaseImpl.add()");
        repository.save(animal);
    }

    @Override
    public boolean delete(int id) {
        Animal animal = this.findById(id);
        if (animal == null) {
            return false;
        } else {
            repository.delete(animal);
            return true;
        }
    }
} // end class ...
