package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.*;

/*
Data access for pet domain Objects
CRUD
story types:
components
Services
Repository
Controller
 */
@Repository
public class AnimalDaoStubImpl implements AnimalDao { //animalDao

    // Method level
    //create map

    Map<Object,Animal> animals = new HashMap<>();

private int counter=0;
    //    List<Animal> animals=new ArrayList<>();
    public AnimalDaoStubImpl() {
        for (int i = 0; i < 3; i++) {
            animals.put(++counter, new Animal("kitty" + (++counter)));
        }
    }

    public Animal findById(int id) {
        System.out.println("AnimalDao.findPet:" + id);
//pull map
        if (animals.containsKey(id)) {
            return (Animal) animals.get(id);
        } else
            return null;

    } //End findPet method

    public List<Animal> findAll() {
        System.out.println("AnimalDao.findAll()");
        ArrayList<Animal> animalsList = new ArrayList<Animal>(animals.values());
        return animalsList;
        //return null;
    }//end find all method
    @Override
    public void add(Animal animal){
        animals.put(++counter, animal);

    }
    @Override
    public boolean delete (int id){
        if(animals.containsKey(id)){
            animals.remove(id);
            return true;}
        else{
            return false;
        }

    }

}//the end..
