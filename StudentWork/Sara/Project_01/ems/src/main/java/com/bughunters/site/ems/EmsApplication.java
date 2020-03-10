package com.bughunters.site.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }


    //THIS CODE RUNS FIRST AS TEST CODE:
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args ->

        {
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println("####################################################");
            System.out.println((char) 27 + "[34m ### Start Command Runner ###");
            System.out.println("### sand box code only ###");

        };
    }
}
