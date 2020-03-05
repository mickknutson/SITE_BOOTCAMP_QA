package sa.site.lab.petstore.dao;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Repository;
        import sa.site.lab.petstore.domain.Animal;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Optional;

        import static org.graalvm.compiler.phases.common.DeadCodeEliminationPhase.Optionality.Optional;

@Repository
public class AnimalDaoDatabaseImpl implements AnimalDao {
    @Autowired
    private AnimalRepository repository;



    // TODO: must implement
    @Override
    public Animal findById(int id) {
        System.out.println("*  AnimalDaoDatabaseImpl.findPet: " + id);
        // throw new RuntimeException("Dao Available Yet.");
        // return (repository.findById(id)).get();

        Optional<Animal> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        return null;
    }

    // TODO: must implement
    @Override
    public List<Animal> findAll() {
        System.out.println("*  AnimalDaoDatabaseImpl.findAll() ");
        Iterable<Animal> result = repository.findAll();

        List<Animal> animals = new ArrayList<>();

        for(Animal animal: result){
            animals.add(animal);
        }
        return animals;
    }

    // TODO: must implement
    @Override
    public void add(Animal animal) {
        System.out.println("*  AnimalDaoDatabaseImpl.add() ");
        // Use a Spring Data Repository to Access the Animal TABLE
        repository.save(animal);

    }
}
