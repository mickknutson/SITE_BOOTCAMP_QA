package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees/")
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("new")
    public String gotoAdd(Employee employee) {

        //employeeService.add(employee);
        return "add-emp";
    }

    @GetMapping("list")
    public String listAll(Model model) {
        List<Employee> employees = employeeService.findAll();
        System.out.println(employees.toString());
        model.addAttribute("employees" , employees);
        return "ems";
    }

    @PostMapping("add")
    public String add(Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "add-emp";
        }
        employeeService.add(employee);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String gotoUpdate(@PathVariable("id") int id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "update-employee";
    }

    @PostMapping("update/{id}")
    public String update(@PathVariable("id") int id,
                                Employee employee, BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            employee.setId(id);
            return "update-employee";
        }

        employeeService.add(employee);
        model.addAttribute("employees", employeeService.findAll());
        return "ems";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int id, Model model) {
        //Employee employee = employeeService.findById(id);
        employeeService.delete(id);
        model.addAttribute("employees", employeeService.findAll());
        return "ems";
    }
}
