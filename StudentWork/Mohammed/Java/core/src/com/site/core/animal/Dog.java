package com.site.core.animal;

public class Dog extends Animal {

    public Dog (){

    }
    public Dog (String name){
        setName(name);
    }

    public void talk(){
        System.out.println(" Bark!!");
    }
    public void talk(String voice){
        System.out.println("voice");
    }


    public String getName(){
        System.out.println("Dog.getName");
        return  super.getName();
    }
}
