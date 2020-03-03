package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.List;

@Repository
public class AnimalDaoImpl implements AnimalDao {

    @Override
    public Animal findPet(int id) {
            return new Cat("Kitty");
        } // END findPet METHOD ..

    @Override
    public List<Animal> findAll() {
        return null;
    }

    @Override
    public void addAnimal(Animal animal) {
         animal = new Dog();
    }
}
