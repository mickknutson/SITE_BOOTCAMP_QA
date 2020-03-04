package sa.site.lab.petstore.domain;

public class Cat implements Animal
{
    private String name;

    public Cat(String name)
    {
        this.name = name;

    }

    @Override
    public void eat()
    {
        System.out.println("Sip , Sip , Sip");
    }
    public String getName()
    {
        return this.name;
    }
    public void talk(String voice)
    {
        System.out.println(voice);
    }

}
