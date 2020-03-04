package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.security.Key;
import java.util.*;

@Repository
public class AnimalDaoImpl implements AnimalDao {

    Map<Integer , Animal> map = new HashMap<>();

    // Create a MAP of animals
    public AnimalDaoImpl() {
        map.put(1 , new Cat("first cat from the map"));
        map.put(2 , new Dog("first dog from the map"));
        map.put(3 , new Dog("another dog from the map"));
    }

    public Animal findPet(int id){

        // pull animal from the MAP

        //System.out.println("*Animal Dao* " + id);
        Animal res = map.get(id);
        return res;
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
}
