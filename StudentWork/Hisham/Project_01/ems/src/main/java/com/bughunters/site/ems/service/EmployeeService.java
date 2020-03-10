package com.bughunters.site.ems.service;

import com.bughunters.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeService
{
    Employee findById(int id);
    List<Employee> findAll();
    void add(Employee employee);
    void delete(int id);
    void update(int id,Employee employee);
}
