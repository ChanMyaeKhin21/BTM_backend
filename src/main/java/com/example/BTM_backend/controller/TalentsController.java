package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.Talents;

import com.example.BTM_backend.repository.TalentsRepository;

@RestController
//@RequestMapping("/")
public class TalentsController {

	@Autowired
	TalentsRepository talentsRepository;

	// Get All Job Texts
	@GetMapping("/talents")
	public List<Talents> getUser() {
		return talentsRepository.findAll();
	}

	// Create a new talent record
	// @PostMapping("/talents")
	// public Talents createUser(@Valid @RequestBody Talents talents) {
	// 	return talentsRepository.save(talents);
	// }

}
