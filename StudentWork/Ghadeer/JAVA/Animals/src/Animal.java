public class Animal {
    private String name;
    private static String label;
    //Default constructor
    Animal(){
        this.name="Default";
    }
    //receiving data constructor
    Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(this.name+"  nom.. nommm.. nomm");
    }

    //Main method
    public static void main(String[]args){
        Animal animal1;
        animal1 = new Animal();
        Animal animal2;
        animal2 = new Animal("Bear");

        //Examining the two different type of constructors
        animal1.eat();
        animal2.eat();

        //extends objects

        Animal dog=new Dog();
        Animal cat=new Cat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();
        dog.eat();
       
    }
}
