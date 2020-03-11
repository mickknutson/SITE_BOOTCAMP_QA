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

    @GetMapping("/list")
    @Override
    public String findAll(Model model) {
        System.out.println("* EmployeeController.findAll:");
        List<Employee> allEmployees = service.findAll();
        model.addAttribute("allEmployees", allEmployees);
        return "list";
    }

    @GetMapping("{id}")
    @Override
    public String findById(@PathVariable long id, Model model) {
        System.out.println("* EmployeeController.findById(): " + id);
        Employee employee = service.findById(id);
        model.addAttribute("employee", employee);
        return "employee";
    }
    @GetMapping("add")
    @Override
    public String add(Model model) {
        System.out.println("* EmployeeController.add()");
        model.addAttribute(new Employee());
        return "add";
    }

    @PostMapping("create")
    @Override
    public String create(Employee employee) {
        System.out.println("* EmployeeController.create() -" + employee);
        service.add(employee);
        return "redirect:/employee/list";
    }

    @Override
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        System.out.println("* EmployeeController.delete() -" + id);
        service.delete(id);
        return "redirect:/employee/list";
    }

    @GetMapping("/update/{id}")
    @Override
    public String update(@PathVariable long id, Model model) {
        System.out.println("* EmployeeController.update()");
        Employee employee = service.findById(id);
        if (employee != null) {
            model.addAttribute("employee", employee);
        }
        return "update";
    }
    @PostMapping("save")
    @Override
    public String save(Employee employee) {
        System.out.println("* EmployeeController.save() -" + employee);
        service.update(employee);
        return "redirect:/employee/list";
    }
}
