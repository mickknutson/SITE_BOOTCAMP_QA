package sa.site.lab.petstore.dao;


import org.springframework.web.bind.annotation.PathVariable;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

public interface AnimalDao
{
     Animal findById(int id);

     List<Animal> findAll();

     void add(Animal animal);

     boolean delete( int id);

}


