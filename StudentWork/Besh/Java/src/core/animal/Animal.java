package core.animal;
// Scope Type
public interface Animal {
    // Default Constructor
    //public Animal(){
        //this.name = "Generic";
    //}

    //public  Animal (String name){
        //this.name = name;
    //}
    //Body of the class
    // field / variables (State)
    //private String name;
    //private static String label = "generic";

    //Methods / Behavior
    public void eat();
    String getName();
    void setName(String name);
        //System.out.println(name + " " + "is eating");
        //System.out.println("Label " + label);
    //}
    //Accessor
    //public String getName() {
        //System.out.println("1. Unside animal.getName");
        //return name;

    //
    //public void setName(String name) {
       // this.name = name;
   // }

    public static void main (String[] args){
        //Animal animal = new Animal();
        //Animal Dog = new Dog();
        //Animal Cat = new Cat();
        //animal.eat();
        //Animal Generic = new Animal();
        //Animal wolf = new Animal( "Wolf");
        //Generic.eat();
        //wolf.eat();
        //System.out.println("Label " + Animal.label);

        //((Dog)Dog).talk();
        //((Cat)Cat).talk();
        //((Dog)Dog).talk();
        //((Cat)Cat).talk();
    }
}