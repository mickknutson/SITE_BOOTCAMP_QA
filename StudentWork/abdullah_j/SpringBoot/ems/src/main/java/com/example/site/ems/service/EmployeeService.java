package com.example.site.ems.service;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeService {

    boolean add(Employee employee);

    Employee findById(long id);

    List<Employee> findAll();

    boolean update(Employee updatedEmployee);

    boolean delete(long id);

}
