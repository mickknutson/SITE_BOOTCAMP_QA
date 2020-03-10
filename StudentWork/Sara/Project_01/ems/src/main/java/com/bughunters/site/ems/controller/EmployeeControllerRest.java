package com.bughunters.site.ems.controller;


import com.bughunters.site.ems.domain.Employee;
import com.bughunters.site.ems.service.EmplpyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeControllerRest
{

    @Autowired
    private EmplpyeeService service;


    // GET : return an an array of all employees objects
    @GetMapping("/")
    public List<Employee> findAll()
    {
        List<Employee> employees = service.findAll();
        return employees;
    }

    // GET : return an object of a single employee by his id
    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id, Model model)
    {

        return service.findById(id);
    }

    // POST : add a single employee to the database
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Employee create(@RequestBody Employee employee)
    {
        service.add(employee);
        return employee;
    }

    // DELETE : delete a single employee from the database
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String delete(@PathVariable int id)
    {
        service.delete(id);
        return "Deleted Successfully";
    }

    // PUT : update a single employee from the database by his id
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public String update(@PathVariable int id,@RequestBody Employee employee)
    {
        service.update(id,employee);

        return "Updated Successfully";
    }

}
