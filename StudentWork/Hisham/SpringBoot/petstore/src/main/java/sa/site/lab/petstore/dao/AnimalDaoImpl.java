package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalDaoImpl implements AnimalDao
{

    @Override
    public Animal findPet(int id)
    {
        return new Cat("Kitty");
    }

    @Override
    public List<Animal> findAll()
    {
        List<Animal> allAnimals = new ArrayList<>();

        Cat cat1 = new Cat("Kitten");
        Cat cat2 = new Cat("foo");
        Dog dog1 = new Dog("bar");
        allAnimals.add(cat1);
        allAnimals.add(cat2);
        allAnimals.add(dog1);


        return allAnimals;
    }
}
