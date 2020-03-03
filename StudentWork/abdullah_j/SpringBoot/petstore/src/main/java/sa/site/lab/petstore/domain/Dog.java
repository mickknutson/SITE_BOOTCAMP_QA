package sa.site.lab.petstore.domain;

public class Dog implements Animal{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("nom, nom,nom");
    }

    @Override
    public void talk(String voice){
        System.out.println(voice);
    }

    // Accessor:
    // Override:
    // Animal.getName / Dog.getName
    public String getName() {
        System.out.println("2. inside Dog.getName");
        return this.name;
    }

}
