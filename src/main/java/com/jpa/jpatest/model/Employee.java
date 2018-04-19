package com.jpa.jpatest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private String empId;
	private String firstName;
	private String salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String firstName, String salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
}
