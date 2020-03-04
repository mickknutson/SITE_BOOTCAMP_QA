package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;
import sun.applet.resources.MsgAppletViewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Data access for pet domain object
 * <p>
 * CRUD
 * <p>
 * Stereotype
 * <p>
 * Component
 * Services
 * Repository
 * Controller
 */
@Repository
public class AnimalDaoImpl implements AnimalDao {// animalDao

    // Map
/*    Map <Object, Animal> animals = new HashMap<>();
    animals.put ("foo","foo");*/

    public static Map<Integer, Animal> animals;

    public AnimalDaoImpl() {
        animals = new HashMap<>();
        animals.put(1, new Cat("kitty"));
        animals.put(2, new Dog("Puppy"));
    }

    // Method Level
    public Animal findPet(int id) {
        System.out.println("* AnimalDao: " + id);

        if (animals.containsKey(id)) {
            return animals.get(id);
        } else {
            return null;
        }
        //return new Cat("Kitty");
    }//End findPet method

    @Override
    public List<Animal> findAll() {
        System.out.println(" *AnimalDao.findAll()");
        return animals.values().stream().collect(Collectors.toList());
        //return (List<Animal>)animals.values();
        // from map

    }

}// The End..
