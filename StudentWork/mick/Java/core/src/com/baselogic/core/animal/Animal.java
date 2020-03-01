package com.baselogic.core.animal;

public class Animal {

    // Default Constructor
    public Animal(){
        this.name = "generic";
    }

    public Animal(String name){
        this.name = name;
    }

    private String name;

    // Methods / Behavior
    public void eat(){
        System.out.println(name + " is eating.");
    }

    // Accessor:
    public String getName() {
        System.out.println("1. inside animal.getName");
        return name;
    }

    // Mutator:
    public void setName(String name) {
        this.name = name;
    }

} // The End...
