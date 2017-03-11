package com.higgsup.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAfterAspect {

	@AfterThrowing("within(com.higgsup.spring.service.EmployeeService)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
	}
	
	@Before("execution(* com.higgsup.spring.service.EmployeeService.getEmployee())")
	public void getNameReturningAdviceBefore(){
		System.out.println("before. Returned String=");
	}

	@After("execution(* com.higgsup.spring.service.EmployeeService.getEmployee())")
	public void getNameReturningAdviceAfter(){
		System.out.println("after. Returned String=");
	}
	
}
