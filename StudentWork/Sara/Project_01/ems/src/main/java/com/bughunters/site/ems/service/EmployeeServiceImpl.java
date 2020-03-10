package com.bughunters.site.ems.service;

import com.bughunters.site.ems.dao.EmplpyeeDao;
import com.bughunters.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmplpyeeService {
    @Autowired
    @Qualifier("employeeDaoDatabaseImpl")
    private EmplpyeeDao dao;

    @Override
    public Employee findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Employee> findAll() {

        return dao.findAll();
    }

    @Override
    public void add(Employee employee) {
        dao.add(employee);
    }

    @Override
    public void update(int id,Employee employee)
    {
        System.out.println("* EmployeeServiceImpl.update()");

        dao.update(id,employee);
    }

    @Override
    public boolean delete(int id) {

        return dao.delete(id);
    }
}
