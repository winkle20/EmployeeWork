package com.oodles.main.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {
	
	@Id
	private String id;
	private String name;
	@ManyToOne
	private Employee employee;
	public Project() {}
	public Project(String id, String name,String employeeId) {
		super();
		this.id = id;
		this.name = name;
		this.employee=new Employee(employeeId,"","");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
