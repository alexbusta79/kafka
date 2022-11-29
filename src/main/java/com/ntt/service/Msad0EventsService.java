package com.ntt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.ntt.entity.Payload;
import com.ntt.events.Msad0CreatedEvent;
import com.ntt.events.Event;
import com.ntt.events.EventType;

import java.util.Date;
import java.util.UUID;

@Component
public class Msad0EventsService {

	@Autowired
	private KafkaTemplate<String, Event<?>> producer;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_DELETED_V1}")
	private String topicDocumentaleDelete;
	
	//aggiunte io
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_ACTIVATE_V1}")
	private String topicPraticaActivate;
	
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_SIGNED_OFFER_SAVED_V1}")
	private String topicDocumentaleSignedOfferSaved;
	
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_PARTIALLY_SIGNED_OFFER_SAVED_V1}")
	private String topicDocumentalePartiallySignedOfferSaved;
	
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_OFFER_SIGNED_V1}")
	private String topicFirmaOfferSigned;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_OFFER_SAVED_V1}")
	private String topicDocumentaleOfferSaved;
	
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_OFFER_READY_V1}")
	private String topicFirmaOfferReady;	
	
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_START_SIGN_V1}")
	private String topicFirmaStartSign;
	
	
	public void documentaleDelete(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicDocumentaleDelete, event);
	}

	//Aggiunte io 
	public void praticaActivate(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicPraticaActivate, event);
	}
	
	public void documentaleSignedOfferSaved(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicDocumentaleSignedOfferSaved, event);
	}
	
	public void documentalePartiallySignedOfferSaved(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicDocumentalePartiallySignedOfferSaved, event);
	}
	
	public void firmaOfferSigned(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicFirmaOfferSigned, event);
	}
	
	public void documentaleOfferSaved(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicDocumentaleOfferSaved, event);
	}
	
	public void firmaOfferReady(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicFirmaOfferReady, event);
	}
	
	public void firmaStartSign(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());
		
		this.producer.send(this.topicFirmaStartSign, event);
	}

}
