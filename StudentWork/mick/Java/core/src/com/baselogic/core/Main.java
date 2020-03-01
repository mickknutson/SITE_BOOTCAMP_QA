package com.baselogic.core;

public class Main { // extends Object

    private String anInstanceVariable = "instance";

    public static final String aStaticVariable = "static";

    //    primitives
    int i = 42;
    int j; // == 0
    // int, long, float, double

    //    Wrapper Classes
    Integer wrapperI = i; // auto-boxing

    Integer foo = new Integer(42);

    Long l;
    Float f;
    Double d;


    /*

    */


    // Method Block of code:
    public static void main(String[] args) {

        basic();

        // Fruit


    } // end main() BLOCK

    private static void basic() {
        String aLocalVariable = "local";

        int number = 1;

        // write your code here
        System.out.println("variableA: " + number);

        System.out.println("Hello Mick!");
        System.out.println("local: " + aLocalVariable);

//        System.out.println("instance: " + anInstanceVariable);

        System.out.println("Static: " + aStaticVariable);

        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println("output: " + output);

        System.out.println("number: " + number);
        System.out.println("number: " + ++number);
        System.out.println("number: " + number++);
        System.out.println("number: " + number--);
        System.out.println("number: " + --number);

    }

} // The End Main...
