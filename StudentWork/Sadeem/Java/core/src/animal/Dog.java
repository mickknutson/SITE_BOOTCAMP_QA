package animal;

//interface converted
public class Dog implements Animal{
    private String name;
    public Dog (String name){
        this.name = name;
    }
    public void talk (String voice){
        System.out.println(voice);
    }
    @Override
    public void eat() {
        System.out.println("nom,nom,nom");
    }


/*public class Dog extends Animal {

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
*/

}
