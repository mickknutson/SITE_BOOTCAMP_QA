package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.Animal.Animal;
import sa.site.lab.petstore.Animal.Dog;
import sa.site.lab.petstore.Dao.AnimalDao;

import java.util.List;

/**
 * Illegal:
 * AnimalService service =new AnimalService();
 * Because interface
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalDao dao;
    @Override
    public Animal findPet(int id) {
        return dao.findPet(id);
    }

    public List<Animal> findAll() {
        return dao.findAll();
    }
}
