public class Animal {
    private String name;
    private static String label;
    //Default constructor
    Animal(){
        this.name="Default";
    }
    //receiving data constructor
    Animal(String name){
        this.name=name;
    }
    //accessor
     String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println(this.name+"  nom.. nommm.. nomm");
    }


}
