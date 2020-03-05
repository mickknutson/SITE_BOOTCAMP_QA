package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.Dao.AnimalDao;

import java.util.List;

/**
 * Illegal:
 * AnimalService service =new AnimalService();
 * Because interface
 */
@Service

//OUR BUFFER
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    @Qualifier ("animalDaoDatabaseImpl") //it must start with a lowercase

    //@Qualifier("animalDaoStubImpl")
    private AnimalDao dao;

    @Override
    public Animal findById(int id) {
        System.out.println("** AnimalService.FindPet():" + id);

        return dao.findById(id);
    }

    public List<Animal> findAll() {
        System.out.println("** AnimalService.FindAll():");

        return dao.findAll();
    }

    @Override
    public void add(Animal animal) {
        System.out.println("** AnimalService.add() ");

        dao.add(animal);
    }
}
