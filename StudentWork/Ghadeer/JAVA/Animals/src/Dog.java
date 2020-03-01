public class Dog extends Animal {
    Dog (){
        setName("bubby");
    }
    Dog (String name){
        setName(name);
    }
    public void talk(){
        System.out.println("park,park,park,park,..... ");
    }
    public void eat(){
        System.out.println(getName()+" yummm");

    }
}
