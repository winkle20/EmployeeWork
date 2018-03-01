package com.oodles.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oodles.main.domain.Project;
import com.oodles.main.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository pr;
	
    Project p;
	
	public List<Project> getAllProject(String employeeId)
	{
		List<Project> projects=new ArrayList<>();
		pr.findByemployeeId(employeeId)
		.forEach(projects::add);
		return projects;
	}

	public Project getProject(String id)
	{

		return pr.findOne(id);
	}
	
	
	public Project getProjectByEmployee(String employeeId, String id) {
		
		
		List<Project> projects=getAllProject(employeeId);
		
		return projects.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}
	public void addProject(Project project) {
           pr.save(project);
	
	}

	public void updateProject(Project project)
	{
		pr.save(project);
		
		
	}

	public void deleteProject(String id) {
		pr.delete(id);
		
	}

	

	
}
