package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AnimalDaoImpl implements AnimalDao {
    Cat cat1 = new Cat("Bella");
    Cat cat2 = new Cat("Caramella");
    Dog dog1 = new Dog("Lusy");

    //LAB: Create Map of Animals
    private Map<Integer, Animal> animalMap;

    public AnimalDaoImpl() {

        animalMap = new HashMap<>();

        animalMap.put(0, cat1);
        animalMap.put(1, cat2);
        animalMap.put(2, dog1);

    }

    @Override
    public Animal findPet(int id) {

        System.out.println("* AnimalDao: " + id);
        // LAB: pull Animal from Map
        if (animalMap.containsKey(id)) {
            return animalMap.get(id); //new Cat("Kitty");
        } else {
            return null;

        }
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDao.findAll()");
        // LAB: return List
        List<Animal> allAnimals = new ArrayList<>(animalMap.values());

        //return  animalMap.values().stream().collect(Collectors.toList());

        return allAnimals;

//        Cat cat1 = new Cat("Bella");
//        Cat cat2 = new Cat("Caramella");
//        Dog dog1 = new Dog("Lusy");
////        allAnimals.add(cat1);
//        allAnimals.add(cat2);
//        allAnimals.add(dog1);
    }
}
