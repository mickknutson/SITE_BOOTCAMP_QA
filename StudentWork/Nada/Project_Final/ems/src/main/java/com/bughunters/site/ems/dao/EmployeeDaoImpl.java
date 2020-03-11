package com.bughunters.site.ems.dao;


import com.bughunters.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
    @Autowired
    private EmployeeRepository repository;


    // find a single employee by the db id
    public Employee findById(int id){
        System.out.println("* EmployeeDaoImpl.findById: " + id);
        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        } else {
            return null;
        }
    }

    // find all employees in the database
    public List<Employee> findAll(){
        System.out.println("* EmployeeDaoImpl.findAll()");
        Iterable<Employee> result = repository.findAll();

        List<Employee> employees = new ArrayList<>();

        for(Employee emp: result){
            employees.add(emp);
        }

        return employees;
    }

    // Adding a single employee to the database
    @Override
    public void add(Employee employee){
        System.out.println("* EmployeeDaoImpl.add()");
        // use Spring Data Repository to access the Employee TABLE
        repository.save(employee);
    }

    // Deleting a single employee to the database
    @Override
    public void delete(int id){
        System.out.println("* EmployeeDaoImpl.delete()");
        repository.deleteById(id);
    }

    // Updating a single employee by taking the database id
    // and saving the updated employee
    public void update(int id, Employee employee)
    {
        Employee updatedEmployee = repository.findById(id).get();
        updatedEmployee.setEmployeeId(employee.getEmployeeId());
        updatedEmployee.setFirstName(employee.getFirstName());
        updatedEmployee.setLastName(employee.getLastName());
        updatedEmployee.setDepartment(employee.getDepartment());
        updatedEmployee.setSalary(employee.getSalary());
        updatedEmployee.setHiringDate(employee.getHiringDate());
        updatedEmployee.setEmail(employee.getEmail());
        repository.save(updatedEmployee);
    }

}
