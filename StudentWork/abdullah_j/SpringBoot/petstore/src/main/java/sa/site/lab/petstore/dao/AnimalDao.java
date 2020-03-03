package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

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
public class AnimalDao {

    // Method level
    public Animal findPet(int id){
        return new Cat("kitty");
    } // end findPet method

} // The End..
