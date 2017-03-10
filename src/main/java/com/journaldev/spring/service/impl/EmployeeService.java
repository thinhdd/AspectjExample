package com.journaldev.spring.service.impl;

import com.journaldev.spring.model.Employee;
import com.journaldev.spring.service.interfaces.IEmployeeService;
import com.journaldev.spring.stereotype.Logger;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService implements IEmployeeService {

	private Employee employee = new Employee("thinhdd");

	@Override
	@Logger
	public Employee getEmployee(){
		return this.employee;
	}

	@Override
	public void setEmployee(Employee e){
		this.employee=e;
	}

	@Override
	public void throwExceptionEmployee()
	{
		throw new RuntimeException("Dummy Exception");
	}


}
