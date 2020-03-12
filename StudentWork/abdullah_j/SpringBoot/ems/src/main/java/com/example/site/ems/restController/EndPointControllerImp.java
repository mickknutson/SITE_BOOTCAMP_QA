package com.example.site.ems.restController;

import com.example.site.ems.domain.Employee;

import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EndPointControllerImp implements EndPointController {

    @Autowired
    private EmployeeService service;


    @GetMapping("/{id}")
    @Override
    public Employee findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping
    @Override
    public List<Employee> findAll() {
        return service.findAll();
    }
}
