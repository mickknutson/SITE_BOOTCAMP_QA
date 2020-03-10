package com.example.site.ems.service;

import com.example.site.ems.dao.EmployeeDao;
import com.example.site.ems.dao.EmployeeDaoImpl;
import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    @Qualifier("employeeDaoImpl")
    private EmployeeDao employeeDao;

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> findALl() {
        return employeeDao.findALl();
    }

    @Override
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {

        employeeDao.delete(id);
    }
}
