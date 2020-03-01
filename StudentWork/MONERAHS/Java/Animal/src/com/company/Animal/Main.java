package com.company.Animal;

public class Main  {
    public static void main(String[] args) {
        Main anim=new Main();
        Dog dog=new Dog();
        Cat cat=new Cat();

        anim.eat();
        cat.talk();
        dog.talk();
}

    public void eat() {

        System.out.println("mom,mom,mom.....");
    }


}
