package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import org.springframework.ui.Model;

public interface EmployeeController {

    /**
     * Returns the add html file that can be showed by the template engine
     *
     * @param model  to link java variables with the template engine
     * @return name of the html file
     */
    String add(Model model);

    /**
     * Add the employee to the database and redirect to the employees list page
     *
     * @param employee  employee to add to the database
     * @return the path to redirect to
     */
    String create(Employee employee);

    /**
     * find an employee by id and open that user page
     *
     * @param id  employee id to find
     * @param model  to link java variables with the template engine
     * @return name of the html file
     */
    String findById(long id , Model model);

    /**
     * open the employee list page
     *
     * @param model  to link java variables with the template engine
     * @return name of the html file
     */
    String findAll(Model model);

    /**
     * Returns the update html file that can be showed by the template engine
     *
     * @param id  employee id to update its information
     * @param model  to link java variables with the template engine
     * @return name of the html file
     */
    String update(long id , Model model);

    /**
     * Update the employee informatio  in the database and redirect to the employees list page
     *
     * @param employee  employee to add to the database
     * @return the path to redirect to
     */
    String save(Employee employee);

    /**
     * Update the employee informatio  in the database and redirect to the employees list page
     *
     * @param id  employee id to delete
     * @return the path to redirect to
     */
    String delete(long id);

}
