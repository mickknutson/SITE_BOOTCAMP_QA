import java.util.ArrayList;
import java.util.List;


public class Main {
    //Main method
    public static void main(String[]args) {
        Animal animal1;
        animal1 = new Animal();
        Animal dog = new Dog("dogee");
        Animal cat = new Cat("kitty");
        Animal puppy = new Puppy("pop");

        //Examining the two different type of constructors
        animal1.eat();


        //extends objects


        ((Dog) dog).talk();
        ((Dog) puppy).talk();
        ((Cat) cat).talk();


        //polymorphic

        dog.eat();
        puppy.eat();
        cat.eat();

        //array list

        List<Animal> things = new ArrayList<>();
        things.add(animal1);
        things.add(dog);
        things.add(cat);
        things.add(puppy);
        for (int i = 0; i < things.size(); i++) {
            System.out.println(things.get(i).getName());
        }
    }
}
