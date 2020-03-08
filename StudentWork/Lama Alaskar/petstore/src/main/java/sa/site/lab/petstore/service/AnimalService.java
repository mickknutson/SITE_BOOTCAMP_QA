package sa.site.lab.petstore.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import sa.site.lab.petstore.domain.Animal;

import java.util.List;

/**
 * Illegal:
 * AnimalService service = new AnimalService();
 *
 *
 * Interface Driven Design
 */
public interface AnimalService {

    Animal findById(int id);

    List<Animal> findAll();

    void add(Animal animal);

}
