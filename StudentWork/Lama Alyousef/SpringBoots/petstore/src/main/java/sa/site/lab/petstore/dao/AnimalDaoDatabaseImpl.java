package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    @Override
    public Animal findById(int id) {
        System.out.println("** AnimalDaoDatabaseImpl.findById: " + id);
        throw new RuntimeException("not available yet"); // Runtime exception is Special beaucase its not checked exception
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("** AnimalDaoDatabaseImpl.findAll()" );
        throw new RuntimeException("not available yet");
    }

    @Override
    public void add(Animal animal){
        System.out.println("* AnimalDaoDatabaseImpl.add() ");
        throw new RuntimeException("not available yet");
    }
} // The End..
