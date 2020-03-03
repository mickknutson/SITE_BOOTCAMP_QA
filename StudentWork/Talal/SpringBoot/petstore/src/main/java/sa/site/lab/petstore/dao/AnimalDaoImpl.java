package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import sa.site.lab.petstore.domain.Animal;

public class AnimalDaoImpl implements AnimalDao {

    @Autowired
    private AnimalDao dao;

    public Animal findPet(int id) {
        return dao.findPet(id);
    }
}
