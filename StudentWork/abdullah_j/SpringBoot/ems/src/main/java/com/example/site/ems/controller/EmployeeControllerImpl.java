package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/add")
    @Override
    public String add(Model model) {
        model.addAttribute(new Employee());

        return "add";
    }

    @PostMapping("/create")
    @Override
    public String create(Employee employee) {
        service.add(employee);

        return "redirect:/employee/list";
    }

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable long id, Model model) {

        Employee employee = service.findById(id);

        model.addAttribute("employee" , employee);

        return "employee";

    }

    @GetMapping("/list")
    @Override
    public String findAll(Model model) {
        // Need model object
        List<Employee> allEmployees = service.findAll();

        model.addAttribute("allEmployees" , allEmployees);

        return "List";
    }

    @Override
    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model) {

        return "redirect:/employee/list";
    }

    @Override
    public String delete(long id) {
        return null;
    }
}
