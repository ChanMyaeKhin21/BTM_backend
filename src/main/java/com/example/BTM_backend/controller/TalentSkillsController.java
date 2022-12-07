package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.TalentSkills;
import com.example.BTM_backend.repository.TalentSkillsRepository;

@RestController
//@RequestMapping("/")
public class TalentSkillsController {

	@Autowired
	TalentSkillsRepository talentskillsRepository;

	// Get All Experts Records
	@GetMapping("/talentskills")
	public List<TalentSkills> getTalentSkills() {
		return talentskillsRepository.findAll();
	}

	// Create a new talent record
	@PostMapping("/talentskills")
	public TalentSkills createTalentSkills(@Valid @RequestBody TalentSkills talentskills) {
		return talentskillsRepository.save(talentskills);
	}

}
