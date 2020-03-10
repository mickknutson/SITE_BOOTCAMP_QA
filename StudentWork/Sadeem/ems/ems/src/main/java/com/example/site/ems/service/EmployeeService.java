package com.example.site.ems.service;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Employee findById(int id);
    List<Employee> findAll();
    void add(Employee employee);
    boolean delete(int id);
}
