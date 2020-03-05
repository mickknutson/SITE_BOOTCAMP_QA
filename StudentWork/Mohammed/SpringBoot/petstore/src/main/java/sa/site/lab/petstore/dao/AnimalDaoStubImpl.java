package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AnimalDaoStubImpl implements AnimalDao {

    private List<Animal> animalList ;

    //LAB: Create Map<?, Animal> of Animals.
    private Map<Integer, Animal> animalMap;

    private int conter = 0;

    public AnimalDaoStubImpl() {
        // BETTER to insnlie the LIST and Map here ..

        animalMap = new HashMap<>();
        animalMap.put(++conter, new Animal("kitty"));
        animalMap.put(++conter, new Animal("caty"));
        animalMap.put(++conter, new Animal("mewo cat"));
        animalMap.put(++conter, new Animal("dog"));
    }

    @Override
    public Animal findById(int id) {
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
        animalList = new ArrayList<>();
        animalList.addAll(animalMap.values());
        return animalList;
    }

    @Override
    public void add(Animal animal) {
        System.out.println("** AnimalDaoDatabaseImpl.add");
        animalMap.put(++conter, animal);
    }

}
