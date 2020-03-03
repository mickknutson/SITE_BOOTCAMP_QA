package sa.site.lab.petstore.domain;

public class ExceptionTest {
    public static void main(String[] args){
         Dog dog= new Dog();
        Animal cat= new Cat("foofie");

        int a=0;
        int b=9;
        try {
            int result = b / a;
            System.out.println(result);

        }catch(Exception x){
            System.out.println(x);

        }
        System.out.println(dog.getName());



    }
}
