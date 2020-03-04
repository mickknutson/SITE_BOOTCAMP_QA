package sa.site.lab.petstore.domain;

public class Cat implements Animal{

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void talk(String voice){
        System.out.println(voice);
    }

    @Override
    public void eat() {
        System.out.println("sip, sip, sip");
    }

    public String getName(){
        return name;
    }
}
