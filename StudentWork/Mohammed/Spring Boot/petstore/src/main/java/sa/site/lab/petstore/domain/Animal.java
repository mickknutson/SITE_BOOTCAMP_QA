package sa.site.lab.petstore.domain;

public interface Animal {

    public void eat();
    public void talk(String voice);

    /*
    private String name;

    public Animal (){
        this.name = " Animal!";
    }

    public Animal (String name){
        this.name = name;
    }

    public void eat(){
        System.out.println( name + " nom, nom, nom");
    }

    public String getName() {
        System.out.println("Animal getName!");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main (String[] args){


        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        animal.eat();
        ((Dog)dog).talk();
        ((Cat)cat).talk();

        Animal generic = new Animal();
        Animal lion = new Animal("lion");
        generic.eat();
        lion.eat();
    }

     */
}
