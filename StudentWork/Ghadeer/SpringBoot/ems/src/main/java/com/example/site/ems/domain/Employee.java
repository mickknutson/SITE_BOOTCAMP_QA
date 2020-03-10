package com.example.site.ems.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    //Map field to DB columns

    @Id //Primary key
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long employeeId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column
    private Date hireDate;
    @Column
    private String email;
    @Column
    private String department;
    @Column
    private float salary;

    public Employee(long id, String firstName, String lastName, Date hireDate, String email, String department, float salary) {
        this.employeeId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public long getEmployeeId() {
        return employeeId;
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

    public float getSalary() {
        return salary;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
