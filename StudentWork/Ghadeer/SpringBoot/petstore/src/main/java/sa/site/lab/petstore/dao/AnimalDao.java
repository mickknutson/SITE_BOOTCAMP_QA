package sa.site.lab.petstore.dao;

import sa.site.lab.petstore.domain.Animal;

import java.util.Map;

public interface AnimalDao {
    public Animal findPet(int id);
    Map findAll();
    //public void fillMethod();
}
