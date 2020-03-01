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

    public String getName() {
        System.out.println("inside animal getName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat()
    {
        System.out.println(name + " is eating.");
    }

    }
