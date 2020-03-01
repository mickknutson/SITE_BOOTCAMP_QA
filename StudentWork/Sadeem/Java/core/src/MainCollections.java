import animal.Animal;
import animal.Cat;
import animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {
    public static void main (String[] args){
        //collections: array - list - set - map(keysvalue)
        //QUESTION: create a list of dogs only, add 3 or more dogs to list , loop through list and print out dog.eat()

        List<Animal> animals= new ArrayList<>();
        animals.add(new Dog("FIDO"));
        animals.add((new Dog("CHUCK")));
        animals.add(new Cat("feline"));

        //enhanced for-loo[
        for (Animal animal: animals){
            animal.eat();
        }

    }
}
