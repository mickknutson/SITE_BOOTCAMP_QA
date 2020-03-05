package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
<<<<<<< Updated upstream:StudentWork/Lama Alaskar/petstore/src/main/java/sa/site/lab/petstore/dao/AnimalDaoImpl.java
public class AnimalDaoImpl implements AnimalDao {  //animaldao

    public Animal findPet(int id){
         return new Cat("kitty");
    } //end findpet
=======
public class AnimalDaoImp  implements AnimalDao{
    // LAB: create map<?, Animal> of animals:
   private Map<Integer, Animal> animals;

    public AnimalDaoImp(){
        //LAB: pubulate map with 3+ animals..
        animals = new HashMap<>();
        animals.put(1,new Cat("kitty1"));
        animals.put(2,new Dog("FIDO"));
        animals.put(3,new Cat("kitty2"));

    }
    public Animal findPet(int id){
        System.out.println("* AnimalDao: " +id);
        //LAB: pull single animal from lab
        if (animals.containsKey(id)){
        return animals.get(id);}
        else {
            return null;
        }
    } //end findPet method

    public List<Animal> findAll (){
        System.out.println("* AnimalDao>findall()");
        //LAB: return list<animal> from map
        ArrayList<Animal> valueList = new ArrayList<Animal>(animals.values());
        return valueList;
    }

>>>>>>> Stashed changes:StudentWork/Sadeem/SpringBoot/petstore/src/main/java/sa/site/lab/petstore/dao/AnimalDaoImp.java
}
