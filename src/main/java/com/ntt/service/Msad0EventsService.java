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

}
