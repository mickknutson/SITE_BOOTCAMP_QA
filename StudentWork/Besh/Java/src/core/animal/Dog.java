package core.animal;
public class Dog implements Animal {
    public Dog(){
        setName("Mutt");
    }
    private String name;
    public Dog (String name){
        this.name = name;
    }
    //public Dog(String name) {
       // setName(name);
    //}
    public void eat (){
        System.out.println("nom, nom, mom");
    }
    public void talk(String voice) {
        System.out.println("Voice: " + voice);
    }
    public void talk() {
        System.out.println("bark");
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
}