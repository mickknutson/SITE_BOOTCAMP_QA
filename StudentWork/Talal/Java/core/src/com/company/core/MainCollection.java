package com.company.core;

import com.company.core.animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {

    public static void main(String[] args) {


        List<Dog> dogList= new ArrayList<>();



        dogList.add(new Dog("dog1"));
        dogList.add(new Dog("dog2"));
        dogList.add(new Dog("dog3"));


//        for( int i =0 ;i < dogList.size();i++){
//            System.out.println(i+1);
//            dogList.get(i).talk();
//
//        }

        for (Dog dogs: dogList){
            dogs.talk();
        }
    }
}
