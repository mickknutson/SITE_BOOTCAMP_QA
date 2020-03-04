package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.dao.AnimalDao;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired @Qualifier("animalDaoDatabaseImpl")
    private AnimalDao dao;
    @Override
    public List<Animal> findAll() {

        return dao.findAll();
    }

    public Animal findPet(int id) {
        System.out.println(" * AnimalService.findPet: "+id);
        return dao.findPet(id);
    }
}
