package Animal;

import java.util.List;
import java.util.ArrayList;


public class MainCollecations {

    public static void main(String[] args) {


        List<Dog> l = new ArrayList<Dog>();
        l.add(new Dog("dog1"));
        l.add(new Dog("dog2"));
        l.add(new Dog("dog3"));



       /* for (int i=0; i<l.size();i++){
            l.get(i).eat();

        }*/

        for (Animal a : l) {
            a.talk("hh");
        }


    }
}
