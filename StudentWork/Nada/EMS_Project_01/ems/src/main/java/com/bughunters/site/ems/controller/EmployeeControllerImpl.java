package com.bughunters.site.ems.controller;


import com.bughunters.site.ems.domain.Employee;
import com.bughunters.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeControllerImpl implements EmployeeController
{

    @Autowired
    private EmployeeService service;



    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id, Model model)
    {
        System.out.println("* EmplpoyeeController.FindById : "+id);

        Employee employee = service.findById(id);

        model.addAttribute("employee",employee);

        return "/employee";
    }

    @GetMapping("/edit/{id}")
    @Override
    public String edit(@PathVariable int id, Model model)
    {
        Employee employee = service.findById(id);

        model.addAttribute("employee",employee);

        return "/update";
    }

    @PostMapping("/update/{id}")
    @Override
    public String update (@PathVariable int id , Employee employee)
    {
        service.update(id,employee);

        return "redirect:/employees/list";
    }

    // accept requests on /list
    @GetMapping("/list")
    @Override
    public String findAll(Model model)
    {
        System.out.println("* EmplpoyeeController.FindAll() : ");
        List<Employee> allEmployees = service.findAll();
        // add the animals object to the view
        model.addAttribute("allEmployees",allEmployees);
        return "/employees";
    }

    @GetMapping("/add")
    @Override
    public String add(Model model)
    {
        System.out.println("* EmplpoyeeController.Add() : ");

        model.addAttribute(new Employee());



        return "add";
    }

    @PostMapping("new")
    @Override
    public String create(Employee employee)
    {
        System.out.println("added "+employee);
        service.add(employee);

        return "redirect:/employees/list";


    }


    @GetMapping("/delete/{id}")
    @Override
    public String delete (@PathVariable int id)
    {
        System.out.println("deleted "+id);
        service.delete(id);


        return "redirect:/employees/list";
    }



}
