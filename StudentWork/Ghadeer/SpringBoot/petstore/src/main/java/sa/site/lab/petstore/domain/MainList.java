package sa.site.lab.petstore.domain;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main (String[] args){
       //create a list of dogs only add 3 or more to list
        //loop through and print the eat of each
        List<Animal> animals = new ArrayList<>();
        for (int i=0;i<5;i++){
            animals.add(new Dog ("Dog#"+(i+1)));
            animals.add(new Cat ("Cat#"+(i+1)));

        }
        //regular for loop
//        for (int i = 0; i < animals.size(); i++) {
//            animals.get(i).eat();
//        }
        //enhanced for loop
        for (Animal animal: animals){
            animal.eat();
        }
    }
}//the end...
