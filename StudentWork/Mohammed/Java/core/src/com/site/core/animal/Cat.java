package com.site.core.animal;

public class Cat implements Animal {

   private String name ;
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
