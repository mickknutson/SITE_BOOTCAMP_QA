package com.example.site.ems.controller;


import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")//url i want to map to
public class EmployeeControllerImpl implements EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable long id, Model model) {

        Employee employee = service.findById(id);
        model.addAttribute("employee", employee);
        return "employee";//smth to view in animal.html
    } //End findById method

    /*
   accept GET request on
   http://localhost:8080/List.html
   shall send a string no a list
    */
    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {

        List<Employee> allEmployees = service.findAll();

        //add list to the response model
        model.addAttribute("allEmployees", allEmployees);


        return "list"; //send back the client page
    }


    @GetMapping("add")
    @Override
    public String add(Model model) {
        model.addAttribute(new Employee());
        return "add";
    }

    @PostMapping("create")
    @Override
    public String create(Employee employee) {
        //fixme: need validation
        //Note: add validated to my database
        service.add(employee);
        return "redirect:/employee/list.html";

    }

    @Override
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        boolean result = service.delete(id);
        System.out.println("Delete result is: " + result);
        return "redirect:/employee/list.html";
    }


    @GetMapping("/update/{id}")
    @Override
    public String update(@PathVariable long id, Model model) {
        System.out.println("* EmployeeController.update()");

        Employee employee = service.findById(id);
        if (employee != null) {
            model.addAttribute("employee", employee);
            //model.addAttribute("employee",employee);
            //return "employee";
        }
        return "update";
    }
        ///
        @PostMapping("save")
//    @Override
        public String save(Employee employee) {
            System.out.println("* EmployeeController.save() -" + employee);
            service.update(employee);
            return "redirect:/employee/list.html";
        }

    }

