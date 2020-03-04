package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("animalServiceStub")
public class AnimalDaoStubImpl implements AnimalDao {

    private List<Animal> animalList = new ArrayList<>();

    //LAB: Create Map<?, Animal> of Animals.
    private Map<Integer, Animal> animalMap = new HashMap<>();

    public AnimalDaoStubImpl() {
        // BETTER to insnlie the LIST and Map here ..

        animalMap.put(1, new Cat("kitty"));
        animalMap.put(2, new Cat("caty"));
        animalMap.put(3, new Cat("mewo cat"));
        animalMap.put(4, new Dog("dog"));
    }

    @Override
    public Animal findPet(int id) {
        System.out.println("* AnimalDao.findPet()");
        // LAB: pull SINGEL animal from Map ..
        // gotta do IF/ELSE check the value of ID if it exits in map or return null
        if (animalMap.containsKey(id))
            return animalMap.get(id);
        else
            return null;

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
