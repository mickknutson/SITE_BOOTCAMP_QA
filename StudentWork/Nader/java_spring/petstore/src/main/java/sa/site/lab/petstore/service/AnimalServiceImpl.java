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
    @Qualifier("animalDaoDatabaseImpl")
    private AnimalDao dao;

    @Override
    public Animal findById(int id){
        System.out.println("* In Service findById:* " +id);
        return dao.findById(id);
    }

    @Override
    public List<Animal> findAll(){
        System.out.println("* In Service FindAll()* ");
        return dao.findAll();
    }

    @Override
    public void add(Animal animal) {
        System.out.println("Add animal serivce");
        dao.add(animal);
    }

}
