package com.oodles.main.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	
 @Id 
 private String id;
 private String name;
 @ManyToMany
 private Set<Project> project=new HashSet<Project>();
 public Technology()
 {}
 public Technology(String id, String name) {
	super();
	this.id = id;
	this.name = name;
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

public Set<Project> getProject() {
	return project;
}

public void setProject(Set<Project> project) {
	this.project = project;
}

}
