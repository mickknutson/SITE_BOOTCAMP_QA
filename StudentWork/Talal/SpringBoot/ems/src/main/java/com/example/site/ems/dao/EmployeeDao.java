package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;

import java.util.Date;
import java.util.List;


public interface EmployeeDao {

    Employee findById(int id);

    List<Employee> findALl();

    void add(Employee employee);

    void update(int id, String fname, String lname, String department, String email, int salary, Date date);

    void delete(int id);



}
