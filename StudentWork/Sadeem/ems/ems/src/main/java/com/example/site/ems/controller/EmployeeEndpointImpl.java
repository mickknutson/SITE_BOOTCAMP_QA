package com.example.site.ems.controller;


import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee") // URI
public class EmployeeEndpointImpl {

    @Autowired
    private EmployeeService service;

    // METHOD:

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public Employee findById(@PathVariable int id, Model model) {

        // FIXME: Add Validation:
        return service.findById(id);
    }

    @GetMapping()
    public List<Employee> findAll() {
        List<Employee> employees = service.findAll();
        System.out.println("** REST Employee : " + employees);
        return employees;
    }

    // List<int> List<boolean List<Boolean>

    public Boolean delete(int id){
        throw new RuntimeException("Not implemented yer");
    }

    public Boolean add(Employee animal){
        throw new RuntimeException("Not implemented yer");
    }

    public Boolean update(Employee animal){
        throw new RuntimeException("Not implemented yer");
    }

}
