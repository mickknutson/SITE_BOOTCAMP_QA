package sa.site.lab.petstore.domain;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public String getName(){
        System.out.println("Dog.getName");

        return super.getName();

    }

    public void talk(){
        System.out.println("Bark");
    }
}
