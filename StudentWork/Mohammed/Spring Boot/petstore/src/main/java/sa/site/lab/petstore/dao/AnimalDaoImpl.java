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
public class AnimalDaoImpl implements AnimalDao {

    private List<Animal> animalList = new ArrayList<>();

    //LAB: Create Map<?, Animal> of Animals.
    private Map<Integer, Animal> animalMap = new HashMap<>();

    public AnimalDaoImpl() {
        animalMap.put(1, new Cat("kitty"));
        animalMap.put(2, new Cat("caty"));
        animalMap.put(3, new Cat("mewo cat"));
    }

    @Override
    public Animal findPet(int id) {
        System.out.println("* AnimalDao.findPet()");
        // LAB: pull SINGEL animal from Map
        return animalMap.get(id);

    } // END findPet METHOD ..

    @Override
    public List<Animal> findAll() {
        animalList.addAll(animalMap.values());
        return animalList;
    }

    @Override
    public void addAnimal(Animal animal) {

    }

}
