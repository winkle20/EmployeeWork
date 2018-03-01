package com.oodles.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.oodles.main.domain.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,String> {

}
