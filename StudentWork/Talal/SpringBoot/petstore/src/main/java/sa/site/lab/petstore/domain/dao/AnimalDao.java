package sa.site.lab.petstore.domain.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

/**
 * Data access for Pet Domain Object
 */
@Repository
public class AnimalDao {

    public Animal findPet (int id ){
        return new Cat("kitty");


    }


}
