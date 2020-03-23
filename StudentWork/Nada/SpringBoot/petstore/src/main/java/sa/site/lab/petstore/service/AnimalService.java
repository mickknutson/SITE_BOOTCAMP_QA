package sa.site.lab.petstore.service;

        import org.springframework.stereotype.Repository;
        import sa.site.lab.petstore.domain.Animal;

        import java.util.List;

@Repository // stereotype
public interface AnimalService {

    public Animal findById(int id);

    List<Animal> findAll();

    void add(Animal animal);

    boolean delete(int id);





}
