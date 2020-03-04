package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl  implements AnimalDao{

    @Override
    public Animal findPet(int id) {
        System.out.println("## AniamlDaoDatabaseImpl.findPet: " + id);
        throw new RuntimeException("* findPet() Not available!");
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("## AniamlDaoDatabaseImpl.findAll: ");
        throw new RuntimeException("* findAll() Not available!");
    }

    @Override
    public void addAnimal(Animal animal) {

    }
} // end class ...
