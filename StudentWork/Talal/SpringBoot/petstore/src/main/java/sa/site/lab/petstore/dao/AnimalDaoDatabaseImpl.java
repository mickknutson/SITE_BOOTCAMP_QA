package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    // TODO: Must to implemet
    @Override
    public Animal findById(int id) {
        System.out.println("* AnimalDaoDatabaseImpl.findPet: "+id);
        throw new RuntimeException("Not available yet");

    }
    // TODO: Must to implemet
    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDaoDatabaseImpl.findAll() " );
        throw new RuntimeException("Not available yet");

    }
    // TODO: Must to implemet
    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalDaoDatabaseImpl.findAll() " );
        throw new RuntimeException("Not available yet");

    }
}
