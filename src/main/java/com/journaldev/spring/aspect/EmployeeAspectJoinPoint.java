package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class EmployeeAspectJoinPoint {


	@Before("execution(public void com.journaldev.spring.service..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before running loggingAdvice on method="+joinPoint.toString());

		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

	}
}
