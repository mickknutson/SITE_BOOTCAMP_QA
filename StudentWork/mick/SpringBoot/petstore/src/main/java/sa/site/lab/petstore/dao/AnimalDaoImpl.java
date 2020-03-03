package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

import java.util.List;

/**
 * Data access for Pet Domain Object
 *
 * CRUD
 *
 * Stereotype:
 *
 * Component
 * Service
 * Repository
 * Controller
 *
 */
@Repository
public class AnimalDaoImpl implements AnimalDao{

    // Method level
    public Animal findPet(int id){
        return new Cat("kitty");
    } // end findPet method


    public List<Animal> findAll(){

        // Create a List of Animals
        return null;
    }

} // The End..
