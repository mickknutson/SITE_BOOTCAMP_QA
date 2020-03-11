package com.example.site.ems.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.site.ems.domain.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoDatabaseImpl implements EmployeeDao {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee findById(long id) {
        System.out.println("EmployeeDaoDatabaseImpl.findById" + id);
        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }

    }

    @Override
    public List<Employee> findAll() {
        System.out.println("EmployeeDaoDatabaseImpl.findAll()");

        Iterable<Employee> result = repository.findAll();
        List<Employee> employeesList = new ArrayList<Employee>();
        for (Employee employee : result) {
            employeesList.add(employee);
        }

        return employeesList;
    }
    @Override
    public boolean add(Employee employee) {
        System.out.println("EmployeeDaoDatabaseImpl.add()");

        Optional<Employee> result = repository.findById(employee.getEmployeeId());
        if (!result.isPresent()) {
            repository.save(employee);

            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public boolean delete (long id){
        System.out.println("EmployeeDaoDatabaseImpl.delete()");

        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
           Employee employee=result.get();
            repository.deleteById(id);
            return true;

        }
        else {
            return false;
        }

    }
//    public boolean update(Employee employee) {
//        System.out.println("EmployeeDaoDatabaseImpl.update()");
//        Optional<Employee> result = repository.findById(employee.getEmployeeId());
//        if (result.isPresent()) {
//            repository.save(employee);
//
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }
public boolean update (Employee updatedEmployee){
    System.out.println("EmployeeDaoDatabaseImpl.update()");
    Optional<Employee> result = repository.findById(updatedEmployee.getEmployeeId());
    if(result.isPresent()){
        repository.save(updatedEmployee);
        System.out.println("update result is : "+updatedEmployee.getEmployeeId()+true);
        return true;
    }else {
        System.out.println("update result is: "+updatedEmployee.getEmployeeId()+false);

        return false;

    }
}



}//The End..
