package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    @Qualifier("animalDaoDatabaseImpl") // Name of the class but with the lower case of the first letter
    private AnimalDao dao;

    @Override
    public Animal findById(int id) {
        System.out.println("* AnimalService.findPet: " + id);
        return dao.findById(id);
    }

    @Override
    public List<Animal> findAll(){
        System.out.println("* AnimalService.findAll()");
        return dao.findAll();
    };

    @Override
    public void add(Animal animal){
        System.out.println("* AnimalService.add()");
        dao.add(animal);
    }

    @Override
    public boolean delete(int id){
        System.out.println("* AnimalService.delete()");
        return dao.delete(id);
    }

} // The End..
