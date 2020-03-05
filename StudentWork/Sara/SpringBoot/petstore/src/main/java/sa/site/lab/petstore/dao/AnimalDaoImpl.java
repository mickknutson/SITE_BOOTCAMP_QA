package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AnimalDaoImpl implements AnimalDao {
    Animal cat1 = new Animal("Bella");
    Animal cat2 = new Animal("Caramella");
    Animal dog1 = new Animal("Lusy");

    //LAB: Create Map of Animals
    private Map<Integer, Animal> animalMap;

    private int counter = 0;

    public AnimalDaoImpl() {

        animalMap = new HashMap<>();

        animalMap.put(++counter, cat1);
        animalMap.put(++counter, cat2);
        animalMap.put(++counter, dog1);

    }

    @Override
    public Animal findById(int id) {

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
//        allAnimals.add(cat1);
//        allAnimals.add(cat2);
//        allAnimals.add(dog1);
    }

    @Override
    public void add(Animal animal) {
        System.out.println("*  AnimalDaoImpl.add() ");
        animalMap.put(++counter, animal);
    }
}
