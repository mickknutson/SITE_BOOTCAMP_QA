package com.company.core;

import java.util.ArrayList;
import java.util.List;

public class Main {
     String s = "ff";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        // write your code here
        WriteYourCodeHere();
    } // end main()

    private static void WriteYourCodeHere() {
        System.out.println("hello Talal!");

        int number = 1;
        String output= (number%2==0)? " even number": " odd number";
        System.out.println( "output : "+number);
        System.out.println( "output : "+ number);
        System.out.println( "output : "+ ++number);
        System.out.println( "output : "+number++);
        System.out.println( "output : "+ number--);
        System.out.println( "output : "+ --number);
    }

} // The End
