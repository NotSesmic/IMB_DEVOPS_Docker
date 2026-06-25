package com.example.demo.controller;
 
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
 
@RestController
public class EmployeeController {
 
    private final EmployeeService employeeService = new EmployeeService();
 
    @GetMapping("/employees")

    public List<Employee> getEmployees() {

        return employeeService.getAllEmployees();

    }

}
 