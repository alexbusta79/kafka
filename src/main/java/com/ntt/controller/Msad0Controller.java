package com.ntt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.entity.Payload;
import com.ntt.service.Msad0Service;

@RestController
@RequestMapping("/msad0")
public class Msad0Controller {
	
	private final Msad0Service service;

	public Msad0Controller(Msad0Service service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public Payload save(@RequestBody Payload payload) {
		return this.service.save(payload);
	}
	
}
