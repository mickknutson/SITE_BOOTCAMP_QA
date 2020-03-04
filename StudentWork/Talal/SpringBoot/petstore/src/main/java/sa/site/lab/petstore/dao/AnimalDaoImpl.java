package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AnimalDaoImpl implements AnimalDao {

    Map<Integer, Animal> map = new HashMap<>();

    public AnimalDaoImpl() {
        map.put(1, new Animal("Dog"));
        map.put(2, new Animal("Cat"));
        map.put(3, new Animal("Rabbit"));
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("* AnimalDao.findAll()");
        return new ArrayList<>(map.values());
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
