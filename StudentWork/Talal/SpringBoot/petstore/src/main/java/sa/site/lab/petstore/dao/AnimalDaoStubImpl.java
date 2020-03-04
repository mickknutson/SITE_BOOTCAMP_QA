package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AnimalDaoStubImpl implements AnimalDao {

    Map<Integer, Animal> map;

    public AnimalDaoStubImpl() {
        map = new HashMap<>();
        map.put(1, new Dog("Dog"));
        map.put(2, new Cat("Cat"));
        map.put(3, new Animal("Rabbit"));
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDao.findAll()");
        return new ArrayList<>(map.values());

        // return map.values().stream().collect(Collectors.toList());      Another way
    }

    public Animal findPet(int id) {
        System.out.println("* AnimalDao: " + id);
        if (map.containsKey(id)) {
            return map.get(id);
        } else {
            return null;
        }

    }
}
