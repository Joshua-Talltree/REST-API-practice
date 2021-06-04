package com.jtalltree.springdatarest.department.repos;

import org.springframework.data.repository.CrudRepository;

import com.jtalltree.springdatarest.department.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>{

}
