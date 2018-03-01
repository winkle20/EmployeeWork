package com.oodles.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oodles.main.domain.Technology;
import com.oodles.main.repository.TechnologyRepository;
@Service
public class TechnologyService {
	@Autowired
	private TechnologyRepository tr;
	
	public List<Technology> getAllTechnologies(String projectId) {
		List<Technology> technologies=new ArrayList<>();
		tr.findByprojectId(projectId)
		.forEach(technologies::add);
		return technologies;
	}


	public Technology getTechnology(String id) {
		
		return tr.findOne(id);
	}

	public void deleteTEchnology(String id) {
		tr.delete(id);
		
	}

	public void addTechnology(Technology technology) {
		
		tr.save(technology);
		
	}

	public void updateTechnology(Technology technology) {
		tr.save(technology);
		
	}

	
}
