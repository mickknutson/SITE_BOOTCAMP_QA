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


    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model) {

        System.out.println(" * EmployeeController.findById: " + id);

        Employee employee = service.findById(id);

        model.addAttribute("employee", employee);

        return "employee";
    }


    @GetMapping("/list.html") // Should give us Model
    @Override
    public String findAll(Model model) {

        // *** Need Model Object ****

        // Get List of Animals from DB
        List<Employee> allEmployees = service.findAll();

        // Add List ro Response Model
        model.addAttribute("allEmployees", allEmployees);

        // Return View Page
        return "list"; // Name of the page i want to send back // Send back 'list.html'
    }

    @GetMapping("add") // add mean add.html
    @Override
    public String add(Model model){

        // TODO: Add PPROPER Logic
        model.addAttribute(new Employee());
        return "add";
        // return "redirect:/animal/list.html";
    }


    @PostMapping("new")
    @Override
    public String create(Employee employee){

        // FIXME: NEED VALIDATION !!
        // NOTE: Add validated Animal to DataBase
        service.add(employee);

        return "redirect:/employee/list.html";
    }

    @Override
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){

        boolean result=service.delete(id);
        System.out.println("Delete result is: "+result);


        return "redirect:/employee/list.html";

    }
}
