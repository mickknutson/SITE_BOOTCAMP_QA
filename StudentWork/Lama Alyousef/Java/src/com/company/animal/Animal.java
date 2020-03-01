package com.company.animal;

// Scope:  Type:   ClassName:
 // public    class    Animal {
    public    interface     Animal {

     public void eat();
     public void talk(String voice);
 }

    // public, protected, DEFAULT, private

    // body of my class:

    // 1. fields,/variable => State
    // encapswlayion
    //private static String name;

    /* private String name;
    private static String label = "generic";

    // Constructor
    public Animal() {
        this.name = "generic";
    }

    public Animal(String name) {
        this.name = name;
    }

    // Method (Behavior)
    public void eat() {
        System.out.println(name + "is eating [nomm, nomm]");
    }


    public String getName() {
        System.out.println("Animal.getName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
*/


    /*public static void main(String[] args) {
        System.out.println("main method..");
        Animal generic = new Animal();
        Animal wolf = new Animal(name: "Wolf");

        Dog dog = new Dog();

        generic.eat();
        wolf.eat();
        dog.name = "Foobar";
        dog.talk();

       // System.out.println("Label: " + Animal.label);

        //Animal animal = new Animal();
        //animal.eat();

       Animal animal = new Animal();
        Dog dog = new Dog();
        Animal cat = new Cat();
        Fish fish = new Fish();

        animal.eat();
        dog.talk();
        fish.talk();

        // Down Cast

        Cat c = (Cat)cat;
        c.talk();

        ((Cat)cat).talk();

    } */

