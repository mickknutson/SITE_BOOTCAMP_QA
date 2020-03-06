package sa.site.lab.petstore.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    @Autowired
    private AnimalRepository repository;

    //  MUST implement
    @Override
    public Animal findById(int id) {
        System.out.println("*** AnimalDao.FindPet(" + id + ") ***");

        Optional<Animal> result = repository.findById(id);

        if (result.isPresent()){
            return result.get();
        }
        else{
            return null;
        }
    }

    // MUST implement
    @Override
    public List<Animal> findAll() {
        System.out.println("*** AnimalDao.findAll() ***");

        Iterable<Animal> result = repository.findAll();
        List<Animal> animals = new ArrayList<>();
        for (Animal animal: result){
            animals.add(animal);
        }

        return animals;
    }

    //  MUST implement
    @Override
    public void add(Animal animal) {
        System.out.println("*** AnimalDao.add() ***");
        // use spring data repository to access the Animal table

        repository.save(animal);


    }
}
