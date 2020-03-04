package sa.site.lab.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sa.site.lab.petstore.controller.AnimalController;
import sa.site.lab.petstore.dao.AnimalDaoImp;
import sa.site.lab.petstore.domain.Animal;
import sa.site.lab.petstore.service.AnimalService;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@SpringBootApplication
public class PetstoreApplication {

    //only FIELDS / VARIABLES go here.....
    @Autowired
    private AnimalController controller;

    public static void main(String[] args) { //start of MAIN method
        System.out.println("* start main()");
        SpringApplication.run(PetstoreApplication.class, args);
        System.out.println("* end main()");
    } // end of MAIN method

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args ->{
          //Runnable code goes here
            System.out.println("***animal dao output: ***");

            // map<string, object> context;
        //    AnimalDao dao = ctx.getBean(AnimalDao.class);


            List<Animal> animals = controller.findAll();

            if (animals !=null)
            System.out.println("***animalS:  " + animals);

            Animal animal = controller.findPet(1);
            animal.eat();
        };
    }

} //end of Class
