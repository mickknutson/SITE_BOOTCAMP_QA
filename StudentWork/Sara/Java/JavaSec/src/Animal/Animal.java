package Animal;

//public class Animal {
public interface Animal {

    // Vars
    //   private String name;
    //   private static String label ="Gen";

    /* // Constructors
     public Animal(){

         this.name="Generic";
     }

     public Animal(String name){

         this.name=name;
     }
     // Setter and Getter
     public String getName() {
         System.out.println("Animal.getName");
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }*/
    // Methods
    public void eat();

    public void talk(String voice);

    // Main
    /*public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog("DeeOhGee");
        Puppy puppy = new Puppy("pup");

        animal.eat();
        dog.talk();
        dog.eat();
        puppy.eat();

       /* Animal generic = new Animal();
        Animal wolf = new Animal("Wolf");

        generic.eat();
        wolf.eat();
        System.out.println("Label: " + Animal.label);

        Animal animal = new Animal();
        Animal dog = new Dog("DeeOhGee");
        Animal cat = new Cat();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();

    }*/

}
