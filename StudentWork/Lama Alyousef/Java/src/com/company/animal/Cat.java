package com.company.animal;

  public class Cat implements Animal{
    private String name;

    public Cat(String name){
       this.name=name;
     }

      @Override
      public void eat() {
          System.out.println("sip,sip,sip");
      }

      @Override
      public void talk(String voice) {
          System.out.println("voice");
      }
  }
/* public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
*/