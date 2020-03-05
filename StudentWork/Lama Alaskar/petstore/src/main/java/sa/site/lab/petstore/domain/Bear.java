package sa.site.lab.petstore.domain;

public class Bear implements Animal {
    String Name;

    public Bear(String bear) {
    }

    @Override
    public void eat() {
        System.out.println("hum hum hum");
    }

    @Override
    public void setName(String name) {
    this.Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void talk() {
        System.out.println("hm hm hm");
    }
}
