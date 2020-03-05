package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.Map;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao{
    @Override
    public Animal findbyid(int id) {
        System.out.println("*AnimalDaoDatabaseImpl.findPet:"+ id);
        throw new RuntimeException("not Available yet!"); //not checked exception
    }

    @Override
    public Map<Integer, Animal> findAll() {
        System.out.println("*AnimalDaoDatabaseImpl.findAll");
        throw new RuntimeException("not Available yet!");
    } // Animal Database Access object database implementation

    public void add(Animal animal) {
        System.out.println("* AnimalController.add");
        throw new RuntimeException("not Available!");
         //service.add(animal);
    }

}
