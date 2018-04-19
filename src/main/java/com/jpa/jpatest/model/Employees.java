package com.jpa.jpatest.model;

import java.util.List;

public class Employees {
	
	List<Employee> employees;
	
	public Employees(List<Employee> employees) {
		this.employees= employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	
}
