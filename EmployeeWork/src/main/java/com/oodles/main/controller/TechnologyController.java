package com.oodles.main.controller;


import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oodles.main.domain.Project;
import com.oodles.main.domain.Technology;
import com.oodles.main.service.TechnologyService;


@RestController
public class TechnologyController {
	@Autowired
	private TechnologyService ts;

	
	@RequestMapping("/employees/{employeeId}/projects/{projectId}/technologies")
	public List<Technology> getAllTechnologies(@PathVariable String projectId)
	{
	    return ts.getAllTechnologies(projectId);
				
	}

	@RequestMapping("/employees/{employeeId}/projects/{projectId}/technologies/{id}")
	public Technology getTechnology(@PathVariable String id)
	{
	    return ts.getTechnology(id);
				
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees/{employeeId}/projects/{projectId}/technologies")
	public void addProject(@RequestBody Technology technology,@PathVariable String projectId)
	{ 
       HashSet<Project> h=new HashSet<Project>();
       h.add(new Project(projectId,"",""));
      technology.setProject(h);
		ts.addTechnology(technology);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{employeeId}/projects/{projectId}/technologies/{id}")
	public void updateProject(@RequestBody Technology technology,@PathVariable String projectId,@PathVariable String id)
	{
		HashSet<Project> h=new HashSet<Project>();
	       h.add(new Project(projectId,"",""));
	      technology.setProject(h);
		ts.updateTechnology(technology);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{employeeId}/projects/{projectId}/technologies/{id}")
	public void deleteProject(@PathVariable String id)
	{
		ts.deleteTEchnology(id);
	}
	
}
