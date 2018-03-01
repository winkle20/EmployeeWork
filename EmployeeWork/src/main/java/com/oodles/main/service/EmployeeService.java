package com.oodles.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oodles.main.domain.Employee;
import com.oodles.main.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository er;
	public List<Employee> getAllEmployee()
	{
		List<Employee> employees=new ArrayList<>();
		er.findAll().forEach(employees::add);
		return employees;
	}

	public Employee getEmployee(String id)
	{
		return er.findOne(id);
	}

	public void addEmployee(Employee employee) {
           er.save(employee);
	
	}

	public void updateEmployee(Employee employee, String id) 
	{
		er.save(employee);
		
		
	}

	public void deleteEmployee(String id) {
		er.delete(id);
		
	}
}
