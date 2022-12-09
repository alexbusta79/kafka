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

	//ATTENZIONE: NON CI DEVONO ESSERE  SPAZI 
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_ACTIVATE_V1}")
	private String topicPraticaActivateV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_CANCEL_V1}")
	private String topicPraticaCancelV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_CREATED_V1}")
	private String topicPraticaCreatedlV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_DELETED_V1}")
	private String topicPraticaDeletedV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_DELETE_V1}")
	private String topicPraticaDeleteV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_PARTIALLY_SIGNED_V1}")
	private String topicPraticaPartiallySignedV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_RETRIEVED_V1}")
	private String topicPraticaRetrievedV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_SIGNED_V1}")
	private String topicPraticaSignedV1;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_UPDATED}")
	private String topicPraticaUpdated;

	@Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_DELETED_V1")
	private String topicFirmaDeletedV1;
	
	@Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_DELETED_V1")
	private String topicDocumentaleDeletedV1;
	
	public Payload praticaActivateV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaActivateV1, event);

		return payload;
	}

	public Payload praticaCancelV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaCancelV1, event);

		return payload;
	}

	public Payload praticaCreatedlV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaCreatedlV1, event);

		return payload;
	}

	public Payload praticaDeletedV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaDeletedV1, event);

		return payload;
	}

	public Payload praticaDeleteV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaDeleteV1, event);

		return payload;
	}

	public Payload praticaPartiallySignedV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaPartiallySignedV1, event);

		return payload;
	}

	public Payload praticaRetrievedV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaRetrievedV1, event);

		return payload;
	}

	public Payload praticaSignedV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaSignedV1, event);

		return payload;
	}

	public Payload praticaUpdated(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicPraticaUpdated, event);
		return payload;
	}

	public Payload firmaDeletedV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicFirmaDeletedV1, event);
		return payload;
	}

	public Payload documentaleDeletedV1(Payload payload) {
		Msad0CreatedEvent event = new Msad0CreatedEvent();
		event.setData(payload);
		event.setId(UUID.randomUUID().toString());
		event.setType(EventType.CREATED);
		event.setDate(new Date());
		event.setIdPratica(payload.getIdPratica());
		event.setIdSuperpratica(payload.getIdSuperpratica());

		this.producer.send(this.topicDocumentaleDeletedV1, event);
		return payload;
	}

}

//Chiamate topic pre refactor 
/*
 * @Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_DELETED_V1}")
 * private String topicDocumentaleDelete;
 * 
 * @Value("${topic.customer.name:SDH_SVIL_MSAD0_PRATICA_ACTIVATE_V1}") private
 * String topicPraticaActivate;
 * 
 * @Value(
 * "${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_SIGNED_OFFER_SAVED_V1}")
 * private String topicDocumentaleSignedOfferSaved;
 * 
 * @Value(
 * "${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_PARTIALLY_SIGNED_OFFER_SAVED_V1}")
 * private String topicDocumentalePartiallySignedOfferSaved;
 * 
 * @Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_OFFER_SIGNED_V1}") private
 * String topicFirmaOfferSigned;
 * 
 * @Value("${topic.customer.name:SDH_SVIL_MSAD0_DOCUMENTALE_OFFER_SAVED_V1}")
 * private String topicDocumentaleOfferSaved;
 * 
 * @Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_OFFER_READY_V1}") private
 * String topicFirmaOfferReady;
 * 
 * @Value("${topic.customer.name:SDH_SVIL_MSAD0_FIRMA_START_SIGN_V1}") private
 * String topicFirmaStartSign;
 * 
 * public Payload documentaleDelete(Payload payload) { Msad0CreatedEvent event =
 * new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicDocumentaleDelete, event);
 * 
 * return payload; }
 * 
 * public Payload praticaActivate(Payload payload) { Msad0CreatedEvent event =
 * new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicPraticaActivate, event); return payload; }
 * 
 * public Payload docSignedOffered(Payload payload) { Msad0CreatedEvent event =
 * new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicDocumentaleSignedOfferSaved, event);
 * 
 * return payload; }
 * 
 * public Payload documentalePartiallySignedOfferSaved(Payload payload) {
 * Msad0CreatedEvent event = new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicDocumentalePartiallySignedOfferSaved, event);
 * 
 * return payload; }
 * 
 * public Payload firmaOfferSigned(Payload payload) { Msad0CreatedEvent event =
 * new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicFirmaOfferSigned, event);
 * 
 * return payload; }
 * 
 * public Payload documentaleOfferSaved(Payload payload) { Msad0CreatedEvent
 * event = new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicDocumentaleOfferSaved, event);
 * 
 * return payload; }
 * 
 * public Payload firmaOfferReady(Payload payload) { Msad0CreatedEvent event =
 * new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicFirmaOfferReady, event);
 * 
 * return payload; }
 * 
 * public Payload firmaStartSign(Payload payload) { Msad0CreatedEvent event =
 * new Msad0CreatedEvent(); event.setData(payload);
 * event.setId(UUID.randomUUID().toString()); event.setType(EventType.CREATED);
 * event.setDate(new Date()); event.setIdPratica(payload.getIdPratica());
 * event.setIdSuperpratica(payload.getIdSuperpratica());
 * 
 * this.producer.send(this.topicFirmaStartSign, event);
 * 
 * return payload; }
 */