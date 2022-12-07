package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.Experts;
import com.example.BTM_backend.repository.ExpertsRepository;

@RestController
//@RequestMapping("/")
public class ExpertsController {

	@Autowired
	ExpertsRepository expertsRepository;

	// Get All Experts Records
	@GetMapping("/experts")
	public List<Experts> getExperts() {
		return expertsRepository.findAll();
	}

	// Create a new talent record
	@PostMapping("/experts")
	public Experts createExpert(@Valid @RequestBody Experts experts) {
		return expertsRepository.save(experts);
	}

}
