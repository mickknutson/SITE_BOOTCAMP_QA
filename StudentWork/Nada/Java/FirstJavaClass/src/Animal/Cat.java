package Animal;


public class Cat implements Animal {

    private String name;
    public Cat(String name){
        this.name=name ;
    }

    public void talk(){
        System.out.println("Bark!!");

    }

    @Override
    public void eat() {
        System.out.println("num, num ,num");
    }

    public void talk(String voice){
        System.out.println(voice);

    }

}
