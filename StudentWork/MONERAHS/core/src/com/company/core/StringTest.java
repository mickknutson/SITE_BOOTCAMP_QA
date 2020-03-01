package com.company.core;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);//converting char array to string  
        String s3 = new String("examples"); //creating java string by new keyword  
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
