package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;

@Repository
public class AnimalDaoImpl implements AnimalDao
{

    @Override
    public Animal findPet(int id)
    {
        return new Cat("Kitty");
    }
}
