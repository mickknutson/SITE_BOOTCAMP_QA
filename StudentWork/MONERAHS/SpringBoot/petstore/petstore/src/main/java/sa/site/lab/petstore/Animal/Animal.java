<<<<<<< Updated upstream:StudentWork/MONERAHS/SpringBoot/petstore/petstore/src/main/java/sa/site/lab/petstore/Animal/Animal.java
package sa.site.lab.petstore.Animal;
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
=======
package sa.site.lab.petstore.domain;
//scoop(public, protected,default,private)  type  className

//this is my contract application
  //interface converted
   public interface Animal{
       public void eat();
       public void talk(String voice);

    }
>>>>>>> Stashed changes:StudentWork/Sadeem/SpringBoot/petstore/src/main/java/sa/site/lab/petstore/domain/Animal.java
