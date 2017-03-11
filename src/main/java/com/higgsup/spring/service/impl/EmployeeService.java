package com.higgsup.spring.service.impl;

import com.higgsup.spring.model.Employee;
import com.higgsup.spring.service.interfaces.IEmployeeService;
import com.higgsup.spring.stereotype.Logger;
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
