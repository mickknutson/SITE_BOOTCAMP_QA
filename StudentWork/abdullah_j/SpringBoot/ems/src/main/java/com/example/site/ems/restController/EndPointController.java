package com.example.site.ems.restController;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EndPointController {

    Employee findById(long id);

    List<Employee> findAll();

}
