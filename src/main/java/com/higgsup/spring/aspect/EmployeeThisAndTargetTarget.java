package com.higgsup.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by thinhdd on 3/3/2017.
 */
@Aspect
@Component
public class EmployeeThisAndTargetTarget {

    @After("execution(* *..EmployeeService.getEmployee()) && target(t)")
    public void getNameReturningAdviceAfterWithTarget(Object t) {
        System.out.println("target ok");
    }

    @After("execution(* *..EmployeeService.getEmployee()) && this(s)")
    public void getNameReturningAdviceAfterWithThis(Object s) {
        System.out.println("this ok");

    }

}
