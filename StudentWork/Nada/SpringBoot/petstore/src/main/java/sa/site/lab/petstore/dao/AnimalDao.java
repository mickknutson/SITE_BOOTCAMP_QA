package sa.site.lab.petstore.dao;

import sa.site.lab.petstore.domain.Animal;

public interface AnimalDao {

    public Animal findPet(int id);
}
