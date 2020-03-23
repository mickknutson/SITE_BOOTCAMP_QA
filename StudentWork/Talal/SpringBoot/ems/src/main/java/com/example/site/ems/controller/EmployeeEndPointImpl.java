package com.example.site.ems.controller;

import com.example.site.ems.domain.Employee;
import com.example.site.ems.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/ems")
public class EmployeeEndPointImpl {

    @Autowired
    private EmployeeService service;


 @GetMapping("/{id}")
public String findById(@PathVariable int id , Model model){
    if(service.findById(id)==null){
        return"";

    }else {
        return service.findById(id).toString();
    }

}
@GetMapping("/employee/list")
public List<Employee> findAll( Model model){
     List<Employee> employeeList = service.findALl();
    return employeeList;
}

    @PostMapping("/create")
    public String create(Employee employee){
        service.add(employee);
        return "redirect:/ems/employeesList";
    }

    @GetMapping("/add")
    public String add(Model model) {
        Employee employee = new Employee();
        System.out.println("Employee: " + employee);
        model.addAttribute("employee", employee);
        return "addPage";
    }


    @GetMapping("updateForm/{id}")
    public String updateForm (@PathVariable int id, Model model){
        Employee employee = service.findById(id);
        model.addAttribute("employee",employee);
        return"updatePage";
    }
    @PutMapping("/update")

    public String update(Employee employee) {
        service.update(employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getDepartment(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getDate());
        return "redirect:/ems/employeesList";
    }

    @GetMapping("/delete/{id}")

    public String delete( @PathVariable  int id) {
        service.delete(id);
        return "redirect:/ems/employeesList";
    }


}
