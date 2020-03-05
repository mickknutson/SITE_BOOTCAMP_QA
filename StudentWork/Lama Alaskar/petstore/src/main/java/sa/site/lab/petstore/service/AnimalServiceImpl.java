package sa.site.lab.petstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;

import java.util.Map;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    @Qualifier("AnimalDaoStubImpl")

    private AnimalDao dao;

    public Animal findPet(int id) {
        return dao.findbyid(id);
    }

    @Override
    public Map<Integer, Animal> findAll() {
        return null;
    }

    @Override
    public void add(Animal animal) {

    }
}
