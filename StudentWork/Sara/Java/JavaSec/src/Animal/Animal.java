package Animal;

public class Animal {

    public Animal(){

        this.name="Generic";
    }

    public Animal(String name){

        this.name=name;
    }


    private String name;

    private static String label ="Gen";



    public void eat(){
        System.out.println(name + " is eating nom, nom...");

    }

    public static void main(String[] args) {

        Animal generic = new Animal();
        Animal wolf = new Animal("Wolf");

        generic.eat();
        wolf.eat();
        System.out.println("Label: " + Animal.label);

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();

    }

}
