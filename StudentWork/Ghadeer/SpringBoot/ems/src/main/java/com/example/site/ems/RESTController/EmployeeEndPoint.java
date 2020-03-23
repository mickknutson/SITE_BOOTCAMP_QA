package com.example.site.ems.RESTController;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeEndPoint {

    /**
     * Returns a string in order to share data for an employee by using
     * RESTful service.
     *@param  id
     * @return  Employee ToString
     */
    String findById(long id);
    /**
     * Returns a List of employees in order to share data for an all the employees
     * by using RESTful service.
     * @param -
     * @return  Employee ToString
     */
    List<Employee> findAll();

}


