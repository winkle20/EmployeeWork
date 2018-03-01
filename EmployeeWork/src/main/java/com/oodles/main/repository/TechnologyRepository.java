package com.oodles.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.oodles.main.domain.Technology;

public interface TechnologyRepository extends CrudRepository<Technology, String>{
	public List<Technology> findByprojectId(String projectId);

}
