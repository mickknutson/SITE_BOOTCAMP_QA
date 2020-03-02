package Animal;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("Bark!!");

    }

    @Override
    public void eat() {
        System.out.println(name + " num, num ,num");
    }

    public void talk(String voice) {
        System.out.println(voice);

    }

}


