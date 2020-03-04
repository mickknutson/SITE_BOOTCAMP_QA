package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        // LAP: Creat Map of Animals.
     Map <Integer,Animal> animals = new HashMap<>();

    public AnimalDaoImpl(){
        // LAB: Populate Map with 3+ Animals.
        animals.put(1, new Cat("Bella"));
        animals.put(2, new Cat("Kitty"));
        animals.put(2, new Cat("Katy"));
    }


    public Animal findPet(int id) {
        System.out.println("* AnimalDao: " + id);

        //animal.containsKey(id)
        return animals.get(id);
    }

    public List<Animal> findAll(){
        System.out.println(" * AnimalDao.findAll()");
        // Create a List of Animals
        // LAB: return List

        // LAB: return List<Animal> from Map
        ArrayList<Animal> valueList = new ArrayList<Animal>(animals.values());

        return valueList;
    }
}
