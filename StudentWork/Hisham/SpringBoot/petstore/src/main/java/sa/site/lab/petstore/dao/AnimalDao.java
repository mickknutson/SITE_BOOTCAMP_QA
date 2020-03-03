package sa.site.lab.petstore.dao;

import org.springframework.context.ApplicationContext;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;


public class AnimalDao
{
    public Animal findPet(int id)
    {
        return new Cat("kitten");


    }
}


