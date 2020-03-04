package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {
    // hard code
    // H2-




    @Override
    public Animal findById(int id) {
        System.out.println("*  AnimalDaoDatabaseImpl.findPet: " + id);
        throw new RuntimeException("NOT Available Yet.");
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("*  AnimalDaoDatabaseImpl.findAll() ");
        throw new RuntimeException("NOT Available Yet.");
    }

    @Override
    public void add(Animal animal) {
        System.out.println("*  AnimalDaoDatabaseImpl.add() ");
        throw new RuntimeException("NOT Available Yet.");
    }
}
