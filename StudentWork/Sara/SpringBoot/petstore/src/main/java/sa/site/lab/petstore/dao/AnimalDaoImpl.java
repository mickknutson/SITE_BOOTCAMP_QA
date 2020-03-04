package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AnimalDaoImpl<cat1> implements AnimalDao
{
    Cat cat1 = new Cat("Bella");
    Cat cat2 = new Cat("Caramella");
    Dog dog1 = new Dog("Lusy");

    //LAB: Create Map of Animals

    Map<Integer, Animal> animalMap = new HashMap<>();
    public AnimalDaoImpl(){
        animalMap.put(0, cat1);
        animalMap.put(1, cat2);
        animalMap.put(2, dog1);

    }

    @Override
    public Animal findPet(int id)
    {

        System.out.println("* AnimalDao: "+id );
        // LAB: pull Animal from Map

        return animalMap.get(id); //new Cat("Kitty");
    }

    @Override
    public List<Animal> findAll()
    {
        System.out.println("* AnimalDao.findAll()");
        // LAB: return List
        List<Animal> allAnimals = new ArrayList<> (animalMap.values());


//        Cat cat1 = new Cat("Bella");
//        Cat cat2 = new Cat("Caramella");
//        Dog dog1 = new Dog("Lusy");
////        allAnimals.add(cat1);
//        allAnimals.add(cat2);
//        allAnimals.add(dog1);

        return allAnimals;
    }
}
