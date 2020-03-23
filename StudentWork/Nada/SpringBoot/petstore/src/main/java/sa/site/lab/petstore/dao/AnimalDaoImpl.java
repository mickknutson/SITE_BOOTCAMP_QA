package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
     * Data Access for Pet Domain Object
     *
     * CRUD
     *
     * Stereotypes:
     *
     * Component
     * Service
     * Repository
     * Controller
     *
     * */
    @Repository
    public class AnimalDaoImpl implements AnimalDao {
        Animal cat1 = new Animal("Kitty");
        Animal cat2 = new Animal("Lulu");
        Animal dog = new Animal("Puppy");


        Map<Integer, Animal> animalMap = new HashMap<>();
private int counter=0;
        public AnimalDaoImpl() {
            animalMap.put(++counter, cat1);
            animalMap.put(++counter, cat2);
            animalMap.put(++counter, dog);
        }

        @Override
        public Animal findById(int id) {
            System.out.println("* AnimalDao:" + id);

            return animalMap.get(id);
        }

        @Override
        public List<Animal> findAll() {
            List<Animal> allAnimals=new ArrayList<>(animalMap.values());

            return allAnimals;
        }

        public void add(Animal animal){
            System.out.println( "AinmalDaoDatabaseImpl.add()");
         //   throw new RuntimeException(("Not Available yet"));
            animalMap.put(++counter,animal);
        }


        @Override
        public boolean delete (int id){
            if(animalMap.containsKey(id)){
                animalMap.remove(id);
                return true;}
            else{
                return false;
        }

    }
    }

