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
    public Employee findById(int id){

        return dao.findById(id);
    }

    @Override
    public List<Employee> findAll(){
        return dao.findAll();
    }

    @Override
    public void add(Employee employee) {

        dao.add(employee);
    }

    @Override
    public boolean delete(int id) {
        dao.delete(id);
        return true;
    }
}


