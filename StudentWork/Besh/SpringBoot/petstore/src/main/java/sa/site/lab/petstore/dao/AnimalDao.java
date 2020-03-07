package sa.site.lab.petstore.dao;

import sa.site.lab.petstore.domain.Animal;
import java.util.List;

public interface AnimalDao {
    Animal findById(int id);
    List<Animal> findAll();
    void add(Animal animal);
}
