package com.company.animal;

public class Dog implements Animal {
  String Name;

  public Dog(String s) {
  }

  public void talk(){
        System.out.println("park");
    }

    @Override
    public void eat() {

    }

    @Override
    public void setName(String dogName) {
    this.Name= dogName;
    }

    @Override
    public String getName() {
    return Name;
    }
}