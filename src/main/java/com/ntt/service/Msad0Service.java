package com.ntt.service;

import org.springframework.stereotype.Service;


@Service
public class Msad0Service {
	
	private final Msad0EventsService eventsService;

	public Msad0Service(Msad0EventsService eventsService) {
		super();
		this.eventsService = eventsService;
	}

	public Msad0EventsService getEventsService() {
		return eventsService;
	}
}


