package com.bughunters.site.ems.controller;


import com.bughunters.site.ems.domain.Employee;
import com.bughunters.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
public class EmployeeControllerRest {
    @Autowired
    private EmployeeService service;
    // GET : return an an array of all employees objects
    @GetMapping("/")
    public HashMap<String,Object> findAll() {
        List<Employee> allEmployees = service.findAll();
        HashMap<String,Object> response = new HashMap<>();
        response.put("employees",allEmployees);
        response.put("msg","Exists");
        return response;
    }
    // GET : return an object of a single employee by his id
    @GetMapping("/{id}")
    public HashMap<String,Object> findById(@PathVariable int id) {
        HashMap<String,Object> response = new HashMap<>();
        Employee foundEmployee = service.findById(id);
        response.put("employee",foundEmployee);
        response.put("msg","Exists");
        return response;
    }
    // POST : add a single employee to the database
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public HashMap<String,Object> create(@RequestBody Employee employee) {
        HashMap<String,Object> response = new HashMap<>();
        service.add(employee);
        response.put("employee",employee);
        response.put("msg","Added Successfully");
        return response;
    }
    // DELETE : delete a single employee from the database
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String,Object> delete(@PathVariable int id) {
        HashMap<String,Object> response = new HashMap<>();
        service.delete(id);
        response.put("id",id);
        response.put("msg","Deleted Successfully");
        return response;
    }
    // PUT : update a single employee from the database by his id
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String,Object> update(@PathVariable int id, @RequestBody Employee employee) {
        HashMap<String,Object> response = new HashMap<>();
        response.put("employee",employee);
        response.put("msg","Updated Successfully");
        return response;
    }






}
