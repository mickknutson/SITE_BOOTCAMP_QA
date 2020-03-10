package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoDatabaseImpl implements EmployeeDao {
    @Autowired
    private EmployeeRepository repository;


    // Must implement
    @Override
    public Employee findById(int id) {
        System.out.println("** EmployeeDaoDatabaseImpl.findById: " + id);
        Optional<Employee> result = repository.findById(id); // Beacuse it may don't find any value of the provided id, so we need to check first
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    // TODO: Must implement
    @Override
    public List<Employee> findAll() {
        System.out.println("** AnimalDaoDatabaseImpl.findAll()");
        Iterable<Employee> result = repository.findAll();

        List<Employee> employees = new ArrayList<>();

        for(Employee employee: result){
            employees.add(employee);
        }
        return employees;
    }

    // TODO: Must implement
    @Override
    public void add (Employee employee){
        System.out.println("* EmployeeDaoDatabaseImpl.add() ");
        // use Spring Data Repository to access the Employee TABLE
        repository.save(employee);
    }

    public boolean delete (int id){
        System.out.println("AnimalDaoDatabaseImpl.add()");

        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
            Employee employee=result.get();
            repository.deleteById(id);
            return true;
        }
        else {
            return false;
        }

    }


}
