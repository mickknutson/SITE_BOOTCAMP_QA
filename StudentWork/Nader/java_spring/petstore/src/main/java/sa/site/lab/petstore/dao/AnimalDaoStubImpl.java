package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.*;

@Repository
public class AnimalDaoStubImpl implements AnimalDao {


    private int counter = 0;
    private Map<Integer , Animal> map;

    // Create a MAP of animals
    public AnimalDaoStubImpl() {
        map = new HashMap<>();
        map.put(++counter , new Animal("first cat from the map"));
        map.put(++counter , new Animal("first dog from the map"));
        map.put(++counter , new Animal("another dog from the map"));
    }

    public Animal findById(int id){

        // pull animal from the MAP

        //System.out.println("*Animal Dao* " + id);
        if (map.containsKey(id)) {
            Animal res = map.get(id);
            return res;
        }
        else {
            return null;
        }
    }

    public List<Animal> findAll(){

        // return a MAP
        List<Animal> animals = new ArrayList<>();
        map.forEach((k , v) -> {
            animals.add(v);
                });
//        System.out.println("* In Dao FindAll() * ");
//        List<Animal> animals = new ArrayList<>();
//        Cat cat = new Cat("foo");
//        Dog dog = new Dog("bar");
//        Cat anotherCat = new Cat("FooBinBar");
//        animals.add(anotherCat);
//        animals.add(cat);
//        animals.add(dog);
        return new ArrayList<>(map.values());
    }

    @Override
    public void add(Animal animal) {
        System.out.println("* AnimalDataabaseImpl.add()");
        map.put(++counter , animal);
    }
}
