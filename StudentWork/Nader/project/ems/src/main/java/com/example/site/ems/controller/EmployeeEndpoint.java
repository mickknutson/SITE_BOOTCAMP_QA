package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndpoint  {

    @Autowired
    private EmployeeService service;

    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id){
        return service.findById(id);
    }

    @GetMapping
    public List<Employee> findAll(){
        List<Employee> employees;
        employees = service.findAll();
        return employees;
    }

    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Employee employee){
        service.add(employee);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id){
        service.delete(id);

    }

    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Employee newEmp , @PathVariable int id) {
        Employee oldEmp = service.findById(id);
        oldEmp.setA_employeeId(newEmp.getA_employeeId());
        oldEmp.setA_firstName(newEmp.getA_firstName());
        oldEmp.setB_lastName(newEmp.getB_lastName());
        oldEmp.setDepartment(newEmp.getDepartment());
        oldEmp.setEmail(newEmp.getEmail());
        oldEmp.setHireDate(newEmp.getHireDate());
        oldEmp.setSalary(newEmp.getSalary());
        service.add(oldEmp);
    }
//
//    @PutMapping("/edit/{id}")
//    public void update(@RequestBody Employee newEmp , Integer id) {
//            return service.findById(id).map(employee -> {
//        employee.setFirstName(newEmployee.getFirstName());
//        employee.setLastName(newEmployee.getLastName());
//        employee.setEmail(newEmployee.getEmail());
//        return repository.save(employee);
//    }).orElseGet(() -> {
//        newEmployee.setId(id);
//        return repository.save(newEmployee);
//    });
}
