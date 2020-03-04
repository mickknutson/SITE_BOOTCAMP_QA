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

    public static Map<Integer, Animal> animalMap;

    public AnimalDaoImpl() {
        animalMap = new HashMap<>();
        animalMap.put(1, new Cat("kitty"));
        animalMap.put(2, new Dog("bubby"));
    }

    // Method Level
    public Animal findPet(int id) {
        System.out.println("* AnimalDao: " + id);

        if (animalMap.containsKey(id)) {
            System.out.println("Animal Found");
            return animalMap.get(id);
        } else {
            return null;
        }
        //return new Cat("Kitty");
    }//End findPet method

    @Override
    public Map<Integer, Animal> findAll() {
        System.out.println(" *AnimalDao.findAll()");
        return animalMap;
        // from map

    }

}// The End..
