package com.company.core;
import com.company.core.animalClass.Animal;
import com.company.core.animalClass.Cat;
import com.company.core.animalClass.Dog;
import com.company.core.animalClass.Puppy;
import com.company.core.animalInterface.AnimalInterface;
import com.company.core.animalInterface.CatInter;
import com.company.core.animalInterface.DogInter;

public class ClassesTest
{


    private String anInstanceVar = "instance";
    public static String aStaticVar = "Static";

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal wolf = new Animal("wolf");
        Dog dog = new Dog("zippy");
        Puppy pup = new Puppy("pup");
        Cat cat = new Cat("Cimba");



        animal.eat();
        wolf.eat();
        dog.eat();
        pup.eat();
        cat.eat();

        System.out.println(dog.getName());

        AnimalInterface dog2 = new DogInter("doggy");
        AnimalInterface cat2 = new CatInter("kitty");

        dog2.eat();
        cat2.talk("meow");




//        basic();


    }

    private static void basic() {
        int number = 1;
        String output = (number%2 == 0 ) ? "even number" : "odd number" ;
        System.out.println("output is : "+ output);

        System.out.println("number is : "+ number);
        System.out.println("number is : "+ ++number);
        System.out.println("number is : "+ number++);
        System.out.println("number is : "+ number--);
        System.out.println("number is : "+ --number);
    }
}
