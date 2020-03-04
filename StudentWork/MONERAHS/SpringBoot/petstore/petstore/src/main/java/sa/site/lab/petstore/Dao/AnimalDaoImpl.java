package sa.site.lab.petstore.Dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.Animal.Animal;
import sa.site.lab.petstore.Animal.Cat;
import sa.site.lab.petstore.Animal.Dog;

import java.util.*;

@Repository
public class AnimalDaoImpl implements AnimalDao {

    Map<Integer, Animal> animals;

    public AnimalDaoImpl() {
        animals= new HashMap<>();
        animals.put(1,new Cat("Charlie"));
        animals.put(2,new Dog("Simon"));
        animals.put(3,new Cat("Phepee"));

    }

    public Animal findPet(int id) {

        System.out.println("** AnimalDao.FindPet():"+ id);

        return new Cat("Kitty");
     }

    public List<Animal> findAll() {
        //create a list of elements and then return it back at least 2
        System.out.println("** AnimalDao.FindAll();");

        /*return Arrays.asList(
                new Dog("Phe"),
                new Cat("Charlie"),
                new Dog("Simon")


        );*/



                //List<Animal> list = new AnimalDaoImpl(<key,value>);
                //return list;
                ArrayList<Animal> listOfValues = new ArrayList<Animal>(animals.values());
                return listOfValues;
            }

        }

