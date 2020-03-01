

public class Animal {
    
    public void eat(){
        System.out.println("nom.. nommm.. nomm");

    }
    public static void main(String[]args){
        Animal animal;
        animal = new Animal();

        animal.eat();
       Animal dog=new Dog();
        Animal cat=new Cat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();
        dog.eat();


    }
}
