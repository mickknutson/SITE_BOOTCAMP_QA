package Mains;

import Animal.Animal;
import Animal.*;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {

    public static void main(String[] args) {
        //List<Dog> dogsOnly = new ArrayList<>();
        List<Animal> dogsOnly = new ArrayList<>();

        dogsOnly.add(new Dog("fido"));
        dogsOnly.add(new Dog("bulldog"));
        dogsOnly.add(new Dog("poodle"));
        dogsOnly.add(new Dog("husky"));
        dogsOnly.add(new Cat("Joy"));

       /* for(int i=0;i<dogsOnly.size();i++){
            dogsOnly.get(i).eat();
        }*/
        // Enhances for-loop
        for (Animal a : dogsOnly) {
            a.eat();
        }

    }
}
