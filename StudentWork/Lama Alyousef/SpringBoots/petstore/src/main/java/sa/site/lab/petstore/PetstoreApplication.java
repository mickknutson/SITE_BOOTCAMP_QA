package sa.site.lab.petstore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDao;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

  /*  @Autowired
    private AnimalDao dao;
	@Autowired
    private AnimalService service;*/


    @Autowired
	private AnimalController controller;


    public static void main(String[] args) {
        System.out.println("* Start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* End main()");

    } // End of MAIN Method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("* Start CommandLineRunner *");
            //AnimalDao dao = new AnimalDao();

            //	AnimalDao dao = ctx.getBean(AnimalDao.class);

            //AnimalDao dao1 = (AnimalDao) ctx.getBean("animalDao");


            List<Animal> animals =controller.findAll();
            System.out.println("*****Animals"+ animals);

            Animal animal = controller.findPet(42);
            if(animal != null){
                animal.eat();
            } else {
                System.out.println("No an");
            }

            System.out.println("* End CommandLineRunner *");
        };
    }

}
