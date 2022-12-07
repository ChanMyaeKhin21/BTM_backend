package com.example.BTM_backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BTM_backend.model.Clients;
import com.example.BTM_backend.repository.ClientsRepository;

@RestController
//@RequestMapping("/")
public class ClientsController {

	@Autowired
	ClientsRepository clientsRepository;

	// Get All Clients Records
	@GetMapping("/clients")
	public List<Clients> getClients() {
		return clientsRepository.findAll();
	}

	// Create a new client record
	@PostMapping("/clients")
	public Clients createClient(@Valid @RequestBody Clients clients) {
		return clientsRepository.save(clients);
	}

}
