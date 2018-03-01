package com.oodles.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oodles.main.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, String>
{
	List<Project> findByemployeeId(String employeeId);
}
