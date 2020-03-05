package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AnimalDaoStubImpl implements AnimalDao {

    private Map<Integer, Animal> map;

    private int counter=0;
    public AnimalDaoStubImpl() {
        map = new HashMap<>();
        map.put(++counter, new Animal("Dog"));
        map.put(++counter, new Animal("Cat"));
        map.put(++counter, new Animal("Rabbit"));
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDao.findAll()");
        return new ArrayList<>(map.values());

        // return map.values().stream().collect(Collectors.toList());      Another way
    }

    public Animal findById(int id) {
        System.out.println("* AnimalDao: " + id);
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            return null;
        }

    }

    public void add(Animal animal) {
        System.out.println("* AnimalDaoDatabaseImpl.findAll() ");
        map.put(++counter,animal);

    }
}
