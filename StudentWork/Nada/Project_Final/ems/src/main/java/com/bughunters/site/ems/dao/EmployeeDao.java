package com.bughunters.site.ems.dao;

import com.bughunters.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao
{
    Employee findById(int id);
    List<Employee> findAll();
    void add(Employee employee);
    void delete(int id);
    void update(int id,Employee employee);

}
