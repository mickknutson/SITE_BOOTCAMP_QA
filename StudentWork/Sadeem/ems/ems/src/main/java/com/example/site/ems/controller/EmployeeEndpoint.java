package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EmployeeEndpoint {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> finsAll(){
        List<Employee> employees = service.findAll();
        System.out.println("** REST Employees");
        return employees;
    }
}

