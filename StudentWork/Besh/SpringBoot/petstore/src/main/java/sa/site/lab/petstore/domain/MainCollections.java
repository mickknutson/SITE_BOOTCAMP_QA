package sa.site.lab.petstore.domain;

import java.util.ArrayList;
import java.util.List;

public class MainCollections {
    public static void main ( String [] args){

        List<Dog> Dogs = new ArrayList();
        Dogs.add(new Dog("fido"));
        Dogs.add(new Dog("Sam"));
        Dogs.add(new Dog("Jammy"));
        Dogs.add(new Dog("Kim"));

        //for(int i = 0; i < dogs.size(); i++){
            //dogs.get(i).talk();
       // }
        for (Animal animal: Dogs){
            animal.eat();
        }
    }
}
