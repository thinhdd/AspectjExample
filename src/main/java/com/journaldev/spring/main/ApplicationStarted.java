package com.journaldev.spring.main;

import com.journaldev.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by thinhdd on 3/1/2017.
 */
@Component
public class ApplicationStarted implements ApplicationListener<ApplicationReadyEvent> {

    private ApplicationContext context;

    @Autowired
    public void context(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Pankaj");

        employeeService.getEmployee().throwException();
    }
}
