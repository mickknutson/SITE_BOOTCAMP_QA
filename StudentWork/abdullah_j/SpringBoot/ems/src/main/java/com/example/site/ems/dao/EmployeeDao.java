package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    boolean add(Employee employee);

    Employee findById(long id);

    List<Employee> findAll();

    boolean update(Employee updatedEmployee);

    boolean delete(long id);

}
