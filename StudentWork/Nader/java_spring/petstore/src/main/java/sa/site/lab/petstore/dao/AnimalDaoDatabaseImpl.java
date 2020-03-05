package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    @Autowired
    private AnimalRepository repository;
    //TODO: Must implement:

    @Override
    public Animal findById(int id) {
        System.out.println("## AnimalDaoDatabaseImpl findPet()");

        Optional<Animal> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        else {
            return null;
        }
    }

    //TODO: Must implement:

    @Override
    public List<Animal> findAll() {
        System.out.println("## AnimalDaoDatabaseImpl findPet()");
        throw  new RuntimeException("Dao not available yet");
    }


    //TODO: Must implement:

    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalDatabaseImpl.add()");
        repository.save(animal);
    }
}
