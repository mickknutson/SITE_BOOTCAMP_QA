package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

import java.util.List;

/**
 * Data access for pet domain object
 *
 * CRUD
 *
 * Stereotype
 *
 * Component
 * Services
 * Repository
 * Controller
 */
@Repository
public class AnimalDaoImpl implements AnimalDao {// animalDao

    // Method Level
    public Animal findPet(int id){
        return new Cat("Kitty");
    }//End findPet method

    @Override
    public List<Animal> findAll() {
        return null;
    }

/*    findAll() {
        return null;
    }*/
}// The End..
