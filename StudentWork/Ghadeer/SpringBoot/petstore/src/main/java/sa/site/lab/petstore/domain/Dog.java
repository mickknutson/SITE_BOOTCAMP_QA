package sa.site.lab.petstore.domain;

public class Dog implements Animal {
    private String name;
    Dog (){
        setName("puppy");
    }
    public Dog(String name){
        setName(name);
    }
    @Override
    public void talk(){
        System.out.println("park,park,park,park,..... ");
    }
    @Override
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
