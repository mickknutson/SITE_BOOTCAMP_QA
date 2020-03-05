package sa.site.lab.petstore.dao;

import sa.site.lab.petstore.domain.Animal;
import java.util.Map;


public interface AnimalDao {
   Animal findbyid(int id);
   Map<Integer, Animal> findAll();
   void add(Animal animal);
}
