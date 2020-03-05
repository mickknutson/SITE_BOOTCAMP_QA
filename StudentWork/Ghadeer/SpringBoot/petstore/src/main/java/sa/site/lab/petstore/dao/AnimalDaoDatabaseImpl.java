package sa.site.lab.petstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao{
    //TODO: Must implement
    @Autowired
    private AnimalRepository repository;
    public Animal findById(int id) {
        System.out.println("AnimalDaoDatabaseImpl.findPet"+id);
        Optional<Animal> result=repository.findById(id);
      if(result.isPresent()){
        return  result.get();
      }
      else{
          return null;
      }
    }

    @Override
    public List<Animal> findAll() {
        System.out.println("AnimalDaoDatabaseImpl.findAll()");
//        ArrayList<Animal> animalsList = new ArrayList<Animal>(repository.findAll());
//        repository.findAll();
        throw new RuntimeException("Dao not available yet");
    }
    @Override
    public void add(Animal animal){
        System.out.println("AnimalDaoDatabaseImpl.add()");

        //throw new RuntimeException("dao not available yet");
        //useSpring Data repository to access the animal TABLE
        repository.save(animal);
    }

}//The End......
