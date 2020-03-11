package com.bughunters.site.ems.dao;

import com.bughunters.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*@Repository
public class EmplpyeeDaoImpl implements EmplpyeeDao {


    @Autowired
    private EmployeeDaoRepository repository;

    Map<Integer, Employee> employeeMap = new HashMap<>();

    private int counter=0;




    @Override
    public Employee findById(int id) {
        if (employeeMap.containsKey(id)) {
            return employeeMap.get(id);
        } else {
            return null;

        }
    }

    @Override
    public List<Employee> findAll() {
       List<Employee> allEmployees = new ArrayList<>(employeeMap.values());
       return allEmployees;
    }

    @Override
    public void add(Employee employee) {
        employeeMap.put(++counter, employee);

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
        if(employeeMap.containsKey(id)){
            employeeMap.remove(id);
            return true;}
        else{
            return false;
        }
    }
}*/
