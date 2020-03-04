package sa.site.lab.petstore.dao;


import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {

    @Override
    public Animal findPet(int id) {
        System.out.println("*** AnimalDao.FindPet(" + id + ") ***");

        throw new RuntimeException("Not available yet");
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("*** AnimalDao.findAll() ***");

        throw new RuntimeException("Not available yet");
    }
}
