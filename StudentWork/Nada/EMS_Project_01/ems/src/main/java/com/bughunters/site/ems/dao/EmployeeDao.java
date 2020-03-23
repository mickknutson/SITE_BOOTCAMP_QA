package com.bughunters.site.ems.dao;

import com.bughunters.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao
{
    Employee findById(int id);
    List<Employee> findAll();
    Employee add(Employee employee);
    void delete(int id);
    Employee update(int id,Employee employee);

}
