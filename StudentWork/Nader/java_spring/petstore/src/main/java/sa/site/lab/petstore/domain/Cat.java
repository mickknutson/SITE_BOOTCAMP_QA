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
<<<<<<< Updated upstream:StudentWork/Nader/java_spring/petstore/src/main/java/sa/site/lab/petstore/domain/Cat.java
        System.out.println("sip, sip, sip");
    }
}
=======
        System.out.println("sip,sip,sip");

    }
    public String getName(){
        return name;
    }
}

>>>>>>> Stashed changes:StudentWork/Sadeem/SpringBoot/petstore/src/main/java/sa/site/lab/petstore/domain/Cat.java
