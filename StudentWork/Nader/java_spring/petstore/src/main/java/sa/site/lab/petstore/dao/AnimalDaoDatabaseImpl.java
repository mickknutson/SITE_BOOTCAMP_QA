package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {


    @Override
    public Animal findPet(int id) {
        System.out.println("## AnimalDaoDatabaseImpl findPet()");
        throw new RuntimeException("Not Available");
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("## AnimalDaoDatabaseImpl findPet()");
        throw  new RuntimeException("not available yet");
    }

    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalDataabaseImpl.add()");
        throw new RuntimeException("** NOT YET **");
    }
}
