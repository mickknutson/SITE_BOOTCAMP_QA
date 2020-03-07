package com.coolcompany.mystore;

import com.coolcompany.mystore.controller.ItemController;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MystoreApplication {

    @Autowired
    private ItemController controller;

    public static void main(String[] args) {
        SpringApplication.run(MystoreApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            Item item1 = new Item("item1" , "aaaaaaa" , 49.9f);
            Item item2 = new Item("item2" , "bbbbbbb" , 10.5f);
            Item item3 = new Item("item3" , "ccccccc" , 3.9f);
            Item item4 = new Item("item4" , "ddddddd" , 6.9f);
            Item item5 = new Item("item5" , "eeeeeee" , 100f);

            controller.add(item1);
            controller.add(item2);
            controller.add(item3);
            controller.add(item4);
            controller.add(item5);


            System.out.println(controller.findById(6));
            System.out.println(controller.findById(3));

            System.out.println(controller.findAll());


            controller.updateName(1 , "updated name");
            controller.updateDescription(1 , "updated Description");
            controller.updateCost(1 , 10000.5f);

            System.out.println(controller.findById(1));

            controller.deleteById(3);
            System.out.println(controller.findAll());

            controller.deleteAll();
            System.out.println(controller.findAll());



        };
    }


}// End of class
