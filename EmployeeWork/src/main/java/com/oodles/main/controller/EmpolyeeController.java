package com.oodles.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oodles.main.domain.Employee;
import com.oodles.main.service.EmployeeService;

@RestController
public class EmpolyeeController {
	@Autowired
	EmployeeService es;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee()
	{
	    return es.getAllEmployee();
				
	}
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee)
	{ 	

		es.addEmployee(employee);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable String id)
	{
		es.updateEmployee(employee,id);
	}
	

	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		es.deleteEmployee(id);
	}
}
