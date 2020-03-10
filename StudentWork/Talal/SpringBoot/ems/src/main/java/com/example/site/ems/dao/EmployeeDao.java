package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;

import java.util.List;


public interface EmployeeDao {

    Employee findById(int id);

    List<Employee> findALl();

    void add(Employee employee);

    void update(Employee employee);

    void delete(int id);



}
