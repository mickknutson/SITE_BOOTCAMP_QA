package com.example.site.ems.service;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeService  {

    Employee findById(int id);

    List<Employee> findALl();

    void add(Employee employee);

    void update(Employee employee);

    void delete(int id);


}
