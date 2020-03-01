import Animal.Animal;

import java.util.ArrayList;
import java.util.List;
import Animal.Animal;
import Animal.Dog;
import Animal.*;

public class Main {

    private String anInstanceVariable = "instance";
    public static String aStaticVariable = "static";


    /*

     */


    // Method Block of code:
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("DeeOhGee");
        Puppy puppy = new Puppy("pup");
        Cat cat = new Cat("kitty");



        animal.eat();

        dog.talk();
        dog.talk("Woof");

       /* List<Animal> things = new ArrayList();
        things.add(dog);
        things.add(animal);
        System.out.println(things.get(0));
        System.out.println(things.get(0).getName());*/


       /* System.out.println(animal.getName());
        System.out.println(dog.getName());
        System.out.println(puppy.getName());*/



       /* String aLocalVariable = "local";

        int variableA = 1;

        int i = 42;
        Integer wrap=i;
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        System.out.println(integers.get(0));


        // write your code here
        System.out.println("variableA: " + variableA);

        System.out.println("Hello Sara!");
        System.out.println("local: " + aLocalVariable);

//        System.out.println("instance: " + anInstanceVariable);

        System.out.println("Static: " + aStaticVariable);
        int number =1 ;

        String output = (number %2 = 0) ? "even number" : "odd number";
        System.out.println("output :" + output);

        System.out.println("number :" + number);
        System.out.println("number :" + ++number);
        System.out.println("number :" + number++);
        System.out.println("number :" + --number);
        System.out.println("number :" + number--);*/



    } // end main() BLOCK

} // The End...

