package com.coolcompany.mystore;

import com.coolcompany.mystore.controller.ItemController;
import com.coolcompany.mystore.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

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

            Item item = controller.findById(6);

            if (item != null){
                System.out.println(item);
            }
            else{
                System.out.println("No item with this id");
            }

            item = controller.findById(3);

            if (item != null){
                System.out.println(item);
            }
            else{
                System.out.println("No item with this id");
            }

            List<Item> list = controller.findAll();

            if (list != null && list.size() != 0){
                System.out.println(list);
            }
            else{
                System.out.println("No items found");
            }


            controller.updateName(1 , "updated name");
            controller.updateDescription(1 , "updated Description");
            controller.updateCost(1 , 10000.5f);

            item = controller.findById(1);

            if (item != null){
                System.out.println(item);
            }
            else{
                System.out.println("No item with this id");
            }

            controller.deleteById(3);
            list = controller.findAll();

            if (list != null && list.size() != 0){
                System.out.println(list);
            }
            else{
                System.out.println("No items found");
            }

            //controller.deleteAll();
            list = controller.findAll();

            if (list != null && list.size() != 0){
                System.out.println(list);
            }
            else{
                System.out.println("No items found");
            }



        };
    }


}// End of class
