package com.example.site.ems.domain;

import javax.persistence.*;

@Entity
public class Employee {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String a_employeeId;
    
    @Column
    private String a_firstName;
    @Column
    private String b_lastName;
    @Column
    private String hireDate;
    @Column
    private String department;
    @Column
    private String email;
    @Column
    private double salary;

    public Employee() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getA_employeeId() {
        return a_employeeId;
    }

    public void setA_employeeId(String a_employeeId) {
        this.a_employeeId = a_employeeId;
    }

    public String getA_firstName() {
        return a_firstName;
    }

    public void setA_firstName(String firstName) {
        this.a_firstName = firstName;
    }

    public String getB_lastName() {
        return b_lastName;
    }

    public void setB_lastName(String lastName) {
        this.b_lastName = lastName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

