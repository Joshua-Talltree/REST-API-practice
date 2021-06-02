package com.jtalltree.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.jtalltree.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	

}
