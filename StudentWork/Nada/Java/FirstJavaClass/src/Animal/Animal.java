package Animal;

public class Animal {

    public Animal(){

        this.name="Generic";

    }
    public Animal(String name){
        this.name=name;
    }

    private String name;

    private static String lable;

    public void eat(){
        System.out.println(name+ " nom, nom, nom");

    }

    public static void main (String[] args){

        Animal generic = new Animal();
        Animal wolf = new Animal( "Wolf");

        generic.eat();
        wolf.eat();


        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();

        System.out.println("Lable:" + Animal.lable);
    }
}
