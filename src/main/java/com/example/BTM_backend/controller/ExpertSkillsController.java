package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.ExpertSkills;
import com.example.BTM_backend.repository.ExpertSkillsRepository;

@RestController
//@RequestMapping("/")
public class ExpertSkillsController {

	@Autowired
	ExpertSkillsRepository expertskillsRepository;

	// Get All Experts Records
	@GetMapping("/expertskills")
	public List<ExpertSkills> getExpertSkills() {
		return expertskillsRepository.findAll();
	}

	// Create a new talent record
	@PostMapping("/expertskills")
	public ExpertSkills createExpertSkills(@Valid @RequestBody ExpertSkills expertskills) {
		return expertskillsRepository.save(expertskills);
	}

}
