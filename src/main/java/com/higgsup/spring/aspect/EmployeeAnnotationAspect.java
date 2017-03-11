package com.higgsup.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.higgsup.spring.stereotype.Logger)")
	public void myAdvice(){
		System.out.println("Executing myAdvice annotation");
	}
}
