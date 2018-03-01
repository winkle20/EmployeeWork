package com.oodles.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oodles.main.domain.Employee;
import com.oodles.main.domain.Project;
import com.oodles.main.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService ps;
	
	
	@RequestMapping("/employees/{id}/projects")
	public List<Project> getAllProjects(@PathVariable String id)
	{
	    return ps.getAllProject(id);
				
	}
	@RequestMapping("/employees/{employeeId}/projects/{id}")
	public Project getProject(@PathVariable String id)
	{
		return ps.getProject(id);
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/employees/{employeeId}/projects/{id}")
	public Project getProjectByEmployee(@PathVariable String employeeId,@PathVariable String id)
	{
		return ps.getProjectByEmployee(employeeId,id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/employees/{employeeId}/projects")
	public void addProject(@RequestBody Project project,@PathVariable String employeeId)
	{ 	
        project.setEmployee(new Employee(employeeId,"",""));
		ps.addProject(project);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="employees/{employeeId}/projects/{id}")
	public void updateProject(@RequestBody Project project,@PathVariable String employeeId,@PathVariable String id)
	{
       	project.setEmployee(new Employee(employeeId,"",""));
		ps.updateProject(project);
	}
	

	@RequestMapping(method=RequestMethod.DELETE, value="employees/{employeeId}/projects/{id}")
	public void deleteProject(@PathVariable String id)
	{
		ps.deleteProject(id);
	}
	

}
