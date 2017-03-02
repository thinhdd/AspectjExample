package com.journaldev.spring.model;

import org.springframework.stereotype.Component;

public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee() {
	}
}
