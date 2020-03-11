package com.example.site.ems.RESTcontroller;

import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.site.ems.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/employee")
public class EmployeeEndpointImpl implements EmployeeEndpoint {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> findAll() {
        List<Employee> employees = service.findAll();
        System.out.println("REST Employee");
        return employees;
    }
    @GetMapping("/{id}")
    public String findById(long id, Model model){
        return service.findById(id).toString();
    }
}

