package com.bughunters.site.ems.service;

import com.bughunters.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeService
{
    Employee findById(int id);
    List<Employee> findAll();
    Employee add(Employee employee);
    void delete(int id);
    Employee update(int id,Employee employee);
}
