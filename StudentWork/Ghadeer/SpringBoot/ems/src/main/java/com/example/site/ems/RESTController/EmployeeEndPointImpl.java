package com.example.site.ems.RESTController;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndPointImpl implements EmployeeEndPoint {
    @Autowired
    private EmployeeService service;

    @GetMapping("/{id}")//uri, mapping

    public String findById(@PathVariable long id){

        return service.findById(id).toString();
    }
    @GetMapping
    public List<Employee> findAll(){
        List<Employee> employees = service.findAll();
        System.out.println("REST employees: " + employees);
        return employees;
    }


}
