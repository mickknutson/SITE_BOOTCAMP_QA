package sa.site.lab.petstore.domain;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void talk(){
        System.out.println("meow..meow");
    }
}
