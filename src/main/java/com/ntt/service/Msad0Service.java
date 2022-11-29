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

	public Payload delete(Payload payload) {
		System.out.println("Received " + payload);
		
		this.eventsService.documentaleDelete(payload);
		
		return payload;
	}
	
	//Aggiunte io
	public Payload activate(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.praticaActivate(payload);
		return payload;
	}
	
	public Payload docSignedOffered(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.documentaleSignedOfferSaved(payload);
		return payload;
	}
	
	public Payload partiallySignedOffered(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.documentalePartiallySignedOfferSaved(payload);
		return payload;
	}
	
	public Payload firmaOfferSigned(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.firmaOfferSigned(payload);
		return payload;
	}
	
	public Payload offerSaved(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.documentaleOfferSaved(payload);
		return payload;
	}
	
	public Payload offerReady(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.firmaOfferReady(payload);
		return payload;
	}
	
	public Payload startSign(Payload payload) {
		System.out.println("Received " + payload);
		this.eventsService.firmaStartSign(payload);
		return payload;
	}
	
	
	
}
