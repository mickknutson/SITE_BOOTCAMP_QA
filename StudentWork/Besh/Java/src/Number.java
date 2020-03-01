public class Number {
    public static void main(String[] args) {
        int number = 1;
        String output = (number % 2 == 0) ? "The Number is Even" : "The Number is Odd";
        basic( output, number );
    }

    private static void basic(String output, int number) {
        System.out.println(" The Output is" + " " + output);
        System.out.println(" The Output is" + " " + number++);
        System.out.println(" The Output is" + " " + ++number);
        System.out.println(" The Output is" + " " + number--);
    }
}