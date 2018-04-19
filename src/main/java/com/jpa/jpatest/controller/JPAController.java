package com.jpa.jpatest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.jpatest.model.Employee;
import com.jpa.jpatest.model.Employees;
import com.jpa.jpatest.repository.CustomJpaRepository;

@RestController
@RequestMapping(value="/jpa")
public class JPAController {
	
	
	
	@Autowired
	private CustomJpaRepository jpaRepository;

	@GetMapping(value ="/all")
	public Employees getAll() {
		return new Employees(jpaRepository.findAll());
		
	}
	
	@GetMapping(value ="/push")
	public Employees push() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Suman","61000"));
		employees.add(new Employee("Ritu", "0000"));
		return  new Employees(jpaRepository.save(employees));
		
	}
	@GetMapping(value ="/{name}")
	public Employee getByName(@PathVariable String name) {
		
		return jpaRepository.findByFirstName(name);
		
	}
	
	@GetMapping(value ="/all/{name}")
	public Employees getAllByName(@PathVariable String name) {
		
		return new Employees(jpaRepository.findAllByFirstName(name));
		
	}
	

}
