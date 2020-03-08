package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AnimalDaoStubImpl implements AnimalDao
{
    private Map<Integer,Animal> animals;
    private int count = 0;
//    public AnimalDaoStubImpl()
//    {
//        animals = new HashMap<>();
//        animals.put(++count,new Cat("kitten"));
//        animals.put(++count,new Cat("Cimba"));
//        animals.put(++count,new Dog("Foo"));
//        animals.put(++count,new Dog("Bar"));
//
//    }

    @Override
    public Animal findById(int id)
    {
        if(animals.containsKey(id))
        {
            System.out.printf("### Animal Name for id %d is : " + animals.get(id).getName(),id);
            return animals.get(id);
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
        // # old implementation
//        List<Animal> allAnimals = new ArrayList<>();
//        Cat cat1 = new Cat("Kitten");
//        allAnimals.add(dog1);
//        return new ArrayList<>(animals.values());

        // # new Implementation because changed to a map
        return animals.values().stream().collect(Collectors.toList());
    }

    @Override
    public void add(Animal animal)
    {
        animals.put(++count,animal);
    }
}
