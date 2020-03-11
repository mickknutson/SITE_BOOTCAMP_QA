package com.example.site.ems.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee extends Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generate id value
    private int id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private Date hireDate;
    @Column
    private String department;
    @Column
    private double salary;

    // Constructor
    public Employee() {
    }

    // Methods

    @Override
    public String toString() {
        return "Employee{" +
                "id =" + id +
                ", First Name ='" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Email = '" + email + '\'' +
                ", Hire Date='" + hireDate + '\'' +
                ", Department='" + department + '\'' +
                ", Salary='" + salary + '\'' +
                '}';
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
