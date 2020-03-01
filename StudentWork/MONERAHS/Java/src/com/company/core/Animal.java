package com.company.core;
//scope  type  classname
public class Animal {

    //Default Constructer
    public Animal(){
        this.name="GENERIC";
    }
    public Animal(String name){
        this.name=name;
    }
    //body of my class
    //1.fields/variables --> STATE
    private String name;
    // methods / behavior
    public void eat() {

        System.out.println(name+ " is eating [mom,mom,mom.....]");
    }

    public static void main(String[] args) {
        Animal generic=new Animal();
        Animal wolf=new Animal("WOLF");

        Dog dog=new Dog();
        Cat cat=new Cat();

        generic.eat();
        wolf.eat();
        cat.talk();
        dog.talk();    }

}
