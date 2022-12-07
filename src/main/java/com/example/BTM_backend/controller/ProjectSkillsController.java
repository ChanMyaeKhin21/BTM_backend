package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.ProjectSkills;
import com.example.BTM_backend.repository.ProjectSkillsRepository;

@RestController
//@RequestMapping("/")
public class ProjectSkillsController {

	@Autowired
	ProjectSkillsRepository projectskillsRepository;

	// Get All Experts Records
	@GetMapping("/projectskills")
	public List<ProjectSkills> getProjectSkills() {
		return projectskillsRepository.findAll();
	}

	// Create a new talent record
	@PostMapping("/projectskills")
	public ProjectSkills createProjectSkills(@Valid @RequestBody ProjectSkills projectskills) {
		return projectskillsRepository.save(projectskills);
	}

}
