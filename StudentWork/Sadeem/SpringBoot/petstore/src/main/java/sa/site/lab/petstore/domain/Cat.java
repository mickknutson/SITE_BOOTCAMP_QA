package sa.site.lab.petstore.domain;

public class Cat implements Animal {
    private String name;
    public Cat(String name) {
        this.name=name;
    }
    public void eat(){
        System.out.println("num,num,num...");
    }

    @Override
    public void talk(String voice) {
        System.out.println(voice);
    }
}
