package com.ntt.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ntt.converter.OfferReadyConverter;
import com.ntt.entity.Payload;
import com.ntt.exceptions.Msad0ForbiddenException;
import com.ntt.service.Msad0EventsService;

@Component
@Scope("prototype")
public class OfferReadyCommand extends BaseCommand<Payload> {

	@Autowired
	private Msad0EventsService service;

	@Autowired
	private OfferReadyConverter converter;

	private final Payload payload;

	public OfferReadyCommand(Payload payload) {
		this.payload = payload;
	}

	@Override
	public Payload doExecute() throws Exception {
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321", (System.currentTimeMillis()), " ms");
		Payload payloadResponse = this.service.firmaOfferReady(payload);
		return this.converter.convertPayloandToPayload(payloadResponse);
	}

	@Override
	protected boolean canExecute() throws Msad0ForbiddenException {
		return true;
	}

}
