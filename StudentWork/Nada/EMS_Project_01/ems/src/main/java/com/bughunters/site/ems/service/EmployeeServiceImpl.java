package com.bughunters.site.ems.service;


import com.bughunters.site.ems.dao.EmployeeDao;
import com.bughunters.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    @Qualifier("employeeDaoImpl")
    private EmployeeDao dao;


    @Override
    public Employee findById(int id)
    {
        System.out.println("* EmployeeServiceImpl.findById() : "+id);
        return dao.findById(id);
    }

    @Override
    public List<Employee> findAll()
    {
        System.out.println("* EmployeeServiceImpl.FindAll() : ");
        return dao.findAll();
    }

    @Override
    public Employee add(Employee employee)
    {
        System.out.println("* EmployeeServiceImpl.add() : ");
        dao.add(employee);
        return employee;
    }

    @Override
    public void delete(int id){
        System.out.println("* EmployeeServiceImpl.delete()");
        dao.delete(id);

    }

    public Employee update(int id,Employee employee)
    {
        System.out.println("* EmployeeServiceImpl.update()");

        return dao.update(id,employee);
    }



}
