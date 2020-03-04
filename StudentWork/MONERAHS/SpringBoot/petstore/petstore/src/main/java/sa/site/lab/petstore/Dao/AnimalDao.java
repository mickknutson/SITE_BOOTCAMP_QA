package sa.site.lab.petstore.Dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.Animal.Animal;

import java.util.List;


public interface AnimalDao {
    public Animal findPet(int id);
    public List<Animal> findAll();
}
