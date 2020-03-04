package sa.site.lab.petstore.domain;

public class Dog implements Animal
{

    private String name;

    public Dog(String name)
    {
        this.name = name;

    }

    @Override
    public void eat()
    {
        System.out.println(name + " is eating : Nom , nom , nom");
    }

    public void talk(String voice)
    {
        System.out.println(voice);
    }

}
