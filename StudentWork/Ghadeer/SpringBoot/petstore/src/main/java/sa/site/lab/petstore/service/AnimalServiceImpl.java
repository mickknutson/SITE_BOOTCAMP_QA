package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Dog;
import sa.site.lab.petstore.dao.AnimalDao;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
        @Autowired
private AnimalDao dao;
    public Animal findPet(int id){

        return dao.findPet(id);
    } //End findPet method
    public List<Animal> findAll(){
        return dao.findAll();
    }
}
