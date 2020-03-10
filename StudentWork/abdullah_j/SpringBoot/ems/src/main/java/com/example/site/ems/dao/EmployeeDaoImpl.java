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


    @Override
    public boolean add(Employee employee) {

        System.out.println("*** add() ***");

        if (!repository.existsById(employee.getEmployeeId())) {
            repository.save(employee);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Employee findById(long id) {
        System.out.println("*** findById(" + id + ") ***");

        Optional<Employee> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Employee> findAll() {
        System.out.println("*** findAll() ***");

        Iterable<Employee> result = repository.findAll();
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : result) {
            employees.add(employee);
        }

        return employees;
    }

    @Override
    public boolean update(Employee updatedEmployee) {

        System.out.println("*** update(" + updatedEmployee.getEmployeeId() + ") ***");

        if (repository.existsById(updatedEmployee.getEmployeeId())) {
            repository.save(updatedEmployee);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean delete(long id) {

        System.out.println("*** update(" + id + ") ***");

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }

    }
}
