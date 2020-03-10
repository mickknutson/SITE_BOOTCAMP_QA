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
@RequestMapping("ems")
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id,
                           Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        // TODO: ADD THE HTML PAGE :
        return "";
    }

    @GetMapping("/employeesList")
    @Override
    public String findALl() {
        // TODO : HTML PAGE !!
        return "";
    }

    // TODO : CHANGE METHOD NAME!!! We have 2 add() methods!!
    @PostMapping("/create")
    public String create(Employee employee){
        employeeService.add(employee);
        return "redirect://employee/employeesList";
    }

    @PostMapping("/add")
    @Override
    public String add(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        // TODO : ADD HTML PAGE !!
        return "";
    }

    @Override
    public String update(Employee employee) {
        return null;
    }

    @GetMapping("/delete/{id}")
    @Override
    public String delete(int id) {
        employeeService.delete(id);
        return "redirect:http:localhost:8080/employee/employeesList";
    }
}
