package Animal;

public class Dog extends Animal {

    public Dog (String name){
        setName(name);
    }

    public String getName(){
        System.out.println("Dog.getName");
        return super.getName();
    }

    public void talk(){

    System.out.println( "Bark");
    }

    public void talk(String voice){

        System.out.println( voice);
    }
}
