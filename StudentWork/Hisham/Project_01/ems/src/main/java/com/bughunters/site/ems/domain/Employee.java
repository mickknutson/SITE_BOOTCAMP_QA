package com.bughunters.site.ems.domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer employeeId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String department;
    @Column
    private BigDecimal salary;
    @Column
    private Date hiringDate;
    @Column
    private String email;


    public Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Employee_Id='" + employeeId + '\'' +
                ", First_Name='" + firstName + '\'' +
                ", Last_Name='" + lastName + '\'' +
                ", Department='" + department + '\'' +
                ", Salary='" + salary + '\'' +
                ", Hiring_Date='" + hiringDate + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public BigDecimal getSalary()
    {
        return salary;
    }

    public void setSalary(BigDecimal salary)
    {
        this.salary = salary;
    }

    public Date getHiringDate()
    {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate)
    {
        this.hiringDate = hiringDate;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
