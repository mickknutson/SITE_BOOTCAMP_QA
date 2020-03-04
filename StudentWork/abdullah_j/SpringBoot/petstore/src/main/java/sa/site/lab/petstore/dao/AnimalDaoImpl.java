package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Data access for Pet Domain Object
 * <p>
 * CRUD
 * <p>
 * Steotypes:
 * <p>
 * Component
 * Service
 * Repository
 * Controller
 */
@Repository
public class AnimalDaoImpl implements AnimalDao {

    private Map<Integer, Animal> map;

    public AnimalDaoImpl() {

        map = new HashMap<>();

        map.put(1, new Cat("cat1"));
        map.put(2, new Cat("cat2"));
        map.put(3, new Dog("dog1"));
        map.put(4, new Dog("dog2"));

    }

    // Method level
    @Override
    public Animal findPet(int id) {
        System.out.println("*** AnimalDao.FindPet(" + id + ") ***");

        if (map.containsKey(id)){
            return map.get(id);
        }
        else{
            System.out.println("****** no animal with this id ******");
            return null;
        }

    } // end findPet method

    @Override
    public List<Animal> findAll() {

        System.out.println("*** AnimalDao.findAll() ***");

        return new ArrayList<>(map.values());

    }
} // The End..
