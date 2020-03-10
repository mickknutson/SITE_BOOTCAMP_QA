package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeController {

    Employee findById(int id);

    List<Employee> findALl();

    String add(Employee employee);

    String update(Employee employee);

    void delete(int id);

}
