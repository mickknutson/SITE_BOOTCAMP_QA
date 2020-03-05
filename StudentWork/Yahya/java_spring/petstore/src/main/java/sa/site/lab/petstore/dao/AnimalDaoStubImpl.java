package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Data access for Pet Domain Object
 * <p>
 * CRUD
 * <p>
 * Stereotype:
 * <p>
 * Component
 * Service
 * Repository
 * Controller
 *
 * Stub: Brut Force / Hard Coded
 * Mock: Mockito / EasyMock
 */
@Repository
public class AnimalDaoStubImpl implements AnimalDao {

    // LAB: Create Map<?, Animal> of Animals.
    private Map<Integer, Animal> animals;

    private int counter = 0;

    public AnimalDaoStubImpl() {
        // LAB: Populate Map with 3+ Animals.
        animals = new HashMap<>();

        animals.put(++counter, new Animal("Fido") {
        });
        animals.put(++counter, new Animal("Kitty") {
        });
    }

    // Method level
    public Animal findById(int id) {
        System.out.println("* AnimalDao: " + id);

        // LAB: pull SINGLE animal from Map
        if(animals.containsKey(id)) {
            return animals.get(id);
        } else {
            return null;
        }
    } // end findPet method


    public List<Animal> findAll() {
        System.out.println("* AnimalDao.findAll()");
        // LAB: return List<Animal> from Map
        return animals.values() // List of Keys
                .stream() // Java 8 Stream API
                .collect(Collectors.toList()); // converting steam to a List
    }


    public void add(Animal animal){
        System.out.println("* AnimalDaoDatabaseImpl.add()");
        animals.put(++counter, animal);
    }


} // The End..
