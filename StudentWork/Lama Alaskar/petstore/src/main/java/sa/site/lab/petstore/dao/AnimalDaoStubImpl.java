package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("AnimalDaoStubImpl")
public class AnimalDaoStubImpl implements AnimalDao {
    // dao = database Access object
    // stub: Hard coded / Brut Force
    // Mock: Easy Mock
    // Map
/*    Map <Object, Animal> animals = new HashMap<>();
    animals.put ("foo","foo");*/

    public static Map<Integer, Animal> animalMap;
    private int counter=0;

    public AnimalDaoStubImpl() {
        animalMap = new HashMap<>();
        animalMap.put(++counter, new Cat("kitty"));
        animalMap.put(++counter, new Dog("bubby"));
    }

    // Method Level
    public Animal findbyid(int id) {
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
        return (Map<Integer, Animal>) animalMap;
        // from map

    }

    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalController.add");
        animalMap.put(++counter,animal);
        //service.add(animal);

    }
}
