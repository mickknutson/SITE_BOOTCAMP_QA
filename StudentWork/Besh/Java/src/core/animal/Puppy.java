package core.animal;
public class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }
    public void eat() {
        System.out.println(super.getName() + " " + "is eating");
    }
}
