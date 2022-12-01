package com.ntt.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ntt.converter.DeleteConverter;
import com.ntt.entity.Payload;
import com.ntt.exceptions.Msad0ForbiddenException;
import com.ntt.service.Msad0EventsService;
import com.ntt.service.Msad0Service;

@Component
@Scope("prototype")
public class DeleteCommand extends BaseCommand<Payload>{

	@Autowired
	private Msad0EventsService service;
	
	@Autowired
	private DeleteConverter converter;
	
	private final Payload payload;
	
	public DeleteCommand (Payload payload) {
		this.payload = payload;
	}
	
	
	@Override
	public Payload doExecute() throws Exception{	
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis())," ms");
		Payload payloadResponse = this.service.documentaleDelete(payload);
		return this.converter.convertPayloandToPayload(payloadResponse);
	}
	
	@Override 
    protected boolean canExecute() throws Msad0ForbiddenException {
        return true;
    }

}
