package com.company.animal;

public class Dog extends Animal{

    public Dog(){
        setName("mutt");
    }

    public Dog(String name){
        setName(name);
    }

    // Accessor
    //Override
    //Animal.getName / Dog.getName
    public String getName() {
        System.out.println("Inside Dog.getName");
        return super.getName();
    }

    public void talk(){
        System.out.println("bark");
        //System.out.println("name: " + name);
    }

    // Override talk method but this with parameter
    public void talk(String voice){
        System.out.println(voice);
    }
}
