package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;

public interface EmployeeController {

    String add(Model model);

    String create(Employee employee);

    String findById(long id , Model model);

    String findAll(Model model);

    String update(long id , Model model);

    String save(Employee employee);

    String delete(long id);

}
