package sa.site.lab.petstore.Dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.Animal.Animal;
import sa.site.lab.petstore.Animal.Cat;
import sa.site.lab.petstore.Animal.Dog;

import java.util.Arrays;
import java.util.List;

@Repository
public class AnimalDaoImpl implements AnimalDao {

    public Animal findPet(int id) {
        return new Cat("Kitty");
    }

    public List<Animal> findAll(){
        //create a list of elements and then return it back at least 2
        return Arrays.asList(
                new Dog("Phe"),
                new Cat("Charlie"),
                new Dog("Simon")


        );
    }
}
