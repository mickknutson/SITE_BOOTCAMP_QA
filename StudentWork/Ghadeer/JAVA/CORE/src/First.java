public class First {
    public static void main(String[] args) {
        // write your code here
int num=2;
String output=(num%2==0)?"even number":"odd number";
        basic(num, output);

    }

    private static void basic(int num, String output) {
        System.out.println(output);
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(num);
    }
}
