package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee findById(int id) {

        Optional<Employee> employee = repository.findById(id);
        if (employee.isPresent()){
            return employee.get();
        }else {
            return null;
        }


    }

    @Override
    public List<Employee> findALl() {

       Iterable<Employee> employeeIterable= repository.findAll();

       List<Employee> employeeList= new ArrayList<>();
       if (employeeIterable!= null){

           for(Employee employee: employeeIterable) {
               employeeList.add(employee);
           }
           return employeeList;
       }else {
           return null;

       }
    }

    @Override
    public void add(Employee employee) {
        repository.save(employee);

    }

    @Override
    public void update(Employee employee) {
        throw new RuntimeException("Not implemented yet" );

        //FIXME: ADD IMPLEMENTATION



    }

    @Override
    public void delete(int id) {

        repository.deleteById(id);

    }
}
