package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.Skills;
import com.example.BTM_backend.repository.SkillsRepository;

@RestController
//@RequestMapping("/")
public class SkillsController {

	@Autowired
	SkillsRepository skillsRepository;

	// Get All Experts Records
	@GetMapping("/skills")
	public List<Skills> getExperts() {
		return skillsRepository.findAll();
	}

	// Create a new talent record
	@PostMapping("/skills")
	public Skills createExpert(@Valid @RequestBody Skills skills) {
		return skillsRepository.save(skills);
	}

}
