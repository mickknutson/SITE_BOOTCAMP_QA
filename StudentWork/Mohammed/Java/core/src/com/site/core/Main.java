package com.site.core;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private String anInstanceVariable = "instatnce";

    public static String aStaticVariable = "static";

    // Block of Code :
    public static void main(String[] args) {
        basic();
        // Next Section ()
        // Public / private / protected - static scopes!



    } // end main()

    private static void basic() {
    /*
     String aLocalVariable = "local";

     // write your code here
     System.out.println("Hello moahmmed");

     System.out.println("local : " + aLocalVariable);

     //System.out.println(" instance : " +  );

     System.out.println("Static : " + aStaticVariable);

     int i = 42;
     Integer wrapperI = i;
     List<Integer> integers = new ArrayList<>();
     integers.add(i);
     */


        int number = 1;
        String output = ( number %2 == 0 ) ? "even number" : "odd number";
        System.out.println(" Output : " + output);
        System.out.println(" Number : " + number);
        System.out.println(" Number : " + ++number);
        System.out.println(" Number : " + number++);
        System.out.println(" Number : " + number--);
        System.out.println(" Number : " + --number);
    }

} // The End ..
