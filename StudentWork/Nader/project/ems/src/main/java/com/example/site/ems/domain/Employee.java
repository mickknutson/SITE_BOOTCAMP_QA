package com.example.site.ems.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Date hireDate;
    @Column
    private String department;
    @Column
    private String email;
    @Column
    private double salary;


}
