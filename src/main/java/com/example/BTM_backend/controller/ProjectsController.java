package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.Projects;
import com.example.BTM_backend.repository.ProjectsRepository;

@RestController
//@RequestMapping("/")
public class ProjectsController {

	@Autowired
	ProjectsRepository projectsRepository;

	// Get All Project records
	@GetMapping("/projects")
	public List<Projects> getClients() {
		return projectsRepository.findAll();
	}

	// Create a new project record
	@PostMapping("/projects")
	public Projects createClient(@Valid @RequestBody Projects projects) {
		return projectsRepository.save(projects);
	}

}
