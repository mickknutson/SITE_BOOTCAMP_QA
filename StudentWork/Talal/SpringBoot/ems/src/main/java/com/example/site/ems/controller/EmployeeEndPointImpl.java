package com.example.site.ems.controller;

import com.example.site.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/ems")
public class EmployeeEndPointImpl {

    @Autowired
    private EmployeeService service;





}
