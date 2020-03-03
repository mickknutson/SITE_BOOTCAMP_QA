package sa.site.lab.petstore.domain;

public class Cat implements Animal {
    private String name;
    public Cat(String name){
       setName(name);
    }
    public void talk(){
        System.out.println("Meow,Meow,Meow,Meow,..... ");
    }
    public void eat(){
        System.out.println(getName()+" yummm");

    }
        //accessor
     public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
