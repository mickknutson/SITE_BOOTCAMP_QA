package com.company.core.Animal;

public class Dog implements Animal {
    private String name;
    public Dog(String name) {
       // super(name);
        this.name=name;
    }
    public void eat(){
        System.out.println("Num,Num,Num...");
    }
    public void talk(String voice){
        System.out.println(voice);
    }
}
   /*//overloading
    public void talk(){
        System.out.println("bark");
    }
    public void talk(String voice){
        System.out.println(voice);
    }
    // Overriding
    public String getName() {
        System.out.println("Dog.getName");
        return super.getName();
    }

}
*/
//No Need for Setter as the constructer can do its work
//public void setName(String name) {
//   super.setName(name);
// }