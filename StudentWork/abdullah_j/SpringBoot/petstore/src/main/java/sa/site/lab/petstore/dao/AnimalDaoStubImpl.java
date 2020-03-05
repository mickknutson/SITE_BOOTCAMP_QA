package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

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
 *
 *
 * Stub: Brut Force / Hard coded
 * Mock: Mockito / EasyMock
 *
 */
@Repository
public class AnimalDaoStubImpl implements AnimalDao {

    private Map<Integer, Animal> map;
    private int counter = 0;

    public AnimalDaoStubImpl() {

        map = new HashMap<>();

        map.put(++counter, new Animal("cat1"));
        map.put(++counter, new Animal("cat2"));
        map.put(++counter, new Animal("dog1"));
        map.put(++counter, new Animal("dog2"));

    }

    // Method level
    @Override
    public Animal findById(int id) {
        System.out.println("*** AnimalDao.FindPet(" + id + ") ***");

        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            System.out.println("****** no animal with this id ******");
            return null;
        }

    } // end findPet method

    @Override
    public List<Animal> findAll() {

        System.out.println("*** AnimalDao.findAll() ***");

        return new ArrayList<>(map.values());

    }


    @Override
    public void add(Animal animal) {
        System.out.println("*** AnimalDao.add() ***");

        map.put( ++counter, animal);

    }
} // The End..
