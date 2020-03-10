package com.bughunters.site.ems.controller;

import com.bughunters.site.ems.domain.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeController {
    String findById(int id, Model model);
    String findAll(Model model);
    String add(Model model);
    String create(Employee employee);
    String delete (@PathVariable int id);
    String edit(@PathVariable int id, Model model);
    String update(@PathVariable int id, Employee employee);
}
