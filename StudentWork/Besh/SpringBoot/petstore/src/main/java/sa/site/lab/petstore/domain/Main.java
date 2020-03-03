package sa.site.lab.petstore.domain;

public class Main{
    public static void main(String[] args){
        //Animal animal = new Animal();
        Animal dog = new Dog("Dogee");
        Animal cat = new Cat("Katty");
        //Dog dog = new Dog("DooohGoo");
        //Cat cat = new Cat("Kitty");
        //Dog dog = new Dog("DooohGoo");
        //Cat cat = new Cat("Kitty");
        Puppy puppy = new Puppy("Puppy");
        //dog.name = "Foobar";
        //animal.eat();
        dog.eat();
        cat.eat();
        //puppy.eat();
        //dog.talk("DDDDDD");
        puppy.talk("PPPPPPP");

        //dog.talk("Woof");
        //cat.talk();
        //List<Animal> things = new ArrayList<>();
        //things.add(animal);
        //things.add(dog);

    }
}