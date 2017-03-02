package com.journaldev.spring.controller;

import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thinhdd on 3/2/2017.
 */
@RestController
public class EmployeeController {
    private final IEmployeeService employeeService;

    @Autowired
    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getEmployeeName")
    public String getEmployee(){
        return employeeService.getEmployee().getName();
    }

    @GetMapping("/throwException")
    public void throwException(){
        employeeService.throwExceptionEmployee();
    }

    @PostMapping(name = "/setEmployee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.setEmployee(employee);
    }
}
