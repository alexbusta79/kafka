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
	
	//delete
	@PostMapping(path = "/delete")
	public Payload save(@RequestBody Payload payload) {
		return this.service.delete(payload);
	}
	
	//aggiunto io, path provvisori
	@PostMapping(path = "/activate")
	public Payload activate(@RequestBody Payload payload) {
		return this.service.activate(payload);
	}
	
	@PostMapping(path = "/docSignedOffered")
	public Payload docSignedOffered(@RequestBody Payload payload) {
		return this.service.docSignedOffered(payload);
	}
	
	@PostMapping(path = "/partiallySignedOffered")
	public Payload partiallySignedOffered(@RequestBody Payload payload) {
		return this.service.partiallySignedOffered(payload);
	}
	
	@PostMapping(path = "/firmaOfferSigned")
	public Payload firmaOfferSigned(@RequestBody Payload payload) {
		return this.service.firmaOfferSigned(payload);
	}
	
	@PostMapping(path = "/offerSaved")
	public Payload offerSaved(@RequestBody Payload payload) {
		return this.service.offerSaved(payload);
	}
	
	@PostMapping(path = "/offerReady")
	public Payload offerReady(@RequestBody Payload payload) {
		return this.service.offerReady(payload);
	}
	
	@PostMapping(path = "/startSign")
	public Payload startSign(@RequestBody Payload payload) {
		return this.service.startSign(payload);
	}

}
