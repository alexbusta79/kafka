package com.ntt.service;

import org.springframework.stereotype.Service;

import com.ntt.entity.Payload;

@Service
public class Msad0Service {
	
	private final Msad0EventsService eventsService;

	public Msad0Service(Msad0EventsService eventsService) {
		super();
		this.eventsService = eventsService;
	}

	public Payload save(Payload payload) {
		System.out.println("Received " + payload);
		
		this.eventsService.documentaleDelete(payload);
		
		return payload;
	}
}
