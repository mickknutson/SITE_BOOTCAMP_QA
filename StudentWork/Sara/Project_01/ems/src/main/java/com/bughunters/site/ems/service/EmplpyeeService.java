package com.bughunters.site.ems.service;

import com.bughunters.site.ems.domain.Employee;

import java.util.List;

public interface EmplpyeeService {

    Employee findById(int id);
    List<Employee> findAll();
    void add(Employee employee);
    void update(int id, Employee employee);
    boolean delete(int id);
}
