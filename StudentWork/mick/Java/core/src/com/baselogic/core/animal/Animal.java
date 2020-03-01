package com.baselogic.core.animal;

// Scope:     type:  ClassName:
public        class  Animal {

    // Default Constructor
    public Animal(){
        this.name = "generic";
    }

    public Animal(String name){
        this.name = name;
    }

    // body of my class:
    //1. fields / variables --> STATE
    private String name;

    // Methods / Behavior
    public void eat(){
        System.out.println(name + " is eating [nom, nom, nom...]");
    }


    // Method Block of code:
    public static void main(String[] args) {
        Animal generic = new Animal();
        Animal wolf = new Animal("Wolf");

        generic.eat();
        wolf.eat();

    } // end main() BLOCK

} // The End...
