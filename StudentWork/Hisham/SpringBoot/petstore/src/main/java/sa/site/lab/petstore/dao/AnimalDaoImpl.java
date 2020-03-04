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
public class AnimalDaoImpl implements AnimalDao
{
    Map<Integer,Animal> allAnimals = new HashMap<>();

    public AnimalDaoImpl()
    {
        allAnimals.put(1,new Cat("kitten"));
        allAnimals.put(2,new Cat("Cimba"));
        allAnimals.put(3,new Dog("Foo"));
        allAnimals.put(4,new Dog("Bar"));

    }

    @Override
    public Animal findPet(int id)
    {
        if(allAnimals.containsKey(id))
        {
            System.out.println("### AnimalDao : " + allAnimals.get(id).getName());
            return allAnimals.get(id);
        }
        else
        {
            System.out.println("No Animal found with this id");
            return null;
        }
    }

    @Override
    public List<Animal> findAll()
    {




//        List<Animal> allAnimals = new ArrayList<>();
//
//        Cat cat1 = new Cat("Kitten");
//        Cat cat2 = new Cat("foo");
//        Dog dog1 = new Dog("bar");
//        allAnimals.add(cat1);
//        allAnimals.add(cat2);
//        allAnimals.add(dog1);


        return new ArrayList<>(allAnimals.values());
    }
}
