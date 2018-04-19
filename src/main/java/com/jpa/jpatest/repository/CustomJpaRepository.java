package com.jpa.jpatest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jpa.jpatest.model.Employee;

@Component
public interface CustomJpaRepository extends JpaRepository<Employee, String>{

	Employee findByFirstName(String name);

	List<Employee> findAllByFirstName(String name);

}
