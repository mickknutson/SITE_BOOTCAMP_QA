package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {


    @Autowired
    private EmployeeRepository repository;
    //TODO: Must implement:

    @Override
    public Employee findById(int id) {
        System.out.println("## EmployeeDaoDatabaseImpl findPet()");

        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        else {
            return null;
        }
    }

    //TODO: Must implement:

    @Override
    public List<Employee> findAll() {
        System.out.println("## EmployeeDaoDatabaseImpl findPet()");
        Iterable<Employee> result = repository.findAll();
        List<Employee> animals = new ArrayList<>();
        for (Employee animal : result){
            //System.out.println("## animal: " + animal.getName());
            animals.add(animal);
        }
        return animals;
    }


    //TODO: Must implement:

    @Override
    public void add(Employee animal) {
        System.out.println("* EmployeeDatabaseImpl.add()");
        repository.save(animal);
    }

    @Override
    public boolean delete(int id){
        System.out.println("Employee is deleted");
        repository.deleteById(id);
        return true;
    }

}
