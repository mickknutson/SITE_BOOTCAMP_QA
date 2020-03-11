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

//    private Animal animal;
//    List<AnimalController>


    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable int id , Model model) {
        System.out.println("* In Controller findById:* " +id);
        Employee employee = service.findById(id);
        model.addAttribute("employee" , employee);
        return "employee";

    }

    /*
     * accept get mapping on:
     * http://localhsot:8080/list.html
     *
     * html html html html html html nader from the html page
     *
     * */

    @GetMapping("/list.html")
    @Override
    public String findAll(Model model) {
        List<Employee> employeeList = service.findAll();

        model.addAttribute("allEmployees" , employeeList);
        return "list"; // send back index.html
    }

    @Override
    @GetMapping("/add.html")
    public String add(Model model) {
        model.addAttribute(new Employee());
        return "add";
    }

    @PostMapping("new")
    @Override
    public String create(Employee employee){
        //FIXME: add validation here
        //NOTE: add validated animal from the DB
        service.add(employee);

        return "redirect:/employee/list.html";

    }

    @GetMapping("/delete/{id}")
    @Override
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/employee/list.html";
    }
}
