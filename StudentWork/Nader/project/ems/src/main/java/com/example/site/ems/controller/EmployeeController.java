package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;

public interface EmployeeController {

    String findById(int id , Model model);
    String findAll(Model model);
    String add(Model model);
    String create(Employee employee);
    String delete(int id);

}
