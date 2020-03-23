package com.example.site.ems.service;

import com.example.site.ems.dao.EmployeeDao;
import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    @Qualifier("employeeDaoDatabaseImpl")
    private EmployeeDao dao;

    @Override
    public Employee findById(int id) {
        System.out.println("** EmployeeService.FindById():"+ id);
        return dao.findById(id);
    }

    public List<Employee> findAll() {
        System.out.println("** EmployeeService.FindAll():");
        return dao.findAll();
    }

    @Override
    public void add(Employee employee){
        System.out.println("* EmployeeService.add()");
        dao.add(employee);
    }

    public boolean delete(int id){
        return dao.delete(id);
    }

}
