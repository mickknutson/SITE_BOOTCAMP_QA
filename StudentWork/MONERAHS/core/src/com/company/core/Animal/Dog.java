package com.company.core.Animal;

public class Dog extends Animal {
    public Dog(String name) {
       // super(name);
        setName(name);
    }
   //overloading
    public void talk(){
        System.out.println("bark");
    }
    public void talk(String voice){
        System.out.println(voice);
    }
    // Overriding
    public String getName() {
        System.out.println("Dog.getName");
        return super.getName();
    }

}

//No Need for Setter as the constructer can do its work
//public void setName(String name) {
//   super.setName(name);
// }