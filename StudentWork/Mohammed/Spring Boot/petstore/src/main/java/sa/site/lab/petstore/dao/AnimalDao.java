package sa.site.lab.petstore.dao;

/*
Data access for Pet Domain Object
CRUD Opretions
 */


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

@Repository
public class AnimalDao {

    public Animal findPet (int id){
        return new Cat("Kitty");
    } // END findPet METHOD ..

} // END CLASS ..
