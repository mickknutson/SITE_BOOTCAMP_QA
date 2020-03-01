package animal;
//scoop(public, protected,default,private)  type  className
public class Animal {
    // variables-> state
    private String name;

    public Animal(){
        this.name ="generic";
    }
    public Animal(String name){
        this.name = name;
    }
    //method -> behavior
    public void eat()
    {
        System.out.println(name + " is eating [nom,nom,nom,...]");
    }

    }
