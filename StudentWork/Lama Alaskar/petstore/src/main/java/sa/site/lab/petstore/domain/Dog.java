package sa.site.lab.petstore.domain;

public class Dog implements Animal {
  String Name;

  public Dog(String s) {
  }

  public void talk(){
        System.out.println("park");
    }

    @Override
    public void eat() {
      System.out.println("the dog is eating right now");
    }

    @Override
    public void setName(String dogName) {
    this.Name= dogName;
    }

    @Override
    public String getName() {
    return Name;
    }
}