package com.example.site.ems.service;

import com.example.site.ems.dao.EmployeeDao;
import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Override
    public boolean add(Employee employee) {
        return dao.add(employee);
    }

    @Override
    public Employee findById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }

    @Override
    public boolean update(Employee updatedEmployee) {
        return dao.update(updatedEmployee);
    }

    @Override
    public boolean delete(long id) {
        return dao.delete(id);
    }
}
