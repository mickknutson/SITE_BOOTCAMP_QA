package sa.site.lab.petstore.domain;

public class Cat implements Animal {
    String Name;

    public Cat(String cat) {
    }

    public void talk(){
        System.out.println("mew");
    }

    @Override
    public void eat() {
      System.out.println("cat food");
    }

    @Override
    public void setName(String catname) {
    this.Name = catname;
    }

    @Override
    public String getName() {
    return Name;
    }
}