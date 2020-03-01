package com.baselogic.core.animal;

public class Dog extends Animal{

    public Dog(String name){
        setName(name);
    }

    public void talk(){
        System.out.println("bark");
    }

    public void talk(String voice){
        System.out.println(voice);
    }

    // Accessor:
    // Override:
    // Animal.getName / Dog.getName
    public String getName() {
        System.out.println("2. inside Dog.getName");
        return super.getName();
    }

}
