package com.higgsup.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {

	@Before("execution(public com.higgsup.spring.model.Employee getEmployee())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getEmployee()");
	}

	@Before("execution(* com.higgsup.spring.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}
