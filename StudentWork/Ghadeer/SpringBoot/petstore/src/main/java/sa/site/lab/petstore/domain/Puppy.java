package sa.site.lab.petstore.domain;

public class Puppy extends Dog {
    //set constructor based on the parent
    Puppy(String name){
        super(name);//super====my parent
    }
    public void eat(){
        System.out.println(super.getName()+" is eating!");
    }
}
