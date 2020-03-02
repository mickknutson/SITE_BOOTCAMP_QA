import animal.Animal;
import animal.Cat;
import animal.Dog;
import animal.Puppy;

public class ExeptionTest {
    public static void main (String[] args){
        ExeptionTest test = new ExeptionTest();

        try{
            //attend to execute code that can fails
            int result = test.calculate(0,25);
            System.out.println("calc result: " + result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            //handle exception
            throw e;
        }
        finally {
            System.out.println("finally cleanup");
        }

        System.out.println("after try/catch");





    }
    public int calculate(int a, int b){
        return b / a;
    }
}
