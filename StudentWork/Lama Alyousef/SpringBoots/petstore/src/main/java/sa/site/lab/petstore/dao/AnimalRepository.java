package sa.site.lab.petstore.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;


// MAP AnimalDataBase to Animal Repository to SpringData

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer> {

    // Voodoo Magic

}

