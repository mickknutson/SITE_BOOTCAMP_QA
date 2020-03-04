package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    @Repository("animalService")

    public class AnimalDaoImpl implements AnimalDao {
        Cat cat1 = new Cat("Kitty");
        Cat cat2 = new Cat("Lulu");
        Dog dog = new Dog("Puppy");


        Map<Integer, Animal> animalMap = new HashMap<>();

        public AnimalDaoImpl() {
            animalMap.put(1, cat1);
            animalMap.put(2, cat2);
            animalMap.put(3, dog);
        }

        @Override
        public Animal findPet(int id) {
            System.out.println("* AnimalDao:" + id);


            return animalMap.get(id);

            // new Cat ("Kitty");
        }


        @Override
        public List<Animal> findAll() {
            List<Animal> allAnimals=new ArrayList<>(animalMap.values());

            
            return allAnimals;

        }
    }

