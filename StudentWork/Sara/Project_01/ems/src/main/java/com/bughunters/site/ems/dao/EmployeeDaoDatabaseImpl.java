package com.bughunters.site.ems.dao;

import com.bughunters.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoDatabaseImpl implements EmplpyeeDao {

    @Autowired
    private EmployeeDaoRepository repository;


    @Override
    public Employee findById(int id) {
        Optional<Employee> result = repository.findById(id);
        if(result.isPresent()){
            return result.get();
        }

        return null;
    }

    @Override
    public List<Employee> findAll() {

        Iterable<Employee> result = repository.findAll();
        List<Employee> employees = new ArrayList<>();

        for (Employee employee : result) {
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public void add(Employee employee) {
    repository.save(employee);
    }

    @Override
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

    @Override
    public boolean delete(int id) {
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
