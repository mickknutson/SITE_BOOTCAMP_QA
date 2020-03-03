package sa.site.lab.petstore.dao;

import org.springframework.stereotype.Repository;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.domain.Cat;
import sa.site.lab.petstore.domain.Dog;

import java.util.ArrayList;
import java.util.List;

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
public class AnimalDaoImpl implements AnimalDao{ //animalDao

    // Method level
   public Animal findPet(int id){

      return new Cat("kitty");
   } //End findPet method

    public List<Animal> findAll(){
        List<Animal> animals=new ArrayList<>();
        for(int i=0;i<3;i++) {
            animals.add(new Cat("kitty"+i+1));
        }
       return null;
    }//end find all method
}//the end..
