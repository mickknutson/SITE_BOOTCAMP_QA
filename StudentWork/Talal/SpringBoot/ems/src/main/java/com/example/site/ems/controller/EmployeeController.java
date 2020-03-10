package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;

import java.util.List;

public interface EmployeeController {

     String findById(int id, Model model);
    // Employee findById(int id);

    String findALl(Model model);
    //  List<employee> findALl();

    String add(Model Model);

    String update(Employee employee);

    String delete(int id);

}
