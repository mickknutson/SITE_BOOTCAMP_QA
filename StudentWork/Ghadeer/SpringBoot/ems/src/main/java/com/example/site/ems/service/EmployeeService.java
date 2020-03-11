package com.example.site.ems.service;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findById(long id);

    List<Employee> findAll();

    boolean add(Employee employee);

    boolean delete(long id);

    boolean update(Employee updatedEmployee);
}
