package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

/*
 * Data Access for Pet Domain Object
 *
 * CRUD
 *
 * Stereotypes:
 *
 * Component
 * Service
 * Repository
 * Controller
 *
 * */

@Repository
public class AnimalDaoImpl implements AnimalDao {

    public Animal findPet(int id) {
        return new Cat("Bella");
    }

}
