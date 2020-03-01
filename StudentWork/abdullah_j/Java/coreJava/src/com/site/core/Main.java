package com.site.core;

public class Main {

    private String anInstance;

    public static void main(String[] args) {

        String aLocalVariable;
        System.out.println("Hello Abdullah");

        //basic();


    } // end main()

    private static void basic() {
        int number = 1;

        String output = (number % 2 == 0) ? "even" : "odd";
        System.out.println(output);

        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number--);
        System.out.println(--number);
    }
} // The end
