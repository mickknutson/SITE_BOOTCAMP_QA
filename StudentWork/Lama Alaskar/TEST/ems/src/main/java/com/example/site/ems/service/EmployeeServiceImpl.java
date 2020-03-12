package com.example.site.ems.service;

import com.example.site.ems.dao.EmployeeDao;
import com.example.site.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao dao;
    @Override
    public Employee findById(long id){
        System.out.println("* EmployeeService.findByIdt: " + id);
        return dao.findById(id);
    }
    public List<Employee> findAll(){
        System.out.println("* EmployeeService.findAll:");
        return dao.findAll();
    }
    @Override
    public boolean add(Employee employee) {
        System.out.println("* EmployeeService.add");
        return dao.add(employee);
    }
    @Override
    public boolean delete(long id) {
        System.out.println("EmployeeService.delete");
        return dao.delete(id);
    }
    @Override
    public boolean update(Employee employee) {
        System.out.println("EmployeeService.update");
        return dao.update(employee);
    }
}
