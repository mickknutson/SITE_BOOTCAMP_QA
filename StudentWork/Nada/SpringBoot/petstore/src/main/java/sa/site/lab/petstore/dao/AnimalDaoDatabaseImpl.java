package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;


@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    @Autowired
    private AnimalRepository repository;


    //TODO: Must implement
    public Animal findById(int id) {
        System.out.println("* AinmalDaoDatabaseImpl.findPet:" + id);
        Optional<Animal> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    private Optional<Animal> getAnimal(int id) {
        return repository.findById(id);
    }


    //TODO: Must implement
    public List<Animal> findAll() {
        System.out.println("* AinmalDaoDatabaseImpl.findAll()");
        Iterable<Animal> result = repository.findAll();

        List<Animal> animals = new ArrayList<>();

        for (Animal animal : result) {
            animals.add(animal);
        }
            return animals;
    }

    //TODO: Must implement
    public void add(Animal animal) {
        System.out.println("AinmalDaoDatabaseImpl.add()");
        //  use Spring Data Repository access the Animal TABLE
        repository.save(animal);
    }

    @Override
    public boolean delete (int id){
        System.out.println("AnimalDaoDatabaseImpl.add()");

        Optional<Animal> result = repository.findById(id);
        if (result.isPresent()) {
            Animal animal=result.get();
            repository.deleteById(id);
            return true;

        }
        else {
            return false;
        }

    }

}
