package com.example.site.ems.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String a_firstName;
    @Column
    private String b_lastName;
    @Column
    private Date hireDate;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
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
