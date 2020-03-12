package com.example.site.ems.dao;

import com.example.site.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao {

    /**
     * Returns an Employee on a specified employeeID.
     * This method always returns immediately, whether or not the
     * employeeID exists. it will check the present of the employeeID
     * based on its present the method return either an employee
     * or NULL using the repository Object.
     * @param  id  receiving employee's identifier
     * @return     Employee
     */
    Employee findById(long id);

    /**
     * Returns a List of Employees.
     * This method always returns immediately.
     * it will return All the employees stored in
     * the Database using the repository Object.
     * @return     List of Employees
     */
    List<Employee> findAll();

    /**
     * Returns a boolean value based on the success or
     * the failure of the add procedure.
     * This method always returns immediately, whether or not the
     * add succeed or not. it will check the non present of the employee
     * and based on that the method will use the repository Object to add the
     * object based on the procedure success the method return the proper boolean value
     *@param  employee  receiving an object of employee
     * @return  boolean value
     */
    boolean add(Employee employee);
    /**
     * Returns a boolean value based on the success or
     * the failure of the delete procedure.
     * This method always returns immediately, whether or not the
     * delete succeed or not. it will check the present of the employee
     * and based on that the method will use the repository Object to delete
     * the specified object.
     * based on that the method return the proper boolean value.
     *@param  id  receiving an employee identifier.
     * @return  boolean value
     */
    boolean delete(long id);

    /**
     * Returns a boolean value based on the success or
     * the failure of the update procedure.
     * This method always returns immediately, whether or not the
     * update succeed or not. it will check the present of the employee
     * based on that the method will use the repository object to save the new object.
     * and it will return the proper boolean value.
     *@param  updatedEmployee  receiving an object of employee with updated info
     * @return  boolean value
     */
    boolean update(Employee updatedEmployee);

}



