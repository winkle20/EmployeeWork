package com.oodles.main.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String id;

	private String name;
	private String department;
	
	public Employee()
	{}
	
	public Employee(String id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		department = dept;
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
	public String getDept() {
		return department;
	}
	public void setDept(String dept) {
		department = dept;
	}
}
