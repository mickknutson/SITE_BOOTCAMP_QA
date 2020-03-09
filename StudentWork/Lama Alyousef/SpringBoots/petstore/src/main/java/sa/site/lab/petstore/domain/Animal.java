package sa.site.lab.petstore.domain;

//public class Animal {

import javax.persistence.*;

@Entity
public class Animal extends Object{

    // Map field to DB columns:
    // Primary Key;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generate id value
    private int id;

    @Column
    private String name;
    @Column
    private String type;
    @Column
    private  String sound;

    // Constructor

    public Animal(){}

    public Animal(String name) {
        this.name = name;
    }


    // Methods // These are behavior:
    // TODO: Ignore these methods in JPA:

    @Transient
    public void eat(){
        throw new RuntimeException("not yet implemented");
    }

    @Transient
    public void talk(String voice){
        throw new RuntimeException("not yet implemented");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }

    /// Setter & Getter ---------------------------------- //

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

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
