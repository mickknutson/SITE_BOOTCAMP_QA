package sa.site.lab.petstore.domain;

public class Cat implements Animal{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void talk(String voice){
        System.out.println(voice);
    }


    @Override
    public void eat() {
        System.out.println("sip, sip, sip");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
