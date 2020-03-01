package animal;

public class Dog extends Animal {

    public Dog (String name){
        setName(name);
    }
    public void talk(){
        System.out.println("bark");
    }
    public void talk (String voice){
        System.out.println(voice);

    }

    public String getName(){
        System.out.println("inside dog.getname");
        return super.getName();
    }


}
