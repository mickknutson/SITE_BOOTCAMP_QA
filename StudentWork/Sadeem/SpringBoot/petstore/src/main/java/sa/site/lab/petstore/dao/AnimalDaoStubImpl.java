package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class AnimalDaoStubImpl implements AnimalDao {

    private Map<Integer, Animal> animals;
    private int counter = 0;

    public AnimalDaoStubImpl() {
        animals = new HashMap<>();
        animals.put(++counter, new Animal("Charlie"));
        animals.put(++counter, new Animal("Simon"));
        animals.put(++counter, new Animal("Phepee"));

    }

    public Animal findById(int id) {

        System.out.println("** AnimalDao.FindPet():" + id);
        if (animals.containsKey(id)) {
            return animals.get(id);
        } else {
            return null;
        }
    }

    public List<Animal> findAll() {
        //create a list of elements and then return it back at least 2
        System.out.println("** AnimalDao.FindAll();");

        //ArrayList<Animal> listOfValues = new ArrayList<Animal>(animals.values());
        // return listOfValues;
        return animals.values()
                .stream()
                .collect(Collectors.toList()); //converting stream to list
    }
    public void add(Animal animal){
        System.out.println("* AnimalDaoDatabaseImpl.add()");
        animals.put(++counter, animal);
    }
    public boolean delete (int id){
        if(animals.containsKey(id)){
            animals.remove(id);
            return true;}
        else{
            return false;
        }

    }

}