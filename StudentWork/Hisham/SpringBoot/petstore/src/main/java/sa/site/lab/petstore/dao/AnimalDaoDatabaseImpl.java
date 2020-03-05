package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao
{

    @Override
    public Animal findById(int id)
    {
        System.out.printf("** AnimalDaoDatabaseImpl.findpet:  %d **",id);
        throw new RuntimeException("Not Available yet");
    }

    @Override
    public List<Animal> findAll()
    {
        System.out.println("** AnimalDaoDatabaseImpl.findAll()**");
        throw new RuntimeException("Not Available yet");
    }

    @Override
    public void add(Animal animal)
    {
        System.out.println("** AnimalDaoDatabaseImpl.Add()**");
        throw new RuntimeException("Not Available yet");
    }
}
