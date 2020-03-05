package sa.site.lab.petstore.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal , Integer> {
    //Voodoo Magic is already here...

}
