package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

public interface EmployeeController {

    String gotoAdd(Employee employee);
    String listAll(Model model);
    String add(Employee employee, BindingResult result);
    String gotoUpdate(int id, Model model);
    String update(int id,
                         Employee employee, BindingResult result,
                         Model model);
    public String delete(int id, Model model);

    }
