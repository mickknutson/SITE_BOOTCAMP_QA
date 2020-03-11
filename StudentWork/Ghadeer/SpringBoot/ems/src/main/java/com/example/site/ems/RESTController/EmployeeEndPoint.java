package com.example.site.ems.RESTController;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeEndPoint {
    String findById(long id, Model model);
    List<Employee> findAll();

}
