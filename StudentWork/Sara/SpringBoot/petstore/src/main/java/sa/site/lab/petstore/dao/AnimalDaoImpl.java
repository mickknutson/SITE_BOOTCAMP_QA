package sa.site.lab.petstore.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

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
    Map<Integer, Animal> animalMap = new HashMap<>();

    private int counter = 0;

    public AnimalDaoImpl() {

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

    @Override
    public boolean delete (int id){
        if(animalMap.containsKey(id)){
            animalMap.remove(id);
            return true;}
        else{
            return false;
        }

    }

}
