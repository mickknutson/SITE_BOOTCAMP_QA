package sa.site.lab.petstore.domain;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    private String name ;
    public Cat(){}
    public Cat (String name){
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(" CAT : num num num!!");
    }

    @Override
    public void talk(String voice) {
        System.out.println(voice);
    }


/*
    public void talk(){
        System.out.println(" mewo!");
    }
 */

}
