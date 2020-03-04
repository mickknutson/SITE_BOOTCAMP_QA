package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.dao.AnimalDao;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    @Qualifier("animalDaoStubImpl") // small  first letter of the class
    private AnimalDao dao;


    public Animal findById(int id) {
        System.out.println(" * AnimalService.findPet: " + id);
        return dao.findById(id);
    }

    @Override
    public List<Animal> findAll() {

        return dao.findAll();
    }

    @Override
    public void add(Animal animal) {

        System.out.println("AnimalServiceImpl.add()");
        dao.add(animal);

    }
}
