package com.ntt.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.command.DeleteCommand;
import com.ntt.entity.Payload;
import com.ntt.service.Msad0Service;

@RestController
@RequestMapping("/msad0")
public class Msad0Controller extends BaseController {
	
	private final Msad0Service service;

	public Msad0Controller(Msad0Service service) {
		super();
		this.service = service;
	}
	
	@Autowired
	private BeanFactory beanFactory;
	
	//delete
	@PostMapping(path = "/delete")
	public Payload save(@RequestBody Payload payload) {
		return this.service.delete(payload);
	}
	
	@PostMapping("/delete2")
	public ResponseEntity<Payload> delete(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=delete|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		DeleteCommand command = beanFactory.getBean(DeleteCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
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
