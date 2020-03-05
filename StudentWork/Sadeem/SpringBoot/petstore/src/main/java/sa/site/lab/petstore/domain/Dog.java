package sa.site.lab.petstore.domain;

public class Dog implements Animal {
    private String name;
    public Dog(String name) {
        // super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Num,Num,Num...");
    }
    public void talk(String voice){
        System.out.println(voice);
    }
}
