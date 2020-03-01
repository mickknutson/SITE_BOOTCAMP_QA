package core.animal;

public class Animal {
    public void eat(){
        System.out.println("nom, nom, nom...");
    }
    public static void main (String[] args){
        Animal animal = new Animal();
        Animal Dog = new Dog();
        Animal Cat = new Cat();

        animal.eat();
        ((Dog)Dog).talk();
        ((Cat)Cat).talk();
        ((Dog)Dog).talk();
        ((Cat)Cat).talk();
    }
}