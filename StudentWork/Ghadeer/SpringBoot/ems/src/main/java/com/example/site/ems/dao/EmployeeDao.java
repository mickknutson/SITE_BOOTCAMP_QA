package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee findById(long id);

    List<Employee> findAll();

    boolean add(Employee employee);

    boolean delete(long id);

    boolean update(Employee updatedEmployee);

}
