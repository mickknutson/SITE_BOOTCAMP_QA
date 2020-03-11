package com.example.site.ems.RESTcontroller;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;

import java.util.List;

public interface EmployeeEndpoint {
    List<Employee> findAll();
    String findById(long id, Model model);
}
