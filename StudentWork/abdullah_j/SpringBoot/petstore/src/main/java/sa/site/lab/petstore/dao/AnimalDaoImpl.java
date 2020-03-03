package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Data access for Pet Domain Object
 *
 * CRUD
 *
 * Steotypes:
 *
 * Component
 * Service
 * Repository
 * Controller
 */
@Repository
public class AnimalDaoImpl implements AnimalDao {

    // Method level

    @Override
    public Animal findPet(int id) {
        return new Cat("kitty");
    } // end findPet method

    @Override
    public List<Animal> findAll() {

        List<Animal> list = new ArrayList<>();
        list.add(new Cat("cat1"));
        list.add(new Dog("dog1"));
        list.add(new Cat("cat2"));
        list.add(new Dog("dog2"));
        return list;

    }
} // The End..
