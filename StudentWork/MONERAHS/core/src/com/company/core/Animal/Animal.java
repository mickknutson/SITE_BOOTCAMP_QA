package com.company.core.Animal;
//scope  type  classname
public interface Animal {
    //Default Constructer
    /*public Animal(){

        this.name="GENERIC";
    }
    public Animal(String name){

        this.name=name;
    }
    //body of my class
    //1.fields/variables --> STATE
    private String name;
    private static String label = "generic";
    // methods / behavior
    public void eat() {

        System.out.println(name+ " is eating [mom,mom,mom.....]");
    }

    public String getName() {
        System.out.println("Animal.getName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public void eat();
    public void talk(String voice);


}
