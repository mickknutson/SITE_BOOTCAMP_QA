package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Data access for pet domain Objects
CRUD
story types:
components
Services
Repository
Controller
 */
@Repository
public class AnimalDaoImpl implements AnimalDao { //animalDao

    // Method level
    //create map

    Map animals = new HashMap();

    //    List<Animal> animals=new ArrayList<>();
    public AnimalDaoImpl() {
        for (int i = 0; i < 3; i++) {
            animals.put(i, new Cat("kitty" + i + 1));
        }
    }

    public Animal findPet(int id) {
        System.out.println("AnimalDao.findPet:" + id);
//pull map
        if (animals.containsKey(id)) {
            return (Animal) animals.get(id);
        } else
            return null;

    } //End findPet method

    public Map findAll() {
        System.out.println("AnimalDao.findAll()");
        return animals;
    }//end find all method
}//the end..
