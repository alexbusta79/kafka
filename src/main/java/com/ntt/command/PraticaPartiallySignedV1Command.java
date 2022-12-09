package com.ntt.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ntt.converter.*;
import com.ntt.entity.Payload;
import com.ntt.exceptions.Msad0ForbiddenException;
import com.ntt.service.Msad0EventsService;

@Component
@Scope("prototype")
public class PraticaPartiallySignedV1Command extends BaseCommand<Payload> {

	@Autowired
	private Msad0EventsService service;

	@Autowired
	private PraticaCreatedlV1Converter converter;

	private final Payload payload;

	public PraticaPartiallySignedV1Command(Payload payload) {
		this.payload = payload;
	}

	@Override
	public Payload doExecute() throws Exception {
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321", (System.currentTimeMillis()), " ms");
		Payload payloadResponse = this.service.praticaPartiallySignedV1(payload);
		return this.converter.convertPayloandToPayload(payloadResponse);
	}

	@Override
	protected boolean canExecute() throws Msad0ForbiddenException {
		return true;
	}

}
